lexer grammar Java;
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

AND : '&' ;
AND_ASSIGN : '&=' ;
ASSIGN : '=' ;
AT : '@' ;
BIT_SHIFT_RIGHT : '>>>' ;
BIT_SHIFT_RIGHT_ASSIGN : '>>>=' ;
COLON : ':' ;
COMMA : ',' ;
DEC : '--' ;
DIV : '/' ;
DIV_ASSIGN : '/=' ;
DOT : '.' ;
DOTSTAR : '.*' ;
ELLIPSIS : '...' ;
EQUAL : '==' ;
GREATER_OR_EQUAL : '>=' ;
GREATER_THAN : '>' ;
INC : '++' ;
LBRACK : '[' ;
LCURLY : '{' ;
LESS_OR_EQUAL : '<=' ;
LESS_THAN : '<' ;
LOGICAL_AND : '&&' ;
LOGICAL_NOT : '!' ;
LOGICAL_OR : '||' ;
LPAREN : '(' ;
MINUS : '-' ;
MINUS_ASSIGN : '-=' ;
MOD : '%' ;
MOD_ASSIGN : '%=' ;
NOT : '~' ;
NOT_EQUAL : '!=' ;
OR : '|' ;
OR_ASSIGN : '|=' ;
PLUS : '+' ;
PLUS_ASSIGN : '+=' ;
QUESTION : '?' ;
RBRACK : ']' ;
RCURLY : '}' ;
RPAREN : ')' ;
SEMI : ';' ;
SHIFT_LEFT : '<<' ;
SHIFT_LEFT_ASSIGN : '<<=' ;
SHIFT_RIGHT : '>>' ;
SHIFT_RIGHT_ASSIGN : '>>=' ;
STAR : '*' ;
STAR_ASSIGN : '*=' ;
XOR : '^' ;
XOR_ASSIGN : '^=' ;
ABSTRACT : 'abstract' ;
ASSERT : 'assert' ;
BOOLEAN : 'boolean' ;
BREAK : 'break' ;
BYTE : 'byte' ;
CASE : 'case' ;
CATCH : 'catch' ;
CHAR : 'char' ;
CLASS : 'class' ;
CONTINUE : 'continue' ;
DEFAULT : 'default' ;
DO : 'do' ;
DOUBLE : 'double' ;
ELSE : 'else' ;
ENUM : 'enum' ;
EXTENDS : 'extends' ;
FALSE : 'false' ;
FINAL : 'final' ;
FINALLY : 'finally' ;
FLOAT : 'float' ;
FOR : 'for' ;
IF : 'if' ;
IMPLEMENTS : 'implements' ;
INSTANCEOF : 'instanceof' ;
INTERFACE : 'interface' ;
IMPORT : 'import' ;
INT : 'int' ;
LONG : 'long' ;
NATIVE : 'native' ;
NEW : 'new' ;
NULL : 'null' ;
PACKAGE : 'package' ;
PRIVATE : 'private' ;
PROTECTED : 'protected' ;
PUBLIC : 'public' ;
RETURN : 'return' ;
SHORT : 'short' ;
STATIC : 'static' ;
STRICTFP : 'strictfp' ;
SUPER : 'super' ;
SWITCH : 'switch' ;
SYNCHRONIZED : 'synchronized' ;
THIS : 'this' ;
THROW : 'throw' ;
THROWS : 'throws' ;
TRANSIENT : 'transient' ;
TRUE : 'true' ;
TRY : 'try' ;
VOID : 'void' ;
VOLATILE : 'volatile' ;
WHILE : 'while' ;

// $ANTLR src "Java.g" 1084
HEX_LITERAL : '0' ('x'|'X') HEX_DIGIT+ INTEGER_TYPE_SUFFIX? ;

// $ANTLR src "Java.g" 1086
DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) INTEGER_TYPE_SUFFIX? ;

// $ANTLR src "Java.g" 1088
OCTAL_LITERAL : '0' ('0'..'7')+ INTEGER_TYPE_SUFFIX? ;

// $ANTLR src "Java.g" 1090
fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

// $ANTLR src "Java.g" 1093
fragment
INTEGER_TYPE_SUFFIX : ('l'|'L') ;

// $ANTLR src "Java.g" 1096
FLOATING_POINT_LITERAL
    :   ('0'..'9')+ 
        (
            DOT ('0'..'9')* EXPONENT? FLOAT_TYPE_SUFFIX?
        |   EXPONENT FLOAT_TYPE_SUFFIX?
        |   FLOAT_TYPE_SUFFIX
        )
    |   DOT ('0'..'9')+ EXPONENT? FLOAT_TYPE_SUFFIX?
    ;

// $ANTLR src "Java.g" 1106
fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

// $ANTLR src "Java.g" 1109
fragment
FLOAT_TYPE_SUFFIX : ('f'|'F'|'d'|'D') ;

// $ANTLR src "Java.g" 1112
CHARACTER_LITERAL
    :   '\'' ( ESCAPE_SEQUENCE | ~('\''|'\\') ) '\''
    ;

// $ANTLR src "Java.g" 1116
STRING_LITERAL
    :  '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"'
    ;

// $ANTLR src "Java.g" 1120
fragment
ESCAPE_SEQUENCE
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESCAPE
    |   OCTAL_ESCAPE
    ;

// $ANTLR src "Java.g" 1127
fragment
OCTAL_ESCAPE
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

// $ANTLR src "Java.g" 1134
fragment
UNICODE_ESCAPE
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

// $ANTLR src "Java.g" 1139
IDENT
    :   JAVA_ID_START (JAVA_ID_PART)*
    ;

// $ANTLR src "Java.g" 1143
fragment
JAVA_ID_START
    :  '\u0024'
    |  '\u0041'..'\u005a'
    |  '\u005f'
    |  '\u0061'..'\u007a'
    |  '\u00c0'..'\u00d6'
    |  '\u00d8'..'\u00f6'
    |  '\u00f8'..'\u00ff'
    |  '\u0100'..'\u1fff'
    |  '\u3040'..'\u318f'
    |  '\u3300'..'\u337f'
    |  '\u3400'..'\u3d2d'
    |  '\u4e00'..'\u9fff'
    |  '\uf900'..'\ufaff'
    ;

// $ANTLR src "Java.g" 1160
fragment
JAVA_ID_PART
    :  JAVA_ID_START
    |  '\u0030'..'\u0039'
    ;

// $ANTLR src "Java.g" 1166
WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') 
    {   
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }
    ;

// $ANTLR src "Java.g" 1176
COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/'
    {   
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }
    ;

// $ANTLR src "Java.g" 1187
LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n'
    {   
        if (!preserveWhitespacesAndComments) {
            skip();
        } else {
            $channel = HIDDEN;
        }
    }
    ;
