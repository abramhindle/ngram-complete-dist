CLASSPATH=/usr/share/java/antlr3.jar:.:/usr/local/share/java/zmq.jar

default: LexJava.class

clean:
	rm *class JavaLexer.java Java.tokens || echo Already Done

JavaLexer.java: Java.g
	antlr3 Java.g
CLexer.java: C.g
	antlr3 C.g
PythonLexer.java: Python.g
	antlr3 Python.g
FortranLexerLexer.java: FortranLexer.g
	antlr3 FortranLexer.g

LexJava.class: JavaLexer.class Halstead.class HalsteadCounter.class CLexer.class PythonLexer.class FortranLexerLexer.class

LexJavaMQ.class: LexJava.class LexJavaMQ.java

.SUFFIXES: .java .class

.java.class:
	javac -cp $(CLASSPATH) $<

run: LexJavaMQ.class
	java -Xmx1000m -server -Djava.library.path=/usr/local/lib -classpath $(CLASSPATH) LexJavaMQ

