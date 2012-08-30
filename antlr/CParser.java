// $ANTLR 3.0.1 C.g 2011-07-05 22:40:17

import java.util.Set;
import java.util.HashSet;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
/** ANSI C ANTLR v3 grammar

Translated from Jutta Degener's 1995 ANSI C yacc grammar by Terence Parr
July 2006.  The lexical rules were taken from the Java grammar.

Jutta says: "In 1985, Jeff Lee published his Yacc grammar (which
is accompanied by a matching Lex specification) for the April 30, 1985 draft
version of the ANSI C standard.  Tom Stockfisch reposted it to net.sources in
1987; that original, as mentioned in the answer to question 17.25 of the
comp.lang.c FAQ, can be ftp'ed from ftp.uu.net,
   file usenet/net.sources/ansi.c.grammar.Z.
I intend to keep this version as close to the current C Standard grammar as
possible; please let me know if you discover discrepancies. Jutta Degener, 1995"

Generally speaking, you need symbol table info to parse C; typedefs
define types and then IDENTIFIERS are either types or plain IDs.  I'm doing
the min necessary here tracking only type names.  This is a good example
of the global scope (called Symbols).  Every rule that declares its usage
of Symbols pushes a new copy on the stack effectively creating a new
symbol scope.  Also note rule declaration declares a rule scope that
lets any invoked rule see isTypedef boolean.  It's much easier than
passing that info down as parameters.  Very clean.  Rule
direct_declarator can then easily determine whether the IDENTIFIER
should be declared as a type name.

I have only tested this on a single file, though it is 3500 lines.

This grammar requires ANTLR v3.0.1 or higher.

Terence Parr
July 2006
*/
public class CParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "IDENTIFIER", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "FLOATING_POINT_LITERAL", "LETTER", "EscapeSequence", "HexDigit", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "OctalEscape", "UnicodeEscape", "WS", "COMMENT", "LINE_COMMENT", "LINE_COMMAND", "'typedef'", "';'", "','", "'='", "'extern'", "'static'", "'auto'", "'register'", "'void'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "'const'", "'volatile'", "'('", "')'", "'['", "']'", "'*'", "'...'", "'+'", "'-'", "'/'", "'%'", "'++'", "'--'", "'sizeof'", "'.'", "'->'", "'&'", "'~'", "'!'", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'?'", "'||'", "'&&'", "'|'", "'^'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'<<'", "'>>'", "'case'", "'default'", "'if'", "'else'", "'switch'", "'while'", "'do'", "'for'", "'goto'", "'continue'", "'break'", "'return'"
    };
    public static final int LINE_COMMENT=21;
    public static final int FloatTypeSuffix=16;
    public static final int IntegerTypeSuffix=14;
    public static final int LETTER=11;
    public static final int OCTAL_LITERAL=6;
    public static final int CHARACTER_LITERAL=8;
    public static final int Exponent=15;
    public static final int EOF=-1;
    public static final int HexDigit=13;
    public static final int STRING_LITERAL=9;
    public static final int WS=19;
    public static final int FLOATING_POINT_LITERAL=10;
    public static final int IDENTIFIER=4;
    public static final int UnicodeEscape=18;
    public static final int LINE_COMMAND=22;
    public static final int HEX_LITERAL=5;
    public static final int COMMENT=20;
    public static final int DECIMAL_LITERAL=7;
    public static final int EscapeSequence=12;
    public static final int OctalEscape=17;
    protected static class Symbols_scope {
        Set types;
        // only track types in order to get parser working;
    }
    protected Stack Symbols_stack = new Stack();


        public CParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[213+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "C.g"; }


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

    	boolean isTypeName(String name) {
    		for (int i = Symbols_stack.size()-1; i>=0; i--) {
    			Symbols_scope scope = (Symbols_scope)Symbols_stack.get(i);
    			if ( scope.types.contains(name) ) {
    				return true;
    			}
    		}
    		return false;
    	}



    // $ANTLR start translation_unit
    // C.g:86:1: translation_unit : ( external_declaration )+ ;
    public final void translation_unit() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int translation_unit_StartIndex = input.index();

          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }
            // C.g:91:2: ( ( external_declaration )+ )
            // C.g:91:4: ( external_declaration )+
            {
            // C.g:91:4: ( external_declaration )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==23||(LA1_0>=27 && LA1_0<=39)||(LA1_0>=42 && LA1_0<=43)||(LA1_0>=45 && LA1_0<=48)||LA1_0==52) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C.g:0:0: external_declaration
            	    {
            	    pushFollow(FOLLOW_external_declaration_in_translation_unit83);
            	    external_declaration();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, translation_unit_StartIndex); }
            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end translation_unit


    // $ANTLR start external_declaration
    // C.g:94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );
    public final void external_declaration() throws RecognitionException {
        int external_declaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }
            // C.g:110:2: ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=27 && LA2_0<=30)) ) {
                int LA2_1 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==31) ) {
                int LA2_2 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==32) ) {
                int LA2_3 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 3, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==33) ) {
                int LA2_4 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 4, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==34) ) {
                int LA2_5 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 5, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==35) ) {
                int LA2_6 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 6, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==36) ) {
                int LA2_7 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 7, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==37) ) {
                int LA2_8 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 8, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==38) ) {
                int LA2_9 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 9, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==39) ) {
                int LA2_10 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 10, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=42 && LA2_0<=43)) ) {
                int LA2_11 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 11, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==45) ) {
                int LA2_12 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 12, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==IDENTIFIER) ) {
                int LA2_13 = input.LA(2);

                if ( (((synpred4()&&isTypeName(input.LT(1).getText()))||synpred4())) ) {
                    alt2=1;
                }
                else if ( (isTypeName(input.LT(1).getText())) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 13, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=46 && LA2_0<=47)) ) {
                int LA2_14 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=1;
                }
                else if ( (true) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 14, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==52) && (synpred4())) {
                alt2=1;
            }
            else if ( (LA2_0==48) && (synpred4())) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("94:1: external_declaration options {k=1; } : ( ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition | declaration );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C.g:110:4: ( ( declaration_specifiers )? declarator ( declaration )* '{' )=> function_definition
                    {
                    pushFollow(FOLLOW_function_definition_in_external_declaration119);
                    function_definition();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:111:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_external_declaration124);
                    declaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, external_declaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end external_declaration


    // $ANTLR start function_definition
    // C.g:114:1: function_definition : ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) ;
    public final void function_definition() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int function_definition_StartIndex = input.index();

          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }
            // C.g:119:2: ( ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement ) )
            // C.g:119:4: ( declaration_specifiers )? declarator ( ( declaration )+ compound_statement | compound_statement )
            {
            // C.g:119:4: ( declaration_specifiers )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=27 && LA3_0<=39)||(LA3_0>=42 && LA3_0<=43)||(LA3_0>=45 && LA3_0<=47)) ) {
                alt3=1;
            }
            else if ( (LA3_0==IDENTIFIER) ) {
                switch ( input.LA(2) ) {
                    case 52:
                        {
                        alt3=1;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA3_18 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 48:
                        {
                        int LA3_19 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        {
                        int LA3_20 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 31:
                        {
                        int LA3_21 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 32:
                        {
                        int LA3_22 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 33:
                        {
                        int LA3_23 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 34:
                        {
                        int LA3_24 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 35:
                        {
                        int LA3_25 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 36:
                        {
                        int LA3_26 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 37:
                        {
                        int LA3_27 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 38:
                        {
                        int LA3_28 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 39:
                        {
                        int LA3_29 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 42:
                    case 43:
                        {
                        int LA3_30 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 45:
                        {
                        int LA3_31 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                    case 46:
                    case 47:
                        {
                        int LA3_32 = input.LA(3);

                        if ( ((synpred5()&&isTypeName(input.LT(1).getText()))) ) {
                            alt3=1;
                        }
                        }
                        break;
                }

            }
            switch (alt3) {
                case 1 :
                    // C.g:0:0: declaration_specifiers
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_function_definition146);
                    declaration_specifiers();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_declarator_in_function_definition149);
            declarator();
            _fsp--;
            if (failed) return ;
            // C.g:120:3: ( ( declaration )+ compound_statement | compound_statement )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==IDENTIFIER||LA5_0==23||(LA5_0>=27 && LA5_0<=39)||(LA5_0>=42 && LA5_0<=43)||(LA5_0>=45 && LA5_0<=47)) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("120:3: ( ( declaration )+ compound_statement | compound_statement )", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C.g:120:5: ( declaration )+ compound_statement
                    {
                    // C.g:120:5: ( declaration )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==IDENTIFIER||LA4_0==23||(LA4_0>=27 && LA4_0<=39)||(LA4_0>=42 && LA4_0<=43)||(LA4_0>=45 && LA4_0<=47)) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C.g:0:0: declaration
                    	    {
                    	    pushFollow(FOLLOW_declaration_in_function_definition155);
                    	    declaration();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);

                    pushFollow(FOLLOW_compound_statement_in_function_definition158);
                    compound_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:121:5: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_function_definition165);
                    compound_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, function_definition_StartIndex); }
            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end function_definition

    protected static class declaration_scope {
        boolean isTypedef;
    }
    protected Stack declaration_stack = new Stack();


    // $ANTLR start declaration
    // C.g:125:1: declaration : ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' );
    public final void declaration() throws RecognitionException {
        declaration_stack.push(new declaration_scope());
        int declaration_StartIndex = input.index();

          ((declaration_scope)declaration_stack.peek()).isTypedef = false;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }
            // C.g:132:2: ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==IDENTIFIER||(LA8_0>=27 && LA8_0<=39)||(LA8_0>=42 && LA8_0<=43)||(LA8_0>=45 && LA8_0<=47)) ) {
                alt8=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("125:1: declaration : ( 'typedef' ( declaration_specifiers )? init_declarator_list ';' | declaration_specifiers ( init_declarator_list )? ';' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C.g:132:4: 'typedef' ( declaration_specifiers )? init_declarator_list ';'
                    {
                    match(input,23,FOLLOW_23_in_declaration193); if (failed) return ;
                    // C.g:132:14: ( declaration_specifiers )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=27 && LA6_0<=39)||(LA6_0>=42 && LA6_0<=43)||(LA6_0>=45 && LA6_0<=47)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==IDENTIFIER) ) {
                        int LA6_13 = input.LA(2);

                        if ( (LA6_13==48) ) {
                            int LA6_18 = input.LA(3);

                            if ( ((synpred8()&&isTypeName(input.LT(1).getText()))) ) {
                                alt6=1;
                            }
                        }
                        else if ( (LA6_13==IDENTIFIER||(LA6_13>=27 && LA6_13<=39)||(LA6_13>=42 && LA6_13<=43)||(LA6_13>=45 && LA6_13<=47)||LA6_13==52) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // C.g:0:0: declaration_specifiers
                            {
                            pushFollow(FOLLOW_declaration_specifiers_in_declaration195);
                            declaration_specifiers();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                      ((declaration_scope)declaration_stack.peek()).isTypedef =true;
                    }
                    pushFollow(FOLLOW_init_declarator_list_in_declaration203);
                    init_declarator_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,24,FOLLOW_24_in_declaration205); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:134:4: declaration_specifiers ( init_declarator_list )? ';'
                    {
                    pushFollow(FOLLOW_declaration_specifiers_in_declaration211);
                    declaration_specifiers();
                    _fsp--;
                    if (failed) return ;
                    // C.g:134:27: ( init_declarator_list )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==IDENTIFIER||LA7_0==48||LA7_0==52) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C.g:0:0: init_declarator_list
                            {
                            pushFollow(FOLLOW_init_declarator_list_in_declaration213);
                            init_declarator_list();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    match(input,24,FOLLOW_24_in_declaration216); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, declaration_StartIndex); }
            declaration_stack.pop();
        }
        return ;
    }
    // $ANTLR end declaration


    // $ANTLR start declaration_specifiers
    // C.g:137:1: declaration_specifiers : ( storage_class_specifier | type_specifier | type_qualifier )+ ;
    public final void declaration_specifiers() throws RecognitionException {
        int declaration_specifiers_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }
            // C.g:138:2: ( ( storage_class_specifier | type_specifier | type_qualifier )+ )
            // C.g:138:6: ( storage_class_specifier | type_specifier | type_qualifier )+
            {
            // C.g:138:6: ( storage_class_specifier | type_specifier | type_qualifier )+
            int cnt9=0;
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    int LA9_2 = input.LA(2);

                    if ( ((synpred12()&&isTypeName(input.LT(1).getText()))) ) {
                        alt9=2;
                    }


                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    {
                    alt9=1;
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 45:
                    {
                    alt9=2;
                    }
                    break;
                case 46:
                case 47:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // C.g:138:10: storage_class_specifier
            	    {
            	    pushFollow(FOLLOW_storage_class_specifier_in_declaration_specifiers233);
            	    storage_class_specifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C.g:139:7: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_declaration_specifiers241);
            	    type_specifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C.g:140:13: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_declaration_specifiers255);
            	    type_qualifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, declaration_specifiers_StartIndex); }
        }
        return ;
    }
    // $ANTLR end declaration_specifiers


    // $ANTLR start init_declarator_list
    // C.g:144:1: init_declarator_list : init_declarator ( ',' init_declarator )* ;
    public final void init_declarator_list() throws RecognitionException {
        int init_declarator_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }
            // C.g:145:2: ( init_declarator ( ',' init_declarator )* )
            // C.g:145:4: init_declarator ( ',' init_declarator )*
            {
            pushFollow(FOLLOW_init_declarator_in_init_declarator_list277);
            init_declarator();
            _fsp--;
            if (failed) return ;
            // C.g:145:20: ( ',' init_declarator )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C.g:145:21: ',' init_declarator
            	    {
            	    match(input,25,FOLLOW_25_in_init_declarator_list280); if (failed) return ;
            	    pushFollow(FOLLOW_init_declarator_in_init_declarator_list282);
            	    init_declarator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, init_declarator_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end init_declarator_list


    // $ANTLR start init_declarator
    // C.g:148:1: init_declarator : declarator ( '=' initializer )? ;
    public final void init_declarator() throws RecognitionException {
        int init_declarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }
            // C.g:149:2: ( declarator ( '=' initializer )? )
            // C.g:149:4: declarator ( '=' initializer )?
            {
            pushFollow(FOLLOW_declarator_in_init_declarator295);
            declarator();
            _fsp--;
            if (failed) return ;
            // C.g:149:15: ( '=' initializer )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C.g:149:16: '=' initializer
                    {
                    match(input,26,FOLLOW_26_in_init_declarator298); if (failed) return ;
                    pushFollow(FOLLOW_initializer_in_init_declarator300);
                    initializer();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, init_declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end init_declarator


    // $ANTLR start storage_class_specifier
    // C.g:152:1: storage_class_specifier : ( 'extern' | 'static' | 'auto' | 'register' );
    public final void storage_class_specifier() throws RecognitionException {
        int storage_class_specifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }
            // C.g:153:2: ( 'extern' | 'static' | 'auto' | 'register' )
            // C.g:
            {
            if ( (input.LA(1)>=27 && input.LA(1)<=30) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_storage_class_specifier0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, storage_class_specifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end storage_class_specifier


    // $ANTLR start type_specifier
    // C.g:159:1: type_specifier : ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | type_id );
    public final void type_specifier() throws RecognitionException {
        int type_specifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }
            // C.g:160:2: ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | type_id )
            int alt12=12;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt12=1;
                }
                break;
            case 32:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            case 35:
                {
                alt12=5;
                }
                break;
            case 36:
                {
                alt12=6;
                }
                break;
            case 37:
                {
                alt12=7;
                }
                break;
            case 38:
                {
                alt12=8;
                }
                break;
            case 39:
                {
                alt12=9;
                }
                break;
            case 42:
            case 43:
                {
                alt12=10;
                }
                break;
            case 45:
                {
                alt12=11;
                }
                break;
            case IDENTIFIER:
                {
                alt12=12;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("159:1: type_specifier : ( 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | struct_or_union_specifier | enum_specifier | type_id );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C.g:160:4: 'void'
                    {
                    match(input,31,FOLLOW_31_in_type_specifier339); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:161:4: 'char'
                    {
                    match(input,32,FOLLOW_32_in_type_specifier344); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:162:4: 'short'
                    {
                    match(input,33,FOLLOW_33_in_type_specifier349); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C.g:163:4: 'int'
                    {
                    match(input,34,FOLLOW_34_in_type_specifier354); if (failed) return ;

                    }
                    break;
                case 5 :
                    // C.g:164:4: 'long'
                    {
                    match(input,35,FOLLOW_35_in_type_specifier359); if (failed) return ;

                    }
                    break;
                case 6 :
                    // C.g:165:4: 'float'
                    {
                    match(input,36,FOLLOW_36_in_type_specifier364); if (failed) return ;

                    }
                    break;
                case 7 :
                    // C.g:166:4: 'double'
                    {
                    match(input,37,FOLLOW_37_in_type_specifier369); if (failed) return ;

                    }
                    break;
                case 8 :
                    // C.g:167:4: 'signed'
                    {
                    match(input,38,FOLLOW_38_in_type_specifier374); if (failed) return ;

                    }
                    break;
                case 9 :
                    // C.g:168:4: 'unsigned'
                    {
                    match(input,39,FOLLOW_39_in_type_specifier379); if (failed) return ;

                    }
                    break;
                case 10 :
                    // C.g:169:4: struct_or_union_specifier
                    {
                    pushFollow(FOLLOW_struct_or_union_specifier_in_type_specifier384);
                    struct_or_union_specifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 11 :
                    // C.g:170:4: enum_specifier
                    {
                    pushFollow(FOLLOW_enum_specifier_in_type_specifier389);
                    enum_specifier();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 12 :
                    // C.g:171:4: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_type_specifier394);
                    type_id();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, type_specifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end type_specifier


    // $ANTLR start type_id
    // C.g:174:1: type_id : {...}? IDENTIFIER ;
    public final void type_id() throws RecognitionException {
        int type_id_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }
            // C.g:175:5: ({...}? IDENTIFIER )
            // C.g:175:9: {...}? IDENTIFIER
            {
            if ( !(isTypeName(input.LT(1).getText())) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "type_id", "isTypeName(input.LT(1).getText())");
            }
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_type_id412); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, type_id_StartIndex); }
        }
        return ;
    }
    // $ANTLR end type_id


    // $ANTLR start struct_or_union_specifier
    // C.g:179:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );
    public final void struct_or_union_specifier() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int struct_or_union_specifier_StartIndex = input.index();

          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }
            // C.g:185:2: ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=42 && LA14_0<=43)) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==IDENTIFIER) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==40) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==EOF||LA14_2==IDENTIFIER||(LA14_2>=24 && LA14_2<=25)||(LA14_2>=27 && LA14_2<=39)||(LA14_2>=42 && LA14_2<=50)||LA14_2==52) ) {
                        alt14=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("179:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );", 14, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1==40) ) {
                    alt14=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("179:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("179:1: struct_or_union_specifier options {k=3; } : ( struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}' | struct_or_union IDENTIFIER );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C.g:185:4: struct_or_union ( IDENTIFIER )? '{' struct_declaration_list '}'
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier445);
                    struct_or_union();
                    _fsp--;
                    if (failed) return ;
                    // C.g:185:20: ( IDENTIFIER )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==IDENTIFIER) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C.g:0:0: IDENTIFIER
                            {
                            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier447); if (failed) return ;

                            }
                            break;

                    }

                    match(input,40,FOLLOW_40_in_struct_or_union_specifier450); if (failed) return ;
                    pushFollow(FOLLOW_struct_declaration_list_in_struct_or_union_specifier452);
                    struct_declaration_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,41,FOLLOW_41_in_struct_or_union_specifier454); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:186:4: struct_or_union IDENTIFIER
                    {
                    pushFollow(FOLLOW_struct_or_union_in_struct_or_union_specifier459);
                    struct_or_union();
                    _fsp--;
                    if (failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_struct_or_union_specifier461); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, struct_or_union_specifier_StartIndex); }
            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end struct_or_union_specifier


    // $ANTLR start struct_or_union
    // C.g:189:1: struct_or_union : ( 'struct' | 'union' );
    public final void struct_or_union() throws RecognitionException {
        int struct_or_union_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }
            // C.g:190:2: ( 'struct' | 'union' )
            // C.g:
            {
            if ( (input.LA(1)>=42 && input.LA(1)<=43) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_struct_or_union0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, struct_or_union_StartIndex); }
        }
        return ;
    }
    // $ANTLR end struct_or_union


    // $ANTLR start struct_declaration_list
    // C.g:194:1: struct_declaration_list : ( struct_declaration )+ ;
    public final void struct_declaration_list() throws RecognitionException {
        int struct_declaration_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }
            // C.g:195:2: ( ( struct_declaration )+ )
            // C.g:195:4: ( struct_declaration )+
            {
            // C.g:195:4: ( struct_declaration )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENTIFIER||(LA15_0>=31 && LA15_0<=39)||(LA15_0>=42 && LA15_0<=43)||(LA15_0>=45 && LA15_0<=47)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C.g:0:0: struct_declaration
            	    {
            	    pushFollow(FOLLOW_struct_declaration_in_struct_declaration_list488);
            	    struct_declaration();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, struct_declaration_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end struct_declaration_list


    // $ANTLR start struct_declaration
    // C.g:198:1: struct_declaration : specifier_qualifier_list struct_declarator_list ';' ;
    public final void struct_declaration() throws RecognitionException {
        int struct_declaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }
            // C.g:199:2: ( specifier_qualifier_list struct_declarator_list ';' )
            // C.g:199:4: specifier_qualifier_list struct_declarator_list ';'
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_struct_declaration500);
            specifier_qualifier_list();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_struct_declarator_list_in_struct_declaration502);
            struct_declarator_list();
            _fsp--;
            if (failed) return ;
            match(input,24,FOLLOW_24_in_struct_declaration504); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, struct_declaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end struct_declaration


    // $ANTLR start specifier_qualifier_list
    // C.g:202:1: specifier_qualifier_list : ( type_qualifier | type_specifier )+ ;
    public final void specifier_qualifier_list() throws RecognitionException {
        int specifier_qualifier_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }
            // C.g:203:2: ( ( type_qualifier | type_specifier )+ )
            // C.g:203:4: ( type_qualifier | type_specifier )+
            {
            // C.g:203:4: ( type_qualifier | type_specifier )+
            int cnt16=0;
            loop16:
            do {
                int alt16=3;
                switch ( input.LA(1) ) {
                case IDENTIFIER:
                    {
                    switch ( input.LA(2) ) {
                    case 50:
                        {
                        int LA16_19 = input.LA(3);

                        if ( ((synpred35()&&isTypeName(input.LT(1).getText()))) ) {
                            alt16=2;
                        }


                        }
                        break;
                    case 48:
                        {
                        int LA16_20 = input.LA(3);

                        if ( ((synpred35()&&isTypeName(input.LT(1).getText()))) ) {
                            alt16=2;
                        }


                        }
                        break;
                    case 44:
                        {
                        int LA16_21 = input.LA(3);

                        if ( ((synpred35()&&isTypeName(input.LT(1).getText()))) ) {
                            alt16=2;
                        }


                        }
                        break;
                    case IDENTIFIER:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 42:
                    case 43:
                    case 45:
                    case 46:
                    case 47:
                    case 49:
                    case 52:
                        {
                        alt16=2;
                        }
                        break;

                    }

                    }
                    break;
                case 46:
                case 47:
                    {
                    alt16=1;
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 45:
                    {
                    alt16=2;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // C.g:203:6: type_qualifier
            	    {
            	    pushFollow(FOLLOW_type_qualifier_in_specifier_qualifier_list517);
            	    type_qualifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C.g:203:23: type_specifier
            	    {
            	    pushFollow(FOLLOW_type_specifier_in_specifier_qualifier_list521);
            	    type_specifier();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, specifier_qualifier_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end specifier_qualifier_list


    // $ANTLR start struct_declarator_list
    // C.g:206:1: struct_declarator_list : struct_declarator ( ',' struct_declarator )* ;
    public final void struct_declarator_list() throws RecognitionException {
        int struct_declarator_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return ; }
            // C.g:207:2: ( struct_declarator ( ',' struct_declarator )* )
            // C.g:207:4: struct_declarator ( ',' struct_declarator )*
            {
            pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list535);
            struct_declarator();
            _fsp--;
            if (failed) return ;
            // C.g:207:22: ( ',' struct_declarator )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C.g:207:23: ',' struct_declarator
            	    {
            	    match(input,25,FOLLOW_25_in_struct_declarator_list538); if (failed) return ;
            	    pushFollow(FOLLOW_struct_declarator_in_struct_declarator_list540);
            	    struct_declarator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, struct_declarator_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end struct_declarator_list


    // $ANTLR start struct_declarator
    // C.g:210:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );
    public final void struct_declarator() throws RecognitionException {
        int struct_declarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }
            // C.g:211:2: ( declarator ( ':' constant_expression )? | ':' constant_expression )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==IDENTIFIER||LA19_0==48||LA19_0==52) ) {
                alt19=1;
            }
            else if ( (LA19_0==44) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("210:1: struct_declarator : ( declarator ( ':' constant_expression )? | ':' constant_expression );", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // C.g:211:4: declarator ( ':' constant_expression )?
                    {
                    pushFollow(FOLLOW_declarator_in_struct_declarator553);
                    declarator();
                    _fsp--;
                    if (failed) return ;
                    // C.g:211:15: ( ':' constant_expression )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==44) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C.g:211:16: ':' constant_expression
                            {
                            match(input,44,FOLLOW_44_in_struct_declarator556); if (failed) return ;
                            pushFollow(FOLLOW_constant_expression_in_struct_declarator558);
                            constant_expression();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C.g:212:4: ':' constant_expression
                    {
                    match(input,44,FOLLOW_44_in_struct_declarator565); if (failed) return ;
                    pushFollow(FOLLOW_constant_expression_in_struct_declarator567);
                    constant_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, struct_declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end struct_declarator


    // $ANTLR start enum_specifier
    // C.g:215:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );
    public final void enum_specifier() throws RecognitionException {
        int enum_specifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }
            // C.g:217:2: ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==45) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==40) ) {
                    alt20=1;
                }
                else if ( (LA20_1==IDENTIFIER) ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3==40) ) {
                        alt20=2;
                    }
                    else if ( (LA20_3==EOF||LA20_3==IDENTIFIER||(LA20_3>=24 && LA20_3<=25)||(LA20_3>=27 && LA20_3<=39)||(LA20_3>=42 && LA20_3<=50)||LA20_3==52) ) {
                        alt20=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("215:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );", 20, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("215:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("215:1: enum_specifier options {k=3; } : ( 'enum' '{' enumerator_list '}' | 'enum' IDENTIFIER '{' enumerator_list '}' | 'enum' IDENTIFIER );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C.g:217:4: 'enum' '{' enumerator_list '}'
                    {
                    match(input,45,FOLLOW_45_in_enum_specifier585); if (failed) return ;
                    match(input,40,FOLLOW_40_in_enum_specifier587); if (failed) return ;
                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier589);
                    enumerator_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,41,FOLLOW_41_in_enum_specifier591); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:218:4: 'enum' IDENTIFIER '{' enumerator_list '}'
                    {
                    match(input,45,FOLLOW_45_in_enum_specifier596); if (failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier598); if (failed) return ;
                    match(input,40,FOLLOW_40_in_enum_specifier600); if (failed) return ;
                    pushFollow(FOLLOW_enumerator_list_in_enum_specifier602);
                    enumerator_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,41,FOLLOW_41_in_enum_specifier604); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:219:4: 'enum' IDENTIFIER
                    {
                    match(input,45,FOLLOW_45_in_enum_specifier609); if (failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enum_specifier611); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, enum_specifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end enum_specifier


    // $ANTLR start enumerator_list
    // C.g:222:1: enumerator_list : enumerator ( ',' enumerator )* ;
    public final void enumerator_list() throws RecognitionException {
        int enumerator_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }
            // C.g:223:2: ( enumerator ( ',' enumerator )* )
            // C.g:223:4: enumerator ( ',' enumerator )*
            {
            pushFollow(FOLLOW_enumerator_in_enumerator_list622);
            enumerator();
            _fsp--;
            if (failed) return ;
            // C.g:223:15: ( ',' enumerator )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==25) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C.g:223:16: ',' enumerator
            	    {
            	    match(input,25,FOLLOW_25_in_enumerator_list625); if (failed) return ;
            	    pushFollow(FOLLOW_enumerator_in_enumerator_list627);
            	    enumerator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, enumerator_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end enumerator_list


    // $ANTLR start enumerator
    // C.g:226:1: enumerator : IDENTIFIER ( '=' constant_expression )? ;
    public final void enumerator() throws RecognitionException {
        int enumerator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }
            // C.g:227:2: ( IDENTIFIER ( '=' constant_expression )? )
            // C.g:227:4: IDENTIFIER ( '=' constant_expression )?
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_enumerator640); if (failed) return ;
            // C.g:227:15: ( '=' constant_expression )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // C.g:227:16: '=' constant_expression
                    {
                    match(input,26,FOLLOW_26_in_enumerator643); if (failed) return ;
                    pushFollow(FOLLOW_constant_expression_in_enumerator645);
                    constant_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, enumerator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end enumerator


    // $ANTLR start type_qualifier
    // C.g:230:1: type_qualifier : ( 'const' | 'volatile' );
    public final void type_qualifier() throws RecognitionException {
        int type_qualifier_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }
            // C.g:231:2: ( 'const' | 'volatile' )
            // C.g:
            {
            if ( (input.LA(1)>=46 && input.LA(1)<=47) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_type_qualifier0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, type_qualifier_StartIndex); }
        }
        return ;
    }
    // $ANTLR end type_qualifier


    // $ANTLR start declarator
    // C.g:235:1: declarator : ( ( pointer )? direct_declarator | pointer );
    public final void declarator() throws RecognitionException {
        int declarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }
            // C.g:236:2: ( ( pointer )? direct_declarator | pointer )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==52) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred45()) ) {
                    alt24=1;
                }
                else if ( (true) ) {
                    alt24=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("235:1: declarator : ( ( pointer )? direct_declarator | pointer );", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==IDENTIFIER||LA24_0==48) ) {
                alt24=1;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("235:1: declarator : ( ( pointer )? direct_declarator | pointer );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // C.g:236:4: ( pointer )? direct_declarator
                    {
                    // C.g:236:4: ( pointer )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==52) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C.g:0:0: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_declarator674);
                            pointer();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_direct_declarator_in_declarator677);
                    direct_declarator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:237:4: pointer
                    {
                    pushFollow(FOLLOW_pointer_in_declarator682);
                    pointer();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end declarator


    // $ANTLR start direct_declarator
    // C.g:240:1: direct_declarator : ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* ;
    public final void direct_declarator() throws RecognitionException {
        int direct_declarator_StartIndex = input.index();
        Token IDENTIFIER1=null;

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }
            // C.g:241:2: ( ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )* )
            // C.g:241:6: ( IDENTIFIER | '(' declarator ')' ) ( declarator_suffix )*
            {
            // C.g:241:6: ( IDENTIFIER | '(' declarator ')' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==IDENTIFIER) ) {
                alt25=1;
            }
            else if ( (LA25_0==48) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("241:6: ( IDENTIFIER | '(' declarator ')' )", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // C.g:241:8: IDENTIFIER
                    {
                    IDENTIFIER1=(Token)input.LT(1);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_direct_declarator697); if (failed) return ;
                    if ( backtracking==0 ) {

                      			if (declaration_stack.size()>0&&((declaration_scope)declaration_stack.peek()).isTypedef) {
                      				((Symbols_scope)Symbols_stack.peek()).types.add(IDENTIFIER1.getText());
                      				System.out.println("define type "+IDENTIFIER1.getText());
                      			}
                      			
                    }

                    }
                    break;
                case 2 :
                    // C.g:248:5: '(' declarator ')'
                    {
                    match(input,48,FOLLOW_48_in_direct_declarator708); if (failed) return ;
                    pushFollow(FOLLOW_declarator_in_direct_declarator710);
                    declarator();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_direct_declarator712); if (failed) return ;

                    }
                    break;

            }

            // C.g:250:9: ( declarator_suffix )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==48) ) {
                    switch ( input.LA(2) ) {
                    case 49:
                        {
                        int LA26_26 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA26_27 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        {
                        int LA26_31 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 31:
                        {
                        int LA26_32 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 32:
                        {
                        int LA26_33 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 33:
                        {
                        int LA26_34 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 34:
                        {
                        int LA26_35 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 35:
                        {
                        int LA26_36 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 36:
                        {
                        int LA26_37 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 37:
                        {
                        int LA26_38 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 38:
                        {
                        int LA26_39 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 39:
                        {
                        int LA26_40 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 42:
                    case 43:
                        {
                        int LA26_41 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 45:
                        {
                        int LA26_42 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 46:
                    case 47:
                        {
                        int LA26_43 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;

                    }

                }
                else if ( (LA26_0==50) ) {
                    switch ( input.LA(2) ) {
                    case 51:
                        {
                        int LA26_44 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 48:
                        {
                        int LA26_45 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA26_46 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case HEX_LITERAL:
                    case OCTAL_LITERAL:
                    case DECIMAL_LITERAL:
                    case CHARACTER_LITERAL:
                    case STRING_LITERAL:
                    case FLOATING_POINT_LITERAL:
                        {
                        int LA26_47 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 58:
                        {
                        int LA26_48 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 59:
                        {
                        int LA26_49 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 52:
                    case 54:
                    case 55:
                    case 63:
                    case 64:
                    case 65:
                        {
                        int LA26_50 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;
                    case 60:
                        {
                        int LA26_51 = input.LA(3);

                        if ( (synpred47()) ) {
                            alt26=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt26) {
            	case 1 :
            	    // C.g:0:0: declarator_suffix
            	    {
            	    pushFollow(FOLLOW_declarator_suffix_in_direct_declarator726);
            	    declarator_suffix();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, direct_declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end direct_declarator


    // $ANTLR start declarator_suffix
    // C.g:253:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );
    public final void declarator_suffix() throws RecognitionException {
        int declarator_suffix_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }
            // C.g:254:2: ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' )
            int alt27=5;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==50) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==51) ) {
                    alt27=2;
                }
                else if ( ((LA27_1>=IDENTIFIER && LA27_1<=FLOATING_POINT_LITERAL)||LA27_1==48||LA27_1==52||(LA27_1>=54 && LA27_1<=55)||(LA27_1>=58 && LA27_1<=60)||(LA27_1>=63 && LA27_1<=65)) ) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("253:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==48) ) {
                switch ( input.LA(2) ) {
                case 49:
                    {
                    alt27=5;
                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 45:
                case 46:
                case 47:
                    {
                    alt27=3;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA27_24 = input.LA(3);

                    if ( (synpred50()) ) {
                        alt27=3;
                    }
                    else if ( (synpred51()) ) {
                        alt27=4;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("253:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );", 27, 24, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("253:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );", 27, 2, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("253:1: declarator_suffix : ( '[' constant_expression ']' | '[' ']' | '(' parameter_type_list ')' | '(' identifier_list ')' | '(' ')' );", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C.g:254:6: '[' constant_expression ']'
                    {
                    match(input,50,FOLLOW_50_in_declarator_suffix740); if (failed) return ;
                    pushFollow(FOLLOW_constant_expression_in_declarator_suffix742);
                    constant_expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,51,FOLLOW_51_in_declarator_suffix744); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:255:9: '[' ']'
                    {
                    match(input,50,FOLLOW_50_in_declarator_suffix754); if (failed) return ;
                    match(input,51,FOLLOW_51_in_declarator_suffix756); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:256:9: '(' parameter_type_list ')'
                    {
                    match(input,48,FOLLOW_48_in_declarator_suffix766); if (failed) return ;
                    pushFollow(FOLLOW_parameter_type_list_in_declarator_suffix768);
                    parameter_type_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_declarator_suffix770); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C.g:257:9: '(' identifier_list ')'
                    {
                    match(input,48,FOLLOW_48_in_declarator_suffix780); if (failed) return ;
                    pushFollow(FOLLOW_identifier_list_in_declarator_suffix782);
                    identifier_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_declarator_suffix784); if (failed) return ;

                    }
                    break;
                case 5 :
                    // C.g:258:9: '(' ')'
                    {
                    match(input,48,FOLLOW_48_in_declarator_suffix794); if (failed) return ;
                    match(input,49,FOLLOW_49_in_declarator_suffix796); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, declarator_suffix_StartIndex); }
        }
        return ;
    }
    // $ANTLR end declarator_suffix


    // $ANTLR start pointer
    // C.g:261:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );
    public final void pointer() throws RecognitionException {
        int pointer_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }
            // C.g:262:2: ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case IDENTIFIER:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 42:
                case 43:
                case 44:
                case 45:
                case 48:
                case 49:
                case 50:
                    {
                    alt30=3;
                    }
                    break;
                case 46:
                case 47:
                    {
                    int LA30_17 = input.LA(3);

                    if ( (synpred54()) ) {
                        alt30=1;
                    }
                    else if ( (true) ) {
                        alt30=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("261:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );", 30, 17, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                    {
                    int LA30_25 = input.LA(3);

                    if ( (synpred55()) ) {
                        alt30=2;
                    }
                    else if ( (true) ) {
                        alt30=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("261:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );", 30, 25, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("261:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );", 30, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("261:1: pointer : ( '*' ( type_qualifier )+ ( pointer )? | '*' pointer | '*' );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C.g:262:4: '*' ( type_qualifier )+ ( pointer )?
                    {
                    match(input,52,FOLLOW_52_in_pointer807); if (failed) return ;
                    // C.g:262:8: ( type_qualifier )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( ((LA28_0>=46 && LA28_0<=47)) ) {
                            int LA28_17 = input.LA(2);

                            if ( (synpred52()) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // C.g:0:0: type_qualifier
                    	    {
                    	    pushFollow(FOLLOW_type_qualifier_in_pointer809);
                    	    type_qualifier();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);

                    // C.g:262:24: ( pointer )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==52) ) {
                        int LA29_1 = input.LA(2);

                        if ( (synpred53()) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // C.g:0:0: pointer
                            {
                            pushFollow(FOLLOW_pointer_in_pointer812);
                            pointer();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C.g:263:4: '*' pointer
                    {
                    match(input,52,FOLLOW_52_in_pointer818); if (failed) return ;
                    pushFollow(FOLLOW_pointer_in_pointer820);
                    pointer();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:264:4: '*'
                    {
                    match(input,52,FOLLOW_52_in_pointer825); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, pointer_StartIndex); }
        }
        return ;
    }
    // $ANTLR end pointer


    // $ANTLR start parameter_type_list
    // C.g:267:1: parameter_type_list : parameter_list ( ',' '...' )? ;
    public final void parameter_type_list() throws RecognitionException {
        int parameter_type_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }
            // C.g:268:2: ( parameter_list ( ',' '...' )? )
            // C.g:268:4: parameter_list ( ',' '...' )?
            {
            pushFollow(FOLLOW_parameter_list_in_parameter_type_list836);
            parameter_list();
            _fsp--;
            if (failed) return ;
            // C.g:268:19: ( ',' '...' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==25) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C.g:268:20: ',' '...'
                    {
                    match(input,25,FOLLOW_25_in_parameter_type_list839); if (failed) return ;
                    match(input,53,FOLLOW_53_in_parameter_type_list841); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, parameter_type_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end parameter_type_list


    // $ANTLR start parameter_list
    // C.g:271:1: parameter_list : parameter_declaration ( ',' parameter_declaration )* ;
    public final void parameter_list() throws RecognitionException {
        int parameter_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }
            // C.g:272:2: ( parameter_declaration ( ',' parameter_declaration )* )
            // C.g:272:4: parameter_declaration ( ',' parameter_declaration )*
            {
            pushFollow(FOLLOW_parameter_declaration_in_parameter_list854);
            parameter_declaration();
            _fsp--;
            if (failed) return ;
            // C.g:272:26: ( ',' parameter_declaration )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==25) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==IDENTIFIER||(LA32_1>=27 && LA32_1<=39)||(LA32_1>=42 && LA32_1<=43)||(LA32_1>=45 && LA32_1<=47)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // C.g:272:27: ',' parameter_declaration
            	    {
            	    match(input,25,FOLLOW_25_in_parameter_list857); if (failed) return ;
            	    pushFollow(FOLLOW_parameter_declaration_in_parameter_list859);
            	    parameter_declaration();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, parameter_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end parameter_list


    // $ANTLR start parameter_declaration
    // C.g:275:1: parameter_declaration : declaration_specifiers ( declarator | abstract_declarator )* ;
    public final void parameter_declaration() throws RecognitionException {
        int parameter_declaration_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }
            // C.g:276:2: ( declaration_specifiers ( declarator | abstract_declarator )* )
            // C.g:276:4: declaration_specifiers ( declarator | abstract_declarator )*
            {
            pushFollow(FOLLOW_declaration_specifiers_in_parameter_declaration872);
            declaration_specifiers();
            _fsp--;
            if (failed) return ;
            // C.g:276:27: ( declarator | abstract_declarator )*
            loop33:
            do {
                int alt33=3;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    int LA33_4 = input.LA(2);

                    if ( (synpred58()) ) {
                        alt33=1;
                    }
                    else if ( (synpred59()) ) {
                        alt33=2;
                    }


                    }
                    break;
                case IDENTIFIER:
                    {
                    alt33=1;
                    }
                    break;
                case 48:
                    {
                    switch ( input.LA(2) ) {
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 42:
                    case 43:
                    case 45:
                    case 46:
                    case 47:
                    case 49:
                    case 50:
                        {
                        alt33=2;
                        }
                        break;
                    case 52:
                        {
                        int LA33_17 = input.LA(3);

                        if ( (synpred58()) ) {
                            alt33=1;
                        }
                        else if ( (synpred59()) ) {
                            alt33=2;
                        }


                        }
                        break;
                    case 48:
                        {
                        int LA33_18 = input.LA(3);

                        if ( (synpred58()) ) {
                            alt33=1;
                        }
                        else if ( (synpred59()) ) {
                            alt33=2;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA33_20 = input.LA(3);

                        if ( (synpred58()) ) {
                            alt33=1;
                        }
                        else if ( (synpred59()) ) {
                            alt33=2;
                        }


                        }
                        break;

                    }

                    }
                    break;
                case 50:
                    {
                    alt33=2;
                    }
                    break;

                }

                switch (alt33) {
            	case 1 :
            	    // C.g:276:28: declarator
            	    {
            	    pushFollow(FOLLOW_declarator_in_parameter_declaration875);
            	    declarator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C.g:276:39: abstract_declarator
            	    {
            	    pushFollow(FOLLOW_abstract_declarator_in_parameter_declaration877);
            	    abstract_declarator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 28, parameter_declaration_StartIndex); }
        }
        return ;
    }
    // $ANTLR end parameter_declaration


    // $ANTLR start identifier_list
    // C.g:279:1: identifier_list : IDENTIFIER ( ',' IDENTIFIER )* ;
    public final void identifier_list() throws RecognitionException {
        int identifier_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }
            // C.g:280:2: ( IDENTIFIER ( ',' IDENTIFIER )* )
            // C.g:280:4: IDENTIFIER ( ',' IDENTIFIER )*
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list890); if (failed) return ;
            // C.g:280:15: ( ',' IDENTIFIER )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==25) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C.g:280:16: ',' IDENTIFIER
            	    {
            	    match(input,25,FOLLOW_25_in_identifier_list893); if (failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifier_list895); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 29, identifier_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end identifier_list


    // $ANTLR start type_name
    // C.g:283:1: type_name : specifier_qualifier_list ( abstract_declarator )? ;
    public final void type_name() throws RecognitionException {
        int type_name_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }
            // C.g:284:2: ( specifier_qualifier_list ( abstract_declarator )? )
            // C.g:284:4: specifier_qualifier_list ( abstract_declarator )?
            {
            pushFollow(FOLLOW_specifier_qualifier_list_in_type_name908);
            specifier_qualifier_list();
            _fsp--;
            if (failed) return ;
            // C.g:284:29: ( abstract_declarator )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==48||LA35_0==50||LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // C.g:0:0: abstract_declarator
                    {
                    pushFollow(FOLLOW_abstract_declarator_in_type_name910);
                    abstract_declarator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 30, type_name_StartIndex); }
        }
        return ;
    }
    // $ANTLR end type_name


    // $ANTLR start abstract_declarator
    // C.g:287:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );
    public final void abstract_declarator() throws RecognitionException {
        int abstract_declarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }
            // C.g:288:2: ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            else if ( (LA37_0==48||LA37_0==50) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("287:1: abstract_declarator : ( pointer ( direct_abstract_declarator )? | direct_abstract_declarator );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // C.g:288:4: pointer ( direct_abstract_declarator )?
                    {
                    pushFollow(FOLLOW_pointer_in_abstract_declarator922);
                    pointer();
                    _fsp--;
                    if (failed) return ;
                    // C.g:288:12: ( direct_abstract_declarator )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==48) ) {
                        switch ( input.LA(2) ) {
                            case 49:
                                {
                                int LA36_8 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 52:
                                {
                                int LA36_9 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 48:
                                {
                                int LA36_10 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 50:
                                {
                                int LA36_11 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA36_12 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                                {
                                int LA36_13 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 31:
                                {
                                int LA36_14 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 32:
                                {
                                int LA36_15 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 33:
                                {
                                int LA36_16 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 34:
                                {
                                int LA36_17 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 35:
                                {
                                int LA36_18 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 36:
                                {
                                int LA36_19 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 37:
                                {
                                int LA36_20 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 38:
                                {
                                int LA36_21 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 39:
                                {
                                int LA36_22 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 42:
                            case 43:
                                {
                                int LA36_23 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 45:
                                {
                                int LA36_24 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 46:
                            case 47:
                                {
                                int LA36_25 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                        }

                    }
                    else if ( (LA36_0==50) ) {
                        switch ( input.LA(2) ) {
                            case 51:
                                {
                                int LA36_26 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 48:
                                {
                                int LA36_27 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case IDENTIFIER:
                                {
                                int LA36_28 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case HEX_LITERAL:
                            case OCTAL_LITERAL:
                            case DECIMAL_LITERAL:
                            case CHARACTER_LITERAL:
                            case STRING_LITERAL:
                            case FLOATING_POINT_LITERAL:
                                {
                                int LA36_29 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 58:
                                {
                                int LA36_30 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 59:
                                {
                                int LA36_31 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 52:
                            case 54:
                            case 55:
                            case 63:
                            case 64:
                            case 65:
                                {
                                int LA36_32 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                            case 60:
                                {
                                int LA36_33 = input.LA(3);

                                if ( (synpred62()) ) {
                                    alt36=1;
                                }
                                }
                                break;
                        }

                    }
                    switch (alt36) {
                        case 1 :
                            // C.g:0:0: direct_abstract_declarator
                            {
                            pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator924);
                            direct_abstract_declarator();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C.g:289:4: direct_abstract_declarator
                    {
                    pushFollow(FOLLOW_direct_abstract_declarator_in_abstract_declarator930);
                    direct_abstract_declarator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 31, abstract_declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end abstract_declarator


    // $ANTLR start direct_abstract_declarator
    // C.g:292:1: direct_abstract_declarator : ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* ;
    public final void direct_abstract_declarator() throws RecognitionException {
        int direct_abstract_declarator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }
            // C.g:293:2: ( ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )* )
            // C.g:293:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix ) ( abstract_declarator_suffix )*
            {
            // C.g:293:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==48) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==IDENTIFIER||(LA38_1>=27 && LA38_1<=39)||(LA38_1>=42 && LA38_1<=43)||(LA38_1>=45 && LA38_1<=47)||LA38_1==49) ) {
                    alt38=2;
                }
                else if ( (LA38_1==48||LA38_1==50||LA38_1==52) ) {
                    alt38=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("293:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==50) ) {
                alt38=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("293:4: ( '(' abstract_declarator ')' | abstract_declarator_suffix )", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C.g:293:6: '(' abstract_declarator ')'
                    {
                    match(input,48,FOLLOW_48_in_direct_abstract_declarator943); if (failed) return ;
                    pushFollow(FOLLOW_abstract_declarator_in_direct_abstract_declarator945);
                    abstract_declarator();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_direct_abstract_declarator947); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:293:36: abstract_declarator_suffix
                    {
                    pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator951);
                    abstract_declarator_suffix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // C.g:293:65: ( abstract_declarator_suffix )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==48) ) {
                    switch ( input.LA(2) ) {
                    case 49:
                        {
                        int LA39_8 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA39_12 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                        {
                        int LA39_13 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 31:
                        {
                        int LA39_14 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 32:
                        {
                        int LA39_15 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 33:
                        {
                        int LA39_16 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 34:
                        {
                        int LA39_17 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 35:
                        {
                        int LA39_18 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 36:
                        {
                        int LA39_19 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 37:
                        {
                        int LA39_20 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 38:
                        {
                        int LA39_21 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 39:
                        {
                        int LA39_22 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 42:
                    case 43:
                        {
                        int LA39_23 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 45:
                        {
                        int LA39_24 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 46:
                    case 47:
                        {
                        int LA39_25 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;

                    }

                }
                else if ( (LA39_0==50) ) {
                    switch ( input.LA(2) ) {
                    case 51:
                        {
                        int LA39_26 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 48:
                        {
                        int LA39_27 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                        {
                        int LA39_28 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case HEX_LITERAL:
                    case OCTAL_LITERAL:
                    case DECIMAL_LITERAL:
                    case CHARACTER_LITERAL:
                    case STRING_LITERAL:
                    case FLOATING_POINT_LITERAL:
                        {
                        int LA39_29 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 58:
                        {
                        int LA39_30 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 59:
                        {
                        int LA39_31 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 52:
                    case 54:
                    case 55:
                    case 63:
                    case 64:
                    case 65:
                        {
                        int LA39_32 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;
                    case 60:
                        {
                        int LA39_33 = input.LA(3);

                        if ( (synpred65()) ) {
                            alt39=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt39) {
            	case 1 :
            	    // C.g:0:0: abstract_declarator_suffix
            	    {
            	    pushFollow(FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator955);
            	    abstract_declarator_suffix();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 32, direct_abstract_declarator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end direct_abstract_declarator


    // $ANTLR start abstract_declarator_suffix
    // C.g:296:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );
    public final void abstract_declarator_suffix() throws RecognitionException {
        int abstract_declarator_suffix_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }
            // C.g:297:2: ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' )
            int alt40=4;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==50) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==51) ) {
                    alt40=1;
                }
                else if ( ((LA40_1>=IDENTIFIER && LA40_1<=FLOATING_POINT_LITERAL)||LA40_1==48||LA40_1==52||(LA40_1>=54 && LA40_1<=55)||(LA40_1>=58 && LA40_1<=60)||(LA40_1>=63 && LA40_1<=65)) ) {
                    alt40=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("296:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );", 40, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA40_0==48) ) {
                int LA40_2 = input.LA(2);

                if ( (LA40_2==49) ) {
                    alt40=3;
                }
                else if ( (LA40_2==IDENTIFIER||(LA40_2>=27 && LA40_2<=39)||(LA40_2>=42 && LA40_2<=43)||(LA40_2>=45 && LA40_2<=47)) ) {
                    alt40=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("296:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );", 40, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("296:1: abstract_declarator_suffix : ( '[' ']' | '[' constant_expression ']' | '(' ')' | '(' parameter_type_list ')' );", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C.g:297:4: '[' ']'
                    {
                    match(input,50,FOLLOW_50_in_abstract_declarator_suffix967); if (failed) return ;
                    match(input,51,FOLLOW_51_in_abstract_declarator_suffix969); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:298:4: '[' constant_expression ']'
                    {
                    match(input,50,FOLLOW_50_in_abstract_declarator_suffix974); if (failed) return ;
                    pushFollow(FOLLOW_constant_expression_in_abstract_declarator_suffix976);
                    constant_expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,51,FOLLOW_51_in_abstract_declarator_suffix978); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:299:4: '(' ')'
                    {
                    match(input,48,FOLLOW_48_in_abstract_declarator_suffix983); if (failed) return ;
                    match(input,49,FOLLOW_49_in_abstract_declarator_suffix985); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C.g:300:4: '(' parameter_type_list ')'
                    {
                    match(input,48,FOLLOW_48_in_abstract_declarator_suffix990); if (failed) return ;
                    pushFollow(FOLLOW_parameter_type_list_in_abstract_declarator_suffix992);
                    parameter_type_list();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_abstract_declarator_suffix994); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 33, abstract_declarator_suffix_StartIndex); }
        }
        return ;
    }
    // $ANTLR end abstract_declarator_suffix


    // $ANTLR start initializer
    // C.g:303:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' );
    public final void initializer() throws RecognitionException {
        int initializer_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }
            // C.g:304:2: ( assignment_expression | '{' initializer_list ( ',' )? '}' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=IDENTIFIER && LA42_0<=FLOATING_POINT_LITERAL)||LA42_0==48||LA42_0==52||(LA42_0>=54 && LA42_0<=55)||(LA42_0>=58 && LA42_0<=60)||(LA42_0>=63 && LA42_0<=65)) ) {
                alt42=1;
            }
            else if ( (LA42_0==40) ) {
                alt42=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("303:1: initializer : ( assignment_expression | '{' initializer_list ( ',' )? '}' );", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // C.g:304:4: assignment_expression
                    {
                    pushFollow(FOLLOW_assignment_expression_in_initializer1006);
                    assignment_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:305:4: '{' initializer_list ( ',' )? '}'
                    {
                    match(input,40,FOLLOW_40_in_initializer1011); if (failed) return ;
                    pushFollow(FOLLOW_initializer_list_in_initializer1013);
                    initializer_list();
                    _fsp--;
                    if (failed) return ;
                    // C.g:305:25: ( ',' )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==25) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // C.g:0:0: ','
                            {
                            match(input,25,FOLLOW_25_in_initializer1015); if (failed) return ;

                            }
                            break;

                    }

                    match(input,41,FOLLOW_41_in_initializer1018); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 34, initializer_StartIndex); }
        }
        return ;
    }
    // $ANTLR end initializer


    // $ANTLR start initializer_list
    // C.g:308:1: initializer_list : initializer ( ',' initializer )* ;
    public final void initializer_list() throws RecognitionException {
        int initializer_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }
            // C.g:309:2: ( initializer ( ',' initializer )* )
            // C.g:309:4: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializer_list1029);
            initializer();
            _fsp--;
            if (failed) return ;
            // C.g:309:16: ( ',' initializer )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==25) ) {
                    int LA43_1 = input.LA(2);

                    if ( ((LA43_1>=IDENTIFIER && LA43_1<=FLOATING_POINT_LITERAL)||LA43_1==40||LA43_1==48||LA43_1==52||(LA43_1>=54 && LA43_1<=55)||(LA43_1>=58 && LA43_1<=60)||(LA43_1>=63 && LA43_1<=65)) ) {
                        alt43=1;
                    }


                }


                switch (alt43) {
            	case 1 :
            	    // C.g:309:17: ',' initializer
            	    {
            	    match(input,25,FOLLOW_25_in_initializer_list1032); if (failed) return ;
            	    pushFollow(FOLLOW_initializer_in_initializer_list1034);
            	    initializer();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 35, initializer_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end initializer_list


    // $ANTLR start argument_expression_list
    // C.g:314:1: argument_expression_list : assignment_expression ( ',' assignment_expression )* ;
    public final void argument_expression_list() throws RecognitionException {
        int argument_expression_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }
            // C.g:315:2: ( assignment_expression ( ',' assignment_expression )* )
            // C.g:315:6: assignment_expression ( ',' assignment_expression )*
            {
            pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1051);
            assignment_expression();
            _fsp--;
            if (failed) return ;
            // C.g:315:28: ( ',' assignment_expression )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==25) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // C.g:315:29: ',' assignment_expression
            	    {
            	    match(input,25,FOLLOW_25_in_argument_expression_list1054); if (failed) return ;
            	    pushFollow(FOLLOW_assignment_expression_in_argument_expression_list1056);
            	    assignment_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 36, argument_expression_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end argument_expression_list


    // $ANTLR start additive_expression
    // C.g:318:1: additive_expression : ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* ;
    public final void additive_expression() throws RecognitionException {
        int additive_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }
            // C.g:319:2: ( ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )* )
            // C.g:319:4: ( multiplicative_expression ) ( '+' multiplicative_expression | '-' multiplicative_expression )*
            {
            // C.g:319:4: ( multiplicative_expression )
            // C.g:319:5: multiplicative_expression
            {
            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1070);
            multiplicative_expression();
            _fsp--;
            if (failed) return ;

            }

            // C.g:319:32: ( '+' multiplicative_expression | '-' multiplicative_expression )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==54) ) {
                    alt45=1;
                }
                else if ( (LA45_0==55) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // C.g:319:33: '+' multiplicative_expression
            	    {
            	    match(input,54,FOLLOW_54_in_additive_expression1074); if (failed) return ;
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1076);
            	    multiplicative_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C.g:319:65: '-' multiplicative_expression
            	    {
            	    match(input,55,FOLLOW_55_in_additive_expression1080); if (failed) return ;
            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1082);
            	    multiplicative_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 37, additive_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end additive_expression


    // $ANTLR start multiplicative_expression
    // C.g:322:1: multiplicative_expression : ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* ;
    public final void multiplicative_expression() throws RecognitionException {
        int multiplicative_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }
            // C.g:323:2: ( ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )* )
            // C.g:323:4: ( cast_expression ) ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
            {
            // C.g:323:4: ( cast_expression )
            // C.g:323:5: cast_expression
            {
            pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1096);
            cast_expression();
            _fsp--;
            if (failed) return ;

            }

            // C.g:323:22: ( '*' cast_expression | '/' cast_expression | '%' cast_expression )*
            loop46:
            do {
                int alt46=4;
                switch ( input.LA(1) ) {
                case 52:
                    {
                    alt46=1;
                    }
                    break;
                case 56:
                    {
                    alt46=2;
                    }
                    break;
                case 57:
                    {
                    alt46=3;
                    }
                    break;

                }

                switch (alt46) {
            	case 1 :
            	    // C.g:323:23: '*' cast_expression
            	    {
            	    match(input,52,FOLLOW_52_in_multiplicative_expression1100); if (failed) return ;
            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1102);
            	    cast_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C.g:323:45: '/' cast_expression
            	    {
            	    match(input,56,FOLLOW_56_in_multiplicative_expression1106); if (failed) return ;
            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1108);
            	    cast_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C.g:323:67: '%' cast_expression
            	    {
            	    match(input,57,FOLLOW_57_in_multiplicative_expression1112); if (failed) return ;
            	    pushFollow(FOLLOW_cast_expression_in_multiplicative_expression1114);
            	    cast_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 38, multiplicative_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end multiplicative_expression


    // $ANTLR start cast_expression
    // C.g:326:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );
    public final void cast_expression() throws RecognitionException {
        int cast_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }
            // C.g:327:2: ( '(' type_name ')' cast_expression | unary_expression )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA47_8 = input.LA(3);

                    if ( (synpred78()) ) {
                        alt47=1;
                    }
                    else if ( (true) ) {
                        alt47=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("326:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );", 47, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FLOATING_POINT_LITERAL:
                case 48:
                case 52:
                case 54:
                case 55:
                case 58:
                case 59:
                case 60:
                case 63:
                case 64:
                case 65:
                    {
                    alt47=2;
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 45:
                case 46:
                case 47:
                    {
                    alt47=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("326:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );", 47, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA47_0>=IDENTIFIER && LA47_0<=FLOATING_POINT_LITERAL)||LA47_0==52||(LA47_0>=54 && LA47_0<=55)||(LA47_0>=58 && LA47_0<=60)||(LA47_0>=63 && LA47_0<=65)) ) {
                alt47=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("326:1: cast_expression : ( '(' type_name ')' cast_expression | unary_expression );", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // C.g:327:4: '(' type_name ')' cast_expression
                    {
                    match(input,48,FOLLOW_48_in_cast_expression1127); if (failed) return ;
                    pushFollow(FOLLOW_type_name_in_cast_expression1129);
                    type_name();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_cast_expression1131); if (failed) return ;
                    pushFollow(FOLLOW_cast_expression_in_cast_expression1133);
                    cast_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:328:4: unary_expression
                    {
                    pushFollow(FOLLOW_unary_expression_in_cast_expression1138);
                    unary_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 39, cast_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end cast_expression


    // $ANTLR start unary_expression
    // C.g:331:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );
    public final void unary_expression() throws RecognitionException {
        int unary_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }
            // C.g:332:2: ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' )
            int alt48=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case FLOATING_POINT_LITERAL:
            case 48:
                {
                alt48=1;
                }
                break;
            case 58:
                {
                alt48=2;
                }
                break;
            case 59:
                {
                alt48=3;
                }
                break;
            case 52:
            case 54:
            case 55:
            case 63:
            case 64:
            case 65:
                {
                alt48=4;
                }
                break;
            case 60:
                {
                int LA48_7 = input.LA(2);

                if ( (LA48_7==48) ) {
                    int LA48_8 = input.LA(3);

                    if ( (synpred83()) ) {
                        alt48=5;
                    }
                    else if ( (true) ) {
                        alt48=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("331:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );", 48, 8, input);

                        throw nvae;
                    }
                }
                else if ( ((LA48_7>=IDENTIFIER && LA48_7<=FLOATING_POINT_LITERAL)||LA48_7==52||(LA48_7>=54 && LA48_7<=55)||(LA48_7>=58 && LA48_7<=60)||(LA48_7>=63 && LA48_7<=65)) ) {
                    alt48=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("331:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );", 48, 7, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("331:1: unary_expression : ( postfix_expression | '++' unary_expression | '--' unary_expression | unary_operator cast_expression | 'sizeof' unary_expression | 'sizeof' '(' type_name ')' );", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // C.g:332:4: postfix_expression
                    {
                    pushFollow(FOLLOW_postfix_expression_in_unary_expression1149);
                    postfix_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:333:4: '++' unary_expression
                    {
                    match(input,58,FOLLOW_58_in_unary_expression1154); if (failed) return ;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1156);
                    unary_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:334:4: '--' unary_expression
                    {
                    match(input,59,FOLLOW_59_in_unary_expression1161); if (failed) return ;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1163);
                    unary_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // C.g:335:4: unary_operator cast_expression
                    {
                    pushFollow(FOLLOW_unary_operator_in_unary_expression1168);
                    unary_operator();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_cast_expression_in_unary_expression1170);
                    cast_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // C.g:336:4: 'sizeof' unary_expression
                    {
                    match(input,60,FOLLOW_60_in_unary_expression1175); if (failed) return ;
                    pushFollow(FOLLOW_unary_expression_in_unary_expression1177);
                    unary_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // C.g:337:4: 'sizeof' '(' type_name ')'
                    {
                    match(input,60,FOLLOW_60_in_unary_expression1182); if (failed) return ;
                    match(input,48,FOLLOW_48_in_unary_expression1184); if (failed) return ;
                    pushFollow(FOLLOW_type_name_in_unary_expression1186);
                    type_name();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_unary_expression1188); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 40, unary_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end unary_expression


    // $ANTLR start postfix_expression
    // C.g:340:1: postfix_expression : primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* ;
    public final void postfix_expression() throws RecognitionException {
        int postfix_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }
            // C.g:341:2: ( primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )* )
            // C.g:341:6: primary_expression ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
            {
            pushFollow(FOLLOW_primary_expression_in_postfix_expression1201);
            primary_expression();
            _fsp--;
            if (failed) return ;
            // C.g:342:9: ( '[' expression ']' | '(' ')' | '(' argument_expression_list ')' | '.' IDENTIFIER | '->' IDENTIFIER | '++' | '--' )*
            loop49:
            do {
                int alt49=8;
                switch ( input.LA(1) ) {
                case 50:
                    {
                    alt49=1;
                    }
                    break;
                case 48:
                    {
                    int LA49_24 = input.LA(2);

                    if ( (LA49_24==49) ) {
                        alt49=2;
                    }
                    else if ( ((LA49_24>=IDENTIFIER && LA49_24<=FLOATING_POINT_LITERAL)||LA49_24==48||LA49_24==52||(LA49_24>=54 && LA49_24<=55)||(LA49_24>=58 && LA49_24<=60)||(LA49_24>=63 && LA49_24<=65)) ) {
                        alt49=3;
                    }


                    }
                    break;
                case 61:
                    {
                    alt49=4;
                    }
                    break;
                case 62:
                    {
                    alt49=5;
                    }
                    break;
                case 58:
                    {
                    alt49=6;
                    }
                    break;
                case 59:
                    {
                    alt49=7;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // C.g:342:13: '[' expression ']'
            	    {
            	    match(input,50,FOLLOW_50_in_postfix_expression1215); if (failed) return ;
            	    pushFollow(FOLLOW_expression_in_postfix_expression1217);
            	    expression();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,51,FOLLOW_51_in_postfix_expression1219); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // C.g:343:13: '(' ')'
            	    {
            	    match(input,48,FOLLOW_48_in_postfix_expression1233); if (failed) return ;
            	    match(input,49,FOLLOW_49_in_postfix_expression1235); if (failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // C.g:344:13: '(' argument_expression_list ')'
            	    {
            	    match(input,48,FOLLOW_48_in_postfix_expression1249); if (failed) return ;
            	    pushFollow(FOLLOW_argument_expression_list_in_postfix_expression1251);
            	    argument_expression_list();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,49,FOLLOW_49_in_postfix_expression1253); if (failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // C.g:345:13: '.' IDENTIFIER
            	    {
            	    match(input,61,FOLLOW_61_in_postfix_expression1267); if (failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1269); if (failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // C.g:346:13: '->' IDENTIFIER
            	    {
            	    match(input,62,FOLLOW_62_in_postfix_expression1283); if (failed) return ;
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_postfix_expression1285); if (failed) return ;

            	    }
            	    break;
            	case 6 :
            	    // C.g:347:13: '++'
            	    {
            	    match(input,58,FOLLOW_58_in_postfix_expression1299); if (failed) return ;

            	    }
            	    break;
            	case 7 :
            	    // C.g:348:13: '--'
            	    {
            	    match(input,59,FOLLOW_59_in_postfix_expression1313); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 41, postfix_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end postfix_expression


    // $ANTLR start unary_operator
    // C.g:352:1: unary_operator : ( '&' | '*' | '+' | '-' | '~' | '!' );
    public final void unary_operator() throws RecognitionException {
        int unary_operator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }
            // C.g:353:2: ( '&' | '*' | '+' | '-' | '~' | '!' )
            // C.g:
            {
            if ( input.LA(1)==52||(input.LA(1)>=54 && input.LA(1)<=55)||(input.LA(1)>=63 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unary_operator0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 42, unary_operator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end unary_operator


    // $ANTLR start primary_expression
    // C.g:361:1: primary_expression : ( IDENTIFIER | constant | '(' expression ')' );
    public final void primary_expression() throws RecognitionException {
        int primary_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }
            // C.g:362:2: ( IDENTIFIER | constant | '(' expression ')' )
            int alt50=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt50=1;
                }
                break;
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case FLOATING_POINT_LITERAL:
                {
                alt50=2;
                }
                break;
            case 48:
                {
                alt50=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("361:1: primary_expression : ( IDENTIFIER | constant | '(' expression ')' );", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // C.g:362:4: IDENTIFIER
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primary_expression1371); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:363:4: constant
                    {
                    pushFollow(FOLLOW_constant_in_primary_expression1376);
                    constant();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:364:4: '(' expression ')'
                    {
                    match(input,48,FOLLOW_48_in_primary_expression1381); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_primary_expression1383);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_primary_expression1385); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 43, primary_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end primary_expression


    // $ANTLR start constant
    // C.g:367:1: constant : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL );
    public final void constant() throws RecognitionException {
        int constant_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }
            // C.g:368:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | FLOATING_POINT_LITERAL )
            // C.g:
            {
            if ( (input.LA(1)>=HEX_LITERAL && input.LA(1)<=FLOATING_POINT_LITERAL) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constant0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 44, constant_StartIndex); }
        }
        return ;
    }
    // $ANTLR end constant


    // $ANTLR start expression
    // C.g:378:1: expression : assignment_expression ( ',' assignment_expression )* ;
    public final void expression() throws RecognitionException {
        int expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }
            // C.g:379:2: ( assignment_expression ( ',' assignment_expression )* )
            // C.g:379:4: assignment_expression ( ',' assignment_expression )*
            {
            pushFollow(FOLLOW_assignment_expression_in_expression1460);
            assignment_expression();
            _fsp--;
            if (failed) return ;
            // C.g:379:26: ( ',' assignment_expression )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==25) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C.g:379:27: ',' assignment_expression
            	    {
            	    match(input,25,FOLLOW_25_in_expression1463); if (failed) return ;
            	    pushFollow(FOLLOW_assignment_expression_in_expression1465);
            	    assignment_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 45, expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end expression


    // $ANTLR start constant_expression
    // C.g:382:1: constant_expression : conditional_expression ;
    public final void constant_expression() throws RecognitionException {
        int constant_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }
            // C.g:383:2: ( conditional_expression )
            // C.g:383:4: conditional_expression
            {
            pushFollow(FOLLOW_conditional_expression_in_constant_expression1478);
            conditional_expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 46, constant_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end constant_expression


    // $ANTLR start assignment_expression
    // C.g:386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );
    public final void assignment_expression() throws RecognitionException {
        int assignment_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }
            // C.g:387:2: ( lvalue assignment_operator assignment_expression | conditional_expression )
            int alt52=2;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    int LA52_8 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA52_9 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA52_10 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 10, input);

                        throw nvae;
                    }
                    }
                    break;
                case 62:
                    {
                    int LA52_11 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_12 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 12, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_13 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 13, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 24:
                case 25:
                case 41:
                case 44:
                case 49:
                case 51:
                case 52:
                case 54:
                case 55:
                case 56:
                case 57:
                case 63:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                    {
                    alt52=2;
                    }
                    break;
                case 26:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    {
                    alt52=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 1, input);

                    throw nvae;
                }

                }
                break;
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case FLOATING_POINT_LITERAL:
                {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    int LA52_36 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 36, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA52_37 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 37, input);

                        throw nvae;
                    }
                    }
                    break;
                case 61:
                    {
                    int LA52_38 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 38, input);

                        throw nvae;
                    }
                    }
                    break;
                case 62:
                    {
                    int LA52_39 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 39, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_40 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 40, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_41 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 41, input);

                        throw nvae;
                    }
                    }
                    break;
                case 26:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    {
                    alt52=1;
                    }
                    break;
                case EOF:
                case 24:
                case 25:
                case 41:
                case 44:
                case 49:
                case 51:
                case 52:
                case 54:
                case 55:
                case 56:
                case 57:
                case 63:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                    {
                    alt52=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 2, input);

                    throw nvae;
                }

                }
                break;
            case 48:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA52_64 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 64, input);

                        throw nvae;
                    }
                    }
                    break;
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FLOATING_POINT_LITERAL:
                    {
                    int LA52_65 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 65, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA52_66 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 66, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_67 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 67, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_68 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 68, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                case 54:
                case 55:
                case 63:
                case 64:
                case 65:
                    {
                    int LA52_69 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 69, input);

                        throw nvae;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA52_70 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 70, input);

                        throw nvae;
                    }
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 42:
                case 43:
                case 45:
                case 46:
                case 47:
                    {
                    alt52=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 3, input);

                    throw nvae;
                }

                }
                break;
            case 58:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA52_83 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 83, input);

                        throw nvae;
                    }
                    }
                    break;
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FLOATING_POINT_LITERAL:
                    {
                    int LA52_84 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 84, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA52_85 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 85, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_86 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 86, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_87 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 87, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                case 54:
                case 55:
                case 63:
                case 64:
                case 65:
                    {
                    int LA52_88 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 88, input);

                        throw nvae;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA52_89 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 89, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 4, input);

                    throw nvae;
                }

                }
                break;
            case 59:
                {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    int LA52_90 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 90, input);

                        throw nvae;
                    }
                    }
                    break;
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FLOATING_POINT_LITERAL:
                    {
                    int LA52_91 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 91, input);

                        throw nvae;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA52_92 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 92, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_93 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 93, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_94 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 94, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                case 54:
                case 55:
                case 63:
                case 64:
                case 65:
                    {
                    int LA52_95 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 95, input);

                        throw nvae;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA52_96 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 96, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 5, input);

                    throw nvae;
                }

                }
                break;
            case 52:
            case 54:
            case 55:
            case 63:
            case 64:
            case 65:
                {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    int LA52_97 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 97, input);

                        throw nvae;
                    }
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA52_98 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 98, input);

                        throw nvae;
                    }
                    }
                    break;
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FLOATING_POINT_LITERAL:
                    {
                    int LA52_99 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 99, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_100 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 100, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_101 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 101, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                case 54:
                case 55:
                case 63:
                case 64:
                case 65:
                    {
                    int LA52_102 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 102, input);

                        throw nvae;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA52_103 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 103, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 6, input);

                    throw nvae;
                }

                }
                break;
            case 60:
                {
                switch ( input.LA(2) ) {
                case 48:
                    {
                    int LA52_104 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 104, input);

                        throw nvae;
                    }
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA52_105 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 105, input);

                        throw nvae;
                    }
                    }
                    break;
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case CHARACTER_LITERAL:
                case STRING_LITERAL:
                case FLOATING_POINT_LITERAL:
                    {
                    int LA52_106 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 106, input);

                        throw nvae;
                    }
                    }
                    break;
                case 58:
                    {
                    int LA52_107 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 107, input);

                        throw nvae;
                    }
                    }
                    break;
                case 59:
                    {
                    int LA52_108 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 108, input);

                        throw nvae;
                    }
                    }
                    break;
                case 52:
                case 54:
                case 55:
                case 63:
                case 64:
                case 65:
                    {
                    int LA52_109 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 109, input);

                        throw nvae;
                    }
                    }
                    break;
                case 60:
                    {
                    int LA52_110 = input.LA(3);

                    if ( (synpred104()) ) {
                        alt52=1;
                    }
                    else if ( (true) ) {
                        alt52=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 110, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 7, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("386:1: assignment_expression : ( lvalue assignment_operator assignment_expression | conditional_expression );", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // C.g:387:4: lvalue assignment_operator assignment_expression
                    {
                    pushFollow(FOLLOW_lvalue_in_assignment_expression1489);
                    lvalue();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_assignment_operator_in_assignment_expression1491);
                    assignment_operator();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_assignment_expression_in_assignment_expression1493);
                    assignment_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:388:4: conditional_expression
                    {
                    pushFollow(FOLLOW_conditional_expression_in_assignment_expression1498);
                    conditional_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 47, assignment_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end assignment_expression


    // $ANTLR start lvalue
    // C.g:391:1: lvalue : unary_expression ;
    public final void lvalue() throws RecognitionException {
        int lvalue_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }
            // C.g:392:2: ( unary_expression )
            // C.g:392:4: unary_expression
            {
            pushFollow(FOLLOW_unary_expression_in_lvalue1510);
            unary_expression();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 48, lvalue_StartIndex); }
        }
        return ;
    }
    // $ANTLR end lvalue


    // $ANTLR start assignment_operator
    // C.g:395:1: assignment_operator : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final void assignment_operator() throws RecognitionException {
        int assignment_operator_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }
            // C.g:396:2: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // C.g:
            {
            if ( input.LA(1)==26||(input.LA(1)>=66 && input.LA(1)<=75) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_assignment_operator0);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 49, assignment_operator_StartIndex); }
        }
        return ;
    }
    // $ANTLR end assignment_operator


    // $ANTLR start conditional_expression
    // C.g:409:1: conditional_expression : logical_or_expression ( '?' expression ':' conditional_expression )? ;
    public final void conditional_expression() throws RecognitionException {
        int conditional_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }
            // C.g:410:2: ( logical_or_expression ( '?' expression ':' conditional_expression )? )
            // C.g:410:4: logical_or_expression ( '?' expression ':' conditional_expression )?
            {
            pushFollow(FOLLOW_logical_or_expression_in_conditional_expression1582);
            logical_or_expression();
            _fsp--;
            if (failed) return ;
            // C.g:410:26: ( '?' expression ':' conditional_expression )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==76) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // C.g:410:27: '?' expression ':' conditional_expression
                    {
                    match(input,76,FOLLOW_76_in_conditional_expression1585); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_conditional_expression1587);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,44,FOLLOW_44_in_conditional_expression1589); if (failed) return ;
                    pushFollow(FOLLOW_conditional_expression_in_conditional_expression1591);
                    conditional_expression();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 50, conditional_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end conditional_expression


    // $ANTLR start logical_or_expression
    // C.g:413:1: logical_or_expression : logical_and_expression ( '||' logical_and_expression )* ;
    public final void logical_or_expression() throws RecognitionException {
        int logical_or_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }
            // C.g:414:2: ( logical_and_expression ( '||' logical_and_expression )* )
            // C.g:414:4: logical_and_expression ( '||' logical_and_expression )*
            {
            pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1604);
            logical_and_expression();
            _fsp--;
            if (failed) return ;
            // C.g:414:27: ( '||' logical_and_expression )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==77) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C.g:414:28: '||' logical_and_expression
            	    {
            	    match(input,77,FOLLOW_77_in_logical_or_expression1607); if (failed) return ;
            	    pushFollow(FOLLOW_logical_and_expression_in_logical_or_expression1609);
            	    logical_and_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 51, logical_or_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end logical_or_expression


    // $ANTLR start logical_and_expression
    // C.g:417:1: logical_and_expression : inclusive_or_expression ( '&&' inclusive_or_expression )* ;
    public final void logical_and_expression() throws RecognitionException {
        int logical_and_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }
            // C.g:418:2: ( inclusive_or_expression ( '&&' inclusive_or_expression )* )
            // C.g:418:4: inclusive_or_expression ( '&&' inclusive_or_expression )*
            {
            pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1622);
            inclusive_or_expression();
            _fsp--;
            if (failed) return ;
            // C.g:418:28: ( '&&' inclusive_or_expression )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==78) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // C.g:418:29: '&&' inclusive_or_expression
            	    {
            	    match(input,78,FOLLOW_78_in_logical_and_expression1625); if (failed) return ;
            	    pushFollow(FOLLOW_inclusive_or_expression_in_logical_and_expression1627);
            	    inclusive_or_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 52, logical_and_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end logical_and_expression


    // $ANTLR start inclusive_or_expression
    // C.g:421:1: inclusive_or_expression : exclusive_or_expression ( '|' exclusive_or_expression )* ;
    public final void inclusive_or_expression() throws RecognitionException {
        int inclusive_or_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }
            // C.g:422:2: ( exclusive_or_expression ( '|' exclusive_or_expression )* )
            // C.g:422:4: exclusive_or_expression ( '|' exclusive_or_expression )*
            {
            pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1640);
            exclusive_or_expression();
            _fsp--;
            if (failed) return ;
            // C.g:422:28: ( '|' exclusive_or_expression )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==79) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // C.g:422:29: '|' exclusive_or_expression
            	    {
            	    match(input,79,FOLLOW_79_in_inclusive_or_expression1643); if (failed) return ;
            	    pushFollow(FOLLOW_exclusive_or_expression_in_inclusive_or_expression1645);
            	    exclusive_or_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 53, inclusive_or_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end inclusive_or_expression


    // $ANTLR start exclusive_or_expression
    // C.g:425:1: exclusive_or_expression : and_expression ( '^' and_expression )* ;
    public final void exclusive_or_expression() throws RecognitionException {
        int exclusive_or_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }
            // C.g:426:2: ( and_expression ( '^' and_expression )* )
            // C.g:426:4: and_expression ( '^' and_expression )*
            {
            pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1658);
            and_expression();
            _fsp--;
            if (failed) return ;
            // C.g:426:19: ( '^' and_expression )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==80) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // C.g:426:20: '^' and_expression
            	    {
            	    match(input,80,FOLLOW_80_in_exclusive_or_expression1661); if (failed) return ;
            	    pushFollow(FOLLOW_and_expression_in_exclusive_or_expression1663);
            	    and_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 54, exclusive_or_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end exclusive_or_expression


    // $ANTLR start and_expression
    // C.g:429:1: and_expression : equality_expression ( '&' equality_expression )* ;
    public final void and_expression() throws RecognitionException {
        int and_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }
            // C.g:430:2: ( equality_expression ( '&' equality_expression )* )
            // C.g:430:4: equality_expression ( '&' equality_expression )*
            {
            pushFollow(FOLLOW_equality_expression_in_and_expression1676);
            equality_expression();
            _fsp--;
            if (failed) return ;
            // C.g:430:24: ( '&' equality_expression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==63) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // C.g:430:25: '&' equality_expression
            	    {
            	    match(input,63,FOLLOW_63_in_and_expression1679); if (failed) return ;
            	    pushFollow(FOLLOW_equality_expression_in_and_expression1681);
            	    equality_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 55, and_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end and_expression


    // $ANTLR start equality_expression
    // C.g:432:1: equality_expression : relational_expression ( ( '==' | '!=' ) relational_expression )* ;
    public final void equality_expression() throws RecognitionException {
        int equality_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }
            // C.g:433:2: ( relational_expression ( ( '==' | '!=' ) relational_expression )* )
            // C.g:433:4: relational_expression ( ( '==' | '!=' ) relational_expression )*
            {
            pushFollow(FOLLOW_relational_expression_in_equality_expression1693);
            relational_expression();
            _fsp--;
            if (failed) return ;
            // C.g:433:26: ( ( '==' | '!=' ) relational_expression )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=81 && LA59_0<=82)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // C.g:433:27: ( '==' | '!=' ) relational_expression
            	    {
            	    if ( (input.LA(1)>=81 && input.LA(1)<=82) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_equality_expression1696);    throw mse;
            	    }

            	    pushFollow(FOLLOW_relational_expression_in_equality_expression1702);
            	    relational_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 56, equality_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end equality_expression


    // $ANTLR start relational_expression
    // C.g:436:1: relational_expression : shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* ;
    public final void relational_expression() throws RecognitionException {
        int relational_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }
            // C.g:437:2: ( shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )* )
            // C.g:437:4: shift_expression ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            {
            pushFollow(FOLLOW_shift_expression_in_relational_expression1715);
            shift_expression();
            _fsp--;
            if (failed) return ;
            // C.g:437:21: ( ( '<' | '>' | '<=' | '>=' ) shift_expression )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=83 && LA60_0<=86)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // C.g:437:22: ( '<' | '>' | '<=' | '>=' ) shift_expression
            	    {
            	    if ( (input.LA(1)>=83 && input.LA(1)<=86) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relational_expression1718);    throw mse;
            	    }

            	    pushFollow(FOLLOW_shift_expression_in_relational_expression1728);
            	    shift_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 57, relational_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end relational_expression


    // $ANTLR start shift_expression
    // C.g:440:1: shift_expression : additive_expression ( ( '<<' | '>>' ) additive_expression )* ;
    public final void shift_expression() throws RecognitionException {
        int shift_expression_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }
            // C.g:441:2: ( additive_expression ( ( '<<' | '>>' ) additive_expression )* )
            // C.g:441:4: additive_expression ( ( '<<' | '>>' ) additive_expression )*
            {
            pushFollow(FOLLOW_additive_expression_in_shift_expression1741);
            additive_expression();
            _fsp--;
            if (failed) return ;
            // C.g:441:24: ( ( '<<' | '>>' ) additive_expression )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=87 && LA61_0<=88)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // C.g:441:25: ( '<<' | '>>' ) additive_expression
            	    {
            	    if ( (input.LA(1)>=87 && input.LA(1)<=88) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_shift_expression1744);    throw mse;
            	    }

            	    pushFollow(FOLLOW_additive_expression_in_shift_expression1750);
            	    additive_expression();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 58, shift_expression_StartIndex); }
        }
        return ;
    }
    // $ANTLR end shift_expression


    // $ANTLR start statement
    // C.g:446:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );
    public final void statement() throws RecognitionException {
        int statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }
            // C.g:447:2: ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement )
            int alt62=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==44) ) {
                    alt62=1;
                }
                else if ( ((LA62_1>=24 && LA62_1<=26)||LA62_1==48||LA62_1==50||LA62_1==52||(LA62_1>=54 && LA62_1<=59)||(LA62_1>=61 && LA62_1<=63)||(LA62_1>=66 && LA62_1<=88)) ) {
                    alt62=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("446:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );", 62, 1, input);

                    throw nvae;
                }
                }
                break;
            case 89:
            case 90:
                {
                alt62=1;
                }
                break;
            case 40:
                {
                alt62=2;
                }
                break;
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
            case FLOATING_POINT_LITERAL:
            case 24:
            case 48:
            case 52:
            case 54:
            case 55:
            case 58:
            case 59:
            case 60:
            case 63:
            case 64:
            case 65:
                {
                alt62=3;
                }
                break;
            case 91:
            case 93:
                {
                alt62=4;
                }
                break;
            case 94:
            case 95:
            case 96:
                {
                alt62=5;
                }
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                {
                alt62=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("446:1: statement : ( labeled_statement | compound_statement | expression_statement | selection_statement | iteration_statement | jump_statement );", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // C.g:447:4: labeled_statement
                    {
                    pushFollow(FOLLOW_labeled_statement_in_statement1765);
                    labeled_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:448:4: compound_statement
                    {
                    pushFollow(FOLLOW_compound_statement_in_statement1770);
                    compound_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:449:4: expression_statement
                    {
                    pushFollow(FOLLOW_expression_statement_in_statement1775);
                    expression_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // C.g:450:4: selection_statement
                    {
                    pushFollow(FOLLOW_selection_statement_in_statement1780);
                    selection_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // C.g:451:4: iteration_statement
                    {
                    pushFollow(FOLLOW_iteration_statement_in_statement1785);
                    iteration_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // C.g:452:4: jump_statement
                    {
                    pushFollow(FOLLOW_jump_statement_in_statement1790);
                    jump_statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 59, statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end statement


    // $ANTLR start labeled_statement
    // C.g:455:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );
    public final void labeled_statement() throws RecognitionException {
        int labeled_statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }
            // C.g:456:2: ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement )
            int alt63=3;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt63=1;
                }
                break;
            case 89:
                {
                alt63=2;
                }
                break;
            case 90:
                {
                alt63=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("455:1: labeled_statement : ( IDENTIFIER ':' statement | 'case' constant_expression ':' statement | 'default' ':' statement );", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // C.g:456:4: IDENTIFIER ':' statement
                    {
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_labeled_statement1801); if (failed) return ;
                    match(input,44,FOLLOW_44_in_labeled_statement1803); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_labeled_statement1805);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:457:4: 'case' constant_expression ':' statement
                    {
                    match(input,89,FOLLOW_89_in_labeled_statement1810); if (failed) return ;
                    pushFollow(FOLLOW_constant_expression_in_labeled_statement1812);
                    constant_expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,44,FOLLOW_44_in_labeled_statement1814); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_labeled_statement1816);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:458:4: 'default' ':' statement
                    {
                    match(input,90,FOLLOW_90_in_labeled_statement1821); if (failed) return ;
                    match(input,44,FOLLOW_44_in_labeled_statement1823); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_labeled_statement1825);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 60, labeled_statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end labeled_statement


    // $ANTLR start compound_statement
    // C.g:461:1: compound_statement : '{' ( declaration )* ( statement_list )? '}' ;
    public final void compound_statement() throws RecognitionException {
        Symbols_stack.push(new Symbols_scope());

        int compound_statement_StartIndex = input.index();

          ((Symbols_scope)Symbols_stack.peek()).types = new HashSet();

        try {
            if ( backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }
            // C.g:466:2: ( '{' ( declaration )* ( statement_list )? '}' )
            // C.g:466:4: '{' ( declaration )* ( statement_list )? '}'
            {
            match(input,40,FOLLOW_40_in_compound_statement1847); if (failed) return ;
            // C.g:466:8: ( declaration )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==IDENTIFIER) ) {
                    switch ( input.LA(2) ) {
                    case 48:
                        {
                        int LA64_38 = input.LA(3);

                        if ( ((synpred136()&&isTypeName(input.LT(1).getText()))) ) {
                            alt64=1;
                        }


                        }
                        break;
                    case 52:
                        {
                        int LA64_43 = input.LA(3);

                        if ( ((synpred136()&&isTypeName(input.LT(1).getText()))) ) {
                            alt64=1;
                        }


                        }
                        break;
                    case 24:
                        {
                        int LA64_58 = input.LA(3);

                        if ( ((synpred136()&&isTypeName(input.LT(1).getText()))) ) {
                            alt64=1;
                        }


                        }
                        break;
                    case IDENTIFIER:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 42:
                    case 43:
                    case 45:
                    case 46:
                    case 47:
                        {
                        alt64=1;
                        }
                        break;

                    }

                }
                else if ( (LA64_0==23||(LA64_0>=27 && LA64_0<=39)||(LA64_0>=42 && LA64_0<=43)||(LA64_0>=45 && LA64_0<=47)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // C.g:0:0: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_compound_statement1849);
            	    declaration();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            // C.g:466:21: ( statement_list )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=IDENTIFIER && LA65_0<=FLOATING_POINT_LITERAL)||LA65_0==24||LA65_0==40||LA65_0==48||LA65_0==52||(LA65_0>=54 && LA65_0<=55)||(LA65_0>=58 && LA65_0<=60)||(LA65_0>=63 && LA65_0<=65)||(LA65_0>=89 && LA65_0<=91)||(LA65_0>=93 && LA65_0<=100)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // C.g:0:0: statement_list
                    {
                    pushFollow(FOLLOW_statement_list_in_compound_statement1852);
                    statement_list();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,41,FOLLOW_41_in_compound_statement1855); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 61, compound_statement_StartIndex); }
            Symbols_stack.pop();

        }
        return ;
    }
    // $ANTLR end compound_statement


    // $ANTLR start statement_list
    // C.g:469:1: statement_list : ( statement )+ ;
    public final void statement_list() throws RecognitionException {
        int statement_list_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }
            // C.g:470:2: ( ( statement )+ )
            // C.g:470:4: ( statement )+
            {
            // C.g:470:4: ( statement )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( ((LA66_0>=IDENTIFIER && LA66_0<=FLOATING_POINT_LITERAL)||LA66_0==24||LA66_0==40||LA66_0==48||LA66_0==52||(LA66_0>=54 && LA66_0<=55)||(LA66_0>=58 && LA66_0<=60)||(LA66_0>=63 && LA66_0<=65)||(LA66_0>=89 && LA66_0<=91)||(LA66_0>=93 && LA66_0<=100)) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C.g:0:0: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_statement_list1866);
            	    statement();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 62, statement_list_StartIndex); }
        }
        return ;
    }
    // $ANTLR end statement_list


    // $ANTLR start expression_statement
    // C.g:473:1: expression_statement : ( ';' | expression ';' );
    public final void expression_statement() throws RecognitionException {
        int expression_statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }
            // C.g:474:2: ( ';' | expression ';' )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==24) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=IDENTIFIER && LA67_0<=FLOATING_POINT_LITERAL)||LA67_0==48||LA67_0==52||(LA67_0>=54 && LA67_0<=55)||(LA67_0>=58 && LA67_0<=60)||(LA67_0>=63 && LA67_0<=65)) ) {
                alt67=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("473:1: expression_statement : ( ';' | expression ';' );", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // C.g:474:4: ';'
                    {
                    match(input,24,FOLLOW_24_in_expression_statement1878); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:475:4: expression ';'
                    {
                    pushFollow(FOLLOW_expression_in_expression_statement1883);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,24,FOLLOW_24_in_expression_statement1885); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 63, expression_statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end expression_statement


    // $ANTLR start selection_statement
    // C.g:478:1: selection_statement : ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement );
    public final void selection_statement() throws RecognitionException {
        int selection_statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }
            // C.g:479:2: ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==91) ) {
                alt69=1;
            }
            else if ( (LA69_0==93) ) {
                alt69=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("478:1: selection_statement : ( 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )? | 'switch' '(' expression ')' statement );", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // C.g:479:4: 'if' '(' expression ')' statement ( options {k=1; backtrack=false; } : 'else' statement )?
                    {
                    match(input,91,FOLLOW_91_in_selection_statement1896); if (failed) return ;
                    match(input,48,FOLLOW_48_in_selection_statement1898); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_selection_statement1900);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_selection_statement1902); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_selection_statement1904);
                    statement();
                    _fsp--;
                    if (failed) return ;
                    // C.g:479:38: ( options {k=1; backtrack=false; } : 'else' statement )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==92) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // C.g:479:71: 'else' statement
                            {
                            match(input,92,FOLLOW_92_in_selection_statement1919); if (failed) return ;
                            pushFollow(FOLLOW_statement_in_selection_statement1921);
                            statement();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C.g:480:4: 'switch' '(' expression ')' statement
                    {
                    match(input,93,FOLLOW_93_in_selection_statement1928); if (failed) return ;
                    match(input,48,FOLLOW_48_in_selection_statement1930); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_selection_statement1932);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_selection_statement1934); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_selection_statement1936);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 64, selection_statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end selection_statement


    // $ANTLR start iteration_statement
    // C.g:483:1: iteration_statement : ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement );
    public final void iteration_statement() throws RecognitionException {
        int iteration_statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }
            // C.g:484:2: ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement )
            int alt71=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt71=1;
                }
                break;
            case 95:
                {
                alt71=2;
                }
                break;
            case 96:
                {
                alt71=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("483:1: iteration_statement : ( 'while' '(' expression ')' statement | 'do' statement 'while' '(' expression ')' ';' | 'for' '(' expression_statement expression_statement ( expression )? ')' statement );", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // C.g:484:4: 'while' '(' expression ')' statement
                    {
                    match(input,94,FOLLOW_94_in_iteration_statement1947); if (failed) return ;
                    match(input,48,FOLLOW_48_in_iteration_statement1949); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_iteration_statement1951);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_iteration_statement1953); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_iteration_statement1955);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:485:4: 'do' statement 'while' '(' expression ')' ';'
                    {
                    match(input,95,FOLLOW_95_in_iteration_statement1960); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_iteration_statement1962);
                    statement();
                    _fsp--;
                    if (failed) return ;
                    match(input,94,FOLLOW_94_in_iteration_statement1964); if (failed) return ;
                    match(input,48,FOLLOW_48_in_iteration_statement1966); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_iteration_statement1968);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,49,FOLLOW_49_in_iteration_statement1970); if (failed) return ;
                    match(input,24,FOLLOW_24_in_iteration_statement1972); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:486:4: 'for' '(' expression_statement expression_statement ( expression )? ')' statement
                    {
                    match(input,96,FOLLOW_96_in_iteration_statement1977); if (failed) return ;
                    match(input,48,FOLLOW_48_in_iteration_statement1979); if (failed) return ;
                    pushFollow(FOLLOW_expression_statement_in_iteration_statement1981);
                    expression_statement();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_expression_statement_in_iteration_statement1983);
                    expression_statement();
                    _fsp--;
                    if (failed) return ;
                    // C.g:486:56: ( expression )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=IDENTIFIER && LA70_0<=FLOATING_POINT_LITERAL)||LA70_0==48||LA70_0==52||(LA70_0>=54 && LA70_0<=55)||(LA70_0>=58 && LA70_0<=60)||(LA70_0>=63 && LA70_0<=65)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C.g:0:0: expression
                            {
                            pushFollow(FOLLOW_expression_in_iteration_statement1985);
                            expression();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    match(input,49,FOLLOW_49_in_iteration_statement1988); if (failed) return ;
                    pushFollow(FOLLOW_statement_in_iteration_statement1990);
                    statement();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 65, iteration_statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end iteration_statement


    // $ANTLR start jump_statement
    // C.g:489:1: jump_statement : ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );
    public final void jump_statement() throws RecognitionException {
        int jump_statement_StartIndex = input.index();
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }
            // C.g:490:2: ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' )
            int alt72=5;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt72=1;
                }
                break;
            case 98:
                {
                alt72=2;
                }
                break;
            case 99:
                {
                alt72=3;
                }
                break;
            case 100:
                {
                int LA72_4 = input.LA(2);

                if ( (LA72_4==24) ) {
                    alt72=4;
                }
                else if ( ((LA72_4>=IDENTIFIER && LA72_4<=FLOATING_POINT_LITERAL)||LA72_4==48||LA72_4==52||(LA72_4>=54 && LA72_4<=55)||(LA72_4>=58 && LA72_4<=60)||(LA72_4>=63 && LA72_4<=65)) ) {
                    alt72=5;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("489:1: jump_statement : ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );", 72, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("489:1: jump_statement : ( 'goto' IDENTIFIER ';' | 'continue' ';' | 'break' ';' | 'return' ';' | 'return' expression ';' );", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // C.g:490:4: 'goto' IDENTIFIER ';'
                    {
                    match(input,97,FOLLOW_97_in_jump_statement2001); if (failed) return ;
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_jump_statement2003); if (failed) return ;
                    match(input,24,FOLLOW_24_in_jump_statement2005); if (failed) return ;

                    }
                    break;
                case 2 :
                    // C.g:491:4: 'continue' ';'
                    {
                    match(input,98,FOLLOW_98_in_jump_statement2010); if (failed) return ;
                    match(input,24,FOLLOW_24_in_jump_statement2012); if (failed) return ;

                    }
                    break;
                case 3 :
                    // C.g:492:4: 'break' ';'
                    {
                    match(input,99,FOLLOW_99_in_jump_statement2017); if (failed) return ;
                    match(input,24,FOLLOW_24_in_jump_statement2019); if (failed) return ;

                    }
                    break;
                case 4 :
                    // C.g:493:4: 'return' ';'
                    {
                    match(input,100,FOLLOW_100_in_jump_statement2024); if (failed) return ;
                    match(input,24,FOLLOW_24_in_jump_statement2026); if (failed) return ;

                    }
                    break;
                case 5 :
                    // C.g:494:4: 'return' expression ';'
                    {
                    match(input,100,FOLLOW_100_in_jump_statement2031); if (failed) return ;
                    pushFollow(FOLLOW_expression_in_jump_statement2033);
                    expression();
                    _fsp--;
                    if (failed) return ;
                    match(input,24,FOLLOW_24_in_jump_statement2035); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 66, jump_statement_StartIndex); }
        }
        return ;
    }
    // $ANTLR end jump_statement

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // C.g:110:6: ( declaration_specifiers )
        // C.g:110:6: declaration_specifiers
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred2106);
        declaration_specifiers();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // C.g:110:4: ( ( declaration_specifiers )? declarator ( declaration )* '{' )
        // C.g:110:6: ( declaration_specifiers )? declarator ( declaration )* '{'
        {
        // C.g:110:6: ( declaration_specifiers )?
        int alt73=2;
        int LA73_0 = input.LA(1);

        if ( ((LA73_0>=27 && LA73_0<=39)||(LA73_0>=42 && LA73_0<=43)||(LA73_0>=45 && LA73_0<=47)) ) {
            alt73=1;
        }
        else if ( (LA73_0==IDENTIFIER) ) {
            switch ( input.LA(2) ) {
                case 52:
                    {
                    alt73=1;
                    }
                    break;
                case IDENTIFIER:
                    {
                    int LA73_18 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA73_19 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    {
                    int LA73_20 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 31:
                    {
                    int LA73_21 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 32:
                    {
                    int LA73_22 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 33:
                    {
                    int LA73_23 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 34:
                    {
                    int LA73_24 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA73_25 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 36:
                    {
                    int LA73_26 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 37:
                    {
                    int LA73_27 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA73_28 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA73_29 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 42:
                case 43:
                    {
                    int LA73_30 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA73_31 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
                case 46:
                case 47:
                    {
                    int LA73_32 = input.LA(3);

                    if ( ((synpred2()&&isTypeName(input.LT(1).getText()))) ) {
                        alt73=1;
                    }
                    }
                    break;
            }

        }
        switch (alt73) {
            case 1 :
                // C.g:0:0: declaration_specifiers
                {
                pushFollow(FOLLOW_declaration_specifiers_in_synpred4106);
                declaration_specifiers();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_declarator_in_synpred4109);
        declarator();
        _fsp--;
        if (failed) return ;
        // C.g:110:41: ( declaration )*
        loop74:
        do {
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==IDENTIFIER||LA74_0==23||(LA74_0>=27 && LA74_0<=39)||(LA74_0>=42 && LA74_0<=43)||(LA74_0>=45 && LA74_0<=47)) ) {
                alt74=1;
            }


            switch (alt74) {
        	case 1 :
        	    // C.g:0:0: declaration
        	    {
        	    pushFollow(FOLLOW_declaration_in_synpred4111);
        	    declaration();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    break loop74;
            }
        } while (true);

        match(input,40,FOLLOW_40_in_synpred4114); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // C.g:119:4: ( declaration_specifiers )
        // C.g:119:4: declaration_specifiers
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred5146);
        declaration_specifiers();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // C.g:132:14: ( declaration_specifiers )
        // C.g:132:14: declaration_specifiers
        {
        pushFollow(FOLLOW_declaration_specifiers_in_synpred8195);
        declaration_specifiers();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // C.g:139:7: ( type_specifier )
        // C.g:139:7: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred12241);
        type_specifier();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // C.g:203:23: ( type_specifier )
        // C.g:203:23: type_specifier
        {
        pushFollow(FOLLOW_type_specifier_in_synpred35521);
        type_specifier();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred45
    public final void synpred45_fragment() throws RecognitionException {   
        // C.g:236:4: ( ( pointer )? direct_declarator )
        // C.g:236:4: ( pointer )? direct_declarator
        {
        // C.g:236:4: ( pointer )?
        int alt79=2;
        int LA79_0 = input.LA(1);

        if ( (LA79_0==52) ) {
            alt79=1;
        }
        switch (alt79) {
            case 1 :
                // C.g:0:0: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred45674);
                pointer();
                _fsp--;
                if (failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_direct_declarator_in_synpred45677);
        direct_declarator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred45

    // $ANTLR start synpred47
    public final void synpred47_fragment() throws RecognitionException {   
        // C.g:250:9: ( declarator_suffix )
        // C.g:250:9: declarator_suffix
        {
        pushFollow(FOLLOW_declarator_suffix_in_synpred47726);
        declarator_suffix();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred47

    // $ANTLR start synpred50
    public final void synpred50_fragment() throws RecognitionException {   
        // C.g:256:9: ( '(' parameter_type_list ')' )
        // C.g:256:9: '(' parameter_type_list ')'
        {
        match(input,48,FOLLOW_48_in_synpred50766); if (failed) return ;
        pushFollow(FOLLOW_parameter_type_list_in_synpred50768);
        parameter_type_list();
        _fsp--;
        if (failed) return ;
        match(input,49,FOLLOW_49_in_synpred50770); if (failed) return ;

        }
    }
    // $ANTLR end synpred50

    // $ANTLR start synpred51
    public final void synpred51_fragment() throws RecognitionException {   
        // C.g:257:9: ( '(' identifier_list ')' )
        // C.g:257:9: '(' identifier_list ')'
        {
        match(input,48,FOLLOW_48_in_synpred51780); if (failed) return ;
        pushFollow(FOLLOW_identifier_list_in_synpred51782);
        identifier_list();
        _fsp--;
        if (failed) return ;
        match(input,49,FOLLOW_49_in_synpred51784); if (failed) return ;

        }
    }
    // $ANTLR end synpred51

    // $ANTLR start synpred52
    public final void synpred52_fragment() throws RecognitionException {   
        // C.g:262:8: ( type_qualifier )
        // C.g:262:8: type_qualifier
        {
        pushFollow(FOLLOW_type_qualifier_in_synpred52809);
        type_qualifier();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred52

    // $ANTLR start synpred53
    public final void synpred53_fragment() throws RecognitionException {   
        // C.g:262:24: ( pointer )
        // C.g:262:24: pointer
        {
        pushFollow(FOLLOW_pointer_in_synpred53812);
        pointer();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred53

    // $ANTLR start synpred54
    public final void synpred54_fragment() throws RecognitionException {   
        // C.g:262:4: ( '*' ( type_qualifier )+ ( pointer )? )
        // C.g:262:4: '*' ( type_qualifier )+ ( pointer )?
        {
        match(input,52,FOLLOW_52_in_synpred54807); if (failed) return ;
        // C.g:262:8: ( type_qualifier )+
        int cnt80=0;
        loop80:
        do {
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=46 && LA80_0<=47)) ) {
                alt80=1;
            }


            switch (alt80) {
        	case 1 :
        	    // C.g:0:0: type_qualifier
        	    {
        	    pushFollow(FOLLOW_type_qualifier_in_synpred54809);
        	    type_qualifier();
        	    _fsp--;
        	    if (failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt80 >= 1 ) break loop80;
        	    if (backtracking>0) {failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(80, input);
                    throw eee;
            }
            cnt80++;
        } while (true);

        // C.g:262:24: ( pointer )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==52) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // C.g:0:0: pointer
                {
                pushFollow(FOLLOW_pointer_in_synpred54812);
                pointer();
                _fsp--;
                if (failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred54

    // $ANTLR start synpred55
    public final void synpred55_fragment() throws RecognitionException {   
        // C.g:263:4: ( '*' pointer )
        // C.g:263:4: '*' pointer
        {
        match(input,52,FOLLOW_52_in_synpred55818); if (failed) return ;
        pushFollow(FOLLOW_pointer_in_synpred55820);
        pointer();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred55

    // $ANTLR start synpred58
    public final void synpred58_fragment() throws RecognitionException {   
        // C.g:276:28: ( declarator )
        // C.g:276:28: declarator
        {
        pushFollow(FOLLOW_declarator_in_synpred58875);
        declarator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred58

    // $ANTLR start synpred59
    public final void synpred59_fragment() throws RecognitionException {   
        // C.g:276:39: ( abstract_declarator )
        // C.g:276:39: abstract_declarator
        {
        pushFollow(FOLLOW_abstract_declarator_in_synpred59877);
        abstract_declarator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred59

    // $ANTLR start synpred62
    public final void synpred62_fragment() throws RecognitionException {   
        // C.g:288:12: ( direct_abstract_declarator )
        // C.g:288:12: direct_abstract_declarator
        {
        pushFollow(FOLLOW_direct_abstract_declarator_in_synpred62924);
        direct_abstract_declarator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred62

    // $ANTLR start synpred65
    public final void synpred65_fragment() throws RecognitionException {   
        // C.g:293:65: ( abstract_declarator_suffix )
        // C.g:293:65: abstract_declarator_suffix
        {
        pushFollow(FOLLOW_abstract_declarator_suffix_in_synpred65955);
        abstract_declarator_suffix();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred65

    // $ANTLR start synpred78
    public final void synpred78_fragment() throws RecognitionException {   
        // C.g:327:4: ( '(' type_name ')' cast_expression )
        // C.g:327:4: '(' type_name ')' cast_expression
        {
        match(input,48,FOLLOW_48_in_synpred781127); if (failed) return ;
        pushFollow(FOLLOW_type_name_in_synpred781129);
        type_name();
        _fsp--;
        if (failed) return ;
        match(input,49,FOLLOW_49_in_synpred781131); if (failed) return ;
        pushFollow(FOLLOW_cast_expression_in_synpred781133);
        cast_expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred78

    // $ANTLR start synpred83
    public final void synpred83_fragment() throws RecognitionException {   
        // C.g:336:4: ( 'sizeof' unary_expression )
        // C.g:336:4: 'sizeof' unary_expression
        {
        match(input,60,FOLLOW_60_in_synpred831175); if (failed) return ;
        pushFollow(FOLLOW_unary_expression_in_synpred831177);
        unary_expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred83

    // $ANTLR start synpred104
    public final void synpred104_fragment() throws RecognitionException {   
        // C.g:387:4: ( lvalue assignment_operator assignment_expression )
        // C.g:387:4: lvalue assignment_operator assignment_expression
        {
        pushFollow(FOLLOW_lvalue_in_synpred1041489);
        lvalue();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_assignment_operator_in_synpred1041491);
        assignment_operator();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_assignment_expression_in_synpred1041493);
        assignment_expression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred104

    // $ANTLR start synpred136
    public final void synpred136_fragment() throws RecognitionException {   
        // C.g:466:8: ( declaration )
        // C.g:466:8: declaration
        {
        pushFollow(FOLLOW_declaration_in_synpred1361849);
        declaration();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred136

    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred136() {
        backtracking++;
        int start = input.mark();
        try {
            synpred136_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred59() {
        backtracking++;
        int start = input.mark();
        try {
            synpred59_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred58() {
        backtracking++;
        int start = input.mark();
        try {
            synpred58_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred45() {
        backtracking++;
        int start = input.mark();
        try {
            synpred45_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred83() {
        backtracking++;
        int start = input.mark();
        try {
            synpred83_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred65() {
        backtracking++;
        int start = input.mark();
        try {
            synpred65_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred47() {
        backtracking++;
        int start = input.mark();
        try {
            synpred47_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred55() {
        backtracking++;
        int start = input.mark();
        try {
            synpred55_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred54() {
        backtracking++;
        int start = input.mark();
        try {
            synpred54_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred78() {
        backtracking++;
        int start = input.mark();
        try {
            synpred78_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred62() {
        backtracking++;
        int start = input.mark();
        try {
            synpred62_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred53() {
        backtracking++;
        int start = input.mark();
        try {
            synpred53_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred52() {
        backtracking++;
        int start = input.mark();
        try {
            synpred52_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred51() {
        backtracking++;
        int start = input.mark();
        try {
            synpred51_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred50() {
        backtracking++;
        int start = input.mark();
        try {
            synpred50_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred104() {
        backtracking++;
        int start = input.mark();
        try {
            synpred104_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_external_declaration_in_translation_unit83 = new BitSet(new long[]{0x0011ECFFF8800012L});
    public static final BitSet FOLLOW_function_definition_in_external_declaration119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_external_declaration124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_function_definition146 = new BitSet(new long[]{0x0011000000000010L});
    public static final BitSet FOLLOW_declarator_in_function_definition149 = new BitSet(new long[]{0x0000EDFFF8800010L});
    public static final BitSet FOLLOW_declaration_in_function_definition155 = new BitSet(new long[]{0x0000EDFFF8800010L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_function_definition165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_declaration193 = new BitSet(new long[]{0x0011ECFFF8000010L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration195 = new BitSet(new long[]{0x0011000000000010L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration203 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declaration205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_declaration211 = new BitSet(new long[]{0x0011000001000010L});
    public static final BitSet FOLLOW_init_declarator_list_in_declaration213 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_declaration216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storage_class_specifier_in_declaration_specifiers233 = new BitSet(new long[]{0x0000ECFFF8000012L});
    public static final BitSet FOLLOW_type_specifier_in_declaration_specifiers241 = new BitSet(new long[]{0x0000ECFFF8000012L});
    public static final BitSet FOLLOW_type_qualifier_in_declaration_specifiers255 = new BitSet(new long[]{0x0000ECFFF8000012L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list277 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_init_declarator_list280 = new BitSet(new long[]{0x0011000000000010L});
    public static final BitSet FOLLOW_init_declarator_in_init_declarator_list282 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_declarator_in_init_declarator295 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_init_declarator298 = new BitSet(new long[]{0x9CD10100000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_initializer_in_init_declarator300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_storage_class_specifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_type_specifier339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_type_specifier344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_type_specifier349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_type_specifier354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_type_specifier359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_type_specifier364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_type_specifier369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_type_specifier374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type_specifier379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_specifier_in_type_specifier384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enum_specifier_in_type_specifier389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_id_in_type_specifier394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_type_id412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier445 = new BitSet(new long[]{0x0000010000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier447 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_struct_or_union_specifier450 = new BitSet(new long[]{0x0000ECFF80000010L});
    public static final BitSet FOLLOW_struct_declaration_list_in_struct_or_union_specifier452 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_struct_or_union_specifier454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_or_union_in_struct_or_union_specifier459 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_struct_or_union_specifier461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_struct_or_union0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_struct_declaration_in_struct_declaration_list488 = new BitSet(new long[]{0x0000ECFF80000012L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_struct_declaration500 = new BitSet(new long[]{0x0011100000000010L});
    public static final BitSet FOLLOW_struct_declarator_list_in_struct_declaration502 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_struct_declaration504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_specifier_qualifier_list517 = new BitSet(new long[]{0x0000ECFF80000012L});
    public static final BitSet FOLLOW_type_specifier_in_specifier_qualifier_list521 = new BitSet(new long[]{0x0000ECFF80000012L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list535 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_struct_declarator_list538 = new BitSet(new long[]{0x0011100000000010L});
    public static final BitSet FOLLOW_struct_declarator_in_struct_declarator_list540 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_declarator_in_struct_declarator553 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_44_in_struct_declarator556 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_struct_declarator565 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_constant_expression_in_struct_declarator567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_enum_specifier585 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_enum_specifier587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier589 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_enum_specifier591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_enum_specifier596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier598 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_enum_specifier600 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumerator_list_in_enum_specifier602 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_enum_specifier604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_enum_specifier609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enum_specifier611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list622 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_enumerator_list625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_enumerator_in_enumerator_list627 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_enumerator640 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_enumerator643 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_constant_expression_in_enumerator645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_type_qualifier0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator674 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_direct_declarator_in_declarator677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_declarator682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_direct_declarator697 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_48_in_direct_declarator708 = new BitSet(new long[]{0x0011000000000010L});
    public static final BitSet FOLLOW_declarator_in_direct_declarator710 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_direct_declarator712 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_declarator_suffix_in_direct_declarator726 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_50_in_declarator_suffix740 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_constant_expression_in_declarator_suffix742 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_declarator_suffix744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_declarator_suffix754 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_declarator_suffix756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_declarator_suffix766 = new BitSet(new long[]{0x0000ECFFF8000010L});
    public static final BitSet FOLLOW_parameter_type_list_in_declarator_suffix768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarator_suffix770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_declarator_suffix780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_list_in_declarator_suffix782 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarator_suffix784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_declarator_suffix794 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_declarator_suffix796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_pointer807 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_type_qualifier_in_pointer809 = new BitSet(new long[]{0x0010C00000000002L});
    public static final BitSet FOLLOW_pointer_in_pointer812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_pointer818 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_pointer_in_pointer820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_pointer825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_list_in_parameter_type_list836 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parameter_type_list839 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_parameter_type_list841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list854 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_parameter_list857 = new BitSet(new long[]{0x0000ECFFF8000010L});
    public static final BitSet FOLLOW_parameter_declaration_in_parameter_list859 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_parameter_declaration872 = new BitSet(new long[]{0x0015000000000012L});
    public static final BitSet FOLLOW_declarator_in_parameter_declaration875 = new BitSet(new long[]{0x0015000000000012L});
    public static final BitSet FOLLOW_abstract_declarator_in_parameter_declaration877 = new BitSet(new long[]{0x0015000000000012L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list890 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_identifier_list893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_identifier_list895 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_specifier_qualifier_list_in_type_name908 = new BitSet(new long[]{0x0015000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_type_name910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_abstract_declarator922 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_abstract_declarator930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_direct_abstract_declarator943 = new BitSet(new long[]{0x0015000000000000L});
    public static final BitSet FOLLOW_abstract_declarator_in_direct_abstract_declarator945 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_direct_abstract_declarator947 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator951 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_suffix_in_direct_abstract_declarator955 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_50_in_abstract_declarator_suffix967 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_abstract_declarator_suffix969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_abstract_declarator_suffix974 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_constant_expression_in_abstract_declarator_suffix976 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_abstract_declarator_suffix978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_abstract_declarator_suffix983 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_abstract_declarator_suffix985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_abstract_declarator_suffix990 = new BitSet(new long[]{0x0000ECFFF8000010L});
    public static final BitSet FOLLOW_parameter_type_list_in_abstract_declarator_suffix992 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_abstract_declarator_suffix994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_initializer1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_initializer1011 = new BitSet(new long[]{0x9CD10100000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_initializer_list_in_initializer1013 = new BitSet(new long[]{0x0000020002000000L});
    public static final BitSet FOLLOW_25_in_initializer1015 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_initializer1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializer_list1029 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_initializer_list1032 = new BitSet(new long[]{0x9CD10100000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_initializer_in_initializer_list1034 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1051 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_argument_expression_list1054 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_assignment_expression_in_argument_expression_list1056 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1070 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_54_in_additive_expression1074 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1076 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_55_in_additive_expression1080 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1082 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1096 = new BitSet(new long[]{0x0310000000000002L});
    public static final BitSet FOLLOW_52_in_multiplicative_expression1100 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1102 = new BitSet(new long[]{0x0310000000000002L});
    public static final BitSet FOLLOW_56_in_multiplicative_expression1106 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1108 = new BitSet(new long[]{0x0310000000000002L});
    public static final BitSet FOLLOW_57_in_multiplicative_expression1112 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_cast_expression_in_multiplicative_expression1114 = new BitSet(new long[]{0x0310000000000002L});
    public static final BitSet FOLLOW_48_in_cast_expression1127 = new BitSet(new long[]{0x0000ECFF80000010L});
    public static final BitSet FOLLOW_type_name_in_cast_expression1129 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_cast_expression1131 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_cast_expression_in_cast_expression1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_cast_expression1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expression_in_unary_expression1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_unary_expression1154 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_unary_expression1161 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_operator_in_unary_expression1168 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_cast_expression_in_unary_expression1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_unary_expression1175 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_unary_expression_in_unary_expression1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_unary_expression1182 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_unary_expression1184 = new BitSet(new long[]{0x0000ECFF80000010L});
    public static final BitSet FOLLOW_type_name_in_unary_expression1186 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_unary_expression1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_expression_in_postfix_expression1201 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_50_in_postfix_expression1215 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_postfix_expression1217 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_postfix_expression1219 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_48_in_postfix_expression1233 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_postfix_expression1235 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_48_in_postfix_expression1249 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_argument_expression_list_in_postfix_expression1251 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_postfix_expression1253 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_61_in_postfix_expression1267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1269 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_62_in_postfix_expression1283 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_postfix_expression1285 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_58_in_postfix_expression1299 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_59_in_postfix_expression1313 = new BitSet(new long[]{0x6C05000000000002L});
    public static final BitSet FOLLOW_set_in_unary_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primary_expression1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_primary_expression1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_primary_expression1381 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_primary_expression1383 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_primary_expression1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constant0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_expression_in_expression1460 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_expression1463 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_assignment_expression_in_expression1465 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_conditional_expression_in_constant_expression1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_assignment_expression1489 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000FFCL});
    public static final BitSet FOLLOW_assignment_operator_in_assignment_expression1491 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_assignment_expression_in_assignment_expression1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_expression_in_assignment_expression1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unary_expression_in_lvalue1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignment_operator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_or_expression_in_conditional_expression1582 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_conditional_expression1585 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_conditional_expression1587 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_conditional_expression1589 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_conditional_expression_in_conditional_expression1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1604 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_logical_or_expression1607 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_logical_and_expression_in_logical_or_expression1609 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_logical_and_expression1625 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_inclusive_or_expression_in_logical_and_expression1627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1640 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_inclusive_or_expression1643 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_exclusive_or_expression_in_inclusive_or_expression1645 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_exclusive_or_expression1661 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_and_expression_in_exclusive_or_expression1663 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1676 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_and_expression1679 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_equality_expression_in_and_expression1681 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1693 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_set_in_equality_expression1696 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_relational_expression_in_equality_expression1702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000060000L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1715 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_set_in_relational_expression1718 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_shift_expression_in_relational_expression1728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000780000L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1741 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_set_in_shift_expression1744 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_additive_expression_in_shift_expression1750 = new BitSet(new long[]{0x0000000000000002L,0x0000000001800000L});
    public static final BitSet FOLLOW_labeled_statement_in_statement1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compound_statement_in_statement1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selection_statement_in_statement1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iteration_statement_in_statement1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jump_statement_in_statement1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_labeled_statement1801 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_labeled_statement1803 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_labeled_statement1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_labeled_statement1810 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_constant_expression_in_labeled_statement1812 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_labeled_statement1814 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_labeled_statement1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_labeled_statement1821 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_labeled_statement1823 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_labeled_statement1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_compound_statement1847 = new BitSet(new long[]{0x9CD1EFFFF98007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_declaration_in_compound_statement1849 = new BitSet(new long[]{0x9CD1EFFFF98007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_list_in_compound_statement1852 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_compound_statement1855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statement_list1866 = new BitSet(new long[]{0x9CD10100010007F2L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_24_in_expression_statement1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement1883 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_expression_statement1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_selection_statement1896 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_selection_statement1898 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_selection_statement1900 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selection_statement1902 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_selection_statement1904 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_selection_statement1919 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_selection_statement1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_selection_statement1928 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_selection_statement1930 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_selection_statement1932 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_selection_statement1934 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_selection_statement1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_iteration_statement1947 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_iteration_statement1949 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_iteration_statement1951 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iteration_statement1953 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_iteration_statement1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_iteration_statement1960 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_iteration_statement1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_iteration_statement1964 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_iteration_statement1966 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_iteration_statement1968 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iteration_statement1970 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_iteration_statement1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_iteration_statement1977 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_iteration_statement1979 = new BitSet(new long[]{0x9CD10000010007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement1981 = new BitSet(new long[]{0x9CD10000010007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_statement_in_iteration_statement1983 = new BitSet(new long[]{0x9CD30000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_iteration_statement1985 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_iteration_statement1988 = new BitSet(new long[]{0x9CD10100010007F0L,0x0000001FEE000003L});
    public static final BitSet FOLLOW_statement_in_iteration_statement1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_jump_statement2001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_IDENTIFIER_in_jump_statement2003 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_jump_statement2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_jump_statement2010 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_jump_statement2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_jump_statement2017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_jump_statement2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_jump_statement2024 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_jump_statement2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_jump_statement2031 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_expression_in_jump_statement2033 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_jump_statement2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred2106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred4106 = new BitSet(new long[]{0x0011000000000010L});
    public static final BitSet FOLLOW_declarator_in_synpred4109 = new BitSet(new long[]{0x0000EDFFF8800010L});
    public static final BitSet FOLLOW_declaration_in_synpred4111 = new BitSet(new long[]{0x0000EDFFF8800010L});
    public static final BitSet FOLLOW_40_in_synpred4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_specifiers_in_synpred8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred12241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_specifier_in_synpred35521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred45674 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_direct_declarator_in_synpred45677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_suffix_in_synpred47726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred50766 = new BitSet(new long[]{0x0000ECFFF8000010L});
    public static final BitSet FOLLOW_parameter_type_list_in_synpred50768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred50770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred51780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_identifier_list_in_synpred51782 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred51784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_qualifier_in_synpred52809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred53812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred54807 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_type_qualifier_in_synpred54809 = new BitSet(new long[]{0x0010C00000000002L});
    public static final BitSet FOLLOW_pointer_in_synpred54812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_synpred55818 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_pointer_in_synpred55820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declarator_in_synpred58875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_in_synpred59877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_direct_abstract_declarator_in_synpred62924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abstract_declarator_suffix_in_synpred65955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_synpred781127 = new BitSet(new long[]{0x0000ECFF80000010L});
    public static final BitSet FOLLOW_type_name_in_synpred781129 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_synpred781131 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_cast_expression_in_synpred781133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred831175 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_unary_expression_in_synpred831177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lvalue_in_synpred1041489 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000FFCL});
    public static final BitSet FOLLOW_assignment_operator_in_synpred1041491 = new BitSet(new long[]{0x9CD10000000007F0L,0x0000000000000003L});
    public static final BitSet FOLLOW_assignment_expression_in_synpred1041493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_synpred1361849 = new BitSet(new long[]{0x0000000000000002L});

}