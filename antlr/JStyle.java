import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;


public class JStyle 
{
    public static void main(String[] args) 
    {



	int idents=0;
	int keywords=0;
	int numbers=0;
	int comments=0;
	int periods=0;
	int commas=0;
	int spaces=0;
	int parens=0;
	int arithops=0;
	int compops=0;
	int assigns=0;
	int branches=0;
	int loops=0;
	
        int lines=0;

        HalsteadCounter hc = new HalsteadCounter();

	try
	{
	  CharStream input = new ANTLRFileStream(args[0]);
	  JavaLexer lexer = new JavaLexer(input);
	  Token token;

	  while ((token = lexer.nextToken())!=Token.EOF_TOKEN) 
	  {
	    lines = token.getLine();

            hc.countToken( token );

	    switch(token.getType())
	    {
		// identifiers
			case JavaLexer.IDENT:
				  idents++;
				  break;

		// keywords
			case JavaLexer.PACKAGE:
			case JavaLexer.CASE:
			case JavaLexer.CHAR:
			case JavaLexer.NEW:
			case JavaLexer.TYPE:
			case JavaLexer.FINAL:
			case JavaLexer.IMPORT:
			case JavaLexer.VOID:
			case JavaLexer.RETURN:
			case JavaLexer.IMPLEMENTS:
			case JavaLexer.CONTINUE:
			case JavaLexer.TRANSIENT:
			case JavaLexer.THIS:
			case JavaLexer.DOUBLE:
			case JavaLexer.SUPER:
			case JavaLexer.PRIVATE:
			case JavaLexer.STATIC:
			case JavaLexer.SWITCH:
			case JavaLexer.NULL:
			case JavaLexer.BREAK:
			case JavaLexer.ELSE:
			case JavaLexer.STRICTFP:
			case JavaLexer.NATIVE:
			case JavaLexer.THROWS:
			case JavaLexer.INT:
			case JavaLexer.ASSERT:
			case JavaLexer.TRY:
			case JavaLexer.INTERFACE:
			case JavaLexer.LONG:
			case JavaLexer.PUBLIC:
			case JavaLexer.EXTENDS:
			case JavaLexer.FOR_EACH:
			case JavaLexer.BYTE:
			case JavaLexer.VOLATILE:
			case JavaLexer.SHORT:
			case JavaLexer.INSTANCEOF:
			case JavaLexer.TRUE:
			case JavaLexer.ENUM:
			case JavaLexer.FINALLY:
			case JavaLexer.DEFAULT:
			case JavaLexer.CATCH:
			case JavaLexer.FALSE:
			case JavaLexer.THROW:
			case JavaLexer.PROTECTED:
			case JavaLexer.CLASS:
			case JavaLexer.FLOAT:
			case JavaLexer.ABSTRACT:
			case JavaLexer.BOOLEAN:
			case JavaLexer.SYNCHRONIZED:
				keywords++;
				break;


		// numbers 
			case JavaLexer.FLOATING_POINT_LITERAL:
			case JavaLexer.DECIMAL_LITERAL:
			case JavaLexer.OCTAL_LITERAL:
			case JavaLexer.HEX_LITERAL:
				numbers++;
				break;

		// comments
			case JavaLexer.COMMENT:
			case JavaLexer.LINE_COMMENT:
				comments++;
				break;
  
		// periods
			case JavaLexer.DOT:
			case JavaLexer.ELLIPSIS:
				periods++;
				break;

		// commas
			case JavaLexer.COMMA:
				commas++;
				break;
		// spaces
			case JavaLexer.WS:
				spaces++;
				break;
  
		// parenthesis
			case JavaLexer.LPAREN:
			case JavaLexer.RPAREN:
			case JavaLexer.LBRACK:
			case JavaLexer.RBRACK:
			case JavaLexer.LCURLY:
			case JavaLexer.RCURLY:
				parens++;
				break;

		// arithmetic operators
			case JavaLexer.PLUS:
			case JavaLexer.MINUS:
			case JavaLexer.EXPONENT:
			case JavaLexer.STAR:
			case JavaLexer.DIV:
			case JavaLexer.MOD:

			case JavaLexer.UNARY_PLUS:
			case JavaLexer.UNARY_MINUS:

			case JavaLexer.INC:
			case JavaLexer.PRE_INC:
			case JavaLexer.POST_INC:

			case JavaLexer.DEC:
			case JavaLexer.PRE_DEC:
			case JavaLexer.POST_DEC:

			case JavaLexer.AND:
			case JavaLexer.OR:
			case JavaLexer.NOT:
			case JavaLexer.LOGICAL_AND:
			case JavaLexer.LOGICAL_OR:
			case JavaLexer.LOGICAL_NOT:
			case JavaLexer.XOR:

			case JavaLexer.SHIFT_LEFT:
			case JavaLexer.SHIFT_RIGHT:

			case JavaLexer.BIT_SHIFT_RIGHT:
			    arithops++;
			    break;

		// comparison operators
			case JavaLexer.EQUAL:
			case JavaLexer.NOT_EQUAL:
			case JavaLexer.LESS_THAN:
			case JavaLexer.GREATER_THAN:
			case JavaLexer.LESS_OR_EQUAL:
			case JavaLexer.GREATER_OR_EQUAL:
			     compops++;
			     break;
			    

		// assignments
			case JavaLexer.ASSIGN:
			case JavaLexer.PLUS_ASSIGN:
			case JavaLexer.MINUS_ASSIGN:
			case JavaLexer.STAR_ASSIGN:
			case JavaLexer.DIV_ASSIGN:
			case JavaLexer.MOD_ASSIGN:

			case JavaLexer.BIT_SHIFT_RIGHT_ASSIGN:
			case JavaLexer.SHIFT_LEFT_ASSIGN:
			case JavaLexer.SHIFT_RIGHT_ASSIGN:
			case JavaLexer.OR_ASSIGN:
			case JavaLexer.AND_ASSIGN:
			case JavaLexer.XOR_ASSIGN:
			    assigns++;
			    break;

		// branches
			case JavaLexer.IF:
			    branches++;
			    keywords++;
			    break;

		// loops
			case JavaLexer.WHILE:
			case JavaLexer.DO:
			case JavaLexer.FOR:
			    loops++;
			    keywords++;
			    break;

		// blank lines

		// max occurences character/ident


		// will be counted
			case JavaLexer.CAST_EXPR:
			case JavaLexer.QUESTION:
			case JavaLexer.AT:
			case JavaLexer.DOTSTAR:
			case JavaLexer.SEMI:
			case JavaLexer.COLON:

			    break;
    
		// uncounted 
		/*
			case JavaLexer.GENERIC_TYPE_PARAM_LIST
			case JavaLexer.CLASS_INSTANCE_INITIALIZER
			case JavaLexer.ARRAY_ELEMENT_ACCESS
			case JavaLexer.FOR_CONDITION
			case JavaLexer.VAR_DECLARATION
			case JavaLexer.ANNOTATION_METHOD_DECL
			case JavaLexer.EOF
			case JavaLexer.FOR_UPDATE
			case JavaLexer.STRING_LITERAL
			case JavaLexer.VOID_METHOD_DECL
			case JavaLexer.ENUM_TOP_LEVEL_SCOPE			
			case JavaLexer.ANNOTATION_INIT_KEY_LIST
			case JavaLexer.JAVA_ID_START
			case JavaLexer.FLOAT_TYPE_SUFFIX
			case JavaLexer.IMPLEMENTS_CLAUSE
			case JavaLexer.SWITCH_BLOCK_LABEL_LIST
			case JavaLexer.BLOCK_SCOPE
			case JavaLexer.ANNOTATION_INIT_DEFAULT_KEY
			case JavaLexer.VAR_DECLARATOR
			case JavaLexer.CHARACTER_LITERAL
			case JavaLexer.ANNOTATION_LIST
			case JavaLexer.OCTAL_ESCAPE
			case JavaLexer.FORMAL_PARAM_VARARG_DECL
			case JavaLexer.METHOD_CALL
			case JavaLexer.ARRAY_INITIALIZER
			case JavaLexer.CATCH_CLAUSE_LIST
			case JavaLexer.SUPER_CONSTRUCTOR_CALL
			case JavaLexer.ANNOTATION_INIT_ARRAY_ELEMENT
			case JavaLexer.FUNCTION_METHOD_DECL
			case JavaLexer.CLASS_CONSTRUCTOR_CALL
			case JavaLexer.INTERFACE_TOP_LEVEL_SCOPE
			case JavaLexer.ANNOTATION_TOP_LEVEL_SCOPE
			case JavaLexer.JAVA_ID_PART
			case JavaLexer.PARENTESIZED_EXPR
			case JavaLexer.HEX_DIGIT
			case JavaLexer.VAR_DECLARATOR_LIST
			case JavaLexer.ARRAY_DECLARATOR_LIST
			case JavaLexer.CLASS_STATIC_INITIALIZER
			case JavaLexer.EXTENDS_CLAUSE
			case JavaLexer.ARRAY_DECLARATOR
			case JavaLexer.FORMAL_PARAM_STD_DECL
			case JavaLexer.LOCAL_MODIFIER_LIST
			case JavaLexer.EXTENDS_BOUND_LIST
			case JavaLexer.JAVA_SOURCE
			case JavaLexer.INTEGER_TYPE_SUFFIX
			case JavaLexer.FOR_INIT
			case JavaLexer.THROWS_CLAUSE
			case JavaLexer.THIS_CONSTRUCTOR_CALL
			case JavaLexer.ANNOTATION_SCOPE
			case JavaLexer.MODIFIER_LIST
			case JavaLexer.STATIC_ARRAY_CREATOR
			case JavaLexer.CONSTRUCTOR_DECL
			case JavaLexer.ESCAPE_SEQUENCE
			case JavaLexer.LABELED_STATEMENT
			case JavaLexer.UNICODE_ESCAPE
			case JavaLexer.EXPR
			case JavaLexer.CLASS_TOP_LEVEL_SCOPE
			case JavaLexer.ARGUMENT_LIST
			case JavaLexer.QUALIFIED_TYPE_IDENT
			case JavaLexer.ANNOTATION_INIT_BLOCK
			case JavaLexer.FORMAL_PARAM_LIST
			case JavaLexer.GENERIC_TYPE_ARG_LIST
		 */

		default:
		  //System.out.println("Token: "+ token.getLine() + ":" + token.getText() );
		    ;
	    }
	  }
	}
        catch(Throwable t) 
        {
	   System.out.println("Exception: "+t);
	  t.printStackTrace();
        }

        Halstead.HalsteadResults hr = hc.calculateHalstead();

        System.out.printf("%2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\t %2.2f\n",
				idents/(float)lines,
				keywords/(float)lines,
				numbers/(float)lines,
				comments/(float)lines,
				periods/(float)lines,
				commas/(float)lines,
				spaces/(float)lines,
				parens/(float)lines,
				arithops/(float)lines,
				compops/(float)lines,
				assigns/(float)lines,
				branches/(float)lines,
                                loops/(float)lines,
                                ((float)hr.length),
                                ((float)hr.vocab),
                                ((float)hr.volume),
                                ((float)hr.difficulty),
                                ((float)hr.idifficulty),
                                ((float)hr.effort),
                                ((float)hr.mentalDisc)
                                ); 
    } 

}
