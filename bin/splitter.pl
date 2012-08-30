my $n = 65500; 
$c=0;
while(<>) {
	chomp; 
	my $l = length($_)+$1; 
	if ($c + $l > $n) { 
		print join(" ",@o).$/; 
		$c=0;
		@o=()
	} 
	push @o,$_;
	 $c += $l 
} 
print join(" ",@o),$/;
