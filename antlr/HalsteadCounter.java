/*

Stolen from:

;;;    Java/C/C++/Perl/PHP/Python indentation and mccabe/halstead complexity metric suite
;;;    Copyright (C) 2009 Abram Hindle <abram.hindle@softwareprocess.us>
;;;
;;;    This program is free software; you can redistribute it and/or modify
;;;    it under the terms of the GNU General Public License as published by
;;;    the Free Software Foundation; either version 2 of the License, or
;;;    (at your option) any later version.
;;;
;;;    This program is distributed in the hope that it will be useful,
;;;    but WITHOUT ANY WARRANTY; without even the implied warranty of
;;;    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;;    GNU General Public License for more details.
;;;
;;;    You should have received a copy of the GNU General Public License
;;;    along with this program; if not, write to the Free Software
;;;    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.*;

// Assumptions: token.getText() is a reasonable value!

public class HalsteadCounter {
    int operators = 0;
    int operands = 0;
    Map<String,Integer> operatorMap;
    Map<String,Integer> operandMap;
    // http://www.scribd.com/doc/99533/Halsteads-Operators-and-Operands-in-C-C-JAVA-by-Indranil-Nandy
    // operands - identifiers, typenames, constants
    // operators - storage - auto, extern, register, static,
    //           - type qual - const friend volatile
    //           - reserved words
    //           - operators

    public HalsteadCounter() {
        operatorMap = new HashMap<String,Integer>();
        operandMap = new HashMap<String,Integer>();
        operators = 0;
        operands = 0;
    }

    void increment( Map<String,Integer> m, String s ) {
        int count = ( m.containsKey( s ) ) ? m.get(s) : 0;
        m.put( s, count + 1 );
    }

    public void addOperator( Token token ) {
        operators++;
        increment( operatorMap, token.getText() );
    }

    public void addOperand( Token token ) {
        operands++;
        increment( operandMap, token.getText() );
    }

    // counts a token as operator or operand
    public void countToken( Token token ) {
        switch(token.getType()) {
            // operands
            // identifiers
        case JavaLexer.IDENT:
            // type? Not sure!
        case JavaLexer.QUALIFIED_TYPE_IDENT:
            // literals/constants
        case JavaLexer.FLOATING_POINT_LITERAL:
        case JavaLexer.DECIMAL_LITERAL:
        case JavaLexer.OCTAL_LITERAL:
        case JavaLexer.HEX_LITERAL:
        case JavaLexer.STRING_LITERAL:
        case JavaLexer.CHARACTER_LITERAL:
        case JavaLexer.NULL:
        case JavaLexer.TRUE:
            // more names of operands
        case JavaLexer.SUPER:
        case JavaLexer.THIS:
        case JavaLexer.FALSE:
            addOperand( token );
            break;
                
                
            //operators
            // keywords
        case JavaLexer.PACKAGE:
        case JavaLexer.CASE:
        case JavaLexer.CHAR:
        case JavaLexer.NEW:
        case JavaLexer.FINAL:
        case JavaLexer.IMPORT:
        case JavaLexer.VOID:
        case JavaLexer.RETURN:
        case JavaLexer.IMPLEMENTS:
        case JavaLexer.CONTINUE:
        case JavaLexer.TRANSIENT:
        case JavaLexer.DOUBLE:
        case JavaLexer.PRIVATE:
        case JavaLexer.STATIC:
        case JavaLexer.SWITCH:
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
        case JavaLexer.ENUM:
        case JavaLexer.FINALLY:
        case JavaLexer.DEFAULT:
        case JavaLexer.CATCH:
        case JavaLexer.THROW:
        case JavaLexer.PROTECTED:
        case JavaLexer.CLASS:
        case JavaLexer.FLOAT:
        case JavaLexer.ABSTRACT:
        case JavaLexer.BOOLEAN:
        case JavaLexer.SYNCHRONIZED:
            // periods
        case JavaLexer.DOT:
        case JavaLexer.ELLIPSIS:
        case JavaLexer.COMMA:
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
            // comparison operators
        case JavaLexer.EQUAL:
        case JavaLexer.NOT_EQUAL:
        case JavaLexer.LESS_THAN:
        case JavaLexer.GREATER_THAN:
        case JavaLexer.LESS_OR_EQUAL:
        case JavaLexer.GREATER_OR_EQUAL:
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
            // branches
        case JavaLexer.IF:
            // loops
        case JavaLexer.WHILE:
        case JavaLexer.DO:
        case JavaLexer.FOR:
            // will be counted
        case JavaLexer.CAST_EXPR:
        case JavaLexer.QUESTION:
        case JavaLexer.AT:
        case JavaLexer.DOTSTAR:
        case JavaLexer.SEMI:
        case JavaLexer.COLON:
            addOperator( token );
            break;
                
            // the uncounted
            // comments
        case JavaLexer.COMMENT:
        case JavaLexer.LINE_COMMENT:
        case JavaLexer.WS:
            // parenthesis
        case JavaLexer.LPAREN:
        case JavaLexer.RPAREN:
        case JavaLexer.LBRACK:
        case JavaLexer.RBRACK:
        case JavaLexer.LCURLY:
        case JavaLexer.RCURLY:
                            
            // uncounted 
            /* // This junk is intermediate crap not in the code itself
               case JavaLexer.GENERIC_TYPE_PARAM_LIST
               case JavaLexer.CLASS_INSTANCE_INITIALIZER
               case JavaLexer.ARRAY_ELEMENT_ACCESS
               case JavaLexer.FOR_CONDITION
               case JavaLexer.VAR_DECLARATION
               case JavaLexer.ANNOTATION_METHOD_DECL
               case JavaLexer.EOF
               case JavaLexer.FOR_UPDATE
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
               case JavaLexer.ANNOTATION_INIT_BLOCK
               case JavaLexer.FORMAL_PARAM_LIST
               case JavaLexer.GENERIC_TYPE_ARG_LIST
               case JavaLexer.TYPE:

            */

        default:
            // do nothing!
        }
    }

    public Halstead.HalsteadResults calculateHalstead() {
        Halstead halstead = new Halstead();
        return halstead.calculateMetrics( operatorMap, operandMap );
    }
    
    /*
   (define (halstead l)
  (let* ((operand-eq? (gen-car-eqv 'operand))
         (operator-eq? (gen-car-eqv 'operator))
         (operands (filter-map (lambda (x) (if (operand-eq? x) (cdr x) #f)) l))
         (operators (filter-map (lambda (x) (if (operator-eq? x) (cdr x) #f)) l))
         (errors (count (gen-car-eqv 'error) l))
         (total-operands (length operands))
         (total-operators (length operators))
         (unique-operators (uniq operators string=?)) ;(delete-duplicates operators string=?))
         (unique-operands  (uniq operands string=?)) ;(delete-duplicates operands string=?))
         (total-unique-operators (length unique-operators))
         (total-unique-operands (length unique-operands))
         (n1 total-unique-operators)
         (n2 total-unique-operands)
         (tN1 total-operators)
         (tN2 total-operands)
         (program-length (+ tN1 tN2))
         (program-vocab  (+ n1 n2))
         (N program-length) ;pg_length
         (n program-vocab)
         (volume (* N (/ (log n) (log 2)))) ; pg_volume
         (V volume)
         (N2divn2 (if (= 0 n2) 0 (/ tN2 n2)))
         (difficulty (* (/ n1 2)  N2divn2 )) ; pg_level
         (D difficulty)
         (Di (if (= 0 D) 0 (/ 1 D)))
         (effort (* D V))
         (mental-disc (if (= 0 Di) 0 (/ V Di))) ; estimated effective mental discriminations: E^ = V / L
         (E effort))
    (zip   '(length          vocab volume difficulty idifficulty effort mental-disc halstead-errors)
           (list program-length n     V       D         Di          E   mental-disc errors))))

    */
}
