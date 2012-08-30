import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
/*
  Copyright (c) 2010 Abram Hindle
  All rights reserved.

  Redistribution and use in source and binary forms, with or without
  modification, are permitted provided that the following conditions
  are met:

  Redistributions of source code must retain the above copyright
  notice, this list of conditions and the following disclaimer.

  Redistributions in binary form must reproduce the above copyright
  notice, this list of conditions and the following disclaimer in the
  documentation and/or other materials provided with the distribution.

  Neither the name of the author nor the names of its contributors may
  be used to endorse or promote products derived from this software
  without specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
  "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
  LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
  FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
  COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
  LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
  LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
  ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
  POSSIBILITY OF SUCH DAMAGE.

 */

interface LangLexer {
    public int COMMENT(); 
    public int LINE_COMMENT();
    public void setStream( CharStream in );
    public Token nextToken();
}
class JavaLangLexer implements LangLexer {
    JavaLexer lexer;
    // call me first
    public int COMMENT() { return JavaLexer.COMMENT; }
    public int LINE_COMMENT() { return JavaLexer.LINE_COMMENT; }
        
    public void setStream( CharStream in ) {
        lexer = new JavaLexer(in);
        lexer.preserveWhitespacesAndComments = true;
    }
    public Token nextToken() {
        return lexer.nextToken();
    }
}
class CLangLexer implements LangLexer {
    CLexer lexer;
    // call me first
    public int COMMENT() { return CLexer.COMMENT; }
    public int LINE_COMMENT() { return CLexer.LINE_COMMENT; }

    public void setStream( CharStream in ) {
        lexer = new CLexer(in);
        lexer.preserveWhitespacesAndComments = true;
    }
    public Token nextToken() {
        return lexer.nextToken();
    }
}
class PythonLangLexer implements LangLexer {
    PythonLexer lexer;
    // call me first
    public int COMMENT() { return PythonLexer.COMMENT; }
    public int LINE_COMMENT() { return PythonLexer.COMMENT; }

    public void setStream( CharStream in ) {
        lexer = new PythonLexer(in);
        lexer.preserveWhitespacesAndComments = true;
    }
    public Token nextToken() {
        return lexer.nextToken();
    }

}
class FortranLangLexer implements LangLexer {
    FortranLexer lexer;
    // call me first
    public int COMMENT() { return FortranLexer.LINE_COMMENT; }
    public int LINE_COMMENT() { return FortranLexer.LINE_COMMENT; }

    public void setStream( CharStream in ) {
        lexer = new FortranLexer(in);
        lexer.preserveWhitespacesAndComments = true;
    }
    public Token nextToken() {
        return lexer.nextToken();
    }

}


/*
class RubyLangLexer implements LangLexer {
    RubyLexer lexer;
    // call me first
    public int COMMENT() { return RubyLexer.COMMENT; }
    public int LINE_COMMENT() { return RubyLexer.LINE_COMMENT; }

    public void setStream( CharStream in ) {
        lexer = new RubyLexer(in);
        lexer.preserveWhitespacesAndComments = true;
    }
    public Token nextToken() {
        return lexer.nextToken();
    }

}
*/



public class LexJava {

    public String lexJava( String[] args ) throws  java.io.IOException {
        CharStream input = new ANTLRFileStream(args[args.length - 1]);
        return lexJava( args, input );
    }
    public String lexJava( String[] args, String in ) throws  java.io.IOException{
        CharStream input = new ANTLRStringStream( in );
        return lexJava( args, input );        
    }
    public String lexJava( String[] args, CharStream input ) throws  java.io.IOException {
        boolean withComments = true;
        boolean withCode = true;
	boolean withCharIndices = false;
        StringBuilder output = new StringBuilder();
        LangLexer language = new JavaLangLexer();
        for (int i = 0; i < args.length; i++) {
            if ( args[i].equals("-code") ) {
                withCode = false;
            } else if ( args[i].equals("-comments") ) {
                withComments = false;
            } else if ( args[i].equals("+code") ) {
                withCode = true;
            } else if ( args[i].equals("+comments") ) {
                withComments = true;
            } else if (args[i].toLowerCase().equals("+java")) {
                language = new JavaLangLexer();
            } else if (args[i].toLowerCase().equals("+c")) {
                language = new CLangLexer();
            } else if (args[i].toLowerCase().equals("+python")) {
                language = new PythonLangLexer();
            } else if (args[i].toLowerCase().equals("+fortran")) {
                language = new FortranLangLexer();
            } else if (args[i].toLowerCase().equals("+chars")) {
                withCharIndices = true;
            }
        }
        LangLexer lexer = language;
        lexer.setStream(input);
        Token token;
        int COMMENT = lexer.COMMENT();
        int LINE_COMMENT = lexer.LINE_COMMENT();
        while ((token = lexer.nextToken())!=Token.EOF_TOKEN)  {
            int type = token.getType();
            if ( type == COMMENT || type == LINE_COMMENT ) {
                if ( withComments ) {
                    output.append( token.getText() );
                    if ( withCharIndices ) output.append(" " +  Integer.toString( input.index() ) );
                    output.append("\n");
                }
            } else {
                if ( withCode ) {
                    output.append( token.getText() );
                    if ( withCharIndices ) output.append(" " + Integer.toString( input.index() ) );
                    output.append("\n");
                }
            }
        }
        return output.toString();
        
    }

    public static void main(String[] args) 
    {
	try
	{            
            LexJava lj = new LexJava();
            System.out.print( lj.lexJava( args ) );
	}
        catch(Throwable t) 
        {
	   System.out.println("Exception: "+t);
           t.printStackTrace();
        }
    }
}
