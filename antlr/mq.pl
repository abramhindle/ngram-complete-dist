#!/usr/bin/perl
use strict;
use ZeroMQ qw/:all/;
my $ctxt = ZeroMQ::Context->new();    
my $socket = $ctxt->socket( ZMQ_REQ );
$socket->connect( "tcp://127.0.0.1:32132" );
$socket->send( "+comment +code$/" . <<EOM );
// hey this si a comment
public class VeryPublicClass {
    public VeryPublicClass() {
    }
}
EOM
my $msg = $socket->recv();

print $msg->data();
