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

import java.util.*;
import java.math.*;

public class Halstead {
    class HalsteadResults {
        int length = 0;
        int vocab = 0;
        double volume = 0;
        double difficulty = 0;
        double idifficulty = 0;
        double effort = 0;
        double mentalDisc = 0;
        HalsteadResults(){}
        HalsteadResults(int length, int vocab, double volume, double difficulty, double idifficulty, double effort, double mentalDisc) {
            this.length       = length      ;
            this.vocab        = vocab       ;
            this.volume       = volume      ;
            this.difficulty   = difficulty  ;
            this.idifficulty  = idifficulty ;
            this.effort       = effort      ;
            this.mentalDisc   = mentalDisc  ;
        }
        public Map<String,Number> toMap() {
            Map<String,Number> map = new TreeMap<String,Number>();
            map.put( "length",      new Integer( length ) );
            map.put( "vocab",       new Integer( vocab ));
            map.put( "volume",      new Double( volume ));
            map.put( "difficulty",  new Double( difficulty ));
            map.put( "idifficulty", new Double( idifficulty ));
            map.put( "effort",      new Double( effort ));
            map.put( "mentalDisc",  new Double( mentalDisc ));
            return map;
        }
    }

    int sum( Collection<Integer> c ) {
        int result = 0;
        for (int i : c)
            result += i;
        return result;
    }

    public HalsteadResults calculateMetrics( Map<String,Integer> operatorMap,  Map<String,Integer> operandMap ) {
        int totalOperands        = sum( operatorMap.values() );
        int totalOperators       = sum(  operandMap.values() );
        int totalUniqueOperators = operatorMap.keySet().size();
        int totalUniqueOperands  =  operandMap.keySet().size();

        // Please note that this style is derived from how one classicly
        // calculates halstead so excuse the short names, it wasn't my idea

        int n1 = totalUniqueOperators;
        int n2 = totalUniqueOperands;
        int tN1 = totalOperators;
        int tN2 = totalOperands;
        
        int programLength = tN1 + tN2;
        int programVocab  = n1 + n2;
        int N = programLength; //pg_length
        int n = programVocab;
        double volume =  N * (Math.log(n) / Math.log(2)); // pg_volume
        double V = volume;
        double N2divn2 = (0 == n2)? 0 : (tN2 / n2);
        double difficulty = (n1 / 2) * N2divn2 ; // pg_level
        double D = difficulty;
        double Di = (0 == D) ? 0 : ( 1.0 / D);
        double effort = D * V;
        // ugh double 0 comparison
        double mentalDisc = (0.0 == Di) ? 0 : (V / Di) ; //estimated effective mental discriminations: E^ = V / L
        double E = effort;

        return new HalsteadResults( programLength, n, V, D, Di, E, mentalDisc);
    }


    /* here's some code written in a real language
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
