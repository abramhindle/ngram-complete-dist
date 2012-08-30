lexer grammar Python;
@members {
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

}

T70 : 'def' ;
T71 : 'print' ;
T72 : 'del' ;
T73 : 'pass' ;
T74 : 'break' ;
T75 : 'continue' ;
T76 : 'return' ;
T77 : 'raise' ;
T78 : 'import' ;
T79 : 'from' ;
T80 : 'as' ;
T81 : 'global' ;
T82 : 'exec' ;
T83 : 'in' ;
T84 : 'assert' ;
T85 : 'if' ;
T86 : 'else' ;
T87 : 'elif' ;
T88 : 'while' ;
T89 : 'for' ;
T90 : 'try' ;
T91 : 'finally' ;
T92 : 'with' ;
T93 : 'except' ;
T94 : 'is' ;
T95 : 'lambda' ;
T96 : 'class' ;
T97 : 'yield' ;

// $ANTLR src "Python.g" 453
LPAREN    : '(' {implicitLineJoiningLevel++;} ;

// $ANTLR src "Python.g" 455
RPAREN    : ')' {implicitLineJoiningLevel--;} ;

// $ANTLR src "Python.g" 457
LBRACK    : '[' {implicitLineJoiningLevel++;} ;

// $ANTLR src "Python.g" 459
RBRACK    : ']' {implicitLineJoiningLevel--;} ;

// $ANTLR src "Python.g" 461
COLON     : ':' ;

// $ANTLR src "Python.g" 463
COMMA    : ',' ;

// $ANTLR src "Python.g" 465
SEMI    : ';' ;

// $ANTLR src "Python.g" 467
PLUS    : '+' ;

// $ANTLR src "Python.g" 469
MINUS    : '-' ;

// $ANTLR src "Python.g" 471
STAR    : '*' ;

// $ANTLR src "Python.g" 473
SLASH    : '/' ;

// $ANTLR src "Python.g" 475
VBAR    : '|' ;

// $ANTLR src "Python.g" 477
AMPER    : '&' ;

// $ANTLR src "Python.g" 479
LESS    : '<' ;

// $ANTLR src "Python.g" 481
GREATER    : '>' ;

// $ANTLR src "Python.g" 483
ASSIGN    : '=' ;

// $ANTLR src "Python.g" 485
PERCENT    : '%' ;

// $ANTLR src "Python.g" 487
BACKQUOTE    : '`' ;

// $ANTLR src "Python.g" 489
LCURLY    : '{' {implicitLineJoiningLevel++;} ;

// $ANTLR src "Python.g" 491
RCURLY    : '}' {implicitLineJoiningLevel--;} ;

// $ANTLR src "Python.g" 493
CIRCUMFLEX    : '^' ;

// $ANTLR src "Python.g" 495
TILDE    : '~' ;

// $ANTLR src "Python.g" 497
EQUAL    : '==' ;

// $ANTLR src "Python.g" 499
NOTEQUAL    : '!=' ;

// $ANTLR src "Python.g" 501
ALT_NOTEQUAL: '<>' ;

// $ANTLR src "Python.g" 503
LESSEQUAL    : '<=' ;

// $ANTLR src "Python.g" 505
LEFTSHIFT    : '<<' ;

// $ANTLR src "Python.g" 507
GREATEREQUAL    : '>=' ;

// $ANTLR src "Python.g" 509
RIGHTSHIFT    : '>>' ;

// $ANTLR src "Python.g" 511
PLUSEQUAL    : '+=' ;

// $ANTLR src "Python.g" 513
MINUSEQUAL    : '-=' ;

// $ANTLR src "Python.g" 515
DOUBLESTAR    : '**' ;

// $ANTLR src "Python.g" 517
STAREQUAL    : '*=' ;

// $ANTLR src "Python.g" 519
DOUBLESLASH    : '//' ;

// $ANTLR src "Python.g" 521
SLASHEQUAL    : '/=' ;

// $ANTLR src "Python.g" 523
VBAREQUAL    : '|=' ;

// $ANTLR src "Python.g" 525
PERCENTEQUAL    : '%=' ;

// $ANTLR src "Python.g" 527
AMPEREQUAL    : '&=' ;

// $ANTLR src "Python.g" 529
CIRCUMFLEXEQUAL    : '^=' ;

// $ANTLR src "Python.g" 531
LEFTSHIFTEQUAL    : '<<=' ;

// $ANTLR src "Python.g" 533
RIGHTSHIFTEQUAL    : '>>=' ;

// $ANTLR src "Python.g" 535
DOUBLESTAREQUAL    : '**=' ;

// $ANTLR src "Python.g" 537
DOUBLESLASHEQUAL    : '//=' ;

// $ANTLR src "Python.g" 539
DOT : '.' ;

// $ANTLR src "Python.g" 541
AT : '@' ;

// $ANTLR src "Python.g" 543
AND : 'and' ;

// $ANTLR src "Python.g" 545
OR : 'or' ;

// $ANTLR src "Python.g" 547
NOT : 'not' ;

// $ANTLR src "Python.g" 549
FLOAT
    :   '.' DIGITS (Exponent)?
    |   DIGITS '.' Exponent
    |   DIGITS ('.' (DIGITS (Exponent)?)? | Exponent)
    ;

