// $ANTLR 3.0.1 C.g 2011-07-05 22:40:17

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CLexer extends Lexer {
    public static final int FloatTypeSuffix=16;
    public static final int LETTER=11;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int T23=23;
    public static final int STRING_LITERAL=9;
    public static final int FLOATING_POINT_LITERAL=10;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int COMMENT=20;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int LINE_COMMENT=21;
    public static final int IntegerTypeSuffix=14;
    public static final int CHARACTER_LITERAL=8;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T100=100;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T45=45;
    public static final int T44=44;
    public static final int WS=19;
    public static final int T50=50;
    public static final int LINE_COMMAND=22;
    public static final int T59=59;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int EscapeSequence=12;
    public static final int DECIMAL_LITERAL=7;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int Exponent=15;
    public static final int HexDigit=13;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int IDENTIFIER=4;
    public static final int HEX_LITERAL=5;
    public static final int T61=61;
    public static final int T60=60;
    public static final int T99=99;
    public static final int T97=97;
    public static final int T98=98;
    public static final int T95=95;
    public static final int T96=96;
    public static final int OCTAL_LITERAL=6;
    public static final int T94=94;
    public static final int Tokens=101;
    public static final int T93=93;
    public static final int T92=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int UnicodeEscape=18;
    public static final int T81=81;
    public static final int T80=80;
    public static final int T83=83;
    public static final int OctalEscape=17;
    public static final int T82=82;

    /** 
     *  Determines if whitespaces and comments should be preserved or thrown away.
     *
     *  If <code>true</code> whitespaces and comments will be preserved within the
     *  hidden channel, otherwise the appropriate tokens will be skiped. This is
     *  a 'little bit' expensive, of course. If only one of the two behaviours is
     *  needed forever the lexer part of the grammar should be changed by replacing 
     *  the 'if-else' stuff within the approprate lexer grammar actions.
     */
        public boolean preserveWhitespacesAndComments = false;


    public CLexer() {;} 
    public CLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "C.g"; }

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // C.g:16:5: ( 'typedef' )
            // C.g:16:7: 'typedef'
            {
            match("typedef"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // C.g:17:5: ( ';' )
            // C.g:17:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // C.g:18:5: ( ',' )
            // C.g:18:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // C.g:19:5: ( '=' )
            // C.g:19:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // C.g:20:5: ( 'extern' )
            // C.g:20:7: 'extern'
            {
            match("extern"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // C.g:21:5: ( 'static' )
            // C.g:21:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // C.g:22:5: ( 'auto' )
            // C.g:22:7: 'auto'
            {
            match("auto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // C.g:23:5: ( 'register' )
            // C.g:23:7: 'register'
            {
            match("register"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // C.g:24:5: ( 'void' )
            // C.g:24:7: 'void'
            {
            match("void"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // C.g:25:5: ( 'char' )
            // C.g:25:7: 'char'
            {
            match("char"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // C.g:26:5: ( 'short' )
            // C.g:26:7: 'short'
            {
            match("short"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // C.g:27:5: ( 'int' )
            // C.g:27:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // C.g:28:5: ( 'long' )
            // C.g:28:7: 'long'
            {
            match("long"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // C.g:29:5: ( 'float' )
            // C.g:29:7: 'float'
            {
            match("float"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // C.g:30:5: ( 'double' )
            // C.g:30:7: 'double'
            {
            match("double"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // C.g:31:5: ( 'signed' )
            // C.g:31:7: 'signed'
            {
            match("signed"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // C.g:32:5: ( 'unsigned' )
            // C.g:32:7: 'unsigned'
            {
            match("unsigned"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // C.g:33:5: ( '{' )
            // C.g:33:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // C.g:34:5: ( '}' )
            // C.g:34:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // C.g:35:5: ( 'struct' )
            // C.g:35:7: 'struct'
            {
            match("struct"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // C.g:36:5: ( 'union' )
            // C.g:36:7: 'union'
            {
            match("union"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // C.g:37:5: ( ':' )
            // C.g:37:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // C.g:38:5: ( 'enum' )
            // C.g:38:7: 'enum'
            {
            match("enum"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // C.g:39:5: ( 'const' )
            // C.g:39:7: 'const'
            {
            match("const"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // C.g:40:5: ( 'volatile' )
            // C.g:40:7: 'volatile'
            {
            match("volatile"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // C.g:41:5: ( '(' )
            // C.g:41:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // C.g:42:5: ( ')' )
            // C.g:42:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // C.g:43:5: ( '[' )
            // C.g:43:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // C.g:44:5: ( ']' )
            // C.g:44:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // C.g:45:5: ( '*' )
            // C.g:45:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // C.g:46:5: ( '...' )
            // C.g:46:7: '...'
            {
            match("..."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // C.g:47:5: ( '+' )
            // C.g:47:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // C.g:48:5: ( '-' )
            // C.g:48:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // C.g:49:5: ( '/' )
            // C.g:49:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // C.g:50:5: ( '%' )
            // C.g:50:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // C.g:51:5: ( '++' )
            // C.g:51:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // C.g:52:5: ( '--' )
            // C.g:52:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // C.g:53:5: ( 'sizeof' )
            // C.g:53:7: 'sizeof'
            {
            match("sizeof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // C.g:54:5: ( '.' )
            // C.g:54:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // C.g:55:5: ( '->' )
            // C.g:55:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // C.g:56:5: ( '&' )
            // C.g:56:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // C.g:57:5: ( '~' )
            // C.g:57:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // C.g:58:5: ( '!' )
            // C.g:58:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // C.g:59:5: ( '*=' )
            // C.g:59:7: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // C.g:60:5: ( '/=' )
            // C.g:60:7: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // C.g:61:5: ( '%=' )
            // C.g:61:7: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // C.g:62:5: ( '+=' )
            // C.g:62:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // C.g:63:5: ( '-=' )
            // C.g:63:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // C.g:64:5: ( '<<=' )
            // C.g:64:7: '<<='
            {
            match("<<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // C.g:65:5: ( '>>=' )
            // C.g:65:7: '>>='
            {
            match(">>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // C.g:66:5: ( '&=' )
            // C.g:66:7: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // C.g:67:5: ( '^=' )
            // C.g:67:7: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // C.g:68:5: ( '|=' )
            // C.g:68:7: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // C.g:69:5: ( '?' )
            // C.g:69:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // C.g:70:5: ( '||' )
            // C.g:70:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // C.g:71:5: ( '&&' )
            // C.g:71:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // C.g:72:5: ( '|' )
            // C.g:72:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // C.g:73:5: ( '^' )
            // C.g:73:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // C.g:74:5: ( '==' )
            // C.g:74:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // C.g:75:5: ( '!=' )
            // C.g:75:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // C.g:76:5: ( '<' )
            // C.g:76:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // C.g:77:5: ( '>' )
            // C.g:77:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // C.g:78:5: ( '<=' )
            // C.g:78:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // C.g:79:5: ( '>=' )
            // C.g:79:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // C.g:80:5: ( '<<' )
            // C.g:80:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // C.g:81:5: ( '>>' )
            // C.g:81:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // C.g:82:5: ( 'case' )
            // C.g:82:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // C.g:83:5: ( 'default' )
            // C.g:83:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // C.g:84:5: ( 'if' )
            // C.g:84:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // C.g:85:5: ( 'else' )
            // C.g:85:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // C.g:86:5: ( 'switch' )
            // C.g:86:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // C.g:87:5: ( 'while' )
            // C.g:87:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // C.g:88:5: ( 'do' )
            // C.g:88:7: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // C.g:89:5: ( 'for' )
            // C.g:89:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // C.g:90:5: ( 'goto' )
            // C.g:90:7: 'goto'
            {
            match("goto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // C.g:91:5: ( 'continue' )
            // C.g:91:7: 'continue'
            {
            match("continue"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // C.g:92:5: ( 'break' )
            // C.g:92:7: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // C.g:93:6: ( 'return' )
            // C.g:93:8: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start IDENTIFIER
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            // C.g:498:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C.g:498:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C.g:498:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end IDENTIFIER

    // $ANTLR start LETTER
    public final void mLETTER() throws RecognitionException {
        try {
            // C.g:503:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end LETTER

    // $ANTLR start CHARACTER_LITERAL
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            // C.g:510:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\'' )
            // C.g:510:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) ) '\\''
            {
            match('\''); 
            // C.g:510:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\\') ) {
                alt2=1;
            }
            else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFE')) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("510:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C.g:510:16: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // C.g:510:33: ~ ( '\\'' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            match('\''); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHARACTER_LITERAL

    // $ANTLR start STRING_LITERAL
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            // C.g:514:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C.g:514:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // C.g:514:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='!')||(LA3_0>='#' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFE')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C.g:514:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C.g:514:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING_LITERAL

    // $ANTLR start HEX_LITERAL
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            int _type = HEX_LITERAL;
            // C.g:517:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // C.g:517:15: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C.g:517:29: ( HexDigit )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C.g:517:29: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // C.g:517:39: ( IntegerTypeSuffix )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='U'||LA5_0=='l'||LA5_0=='u') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C.g:517:39: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HEX_LITERAL

    // $ANTLR start DECIMAL_LITERAL
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            // C.g:519:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // C.g:519:19: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // C.g:519:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("519:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C.g:519:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C.g:519:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // C.g:519:35: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C.g:519:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // C.g:519:46: ( IntegerTypeSuffix )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='U'||LA8_0=='l'||LA8_0=='u') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C.g:519:46: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DECIMAL_LITERAL

    // $ANTLR start OCTAL_LITERAL
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = OCTAL_LITERAL;
            // C.g:521:15: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // C.g:521:17: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            // C.g:521:21: ( '0' .. '7' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C.g:521:22: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // C.g:521:33: ( IntegerTypeSuffix )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='U'||LA10_0=='l'||LA10_0=='u') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C.g:521:33: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end OCTAL_LITERAL

    // $ANTLR start HexDigit
    public final void mHexDigit() throws RecognitionException {
        try {
            // C.g:524:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C.g:524:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end HexDigit

    // $ANTLR start IntegerTypeSuffix
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // C.g:528:2: ( ( 'u' | 'U' )? ( 'l' | 'L' ) | ( 'u' | 'U' ) ( 'l' | 'L' )? )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='U'||LA13_0=='u') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='L'||LA13_1=='l') ) {
                    alt13=1;
                }
                else {
                    alt13=2;}
            }
            else if ( (LA13_0=='L'||LA13_0=='l') ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("526:1: fragment IntegerTypeSuffix : ( ( 'u' | 'U' )? ( 'l' | 'L' ) | ( 'u' | 'U' ) ( 'l' | 'L' )? );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // C.g:528:4: ( 'u' | 'U' )? ( 'l' | 'L' )
                    {
                    // C.g:528:4: ( 'u' | 'U' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='U'||LA11_0=='u') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C.g:
                            {
                            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C.g:529:4: ( 'u' | 'U' ) ( 'l' | 'L' )?
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // C.g:529:15: ( 'l' | 'L' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='L'||LA12_0=='l') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C.g:
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end IntegerTypeSuffix

    // $ANTLR start FLOATING_POINT_LITERAL
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            // C.g:533:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // C.g:533:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // C.g:533:9: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C.g:533:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    match('.'); 
                    // C.g:533:25: ( '0' .. '9' )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C.g:533:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // C.g:533:37: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C.g:533:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // C.g:533:47: ( FloatTypeSuffix )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C.g:533:47: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C.g:534:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 
                    // C.g:534:13: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C.g:534:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // C.g:534:25: ( Exponent )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C.g:534:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // C.g:534:35: ( FloatTypeSuffix )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C.g:534:35: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C.g:535:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // C.g:535:9: ( '0' .. '9' )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C.g:535:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    mExponent(); 
                    // C.g:535:30: ( FloatTypeSuffix )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='D'||LA22_0=='F'||LA22_0=='d'||LA22_0=='f') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C.g:535:30: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C.g:536:9: ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix
                    {
                    // C.g:536:9: ( '0' .. '9' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // C.g:536:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    // C.g:536:21: ( Exponent )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='E'||LA24_0=='e') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C.g:536:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    mFloatTypeSuffix(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end FLOATING_POINT_LITERAL

    // $ANTLR start Exponent
    public final void mExponent() throws RecognitionException {
        try {
            // C.g:540:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C.g:540:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // C.g:540:22: ( '+' | '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+'||LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;

            }

            // C.g:540:33: ( '0' .. '9' )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='0' && LA27_0<='9')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C.g:540:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Exponent

    // $ANTLR start FloatTypeSuffix
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // C.g:543:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // C.g:543:19: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end FloatTypeSuffix

    // $ANTLR start EscapeSequence
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // C.g:547:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1=='\"'||LA28_1=='\''||LA28_1=='\\'||LA28_1=='b'||LA28_1=='f'||LA28_1=='n'||LA28_1=='r'||LA28_1=='t') ) {
                    alt28=1;
                }
                else if ( ((LA28_1>='0' && LA28_1<='7')) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("545:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape );", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("545:1: fragment EscapeSequence : ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // C.g:547:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // C.g:548:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end EscapeSequence

    // $ANTLR start OctalEscape
    public final void mOctalEscape() throws RecognitionException {
        try {
            // C.g:553:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\\') ) {
                int LA29_1 = input.LA(2);

                if ( ((LA29_1>='0' && LA29_1<='3')) ) {
                    int LA29_2 = input.LA(3);

                    if ( ((LA29_2>='0' && LA29_2<='7')) ) {
                        int LA29_5 = input.LA(4);

                        if ( ((LA29_5>='0' && LA29_5<='7')) ) {
                            alt29=1;
                        }
                        else {
                            alt29=2;}
                    }
                    else {
                        alt29=3;}
                }
                else if ( ((LA29_1>='4' && LA29_1<='7')) ) {
                    int LA29_3 = input.LA(3);

                    if ( ((LA29_3>='0' && LA29_3<='7')) ) {
                        alt29=2;
                    }
                    else {
                        alt29=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("551:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("551:1: fragment OctalEscape : ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) );", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C.g:553:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C.g:553:14: ( '0' .. '3' )
                    // C.g:553:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C.g:553:25: ( '0' .. '7' )
                    // C.g:553:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C.g:553:36: ( '0' .. '7' )
                    // C.g:553:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C.g:554:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C.g:554:14: ( '0' .. '7' )
                    // C.g:554:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C.g:554:25: ( '0' .. '7' )
                    // C.g:554:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C.g:555:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C.g:555:14: ( '0' .. '7' )
                    // C.g:555:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end OctalEscape

    // $ANTLR start UnicodeEscape
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // C.g:560:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // C.g:560:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end UnicodeEscape

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // C.g:563:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C.g:563:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


                    if (!preserveWhitespacesAndComments) {
                        skip();
                    } else {
                        channel = HIDDEN;
                    }
                

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start COMMENT
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            // C.g:574:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C.g:574:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C.g:574:14: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFE')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFE')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C.g:574:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match("*/"); 


                    if (!preserveWhitespacesAndComments) {
                        skip();
                    } else {
                        channel = HIDDEN;
                    }
                

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMENT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // C.g:584:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C.g:584:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C.g:584:12: (~ ( '\\n' | '\\r' ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFE')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C.g:584:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // C.g:584:26: ( '\\r' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\r') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C.g:584:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

                    if (!preserveWhitespacesAndComments) {
                        skip();
                    } else {
                        channel = HIDDEN;
                    }
                

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start LINE_COMMAND
    public final void mLINE_COMMAND() throws RecognitionException {
        try {
            int _type = LINE_COMMAND;
            // C.g:595:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C.g:595:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 
            // C.g:595:11: (~ ( '\\n' | '\\r' ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>='\u0000' && LA33_0<='\t')||(LA33_0>='\u000B' && LA33_0<='\f')||(LA33_0>='\u000E' && LA33_0<='\uFFFE')) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C.g:595:11: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // C.g:595:25: ( '\\r' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C.g:595:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

                    if (!preserveWhitespacesAndComments) {
                        skip();
                    } else {
                        channel = HIDDEN;
                    }
                

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMAND

    public void mTokens() throws RecognitionException {
        // C.g:1:8: ( T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
        int alt35=89;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // C.g:1:10: T23
                {
                mT23(); 

                }
                break;
            case 2 :
                // C.g:1:14: T24
                {
                mT24(); 

                }
                break;
            case 3 :
                // C.g:1:18: T25
                {
                mT25(); 

                }
                break;
            case 4 :
                // C.g:1:22: T26
                {
                mT26(); 

                }
                break;
            case 5 :
                // C.g:1:26: T27
                {
                mT27(); 

                }
                break;
            case 6 :
                // C.g:1:30: T28
                {
                mT28(); 

                }
                break;
            case 7 :
                // C.g:1:34: T29
                {
                mT29(); 

                }
                break;
            case 8 :
                // C.g:1:38: T30
                {
                mT30(); 

                }
                break;
            case 9 :
                // C.g:1:42: T31
                {
                mT31(); 

                }
                break;
            case 10 :
                // C.g:1:46: T32
                {
                mT32(); 

                }
                break;
            case 11 :
                // C.g:1:50: T33
                {
                mT33(); 

                }
                break;
            case 12 :
                // C.g:1:54: T34
                {
                mT34(); 

                }
                break;
            case 13 :
                // C.g:1:58: T35
                {
                mT35(); 

                }
                break;
            case 14 :
                // C.g:1:62: T36
                {
                mT36(); 

                }
                break;
            case 15 :
                // C.g:1:66: T37
                {
                mT37(); 

                }
                break;
            case 16 :
                // C.g:1:70: T38
                {
                mT38(); 

                }
                break;
            case 17 :
                // C.g:1:74: T39
                {
                mT39(); 

                }
                break;
            case 18 :
                // C.g:1:78: T40
                {
                mT40(); 

                }
                break;
            case 19 :
                // C.g:1:82: T41
                {
                mT41(); 

                }
                break;
            case 20 :
                // C.g:1:86: T42
                {
                mT42(); 

                }
                break;
            case 21 :
                // C.g:1:90: T43
                {
                mT43(); 

                }
                break;
            case 22 :
                // C.g:1:94: T44
                {
                mT44(); 

                }
                break;
            case 23 :
                // C.g:1:98: T45
                {
                mT45(); 

                }
                break;
            case 24 :
                // C.g:1:102: T46
                {
                mT46(); 

                }
                break;
            case 25 :
                // C.g:1:106: T47
                {
                mT47(); 

                }
                break;
            case 26 :
                // C.g:1:110: T48
                {
                mT48(); 

                }
                break;
            case 27 :
                // C.g:1:114: T49
                {
                mT49(); 

                }
                break;
            case 28 :
                // C.g:1:118: T50
                {
                mT50(); 

                }
                break;
            case 29 :
                // C.g:1:122: T51
                {
                mT51(); 

                }
                break;
            case 30 :
                // C.g:1:126: T52
                {
                mT52(); 

                }
                break;
            case 31 :
                // C.g:1:130: T53
                {
                mT53(); 

                }
                break;
            case 32 :
                // C.g:1:134: T54
                {
                mT54(); 

                }
                break;
            case 33 :
                // C.g:1:138: T55
                {
                mT55(); 

                }
                break;
            case 34 :
                // C.g:1:142: T56
                {
                mT56(); 

                }
                break;
            case 35 :
                // C.g:1:146: T57
                {
                mT57(); 

                }
                break;
            case 36 :
                // C.g:1:150: T58
                {
                mT58(); 

                }
                break;
            case 37 :
                // C.g:1:154: T59
                {
                mT59(); 

                }
                break;
            case 38 :
                // C.g:1:158: T60
                {
                mT60(); 

                }
                break;
            case 39 :
                // C.g:1:162: T61
                {
                mT61(); 

                }
                break;
            case 40 :
                // C.g:1:166: T62
                {
                mT62(); 

                }
                break;
            case 41 :
                // C.g:1:170: T63
                {
                mT63(); 

                }
                break;
            case 42 :
                // C.g:1:174: T64
                {
                mT64(); 

                }
                break;
            case 43 :
                // C.g:1:178: T65
                {
                mT65(); 

                }
                break;
            case 44 :
                // C.g:1:182: T66
                {
                mT66(); 

                }
                break;
            case 45 :
                // C.g:1:186: T67
                {
                mT67(); 

                }
                break;
            case 46 :
                // C.g:1:190: T68
                {
                mT68(); 

                }
                break;
            case 47 :
                // C.g:1:194: T69
                {
                mT69(); 

                }
                break;
            case 48 :
                // C.g:1:198: T70
                {
                mT70(); 

                }
                break;
            case 49 :
                // C.g:1:202: T71
                {
                mT71(); 

                }
                break;
            case 50 :
                // C.g:1:206: T72
                {
                mT72(); 

                }
                break;
            case 51 :
                // C.g:1:210: T73
                {
                mT73(); 

                }
                break;
            case 52 :
                // C.g:1:214: T74
                {
                mT74(); 

                }
                break;
            case 53 :
                // C.g:1:218: T75
                {
                mT75(); 

                }
                break;
            case 54 :
                // C.g:1:222: T76
                {
                mT76(); 

                }
                break;
            case 55 :
                // C.g:1:226: T77
                {
                mT77(); 

                }
                break;
            case 56 :
                // C.g:1:230: T78
                {
                mT78(); 

                }
                break;
            case 57 :
                // C.g:1:234: T79
                {
                mT79(); 

                }
                break;
            case 58 :
                // C.g:1:238: T80
                {
                mT80(); 

                }
                break;
            case 59 :
                // C.g:1:242: T81
                {
                mT81(); 

                }
                break;
            case 60 :
                // C.g:1:246: T82
                {
                mT82(); 

                }
                break;
            case 61 :
                // C.g:1:250: T83
                {
                mT83(); 

                }
                break;
            case 62 :
                // C.g:1:254: T84
                {
                mT84(); 

                }
                break;
            case 63 :
                // C.g:1:258: T85
                {
                mT85(); 

                }
                break;
            case 64 :
                // C.g:1:262: T86
                {
                mT86(); 

                }
                break;
            case 65 :
                // C.g:1:266: T87
                {
                mT87(); 

                }
                break;
            case 66 :
                // C.g:1:270: T88
                {
                mT88(); 

                }
                break;
            case 67 :
                // C.g:1:274: T89
                {
                mT89(); 

                }
                break;
            case 68 :
                // C.g:1:278: T90
                {
                mT90(); 

                }
                break;
            case 69 :
                // C.g:1:282: T91
                {
                mT91(); 

                }
                break;
            case 70 :
                // C.g:1:286: T92
                {
                mT92(); 

                }
                break;
            case 71 :
                // C.g:1:290: T93
                {
                mT93(); 

                }
                break;
            case 72 :
                // C.g:1:294: T94
                {
                mT94(); 

                }
                break;
            case 73 :
                // C.g:1:298: T95
                {
                mT95(); 

                }
                break;
            case 74 :
                // C.g:1:302: T96
                {
                mT96(); 

                }
                break;
            case 75 :
                // C.g:1:306: T97
                {
                mT97(); 

                }
                break;
            case 76 :
                // C.g:1:310: T98
                {
                mT98(); 

                }
                break;
            case 77 :
                // C.g:1:314: T99
                {
                mT99(); 

                }
                break;
            case 78 :
                // C.g:1:318: T100
                {
                mT100(); 

                }
                break;
            case 79 :
                // C.g:1:323: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 80 :
                // C.g:1:334: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 

                }
                break;
            case 81 :
                // C.g:1:352: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 82 :
                // C.g:1:367: HEX_LITERAL
                {
                mHEX_LITERAL(); 

                }
                break;
            case 83 :
                // C.g:1:379: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 

                }
                break;
            case 84 :
                // C.g:1:395: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 

                }
                break;
            case 85 :
                // C.g:1:409: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 86 :
                // C.g:1:432: WS
                {
                mWS(); 

                }
                break;
            case 87 :
                // C.g:1:435: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 88 :
                // C.g:1:443: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 89 :
                // C.g:1:456: LINE_COMMAND
                {
                mLINE_COMMAND(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA25_eotS =
        "\7\uffff\1\10\2\uffff";
    static final String DFA25_eofS =
        "\12\uffff";
    static final String DFA25_minS =
        "\2\56\2\uffff\1\53\1\uffff\2\60\2\uffff";
    static final String DFA25_maxS =
        "\1\71\1\146\2\uffff\1\71\1\uffff\1\71\1\146\2\uffff";
    static final String DFA25_acceptS =
        "\2\uffff\1\2\1\1\1\uffff\1\4\2\uffff\2\3";
    static final String DFA25_specialS =
        "\12\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
            "",
            "",
            "\1\6\1\uffff\1\6\2\uffff\12\7",
            "",
            "\12\7",
            "\12\7\12\uffff\1\11\1\uffff\1\11\35\uffff\1\11\1\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "532:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? FloatTypeSuffix );";
        }
    }
    static final String DFA35_eotS =
        "\1\uffff\1\50\2\uffff\1\61\13\50\7\uffff\1\110\1\112\1\116\1\122"+
        "\1\126\1\130\1\133\1\uffff\1\135\1\140\1\143\1\145\1\150\1\uffff"+
        "\3\50\3\uffff\2\156\2\uffff\1\50\2\uffff\15\50\1\u0082\4\50\1\u0088"+
        "\2\50\27\uffff\1\u008d\3\uffff\1\u008f\6\uffff\3\50\1\uffff\1\u0093"+
        "\1\uffff\1\156\22\50\1\uffff\1\u00a7\1\50\1\u00a9\2\50\1\uffff\3"+
        "\50\4\uffff\3\50\1\uffff\2\50\1\u00b4\1\u00b5\6\50\1\u00bc\3\50"+
        "\1\u00c0\1\u00c1\1\u00c2\2\50\1\uffff\1\u00c5\1\uffff\6\50\1\u00cc"+
        "\3\50\2\uffff\5\50\1\u00d5\1\uffff\3\50\3\uffff\1\u00d9\1\50\1\uffff"+
        "\1\u00db\3\50\1\u00df\1\u00e0\1\uffff\1\u00e1\1\50\1\u00e3\1\u00e4"+
        "\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\uffff\1\u00e9\2\50\1\uffff\1"+
        "\50\1\uffff\1\u00ed\2\50\3\uffff\1\u00f0\7\uffff\3\50\1\uffff\1"+
        "\u00f4\1\50\1\uffff\1\u00f6\1\u00f7\1\u00f8\1\uffff\1\u00f9\4\uffff";
    static final String DFA35_eofS =
        "\u00fa\uffff";
    static final String DFA35_minS =
        "\1\11\1\171\2\uffff\1\75\1\154\1\150\1\165\1\145\1\157\1\141\1\146"+
        "\1\157\1\154\1\145\1\156\7\uffff\1\75\1\56\1\53\1\55\1\52\1\75\1"+
        "\46\1\uffff\1\75\1\74\3\75\1\uffff\1\150\1\157\1\162\3\uffff\2\56"+
        "\2\uffff\1\160\2\uffff\1\164\1\163\1\165\1\151\1\141\1\147\1\157"+
        "\1\164\1\147\1\151\1\163\1\141\1\156\1\44\1\164\1\156\1\162\1\157"+
        "\1\44\1\146\1\151\27\uffff\1\75\3\uffff\1\75\6\uffff\1\151\1\164"+
        "\1\145\1\uffff\1\56\1\uffff\1\56\3\145\1\155\2\164\1\165\1\145\1"+
        "\156\1\162\1\157\1\165\1\151\1\141\1\144\1\145\1\162\1\163\1\uffff"+
        "\1\44\1\147\1\44\1\141\1\142\1\uffff\1\141\1\151\1\157\4\uffff\1"+
        "\154\1\157\1\141\1\uffff\1\144\1\162\2\44\1\143\1\151\1\143\1\157"+
        "\1\145\1\164\1\44\1\162\1\163\1\164\3\44\1\164\1\151\1\uffff\1\44"+
        "\1\uffff\1\164\1\154\1\165\1\147\1\156\1\145\1\44\1\153\1\145\1"+
        "\156\2\uffff\1\150\1\143\1\164\1\146\1\144\1\44\1\uffff\1\156\1"+
        "\164\1\151\3\uffff\1\44\1\156\1\uffff\1\44\1\145\1\154\1\156\2\44"+
        "\1\uffff\1\44\1\146\6\44\1\uffff\1\44\1\145\1\154\1\uffff\1\165"+
        "\1\uffff\1\44\1\164\1\145\3\uffff\1\44\7\uffff\1\162\2\145\1\uffff"+
        "\1\44\1\144\1\uffff\3\44\1\uffff\1\44\4\uffff";
    static final String DFA35_maxS =
        "\1\176\1\171\2\uffff\1\75\1\170\1\167\1\165\1\145\2\157\1\156\3"+
        "\157\1\156\7\uffff\1\75\1\71\1\75\1\76\3\75\1\uffff\2\75\1\76\1"+
        "\75\1\174\1\uffff\1\150\1\157\1\162\3\uffff\1\170\1\146\2\uffff"+
        "\1\160\2\uffff\1\164\1\163\1\165\1\151\1\162\1\172\1\157\2\164\1"+
        "\154\1\163\1\141\1\156\1\172\1\164\1\156\1\162\1\157\1\172\1\146"+
        "\1\163\27\uffff\1\75\3\uffff\1\75\6\uffff\1\151\1\164\1\145\1\uffff"+
        "\1\146\1\uffff\1\146\3\145\1\155\2\164\1\165\1\145\1\156\1\162\1"+
        "\157\1\165\1\151\1\141\1\144\1\145\1\162\1\164\1\uffff\1\172\1\147"+
        "\1\172\1\141\1\142\1\uffff\1\141\1\151\1\157\4\uffff\1\154\1\157"+
        "\1\141\1\uffff\1\144\1\162\2\172\1\143\1\151\1\143\1\157\1\145\1"+
        "\164\1\172\1\162\1\163\1\164\3\172\1\164\1\151\1\uffff\1\172\1\uffff"+
        "\1\164\1\154\1\165\1\147\1\156\1\145\1\172\1\153\1\145\1\156\2\uffff"+
        "\1\150\1\143\1\164\1\146\1\144\1\172\1\uffff\1\156\1\164\1\151\3"+
        "\uffff\1\172\1\156\1\uffff\1\172\1\145\1\154\1\156\2\172\1\uffff"+
        "\1\172\1\146\6\172\1\uffff\1\172\1\145\1\154\1\uffff\1\165\1\uffff"+
        "\1\172\1\164\1\145\3\uffff\1\172\7\uffff\1\162\2\145\1\uffff\1\172"+
        "\1\144\1\uffff\3\172\1\uffff\1\172\4\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\1\3\14\uffff\1\22\1\23\1\26\1\32\1\33\1\34\1\35\7\uffff"+
        "\1\52\5\uffff\1\66\3\uffff\1\117\1\120\1\121\2\uffff\1\126\1\131"+
        "\1\uffff\1\73\1\4\25\uffff\1\54\1\36\1\37\1\47\1\125\1\44\1\57\1"+
        "\40\1\45\1\50\1\60\1\41\1\130\1\127\1\55\1\42\1\56\1\43\1\63\1\70"+
        "\1\51\1\74\1\53\1\uffff\1\77\1\75\1\100\1\uffff\1\76\1\64\1\72\1"+
        "\65\1\67\1\71\3\uffff\1\122\1\uffff\1\123\23\uffff\1\105\5\uffff"+
        "\1\111\3\uffff\1\61\1\101\1\62\1\102\3\uffff\1\124\23\uffff\1\14"+
        "\1\uffff\1\112\12\uffff\1\106\1\27\6\uffff\1\7\3\uffff\1\11\1\103"+
        "\1\12\2\uffff\1\15\6\uffff\1\113\10\uffff\1\13\3\uffff\1\30\1\uffff"+
        "\1\16\3\uffff\1\25\1\110\1\115\1\uffff\1\5\1\107\1\6\1\24\1\46\1"+
        "\20\1\116\3\uffff\1\17\2\uffff\1\1\3\uffff\1\104\1\uffff\1\10\1"+
        "\31\1\114\1\21";
    static final String DFA35_specialS =
        "\u00fa\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\55\1\uffff\2\55\22\uffff\1\55\1\37\1\52\1\56\1\50\1\34\1"+
            "\35\1\51\1\23\1\24\1\27\1\31\1\3\1\32\1\30\1\33\1\53\11\54\1"+
            "\22\1\2\1\40\1\4\1\41\1\44\1\uffff\32\50\1\25\1\uffff\1\26\1"+
            "\42\1\50\1\uffff\1\7\1\47\1\12\1\16\1\5\1\15\1\46\1\50\1\13"+
            "\2\50\1\14\5\50\1\10\1\6\1\1\1\17\1\11\1\45\3\50\1\20\1\43\1"+
            "\21\1\36",
            "\1\57",
            "",
            "",
            "\1\60",
            "\1\63\1\uffff\1\64\11\uffff\1\62",
            "\1\70\1\67\12\uffff\1\66\2\uffff\1\65",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74\6\uffff\1\75\6\uffff\1\76",
            "\1\77\7\uffff\1\100",
            "\1\101",
            "\1\103\2\uffff\1\102",
            "\1\105\11\uffff\1\104",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\111\1\uffff\12\113",
            "\1\114\21\uffff\1\115",
            "\1\117\17\uffff\1\121\1\120",
            "\1\124\4\uffff\1\123\15\uffff\1\125",
            "\1\127",
            "\1\132\26\uffff\1\131",
            "",
            "\1\134",
            "\1\136\1\137",
            "\1\141\1\142",
            "\1\144",
            "\1\146\76\uffff\1\147",
            "",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "\1\113\1\uffff\10\155\2\113\12\uffff\3\113\21\uffff\1\154\13"+
            "\uffff\3\113\21\uffff\1\154",
            "\1\113\1\uffff\12\157\12\uffff\3\113\35\uffff\3\113",
            "",
            "",
            "\1\160",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165\20\uffff\1\166",
            "\1\170\22\uffff\1\167",
            "\1\171",
            "\1\172",
            "\1\174\14\uffff\1\173",
            "\1\176\2\uffff\1\175",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24"+
            "\50\1\u0087\5\50",
            "\1\u0089",
            "\1\u008b\11\uffff\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008c",
            "",
            "",
            "",
            "\1\u008e",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "\1\113\1\uffff\10\155\2\113\12\uffff\3\113\35\uffff\3\113",
            "",
            "\1\113\1\uffff\12\157\12\uffff\3\113\35\uffff\3\113",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5\1\u00a6",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00a8",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "",
            "",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00da",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00e2",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\u00f5",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "\1\50\13\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32"+
            "\50",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
        }
    }
 

}