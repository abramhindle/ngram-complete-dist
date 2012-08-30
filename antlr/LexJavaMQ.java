import org.zeromq.*;
public class LexJavaMQ {
    LexJava lexJava = new LexJava();
    public void start() throws java.io.IOException {
        ZMQ.Context context = ZMQ.context(1);
        ZMQ.Socket  sock    = context.socket(ZMQ.REP);
        sock.bind("tcp://lo:32132");
        for( ;; ) {
            byte[] msg = sock.recv(0);
            // first line is args
            String smsg = new String(msg);
            int index = smsg.indexOf('\n');
            String argString = smsg.substring(0,index);
            String rest = smsg.substring(index+1);
            String[] args = argString.split("\\s");
            String lexed = lexJava.lexJava( args, rest );
            sock.send( lexed.getBytes(), 0 );
        }
        // context.term();
    }
    public static void main(String [] args) {
        try {
            LexJavaMQ ljmq = new LexJavaMQ();
            ljmq.start();
        } catch (java.io.IOException e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }
}
