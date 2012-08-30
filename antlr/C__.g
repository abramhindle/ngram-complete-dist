lexer grammar C;
@members {
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

}

T23 : 'typedef' ;
T24 : ';' ;
T25 : ',' ;
T26 : '=' ;
T27 : 'extern' ;
T28 : 'static' ;
T29 : 'auto' ;
T30 : 'register' ;
T31 : 'void' ;
T32 : 'char' ;
T33 : 'short' ;
T34 : 'int' ;
T35 : 'long' ;
T36 : 'float' ;
T37 : 'double' ;
T38 : 'signed' ;
T39 : 'unsigned' ;
T40 : '{' ;
T41 : '}' ;
T42 : 'struct' ;
T43 : 'union' ;
T44 : ':' ;
T45 : 'enum' ;
T46 : 'const' ;
T47 : 'volatile' ;
T48 : '(' ;
T49 : ')' ;
T50 : '[' ;
T51 : ']' ;
T52 : '*' ;
T53 : '...' ;
T54 : '+' ;
T55 : '-' ;
T56 : '/' ;
T57 : '%' ;
T58 : '++' ;
T59 : '--' ;
T60 : 'sizeof' ;
T61 : '.' ;
T62 : '->' ;
T63 : '&' ;
T64 : '~' ;
T65 : '!' ;
T66 : '*=' ;
T67 : '/=' ;
T68 : '%=' ;
T69 : '+=' ;
T70 : '-=' ;
T71 : '<<=' ;
T72 : '>>=' ;
T73 : '&=' ;
T74 : '^=' ;
T75 : '|=' ;
T76 : '?' ;
T77 : '||' ;
T78 : '&&' ;
T79 : '|' ;
T80 : '^' ;
T81 : '==' ;
T82 : '!=' ;
T83 : '<' ;
T84 : '>' ;
T85 : '<=' ;
T86 : '>=' ;
T87 : '<<' ;
T88 : '>>' ;
T89 : 'case' ;
T90 : 'default' ;
T91 : 'if' ;
T92 : 'else' ;
T93 : 'switch' ;
T94 : 'while' ;
T95 : 'do' ;
T96 : 'for' ;
T97 : 'goto' ;
T98 : 'continue' ;
T99 : 'break' ;
T100 : 'return' ;

// $ANTLR src "C.g" 497
IDENTIFIER
	:	LETTER (LETTER|'0'..'9')*
	;
	
// $ANTLR src "C.g" 501
fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

// $ANTLR src "C.g" 509
CHARACTER_LITERAL
    :   '\'' ( EscapeSequence | ~('\''|'\\') ) '\''
    ;

// $ANTLR src "C.g" 513
STRING_LITERAL
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

// $ANTLR src "C.g" 517
HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix? ;

// $ANTLR src "C.g" 519
DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix? ;

// $ANTLR src "C.g" 521
OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix? ;

// $ANTLR src "C.g" 523
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "C.g" 526
fragment
IntegerTypeSuffix
	:	('u'|'U')? ('l'|'L')
	|	('u'|'U')  ('l'|'L')?
	;

// $ANTLR src "C.g" 532
FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

// $ANTLR src "C.g" 539
fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

// $ANTLR src "C.g" 542
fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

// $ANTLR src "C.g" 545
fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

// $ANTLR src "C.g" 551
fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "C.g" 558
fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

// $ANTLR src "C.g" 563
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }

    ;

// $ANTLR src "C.g" 573
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }
    ;

// $ANTLR src "C.g" 583
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }
    ;

// ignore #line info for now
// $ANTLR src "C.g" 594
LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }
    ;
