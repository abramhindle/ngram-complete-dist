// $ANTLR !Unknown version! Python.g 2012-08-29 21:38:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PythonLexer extends Lexer {
    public static final int BACKQUOTE=55;
    public static final int SLASHEQUAL=21;
    public static final int STAR=14;
    public static final int CIRCUMFLEXEQUAL=25;
    public static final int TRIAPOS=63;
    public static final int GREATEREQUAL=37;
    public static final int COMPLEX=59;
    public static final int NOT=33;
    public static final int EOF=-1;
    public static final int LEADING_WS=68;
    public static final int NOTEQUAL=40;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int MINUSEQUAL=19;
    public static final int VBAR=41;
    public static final int RPAREN=9;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int NAME=10;
    public static final int GREATER=35;
    public static final int T__90=90;
    public static final int DOUBLESTAREQUAL=28;
    public static final int LESS=34;
    public static final int COMMENT=69;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RBRACK=52;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int LCURLY=53;
    public static final int INT=56;
    public static final int RIGHTSHIFT=30;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int DOUBLESLASHEQUAL=29;
    public static final int WS=67;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int VBAREQUAL=24;
    public static final int OR=31;
    public static final int LONGINT=57;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int PERCENTEQUAL=22;
    public static final int LESSEQUAL=38;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int DOUBLESLASH=49;
    public static final int CONTINUED_LINE=66;
    public static final int LBRACK=51;
    public static final int DOUBLESTAR=15;
    public static final int ESC=65;
    public static final int DIGITS=61;
    public static final int Exponent=62;
    public static final int DEDENT=5;
    public static final int FLOAT=58;
    public static final int RIGHTSHIFTEQUAL=27;
    public static final int AND=32;
    public static final int LPAREN=8;
    public static final int INDENT=4;
    public static final int PLUSEQUAL=18;
    public static final int AT=7;
    public static final int SLASH=47;
    public static final int COMMA=13;
    public static final int AMPER=43;
    public static final int EQUAL=36;
    public static final int TILDE=50;
    public static final int LEFTSHIFTEQUAL=26;
    public static final int LEFTSHIFT=44;
    public static final int PLUS=45;
    public static final int DOT=11;
    public static final int PERCENT=48;
    public static final int MINUS=46;
    public static final int SEMI=17;
    public static final int TRIQUOTE=64;
    public static final int COLON=12;
    public static final int NEWLINE=6;
    public static final int AMPEREQUAL=23;
    public static final int RCURLY=54;
    public static final int ASSIGN=16;
    public static final int STAREQUAL=20;
    public static final int CIRCUMFLEX=42;
    public static final int STRING=60;
    public static final int ALT_NOTEQUAL=39;

    /** Handles context-sensitive lexing of implicit line joining such as
     *  the case where newline is ignored in cases like this:
     *  a = [3,
     *       4]
     */
    int implicitLineJoiningLevel = 0;
    int startPos=-1;
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
    public int type = 0;


    // delegates
    // delegators

    public PythonLexer() {;} 
    public PythonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PythonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Python.g"; }

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:24:7: ( 'def' )
            // Python.g:24:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:25:7: ( 'print' )
            // Python.g:25:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:26:7: ( 'del' )
            // Python.g:26:9: 'del'
            {
            match("del"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:27:7: ( 'pass' )
            // Python.g:27:9: 'pass'
            {
            match("pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:28:7: ( 'break' )
            // Python.g:28:9: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:29:7: ( 'continue' )
            // Python.g:29:9: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:30:7: ( 'return' )
            // Python.g:30:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:31:7: ( 'raise' )
            // Python.g:31:9: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:32:7: ( 'import' )
            // Python.g:32:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:33:7: ( 'from' )
            // Python.g:33:9: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:34:7: ( 'as' )
            // Python.g:34:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:35:7: ( 'global' )
            // Python.g:35:9: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:36:7: ( 'exec' )
            // Python.g:36:9: 'exec'
            {
            match("exec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:37:7: ( 'in' )
            // Python.g:37:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:38:7: ( 'assert' )
            // Python.g:38:9: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:39:7: ( 'if' )
            // Python.g:39:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:40:7: ( 'else' )
            // Python.g:40:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:41:7: ( 'elif' )
            // Python.g:41:9: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:42:7: ( 'while' )
            // Python.g:42:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:43:7: ( 'for' )
            // Python.g:43:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:44:7: ( 'try' )
            // Python.g:44:9: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:45:7: ( 'finally' )
            // Python.g:45:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:46:7: ( 'with' )
            // Python.g:46:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:47:7: ( 'except' )
            // Python.g:47:9: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:48:7: ( 'is' )
            // Python.g:48:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:49:7: ( 'lambda' )
            // Python.g:49:9: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:50:7: ( 'class' )
            // Python.g:50:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:51:7: ( 'yield' )
            // Python.g:51:9: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:453:11: ( '(' )
            // Python.g:453:13: '('
            {
            match('('); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:455:11: ( ')' )
            // Python.g:455:13: ')'
            {
            match(')'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:457:11: ( '[' )
            // Python.g:457:13: '['
            {
            match('['); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:459:11: ( ']' )
            // Python.g:459:13: ']'
            {
            match(']'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:461:11: ( ':' )
            // Python.g:461:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:463:10: ( ',' )
            // Python.g:463:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:465:9: ( ';' )
            // Python.g:465:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:467:9: ( '+' )
            // Python.g:467:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:469:10: ( '-' )
            // Python.g:469:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:471:9: ( '*' )
            // Python.g:471:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:473:10: ( '/' )
            // Python.g:473:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "VBAR"
    public final void mVBAR() throws RecognitionException {
        try {
            int _type = VBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:475:9: ( '|' )
            // Python.g:475:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAR"

    // $ANTLR start "AMPER"
    public final void mAMPER() throws RecognitionException {
        try {
            int _type = AMPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:477:10: ( '&' )
            // Python.g:477:12: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:479:9: ( '<' )
            // Python.g:479:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:481:12: ( '>' )
            // Python.g:481:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:483:11: ( '=' )
            // Python.g:483:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:485:12: ( '%' )
            // Python.g:485:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "BACKQUOTE"
    public final void mBACKQUOTE() throws RecognitionException {
        try {
            int _type = BACKQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:487:14: ( '`' )
            // Python.g:487:16: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKQUOTE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:489:11: ( '{' )
            // Python.g:489:13: '{'
            {
            match('{'); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:491:11: ( '}' )
            // Python.g:491:13: '}'
            {
            match('}'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "CIRCUMFLEX"
    public final void mCIRCUMFLEX() throws RecognitionException {
        try {
            int _type = CIRCUMFLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:493:15: ( '^' )
            // Python.g:493:17: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCUMFLEX"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:495:10: ( '~' )
            // Python.g:495:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:497:10: ( '==' )
            // Python.g:497:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:499:13: ( '!=' )
            // Python.g:499:15: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "ALT_NOTEQUAL"
    public final void mALT_NOTEQUAL() throws RecognitionException {
        try {
            int _type = ALT_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:501:13: ( '<>' )
            // Python.g:501:15: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALT_NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:503:14: ( '<=' )
            // Python.g:503:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "LEFTSHIFT"
    public final void mLEFTSHIFT() throws RecognitionException {
        try {
            int _type = LEFTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:505:14: ( '<<' )
            // Python.g:505:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFT"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:507:17: ( '>=' )
            // Python.g:507:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "RIGHTSHIFT"
    public final void mRIGHTSHIFT() throws RecognitionException {
        try {
            int _type = RIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:509:15: ( '>>' )
            // Python.g:509:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFT"

    // $ANTLR start "PLUSEQUAL"
    public final void mPLUSEQUAL() throws RecognitionException {
        try {
            int _type = PLUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:511:14: ( '+=' )
            // Python.g:511:16: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQUAL"

    // $ANTLR start "MINUSEQUAL"
    public final void mMINUSEQUAL() throws RecognitionException {
        try {
            int _type = MINUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:513:15: ( '-=' )
            // Python.g:513:17: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSEQUAL"

    // $ANTLR start "DOUBLESTAR"
    public final void mDOUBLESTAR() throws RecognitionException {
        try {
            int _type = DOUBLESTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:515:15: ( '**' )
            // Python.g:515:17: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAR"

    // $ANTLR start "STAREQUAL"
    public final void mSTAREQUAL() throws RecognitionException {
        try {
            int _type = STAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:517:14: ( '*=' )
            // Python.g:517:16: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAREQUAL"

    // $ANTLR start "DOUBLESLASH"
    public final void mDOUBLESLASH() throws RecognitionException {
        try {
            int _type = DOUBLESLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:519:16: ( '//' )
            // Python.g:519:18: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESLASH"

    // $ANTLR start "SLASHEQUAL"
    public final void mSLASHEQUAL() throws RecognitionException {
        try {
            int _type = SLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:521:15: ( '/=' )
            // Python.g:521:17: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQUAL"

    // $ANTLR start "VBAREQUAL"
    public final void mVBAREQUAL() throws RecognitionException {
        try {
            int _type = VBAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:523:14: ( '|=' )
            // Python.g:523:16: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAREQUAL"

    // $ANTLR start "PERCENTEQUAL"
    public final void mPERCENTEQUAL() throws RecognitionException {
        try {
            int _type = PERCENTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:525:17: ( '%=' )
            // Python.g:525:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTEQUAL"

    // $ANTLR start "AMPEREQUAL"
    public final void mAMPEREQUAL() throws RecognitionException {
        try {
            int _type = AMPEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:527:15: ( '&=' )
            // Python.g:527:17: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPEREQUAL"

    // $ANTLR start "CIRCUMFLEXEQUAL"
    public final void mCIRCUMFLEXEQUAL() throws RecognitionException {
        try {
            int _type = CIRCUMFLEXEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:529:20: ( '^=' )
            // Python.g:529:22: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCUMFLEXEQUAL"

    // $ANTLR start "LEFTSHIFTEQUAL"
    public final void mLEFTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = LEFTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:531:19: ( '<<=' )
            // Python.g:531:21: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFTEQUAL"

    // $ANTLR start "RIGHTSHIFTEQUAL"
    public final void mRIGHTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = RIGHTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:533:20: ( '>>=' )
            // Python.g:533:22: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFTEQUAL"

    // $ANTLR start "DOUBLESTAREQUAL"
    public final void mDOUBLESTAREQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESTAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:535:20: ( '**=' )
            // Python.g:535:22: '**='
            {
            match("**="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAREQUAL"

    // $ANTLR start "DOUBLESLASHEQUAL"
    public final void mDOUBLESLASHEQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:537:21: ( '//=' )
            // Python.g:537:23: '//='
            {
            match("//="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESLASHEQUAL"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:539:5: ( '.' )
            // Python.g:539:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:541:4: ( '@' )
            // Python.g:541:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:543:5: ( 'and' )
            // Python.g:543:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:545:4: ( 'or' )
            // Python.g:545:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:547:5: ( 'not' )
            // Python.g:547:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:550:5: ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // Python.g:550:9: '.' DIGITS ( Exponent )?
                    {
                    match('.'); 
                    mDIGITS(); 
                    // Python.g:550:20: ( Exponent )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='E'||LA1_0=='e') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // Python.g:550:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Python.g:551:9: DIGITS '.' Exponent
                    {
                    mDIGITS(); 
                    match('.'); 
                    mExponent(); 

                    }
                    break;
                case 3 :
                    // Python.g:552:9: DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    {
                    mDIGITS(); 
                    // Python.g:552:16: ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    else if ( (LA4_0=='E'||LA4_0=='e') ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // Python.g:552:17: '.' ( DIGITS ( Exponent )? )?
                            {
                            match('.'); 
                            // Python.g:552:21: ( DIGITS ( Exponent )? )?
                            int alt3=2;
                            int LA3_0 = input.LA(1);

                            if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                                alt3=1;
                            }
                            switch (alt3) {
                                case 1 :
                                    // Python.g:552:22: DIGITS ( Exponent )?
                                    {
                                    mDIGITS(); 
                                    // Python.g:552:29: ( Exponent )?
                                    int alt2=2;
                                    int LA2_0 = input.LA(1);

                                    if ( (LA2_0=='E'||LA2_0=='e') ) {
                                        alt2=1;
                                    }
                                    switch (alt2) {
                                        case 1 :
                                            // Python.g:552:30: Exponent
                                            {
                                            mExponent(); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // Python.g:552:45: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LONGINT"
    public final void mLONGINT() throws RecognitionException {
        try {
            int _type = LONGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:556:5: ( INT ( 'l' | 'L' ) )
            // Python.g:556:9: INT ( 'l' | 'L' )
            {
            mINT(); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONGINT"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // Python.g:561:5: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
            // Python.g:561:10: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Python.g:561:22: ( '+' | '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='+'||LA6_0=='-') ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Python.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:564:5: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( DIGITS )* | '1' .. '9' ( DIGITS )* )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='X'||LA10_1=='x') ) {
                    alt10=1;
                }
                else {
                    alt10=2;}
            }
            else if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // Python.g:565:9: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // Python.g:565:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // Python.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Python.g:567:9: '0' ( DIGITS )*
                    {
                    match('0'); 
                    // Python.g:567:13: ( DIGITS )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Python.g:567:13: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // Python.g:568:9: '1' .. '9' ( DIGITS )*
                    {
                    matchRange('1','9'); 
                    // Python.g:568:18: ( DIGITS )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // Python.g:568:18: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMPLEX"
    public final void mCOMPLEX() throws RecognitionException {
        try {
            int _type = COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:572:5: ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // Python.g:572:9: INT ( 'j' | 'J' )
                    {
                    mINT(); 
                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // Python.g:573:9: FLOAT ( 'j' | 'J' )
                    {
                    mFLOAT(); 
                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // Python.g:577:8: ( ( '0' .. '9' )+ )
            // Python.g:577:10: ( '0' .. '9' )+
            {
            // Python.g:577:10: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Python.g:577:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:579:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // Python.g:579:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Python.g:580:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='z')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Python.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:587:5: ( ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' ) )
            // Python.g:587:9: ( 'r' | 'u' | 'ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            {
            // Python.g:587:9: ( 'r' | 'u' | 'ur' )?
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='r') ) {
                alt14=1;
            }
            else if ( (LA14_0=='u') ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2=='r') ) {
                    alt14=3;
                }
                else if ( (LA14_2=='\"'||LA14_2=='\'') ) {
                    alt14=2;
                }
            }
            switch (alt14) {
                case 1 :
                    // Python.g:587:10: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // Python.g:587:14: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // Python.g:587:18: 'ur'
                    {
                    match("ur"); 


                    }
                    break;

            }

            // Python.g:588:9: ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            int alt19=4;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\'') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='\'') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='\'') ) {
                        alt19=1;
                    }
                    else {
                        alt19=4;}
                }
                else if ( ((LA19_1>='\u0000' && LA19_1<='\t')||(LA19_1>='\u000B' && LA19_1<='&')||(LA19_1>='(' && LA19_1<='\uFFFF')) ) {
                    alt19=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0=='\"') ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2=='\"') ) {
                    int LA19_5 = input.LA(3);

                    if ( (LA19_5=='\"') ) {
                        alt19=2;
                    }
                    else {
                        alt19=3;}
                }
                else if ( ((LA19_2>='\u0000' && LA19_2<='\t')||(LA19_2>='\u000B' && LA19_2<='!')||(LA19_2>='#' && LA19_2<='\uFFFF')) ) {
                    alt19=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // Python.g:588:13: '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // Python.g:588:22: ( options {greedy=false; } : TRIAPOS )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\'') ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1=='\'') ) {
                                int LA15_3 = input.LA(3);

                                if ( (LA15_3=='\'') ) {
                                    alt15=2;
                                }
                                else if ( ((LA15_3>='\u0000' && LA15_3<='&')||(LA15_3>='(' && LA15_3<='\uFFFF')) ) {
                                    alt15=1;
                                }


                            }
                            else if ( ((LA15_1>='\u0000' && LA15_1<='&')||(LA15_1>='(' && LA15_1<='\uFFFF')) ) {
                                alt15=1;
                            }


                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='&')||(LA15_0>='(' && LA15_0<='\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Python.g:588:47: TRIAPOS
                    	    {
                    	    mTRIAPOS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 2 :
                    // Python.g:589:13: '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // Python.g:589:19: ( options {greedy=false; } : TRIQUOTE )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\"') ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1=='\"') ) {
                                int LA16_3 = input.LA(3);

                                if ( (LA16_3=='\"') ) {
                                    alt16=2;
                                }
                                else if ( ((LA16_3>='\u0000' && LA16_3<='!')||(LA16_3>='#' && LA16_3<='\uFFFF')) ) {
                                    alt16=1;
                                }


                            }
                            else if ( ((LA16_1>='\u0000' && LA16_1<='!')||(LA16_1>='#' && LA16_1<='\uFFFF')) ) {
                                alt16=1;
                            }


                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='\uFFFF')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Python.g:589:44: TRIQUOTE
                    	    {
                    	    mTRIQUOTE(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 3 :
                    // Python.g:590:13: '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // Python.g:590:17: ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Python.g:590:18: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // Python.g:590:22: ~ ( '\\\\' | '\\n' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 4 :
                    // Python.g:591:13: '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // Python.g:591:18: ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Python.g:591:19: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // Python.g:591:23: ~ ( '\\\\' | '\\n' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "TRIQUOTE"
    public final void mTRIQUOTE() throws RecognitionException {
        try {
            // Python.g:598:5: ( ( '\"' )? ( '\"' )? ( ESC | ~ ( '\\\\' | '\"' ) )+ )
            // Python.g:598:7: ( '\"' )? ( '\"' )? ( ESC | ~ ( '\\\\' | '\"' ) )+
            {
            // Python.g:598:7: ( '\"' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Python.g:598:7: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            // Python.g:598:12: ( '\"' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\"') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Python.g:598:12: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            // Python.g:598:17: ( ESC | ~ ( '\\\\' | '\"' ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=3;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='\\') ) {
                    alt22=1;
                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='!')||(LA22_0>='#' && LA22_0<='[')||(LA22_0>=']' && LA22_0<='\uFFFF')) ) {
                    alt22=2;
                }


                switch (alt22) {
            	case 1 :
            	    // Python.g:598:18: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // Python.g:598:22: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "TRIQUOTE"

    // $ANTLR start "TRIAPOS"
    public final void mTRIAPOS() throws RecognitionException {
        try {
            // Python.g:604:5: ( ( '\\'' )? ( '\\'' )? ( ESC | ~ ( '\\\\' | '\\'' ) )+ )
            // Python.g:604:7: ( '\\'' )? ( '\\'' )? ( ESC | ~ ( '\\\\' | '\\'' ) )+
            {
            // Python.g:604:7: ( '\\'' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\'') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // Python.g:604:7: '\\''
                    {
                    match('\''); 

                    }
                    break;

            }

            // Python.g:604:13: ( '\\'' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\'') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Python.g:604:13: '\\''
                    {
                    match('\''); 

                    }
                    break;

            }

            // Python.g:604:19: ( ESC | ~ ( '\\\\' | '\\'' ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    alt25=1;
                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // Python.g:604:20: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // Python.g:604:24: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "TRIAPOS"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // Python.g:609:5: ( '\\\\' . )
            // Python.g:609:10: '\\\\' .
            {
            match('\\'); 
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "CONTINUED_LINE"
    public final void mCONTINUED_LINE() throws RecognitionException {
        try {
            int _type = CONTINUED_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            CommonToken nl=null;

            // Python.g:617:5: ( '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl= NEWLINE | ) )
            // Python.g:617:10: '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* (nl= NEWLINE | )
            {
            match('\\'); 
            // Python.g:617:15: ( '\\r' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\r') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Python.g:617:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // Python.g:617:28: ( ' ' | '\\t' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\t'||LA27_0==' ') ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Python.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             _channel=HIDDEN; 
            // Python.g:618:10: (nl= NEWLINE | )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\n'||(LA28_0>='\f' && LA28_0<='\r')) ) {
                alt28=1;
            }
            else {
                alt28=2;}
            switch (alt28) {
                case 1 :
                    // Python.g:618:12: nl= NEWLINE
                    {
                    int nlStart1530 = getCharIndex();
                    mNEWLINE(); 
                    nl = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nlStart1530, getCharIndex()-1);
                    emit(new ClassicToken(NEWLINE,nl.getText()));

                    }
                    break;
                case 2 :
                    // Python.g:620:10: 
                    {
                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUED_LINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:630:5: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' )+ )
            // Python.g:630:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            {
            // Python.g:630:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='\n'||(LA31_0>='\f' && LA31_0<='\r')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Python.g:630:10: ( '\\u000C' )? ( '\\r' )? '\\n'
            	    {
            	    // Python.g:630:10: ( '\\u000C' )?
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0=='\f') ) {
            	        alt29=1;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // Python.g:630:11: '\\u000C'
            	            {
            	            match('\f'); 

            	            }
            	            break;

            	    }

            	    // Python.g:630:21: ( '\\r' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0=='\r') ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // Python.g:630:22: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            if ( startPos==0 || implicitLineJoiningLevel>0 )
                        _channel=HIDDEN;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:636:5: ({...}? => ( ' ' | '\\t' | '\\u000C' )+ )
            // Python.g:636:10: {...}? => ( ' ' | '\\t' | '\\u000C' )+
            {
            if ( !((startPos>0)) ) {
                throw new FailedPredicateException(input, "WS", "startPos>0");
            }
            // Python.g:636:26: ( ' ' | '\\t' | '\\u000C' )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0=='\t'||LA32_0=='\f'||LA32_0==' ') ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // Python.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LEADING_WS"
    public final void mLEADING_WS() throws RecognitionException {
        try {
            int _type = LEADING_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                int spaces = 0;

            // Python.g:649:5: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
            // Python.g:649:9: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            {
            if ( !((startPos==0)) ) {
                throw new FailedPredicateException(input, "LEADING_WS", "startPos==0");
            }
            // Python.g:650:9: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==' ') ) {
                int LA37_1 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA37_0=='\t') ) {
                int LA37_2 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt37=1;
                }
                else if ( (true) ) {
                    alt37=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // Python.g:650:13: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !((implicitLineJoiningLevel>0)) ) {
                        throw new FailedPredicateException(input, "LEADING_WS", "implicitLineJoiningLevel>0");
                    }
                    // Python.g:650:43: ( ' ' | '\\t' )+
                    int cnt33=0;
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0=='\t'||LA33_0==' ') ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // Python.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt33 >= 1 ) break loop33;
                                EarlyExitException eee =
                                    new EarlyExitException(33, input);
                                throw eee;
                        }
                        cnt33++;
                    } while (true);

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // Python.g:651:17: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
                    {
                    // Python.g:651:17: ( ' ' | '\\t' )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=3;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==' ') ) {
                            alt34=1;
                        }
                        else if ( (LA34_0=='\t') ) {
                            alt34=2;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // Python.g:651:23: ' '
                    	    {
                    	    match(' '); 
                    	     spaces++; 

                    	    }
                    	    break;
                    	case 2 :
                    	    // Python.g:652:18: '\\t'
                    	    {
                    	    match('\t'); 
                    	     spaces += 8; spaces -= (spaces % 8); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                                // make a string of n spaces where n is column number - 1
                                char[] indentation = new char[spaces];
                                for (int i=0; i<spaces; i++) {
                                    indentation[i] = ' ';
                                }
                                String s = new String(indentation);
                                emit(new ClassicToken(LEADING_WS,new String(indentation)));
                                
                    // Python.g:665:13: ( ( '\\r' )? '\\n' )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0=='\n'||LA36_0=='\r') ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // Python.g:665:15: ( '\\r' )? '\\n'
                    	    {
                    	    // Python.g:665:15: ( '\\r' )?
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( (LA35_0=='\r') ) {
                    	        alt35=1;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // Python.g:665:16: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }

                    	    match('\n'); 
                    	     _channel=HIDDEN;

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEADING_WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Python.g:688:5: ( ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | {...}? => '#' (~ '\\n' )* ) )
            // Python.g:688:10: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | {...}? => '#' (~ '\\n' )* )
            {
            // Python.g:688:10: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | {...}? => '#' (~ '\\n' )* )
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // Python.g:688:12: {...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !((startPos==0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos==0");
                    }
                    // Python.g:688:29: ( ' ' | '\\t' )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0=='\t'||LA38_0==' ') ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // Python.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match('#'); 
                    // Python.g:688:45: (~ '\\n' )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( ((LA39_0>='\u0000' && LA39_0<='\t')||(LA39_0>='\u000B' && LA39_0<='\uFFFF')) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // Python.g:688:46: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // Python.g:688:54: ( '\\n' )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0=='\n') ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // Python.g:688:54: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt40 >= 1 ) break loop40;
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // Python.g:689:10: {...}? => '#' (~ '\\n' )*
                    {
                    if ( !((startPos>0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos>0");
                    }
                    match('#'); 
                    // Python.g:689:30: (~ '\\n' )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>='\u0000' && LA41_0<='\t')||(LA41_0>='\u000B' && LA41_0<='\uFFFF')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // Python.g:689:31: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }


                        if (!preserveWhitespacesAndComments) {
                            skip();
                        } else {
                            _channel = HIDDEN;
                        }
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // Python.g:1:8: ( T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT )
        int alt43=87;
        alt43 = dfa43.predict(input);
        switch (alt43) {
            case 1 :
                // Python.g:1:10: T__70
                {
                mT__70(); 

                }
                break;
            case 2 :
                // Python.g:1:16: T__71
                {
                mT__71(); 

                }
                break;
            case 3 :
                // Python.g:1:22: T__72
                {
                mT__72(); 

                }
                break;
            case 4 :
                // Python.g:1:28: T__73
                {
                mT__73(); 

                }
                break;
            case 5 :
                // Python.g:1:34: T__74
                {
                mT__74(); 

                }
                break;
            case 6 :
                // Python.g:1:40: T__75
                {
                mT__75(); 

                }
                break;
            case 7 :
                // Python.g:1:46: T__76
                {
                mT__76(); 

                }
                break;
            case 8 :
                // Python.g:1:52: T__77
                {
                mT__77(); 

                }
                break;
            case 9 :
                // Python.g:1:58: T__78
                {
                mT__78(); 

                }
                break;
            case 10 :
                // Python.g:1:64: T__79
                {
                mT__79(); 

                }
                break;
            case 11 :
                // Python.g:1:70: T__80
                {
                mT__80(); 

                }
                break;
            case 12 :
                // Python.g:1:76: T__81
                {
                mT__81(); 

                }
                break;
            case 13 :
                // Python.g:1:82: T__82
                {
                mT__82(); 

                }
                break;
            case 14 :
                // Python.g:1:88: T__83
                {
                mT__83(); 

                }
                break;
            case 15 :
                // Python.g:1:94: T__84
                {
                mT__84(); 

                }
                break;
            case 16 :
                // Python.g:1:100: T__85
                {
                mT__85(); 

                }
                break;
            case 17 :
                // Python.g:1:106: T__86
                {
                mT__86(); 

                }
                break;
            case 18 :
                // Python.g:1:112: T__87
                {
                mT__87(); 

                }
                break;
            case 19 :
                // Python.g:1:118: T__88
                {
                mT__88(); 

                }
                break;
            case 20 :
                // Python.g:1:124: T__89
                {
                mT__89(); 

                }
                break;
            case 21 :
                // Python.g:1:130: T__90
                {
                mT__90(); 

                }
                break;
            case 22 :
                // Python.g:1:136: T__91
                {
                mT__91(); 

                }
                break;
            case 23 :
                // Python.g:1:142: T__92
                {
                mT__92(); 

                }
                break;
            case 24 :
                // Python.g:1:148: T__93
                {
                mT__93(); 

                }
                break;
            case 25 :
                // Python.g:1:154: T__94
                {
                mT__94(); 

                }
                break;
            case 26 :
                // Python.g:1:160: T__95
                {
                mT__95(); 

                }
                break;
            case 27 :
                // Python.g:1:166: T__96
                {
                mT__96(); 

                }
                break;
            case 28 :
                // Python.g:1:172: T__97
                {
                mT__97(); 

                }
                break;
            case 29 :
                // Python.g:1:178: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 30 :
                // Python.g:1:185: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 31 :
                // Python.g:1:192: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 32 :
                // Python.g:1:199: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 33 :
                // Python.g:1:206: COLON
                {
                mCOLON(); 

                }
                break;
            case 34 :
                // Python.g:1:212: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 35 :
                // Python.g:1:218: SEMI
                {
                mSEMI(); 

                }
                break;
            case 36 :
                // Python.g:1:223: PLUS
                {
                mPLUS(); 

                }
                break;
            case 37 :
                // Python.g:1:228: MINUS
                {
                mMINUS(); 

                }
                break;
            case 38 :
                // Python.g:1:234: STAR
                {
                mSTAR(); 

                }
                break;
            case 39 :
                // Python.g:1:239: SLASH
                {
                mSLASH(); 

                }
                break;
            case 40 :
                // Python.g:1:245: VBAR
                {
                mVBAR(); 

                }
                break;
            case 41 :
                // Python.g:1:250: AMPER
                {
                mAMPER(); 

                }
                break;
            case 42 :
                // Python.g:1:256: LESS
                {
                mLESS(); 

                }
                break;
            case 43 :
                // Python.g:1:261: GREATER
                {
                mGREATER(); 

                }
                break;
            case 44 :
                // Python.g:1:269: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 45 :
                // Python.g:1:276: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 46 :
                // Python.g:1:284: BACKQUOTE
                {
                mBACKQUOTE(); 

                }
                break;
            case 47 :
                // Python.g:1:294: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 48 :
                // Python.g:1:301: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 49 :
                // Python.g:1:308: CIRCUMFLEX
                {
                mCIRCUMFLEX(); 

                }
                break;
            case 50 :
                // Python.g:1:319: TILDE
                {
                mTILDE(); 

                }
                break;
            case 51 :
                // Python.g:1:325: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 52 :
                // Python.g:1:331: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 53 :
                // Python.g:1:340: ALT_NOTEQUAL
                {
                mALT_NOTEQUAL(); 

                }
                break;
            case 54 :
                // Python.g:1:353: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 55 :
                // Python.g:1:363: LEFTSHIFT
                {
                mLEFTSHIFT(); 

                }
                break;
            case 56 :
                // Python.g:1:373: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 57 :
                // Python.g:1:386: RIGHTSHIFT
                {
                mRIGHTSHIFT(); 

                }
                break;
            case 58 :
                // Python.g:1:397: PLUSEQUAL
                {
                mPLUSEQUAL(); 

                }
                break;
            case 59 :
                // Python.g:1:407: MINUSEQUAL
                {
                mMINUSEQUAL(); 

                }
                break;
            case 60 :
                // Python.g:1:418: DOUBLESTAR
                {
                mDOUBLESTAR(); 

                }
                break;
            case 61 :
                // Python.g:1:429: STAREQUAL
                {
                mSTAREQUAL(); 

                }
                break;
            case 62 :
                // Python.g:1:439: DOUBLESLASH
                {
                mDOUBLESLASH(); 

                }
                break;
            case 63 :
                // Python.g:1:451: SLASHEQUAL
                {
                mSLASHEQUAL(); 

                }
                break;
            case 64 :
                // Python.g:1:462: VBAREQUAL
                {
                mVBAREQUAL(); 

                }
                break;
            case 65 :
                // Python.g:1:472: PERCENTEQUAL
                {
                mPERCENTEQUAL(); 

                }
                break;
            case 66 :
                // Python.g:1:485: AMPEREQUAL
                {
                mAMPEREQUAL(); 

                }
                break;
            case 67 :
                // Python.g:1:496: CIRCUMFLEXEQUAL
                {
                mCIRCUMFLEXEQUAL(); 

                }
                break;
            case 68 :
                // Python.g:1:512: LEFTSHIFTEQUAL
                {
                mLEFTSHIFTEQUAL(); 

                }
                break;
            case 69 :
                // Python.g:1:527: RIGHTSHIFTEQUAL
                {
                mRIGHTSHIFTEQUAL(); 

                }
                break;
            case 70 :
                // Python.g:1:543: DOUBLESTAREQUAL
                {
                mDOUBLESTAREQUAL(); 

                }
                break;
            case 71 :
                // Python.g:1:559: DOUBLESLASHEQUAL
                {
                mDOUBLESLASHEQUAL(); 

                }
                break;
            case 72 :
                // Python.g:1:576: DOT
                {
                mDOT(); 

                }
                break;
            case 73 :
                // Python.g:1:580: AT
                {
                mAT(); 

                }
                break;
            case 74 :
                // Python.g:1:583: AND
                {
                mAND(); 

                }
                break;
            case 75 :
                // Python.g:1:587: OR
                {
                mOR(); 

                }
                break;
            case 76 :
                // Python.g:1:590: NOT
                {
                mNOT(); 

                }
                break;
            case 77 :
                // Python.g:1:594: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 78 :
                // Python.g:1:600: LONGINT
                {
                mLONGINT(); 

                }
                break;
            case 79 :
                // Python.g:1:608: INT
                {
                mINT(); 

                }
                break;
            case 80 :
                // Python.g:1:612: COMPLEX
                {
                mCOMPLEX(); 

                }
                break;
            case 81 :
                // Python.g:1:620: NAME
                {
                mNAME(); 

                }
                break;
            case 82 :
                // Python.g:1:625: STRING
                {
                mSTRING(); 

                }
                break;
            case 83 :
                // Python.g:1:632: CONTINUED_LINE
                {
                mCONTINUED_LINE(); 

                }
                break;
            case 84 :
                // Python.g:1:647: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 85 :
                // Python.g:1:655: WS
                {
                mWS(); 

                }
                break;
            case 86 :
                // Python.g:1:658: LEADING_WS
                {
                mLEADING_WS(); 

                }
                break;
            case 87 :
                // Python.g:1:669: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA43 dfa43 = new DFA43(this);
    static final String DFA5_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA5_eofS =
        "\6\uffff";
    static final String DFA5_minS =
        "\1\56\1\uffff\1\56\1\105\2\uffff";
    static final String DFA5_maxS =
        "\1\71\1\uffff\2\145\2\uffff";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA5_specialS =
        "\6\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1\1\uffff\12\2",
            "",
            "\1\3\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "\1\5\37\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "549:1: FLOAT : ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) );";
        }
    }
    static final String DFA11_eotS =
        "\7\uffff";
    static final String DFA11_eofS =
        "\7\uffff";
    static final String DFA11_minS =
        "\3\56\2\uffff\2\56";
    static final String DFA11_maxS =
        "\1\71\1\170\1\152\2\uffff\2\152";
    static final String DFA11_acceptS =
        "\3\uffff\1\2\1\1\2\uffff";
    static final String DFA11_specialS =
        "\7\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\3\1\uffff\1\1\11\2",
            "\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\15\uffff\1\4\14"+
            "\uffff\1\3\4\uffff\1\4\15\uffff\1\4",
            "\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4",
            "",
            "",
            "\1\3\1\uffff\12\5\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4",
            "\1\3\1\uffff\12\6\13\uffff\1\3\4\uffff\1\4\32\uffff\1\3\4\uffff"+
            "\1\4"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "571:1: COMPLEX : ( INT ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) );";
        }
    }
    static final String DFA42_eotS =
        "\2\uffff\2\4\1\uffff";
    static final String DFA42_eofS =
        "\5\uffff";
    static final String DFA42_minS =
        "\1\11\1\uffff\2\0\1\uffff";
    static final String DFA42_maxS =
        "\1\43\1\uffff\2\uffff\1\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA42_specialS =
        "\1\2\1\uffff\1\1\1\0\1\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "",
            "\12\3\1\1\ufff5\3",
            "\12\3\1\1\ufff5\3",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "688:10: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | {...}? => '#' (~ '\\n' )* )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA42_3 = input.LA(1);

                         
                        int index42_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA42_3>='\u0000' && LA42_3<='\t')||(LA42_3>='\u000B' && LA42_3<='\uFFFF')) && (((startPos==0)||(startPos>0)))) {s = 3;}

                        else if ( (LA42_3=='\n') && ((startPos==0))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index42_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA42_2 = input.LA(1);

                         
                        int index42_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA42_2>='\u0000' && LA42_2<='\t')||(LA42_2>='\u000B' && LA42_2<='\uFFFF')) && (((startPos==0)||(startPos>0)))) {s = 3;}

                        else if ( (LA42_2=='\n') && ((startPos==0))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index42_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA42_0 = input.LA(1);

                         
                        int index42_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA42_0=='\t'||LA42_0==' ') && ((startPos==0))) {s = 1;}

                        else if ( (LA42_0=='#') && (((startPos==0)||(startPos>0)))) {s = 2;}

                         
                        input.seek(index42_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 42, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\1\uffff\16\55\7\uffff\1\117\1\121\1\124\1\127\1\131\1\133\1\137"+
        "\1\142\1\144\1\146\3\uffff\1\150\2\uffff\1\151\1\uffff\2\55\2\157"+
        "\1\55\3\uffff\1\166\1\uffff\1\170\1\172\1\uffff\11\55\1\u0085\1"+
        "\u0086\1\u0087\3\55\1\u008c\11\55\4\uffff\1\u0099\2\uffff\1\u009b"+
        "\10\uffff\1\u009d\2\uffff\1\u009f\10\uffff\1\u00a0\1\u00a2\1\55"+
        "\1\uffff\1\157\2\uffff\1\u00a0\2\uffff\1\157\1\55\5\uffff\1\u00a9"+
        "\1\u00aa\10\55\3\uffff\1\55\1\u00b4\2\55\1\uffff\1\u00b7\7\55\1"+
        "\u00bf\2\55\13\uffff\1\u00c4\1\157\1\uffff\1\u00a0\1\uffff\1\u00a0"+
        "\2\uffff\1\55\1\u00c9\6\55\1\u00d0\1\uffff\2\55\1\uffff\1\55\1\u00d4"+
        "\1\55\1\u00d6\1\u00d7\1\55\1\u00d9\1\uffff\2\55\1\uffff\1\u00a0"+
        "\2\uffff\1\u00a0\1\uffff\1\u00de\1\uffff\1\u00df\1\55\1\u00e1\1"+
        "\55\1\u00e3\1\55\1\uffff\3\55\1\uffff\1\55\2\uffff\1\u00e9\1\uffff"+
        "\1\55\1\u00eb\1\uffff\1\u00a0\2\uffff\1\55\1\uffff\1\u00ed\1\uffff"+
        "\1\u00ee\1\55\1\u00f0\1\u00f1\1\u00f2\1\uffff\1\u00f3\1\uffff\1"+
        "\55\2\uffff\1\u00f5\4\uffff\1\u00f6\2\uffff";
    static final String DFA43_eofS =
        "\u00f7\uffff";
    static final String DFA43_minS =
        "\1\11\1\145\1\141\1\162\1\154\1\42\1\146\1\151\1\156\2\154\1\150"+
        "\1\162\1\141\1\151\7\uffff\2\75\1\52\1\57\2\75\1\74\3\75\3\uffff"+
        "\1\75\2\uffff\1\60\1\uffff\1\162\1\157\2\56\1\42\3\uffff\1\12\1"+
        "\uffff\2\11\1\uffff\1\146\1\151\1\163\1\145\1\156\1\141\1\164\1"+
        "\151\1\160\3\60\1\157\1\162\1\156\1\60\1\144\1\157\1\143\2\151\1"+
        "\164\1\171\1\155\1\145\4\uffff\1\75\2\uffff\1\75\10\uffff\1\75\2"+
        "\uffff\1\75\10\uffff\2\60\1\164\1\60\1\56\2\uffff\1\60\1\uffff\1"+
        "\53\1\56\1\42\2\uffff\1\0\1\uffff\1\0\2\60\1\156\1\163\1\141\1\164"+
        "\1\163\1\165\1\163\1\157\3\uffff\1\155\1\60\1\141\1\145\1\uffff"+
        "\1\60\1\142\1\143\2\145\1\146\1\154\1\150\1\60\1\142\1\154\11\uffff"+
        "\1\53\1\uffff\2\60\1\53\3\60\2\uffff\1\164\1\60\1\153\1\151\1\163"+
        "\1\162\1\145\1\162\1\60\1\uffff\1\154\1\162\1\uffff\1\141\1\60\1"+
        "\160\2\60\1\145\1\60\1\uffff\2\144\2\60\1\uffff\2\60\1\53\1\60\1"+
        "\uffff\1\60\1\156\1\60\1\156\1\60\1\164\1\uffff\1\154\1\164\1\154"+
        "\1\uffff\1\164\2\uffff\1\60\1\uffff\1\141\3\60\2\uffff\1\165\1\uffff"+
        "\1\60\1\uffff\1\60\1\171\3\60\1\uffff\1\60\1\uffff\1\145\2\uffff"+
        "\1\60\4\uffff\1\60\2\uffff";
    static final String DFA43_maxS =
        "\1\176\1\145\2\162\1\157\1\145\1\163\1\162\1\163\1\154\1\170\1\151"+
        "\1\162\1\141\1\151\7\uffff\6\75\2\76\2\75\3\uffff\1\75\2\uffff\1"+
        "\71\1\uffff\1\162\1\157\1\170\1\154\1\162\3\uffff\1\15\1\uffff\2"+
        "\43\1\uffff\1\154\1\151\1\163\1\145\1\156\1\141\1\164\1\151\1\160"+
        "\3\172\1\157\1\162\1\156\1\172\1\144\1\157\1\145\1\163\1\151\1\164"+
        "\1\171\1\155\1\145\4\uffff\1\75\2\uffff\1\75\10\uffff\1\75\2\uffff"+
        "\1\75\10\uffff\1\152\1\172\1\164\1\146\1\154\2\uffff\1\152\1\uffff"+
        "\1\71\1\154\1\47\2\uffff\1\0\1\uffff\1\0\2\172\1\156\1\163\1\141"+
        "\1\164\1\163\1\165\1\163\1\157\3\uffff\1\155\1\172\1\141\1\145\1"+
        "\uffff\1\172\1\142\1\143\2\145\1\146\1\154\1\150\1\172\1\142\1\154"+
        "\11\uffff\1\71\1\uffff\1\172\1\154\1\71\1\152\1\71\1\152\2\uffff"+
        "\1\164\1\172\1\153\1\151\1\163\1\162\1\145\1\162\1\172\1\uffff\1"+
        "\154\1\162\1\uffff\1\141\1\172\1\160\2\172\1\145\1\172\1\uffff\2"+
        "\144\1\71\1\152\1\uffff\1\71\1\152\1\71\1\172\1\uffff\1\172\1\156"+
        "\1\172\1\156\1\172\1\164\1\uffff\1\154\1\164\1\154\1\uffff\1\164"+
        "\2\uffff\1\172\1\uffff\1\141\1\172\1\71\1\152\2\uffff\1\165\1\uffff"+
        "\1\172\1\uffff\1\172\1\171\3\172\1\uffff\1\172\1\uffff\1\145\2\uffff"+
        "\1\172\4\uffff\1\172\2\uffff";
    static final String DFA43_acceptS =
        "\17\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\12\uffff\1\56\1\57"+
        "\1\60\1\uffff\1\62\1\64\1\uffff\1\111\5\uffff\1\121\1\122\1\123"+
        "\1\uffff\1\124\2\uffff\1\127\31\uffff\1\72\1\44\1\73\1\45\1\uffff"+
        "\1\75\1\46\1\uffff\1\77\1\47\1\100\1\50\1\102\1\51\1\65\1\66\1\uffff"+
        "\1\52\1\70\1\uffff\1\53\1\63\1\54\1\101\1\55\1\103\1\61\1\110\5"+
        "\uffff\1\117\1\120\1\uffff\1\116\3\uffff\1\125\1\126\1\uffff\1\127"+
        "\13\uffff\1\16\1\20\1\31\4\uffff\1\13\13\uffff\1\106\1\74\1\107"+
        "\1\76\1\104\1\67\1\105\1\71\1\115\1\uffff\1\113\6\uffff\1\1\1\3"+
        "\11\uffff\1\24\2\uffff\1\112\7\uffff\1\25\4\uffff\1\114\4\uffff"+
        "\1\4\6\uffff\1\12\3\uffff\1\15\1\uffff\1\21\1\22\1\uffff\1\27\4"+
        "\uffff\1\2\1\5\1\uffff\1\33\1\uffff\1\10\5\uffff\1\23\1\uffff\1"+
        "\34\1\uffff\1\7\1\11\1\uffff\1\17\1\14\1\30\1\32\1\uffff\1\26\1"+
        "\6";
    static final String DFA43_specialS =
        "\1\0\57\uffff\1\5\1\uffff\1\2\1\1\104\uffff\1\3\1\uffff\1\4\174"+
        "\uffff}>";
    static final String[] DFA43_transitionS = {
            "\1\63\1\61\1\uffff\1\60\1\61\22\uffff\1\62\1\45\1\56\1\64\1"+
            "\uffff\1\37\1\33\1\56\1\17\1\20\1\30\1\26\1\24\1\27\1\46\1\31"+
            "\1\52\11\53\1\23\1\25\1\34\1\36\1\35\1\uffff\1\47\32\55\1\21"+
            "\1\57\1\22\1\43\1\55\1\40\1\10\1\3\1\4\1\1\1\12\1\7\1\11\1\55"+
            "\1\6\2\55\1\15\1\55\1\51\1\50\1\2\1\55\1\5\1\55\1\14\1\54\1"+
            "\55\1\13\1\55\1\16\1\55\1\41\1\32\1\42\1\44",
            "\1\65",
            "\1\67\20\uffff\1\66",
            "\1\70",
            "\1\72\2\uffff\1\71",
            "\1\56\4\uffff\1\56\71\uffff\1\74\3\uffff\1\73",
            "\1\77\6\uffff\1\75\1\76\4\uffff\1\100",
            "\1\103\5\uffff\1\102\2\uffff\1\101",
            "\1\105\4\uffff\1\104",
            "\1\106",
            "\1\110\13\uffff\1\107",
            "\1\111\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\120",
            "\1\122\22\uffff\1\123",
            "\1\125\15\uffff\1\126",
            "\1\130",
            "\1\132",
            "\1\136\1\135\1\134",
            "\1\140\1\141",
            "\1\143",
            "\1\145",
            "",
            "",
            "",
            "\1\147",
            "",
            "",
            "\12\152",
            "",
            "\1\153",
            "\1\154",
            "\1\161\1\uffff\12\156\13\uffff\1\163\4\uffff\1\160\1\uffff"+
            "\1\162\13\uffff\1\155\14\uffff\1\163\4\uffff\1\160\1\uffff\1"+
            "\162\13\uffff\1\155",
            "\1\161\1\uffff\12\164\13\uffff\1\163\4\uffff\1\160\1\uffff"+
            "\1\162\30\uffff\1\163\4\uffff\1\160\1\uffff\1\162",
            "\1\56\4\uffff\1\56\112\uffff\1\165",
            "",
            "",
            "",
            "\1\61\2\uffff\1\61",
            "",
            "\1\63\1\167\1\uffff\1\166\1\167\22\uffff\1\62\2\uffff\1\171",
            "\1\63\1\167\1\uffff\1\166\1\167\22\uffff\1\62\2\uffff\1\171",
            "",
            "\1\173\5\uffff\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\22\55\1\u008b\7\55",
            "\1\u008d",
            "\1\u008e",
            "\1\u0090\1\uffff\1\u008f",
            "\1\u0092\11\uffff\1\u0091",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "",
            "",
            "",
            "\1\u0098",
            "",
            "",
            "\1\u009a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u009c",
            "",
            "",
            "\1\u009e",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\152\13\uffff\1\u00a1\4\uffff\1\160\32\uffff\1\u00a1\4\uffff"+
            "\1\160",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00a3",
            "\12\u00a4\7\uffff\6\u00a4\32\uffff\6\u00a4",
            "\1\161\1\uffff\12\156\13\uffff\1\163\4\uffff\1\160\1\uffff"+
            "\1\162\30\uffff\1\163\4\uffff\1\160\1\uffff\1\162",
            "",
            "",
            "\12\u00a6\13\uffff\1\u00a5\4\uffff\1\160\32\uffff\1\u00a5\4"+
            "\uffff\1\160",
            "",
            "\1\u00a7\1\uffff\1\u00a7\2\uffff\12\u00a8",
            "\1\161\1\uffff\12\164\13\uffff\1\163\4\uffff\1\160\1\uffff"+
            "\1\162\30\uffff\1\163\4\uffff\1\160\1\uffff\1\162",
            "\1\56\4\uffff\1\56",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "",
            "",
            "\1\u00b3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c2\1\uffff\1\u00c2\2\uffff\12\u00c3",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u00a4\7\uffff\6\u00a4\3\uffff\1\160\1\uffff\1\162\24\uffff"+
            "\6\u00a4\3\uffff\1\160\1\uffff\1\162",
            "\1\u00c5\1\uffff\1\u00c5\2\uffff\12\u00c6",
            "\12\u00a6\13\uffff\1\u00c7\4\uffff\1\160\32\uffff\1\u00c7\4"+
            "\uffff\1\160",
            "\12\u00a8",
            "\12\u00a8\20\uffff\1\160\37\uffff\1\160",
            "",
            "",
            "\1\u00c8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d5",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00d8",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00da",
            "\1\u00db",
            "\12\u00c3",
            "\12\u00c3\20\uffff\1\160\37\uffff\1\160",
            "",
            "\12\u00c6",
            "\12\u00c6\20\uffff\1\160\37\uffff\1\160",
            "\1\u00dc\1\uffff\1\u00dc\2\uffff\12\u00dd",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e0",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e2",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00e4",
            "",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00ea",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\u00dd",
            "\12\u00dd\20\uffff\1\160\37\uffff\1\160",
            "",
            "",
            "\1\u00ec",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\1\u00ef",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "\1\u00f4",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            "",
            "",
            "",
            "\12\55\7\uffff\32\55\4\uffff\1\55\1\uffff\32\55",
            "",
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0=='d') ) {s = 1;}

                        else if ( (LA43_0=='p') ) {s = 2;}

                        else if ( (LA43_0=='b') ) {s = 3;}

                        else if ( (LA43_0=='c') ) {s = 4;}

                        else if ( (LA43_0=='r') ) {s = 5;}

                        else if ( (LA43_0=='i') ) {s = 6;}

                        else if ( (LA43_0=='f') ) {s = 7;}

                        else if ( (LA43_0=='a') ) {s = 8;}

                        else if ( (LA43_0=='g') ) {s = 9;}

                        else if ( (LA43_0=='e') ) {s = 10;}

                        else if ( (LA43_0=='w') ) {s = 11;}

                        else if ( (LA43_0=='t') ) {s = 12;}

                        else if ( (LA43_0=='l') ) {s = 13;}

                        else if ( (LA43_0=='y') ) {s = 14;}

                        else if ( (LA43_0=='(') ) {s = 15;}

                        else if ( (LA43_0==')') ) {s = 16;}

                        else if ( (LA43_0=='[') ) {s = 17;}

                        else if ( (LA43_0==']') ) {s = 18;}

                        else if ( (LA43_0==':') ) {s = 19;}

                        else if ( (LA43_0==',') ) {s = 20;}

                        else if ( (LA43_0==';') ) {s = 21;}

                        else if ( (LA43_0=='+') ) {s = 22;}

                        else if ( (LA43_0=='-') ) {s = 23;}

                        else if ( (LA43_0=='*') ) {s = 24;}

                        else if ( (LA43_0=='/') ) {s = 25;}

                        else if ( (LA43_0=='|') ) {s = 26;}

                        else if ( (LA43_0=='&') ) {s = 27;}

                        else if ( (LA43_0=='<') ) {s = 28;}

                        else if ( (LA43_0=='>') ) {s = 29;}

                        else if ( (LA43_0=='=') ) {s = 30;}

                        else if ( (LA43_0=='%') ) {s = 31;}

                        else if ( (LA43_0=='`') ) {s = 32;}

                        else if ( (LA43_0=='{') ) {s = 33;}

                        else if ( (LA43_0=='}') ) {s = 34;}

                        else if ( (LA43_0=='^') ) {s = 35;}

                        else if ( (LA43_0=='~') ) {s = 36;}

                        else if ( (LA43_0=='!') ) {s = 37;}

                        else if ( (LA43_0=='.') ) {s = 38;}

                        else if ( (LA43_0=='@') ) {s = 39;}

                        else if ( (LA43_0=='o') ) {s = 40;}

                        else if ( (LA43_0=='n') ) {s = 41;}

                        else if ( (LA43_0=='0') ) {s = 42;}

                        else if ( ((LA43_0>='1' && LA43_0<='9')) ) {s = 43;}

                        else if ( (LA43_0=='u') ) {s = 44;}

                        else if ( ((LA43_0>='A' && LA43_0<='Z')||LA43_0=='_'||LA43_0=='h'||(LA43_0>='j' && LA43_0<='k')||LA43_0=='m'||LA43_0=='q'||LA43_0=='s'||LA43_0=='v'||LA43_0=='x'||LA43_0=='z') ) {s = 45;}

                        else if ( (LA43_0=='\"'||LA43_0=='\'') ) {s = 46;}

                        else if ( (LA43_0=='\\') ) {s = 47;}

                        else if ( (LA43_0=='\f') ) {s = 48;}

                        else if ( (LA43_0=='\n'||LA43_0=='\r') ) {s = 49;}

                        else if ( (LA43_0==' ') && (((startPos==0)||(startPos>0)))) {s = 50;}

                        else if ( (LA43_0=='\t') && (((startPos==0)||(startPos>0)))) {s = 51;}

                        else if ( (LA43_0=='#') && (((startPos==0)||(startPos>0)))) {s = 52;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_51 = input.LA(1);

                         
                        int index43_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_51=='#') && ((startPos==0))) {s = 121;}

                        else if ( (LA43_51==' ') && (((startPos==0)||(startPos>0)))) {s = 50;}

                        else if ( (LA43_51=='\n'||LA43_51=='\r') && ((startPos==0))) {s = 119;}

                        else if ( (LA43_51=='\t') && (((startPos==0)||(startPos>0)))) {s = 51;}

                        else if ( (LA43_51=='\f') && ((startPos>0))) {s = 118;}

                        else s = 122;

                         
                        input.seek(index43_51);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_50 = input.LA(1);

                         
                        int index43_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_50=='\n'||LA43_50=='\r') && ((startPos==0))) {s = 119;}

                        else if ( (LA43_50==' ') && (((startPos==0)||(startPos>0)))) {s = 50;}

                        else if ( (LA43_50=='\t') && (((startPos==0)||(startPos>0)))) {s = 51;}

                        else if ( (LA43_50=='#') && ((startPos==0))) {s = 121;}

                        else if ( (LA43_50=='\f') && ((startPos>0))) {s = 118;}

                        else s = 120;

                         
                        input.seek(index43_50);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_120 = input.LA(1);

                         
                        int index43_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((startPos>0)) ) {s = 118;}

                        else if ( ((((startPos==0)&&(implicitLineJoiningLevel>0))||(startPos==0))) ) {s = 119;}

                         
                        input.seek(index43_120);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_122 = input.LA(1);

                         
                        int index43_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((startPos>0)) ) {s = 118;}

                        else if ( ((((startPos==0)&&(implicitLineJoiningLevel>0))||(startPos==0))) ) {s = 119;}

                         
                        input.seek(index43_122);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_48 = input.LA(1);

                         
                        int index43_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_48=='\n'||LA43_48=='\r') ) {s = 49;}

                        else s = 118;

                         
                        input.seek(index43_48);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}