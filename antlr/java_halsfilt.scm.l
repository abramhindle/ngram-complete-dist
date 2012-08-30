;;; /* this lex routine breaks up C programs into operators and operands	*/
;;; /* operands go to stdout, operators go to stderr			*/
;;; /* distinction is based on my reading of various articles and K&R	*/
;;; /* this routine expects comments and strings to be stripped before	*/
;;; \9 is a tab
%%
//.*$ (inc-comment yytext);ignore comment
/\*([ \t\n]|\*+[^/]|[^*/]|[^*]/)*\*/ (inc-comment yytext);1 line comment


('.'|'\\.'|'\\[0-9]+'|false|true|null|super|this) (inc-operand yytext) ;{
;<<ERROR>> (error )

;			/* character constants go to operand output */
;			printf(" %s ", yytext);
;			}

(\-\>|\+\+|--|\<\<|\>\>|\<\=|\>\=|\=\=|\!\=|\&\&|\|\||[+*/%\-]\=) (inc-operator yytext)	;{
;;			/* print 2 character symbols to operator output */
;;			fprintf(stderr,"%s\n", yytext);
;;			putchar(' ');
;;		 	}
;;
[\.\(\)\[\]\!\~\&\+\/\%\<\>\&\^\|\?\=\,\-] (inc-operator yytext) ;{
;;			/* print most 1 char symbols to operator output */
;;			fprintf(stderr,"%s\n", yytext);
;;			putchar(' ');
;;			}
;;
;;\*/[^ \9\n0-9]		(inc-operator yytext);{
;;			/* print indirection operator to operator output */
;;			fprintf(stderr,"*indirection\n");
;;			putchar(' ');
;;			}
;;
\*			(inc-operator yytext);{
;;			/* multiplication operator */
;;			fprintf(stderr,"%s\n", yytext);
;;			putchar(' ');
;;			}
;;
[\:\;\{\}]		(inc-del yytext);{
;;			/* delete delimiters */
;;			/* NOTE - prints to stdout, unlike above */
;;			putchar(' ');
;;			}
;;
instanceof([ \9\(]|$)	(inc-operator yytext);{
;;			/* sizeof operator to operator output */
;;			fprintf(stderr, "sizeof\n" );
;;			putchar(' ');
;;			}
;;
^(import|package)[ \9\n]+[^ \9\n]+ (inc-operator yytext);
;;#[ \9]*[^ \9\n]+ (inc-operator yytext);
;;#[a-z]+[ \9\n]	(inc-operator yytext);{
;;			/* preprocessor operators to operator output */
;;			fprintf(stderr, "%s\n", yytext);
;;			putchar(' ');
;;			}
;;
;(if|else|while|do|for|switch|case|default|break|continue|return|goto|case)/[:\; \9\(\n]* (inc-operator yytext);{
(new|if|else|while|do|for|switch|case|default|break|continue|return|case|try|throw|catch|finally)[:\; \9\(\n]? (inc-operator yytext);{
;;			/* statements */
;;			fprintf(stderr, "%s\n", yytext);
;;			putchar(' ');2
;;			}
;;
(threadsafe|final|synchronized|abstract|static|native|extends|implements|private|protected|public)[ \9\(\n]? (inc-operator yytext);{
;;			/* storage class specifiers */
;;			fprintf(stderr, "%s\n", yytext);
;;			putchar(' ');
;;			}
;;
(void|byte|char|short|boolean|int|long|float|double)[ \9\(\)\n]? (inc-operator yytext);{
;;			/* type specifier */
;;			fprintf(stderr, "%s\n", yytext);
;;			putchar(' ');
;;			}
;;
(class|interface)[ \9\(\n]?		(inc-operator yytext);{
;;			/* struct or union specifier */
;;			fprintf(stderr, "%s\n", yytext);
;;			putchar(' ');
;;			}
;;
[a-zA-Z_][a-zA-Z0-9_]*	(inc-operand yytext);{
;;			/* catch operand names */
;;			printf(" %s ", yytext);
;;			}
;;
;;.			ECHO;
;.*                      (print "WHAT?: [" yytext "]")

$^  ; ignore blank lines
[ \9\n]* ; ignore whitespace?
\\[ \9\n]* ;
[0-9]+\.?[0-9]*([eE][-+]?[0-9]*)?[ufld]? (inc-operand yytext) ;numbers
\.?[0-9]+([eE][-+]?[0-9]*)?[ufld]? (inc-operand yytext) ;numbers
;[^ \9\n]+                       (inc-operand yytext)
\"([^\"]|\\\")*\" (inc-operand yytext) ;strings
<<EOF>> (list 'eof)
. (inc-error yytext) ;(error yytext)
