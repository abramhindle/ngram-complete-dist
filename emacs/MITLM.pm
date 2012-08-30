package MITLM;
use Moose;
use Term::ANSIColor;
use IPC::Open3;
use Data::Dumper;
use IO::Handle;

has 'corpus' => (is =>'ro', isa => 'Str', default => "$ENV{HOME}/projects/ngram-complete-dist/data/lucene-split");
has 'order'  => (is =>'ro', isa => 'Int', default => 3);
has 'pid'    => (is =>'rw', default => undef);
has 'child_in'    => (is =>'rw', default => undef);
has 'child_out'    => (is =>'rw', default => undef);
has 'stderr'    => (is =>'rw', default => undef);
has 'estimateNgram' => (is =>'ro', isa => 'Str', default => "$ENV{HOME}/projects/mitlm/estimate-ngram");


sub open {
    my ($self) = @_;
    my $corpus =  $self->corpus();
    my $order = $self->order();
    die "No corpus: $corpus" unless -e $corpus;
    my $run = $self->estimateNgram()." -t $corpus -o $order -live";
    warn color("yellow"),$run,color("reset");
    my ($child_in, $child_out, $stderr);
    my $pid = open3( $child_in, $child_out, $stderr, $run );
    #my $pid = open2( $child_out, $child_in, $run );
    $self->pid($pid);
    $self->child_in($child_in);
    $self->child_out($child_out);
    $self->stderr($stderr);
    #IO::Handle::autoflush($child_in,1);

    # read til we're ready


    #print $chld_in $/x10;
    while(my $line = <$child_out>) {
        chomp($line);
        warn color("yellow"),$line,color("reset");
        last if $line =~ /Live Guess/;
        warn color("yellow"),"Reading..",color("reset");
        #IO::Handle::flush($child_in);
    }
    warn color("blue"),"MITLM ready",color("reset");

}

# lex is the text coming in
sub send {
    my ($self, $lex) = @_;
    $lex =~ s/\s+$//;
    warn ref($self)." --- $self ".Dumper($self);
    warn $self->can("new");
    warn $self->can("corpus");
    warn $self->can("order");
    warn $self->can("pid");

    if (!defined($self->pid())) {
        $self->open();
    }

    my $child_out = $self->child_out();
    my $child_in  = $self->child_in();

    print $child_in $lex.$/;
    warn color("red"),"Output to MITLM",color("reset");

    #flush( $child_out );
    my $record = 0;
    my @output = ();
    my $done = 0;
    my $in_line = "";
    my $tokens = "";
    while(!$done) {
        warn color("blue"),"Reading",color("reset");
        $in_line = <$child_out>;
        chomp($in_line);
        warn color("blue"),"\t$in_line",color("reset");
        last unless $in_line;
        if (!$record && $in_line =~ /Live Guess Rankings$/) {
            $record = 1;
            #$tokens = <$child_out>; # assume that liveguess will return the results
        } elsif ($record && $in_line =~ /Live Guess Rankings Done$/) {
            $record = 0;
            $done = 1;
        } elsif ($record) {
            my ($time,$score,$v) = split(/[\s\t]+/, $in_line,3);
	    $v = substr($v,length($lex));
	    $v =~ s/^\s+//;
            push @output, $v;
        }
    }
    @output = reverse(@output);
    my $cnt = 1;
    my $lexed = $lex;
    $lexed =~ s/\s\s+/ /g;
    my @out = ($lexed.$/);
    foreach my $line (@output) {
        push @out, "[".$cnt++."]\t".$line.$/;
    }
    return @out;
}

sub close {
    my ($self) = @_;
    if (defined($self->pid)) {
        close($self->child_out);
        close($self->child_in);
        close($self->stderr);
        kill($self->pid);
    }
}

sub DEMOLISH {
    my ($self) = @_;
    $self->close();
}

1;