// $ANTLR src "Python.g" 555
LONGINT
    :   INT ('l'|'L')
    ;

// $ANTLR src "Python.g" 559
fragment
Exponent
    :    ('e' | 'E') ( '+' | '-' )? DIGITS
    ;

// $ANTLR src "Python.g" 564
INT :   // Hex
        '0' ('x' | 'X') ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
    |   // Octal
        '0' DIGITS*
    |   '1'..'9' DIGITS*
    ;

// $ANTLR src "Python.g" 571
COMPLEX
    :   INT ('j'|'J')
    |   FLOAT ('j'|'J')
    ;

// $ANTLR src "Python.g" 576
fragment
DIGITS : ( '0' .. '9' )+ ;

// $ANTLR src "Python.g" 579
NAME:    ( 'a' .. 'z' | 'A' .. 'Z' | '_')
        ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
    ;

// $ANTLR src "Python.g" 583
/** Match various string types.  Note that greedy=false implies '''
 *  should make us exit loop not continue.
 */
STRING
    :   ('r'|'u'|'ur')?
        (   '\'\'\'' (options {greedy=false;}:TRIAPOS)* '\'\'\''
        |   '"""' (options {greedy=false;}:TRIQUOTE)* '"""'
        |   '"' (ESC|~('\\'|'\n'|'"'))* '"'
        |   '\'' (ESC|~('\\'|'\n'|'\''))* '\''
        )
    ;

// $ANTLR src "Python.g" 595
/** the two '"'? cause a warning -- is there a way to avoid that? */
fragment
TRIQUOTE
    : '"'? '"'? (ESC|~('\\'|'"'))+
    ;

// $ANTLR src "Python.g" 601
/** the two '\''? cause a warning -- is there a way to avoid that? */
fragment
TRIAPOS
    : '\''? '\''? (ESC|~('\\'|'\''))+
    ;

// $ANTLR src "Python.g" 607
fragment
ESC
    :    '\\' .
    ;

// $ANTLR src "Python.g" 612
/** Consume a newline and any whitespace at start of next line
 *  unless the next line contains only white space, in that case
 *  emit a newline.
 */
CONTINUED_LINE
    :    '\\' ('\r')? '\n' (' '|'\t')*  { $channel=HIDDEN; }
         ( nl=NEWLINE {emit(new ClassicToken(NEWLINE,nl.getText()));}
         |
         )
    ;

// $ANTLR src "Python.g" 623
/** Treat a sequence of blank lines as a single blank line.  If
 *  nested within a (..), {..}, or [..], then ignore newlines.
 *  If the first newline starts in column one, they are to be ignored.
 *
 *  Frank Wierzbicki added: Also ignore FORMFEEDS (\u000C).
 */
NEWLINE
    :   (('\u000C')?('\r')? '\n' )+
        {if ( startPos==0 || implicitLineJoiningLevel>0 )
            $channel=HIDDEN;
        }
    ;

// $ANTLR src "Python.g" 636
WS  :    {startPos>0}?=> (' '|'\t'|'\u000C')+ {$channel=HIDDEN;}
    ;
    
// $ANTLR src "Python.g" 639
/** Grab everything before a real symbol.  Then if newline, kill it
 *  as this is a blank line.  If whitespace followed by comment, kill it
 *  as it's a comment on a line by itself.
 *
 *  Ignore leading whitespace when nested in [..], (..), {..}.
 */
LEADING_WS
@init {
    int spaces = 0;
}
    :   {startPos==0}?=>
        (   {implicitLineJoiningLevel>0}? ( ' ' | '\t' )+ {$channel=HIDDEN;}
           |    (     ' '  { spaces++; }
            |    '\t' { spaces += 8; spaces -= (spaces \% 8); }
               )+
            {
            // make a string of n spaces where n is column number - 1
            char[] indentation = new char[spaces];
            for (int i=0; i<spaces; i++) {
                indentation[i] = ' ';
            }
            String s = new String(indentation);
            emit(new ClassicToken(LEADING_WS,new String(indentation)));
            }
            // kill trailing newline if present and then ignore
            ( ('\r')? '\n' {if (token!=null) token.setChannel(HIDDEN); else $channel=HIDDEN;})*
           // {token.setChannel(99); }
        )
    ;

// $ANTLR src "Python.g" 669
/** Comments not on line by themselves are turned into newlines.

    b = a # end of line comment

    or

    a = [1, # weird
         2]

    This rule is invoked directly by nextToken when the comment is in
    first column or when comment is on end of nonwhitespace line.

    Only match \n here if we didn't start on left edge; let NEWLINE return that.
    Kill if newlines if we live on a line by ourselves
    
    Consume any leading whitespace if it starts on left edge.
 */
COMMENT
    :    ( {startPos==0}?=> (' '|'\t')* '#' (~'\n')* '\n'+
    |    {startPos>0}?=> '#' (~'\n')* ) // let NEWLINE handle \n unless char pos==0 for '#'
        {
            if (!preserveWhitespacesAndComments) {
                skip();
            } else {
                $channel = HIDDEN;
            }
        }

    ;

