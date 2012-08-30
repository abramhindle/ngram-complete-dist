LUCENE=$(HOME)/projects/data/lucene-3.0.3.txt
XERCES=$(HOME)/projects/data/xerces-2_11_0.txt
DATADIR=$(HOME)/projects/data/
LEXJAVA=$(HOME)/projects/ngram-complete-dist/antlr/LexJava
ANT=$(DATADIR)/ant-git.txt
BATIK=$(DATADIR)/batik-git.txt
CASSANDRA=$(DATADIR)/cassandra-git.txt
LOG4J=$(DATADIR)/log4j-git.txt
LUCENEG=$(DATADIR)/lucene-git.txt
MAVEN2=$(DATADIR)/maven-2-git.txt
MAVEN3=$(DATADIR)/maven-3-git.txt
XERCES2=$(DATADIR)/xerces2-j-git.txt
XALANJ=$(DATADIR)/xalan-j-git.txt
COMMENTSANDCODE=$(LEXJAVA) +comments +code 
COMMENTS=$(LEXJAVA) +comments -code
CODE=$(LEXJAVA) -comments +code
CODEJOIN=../bin/codejoin.sh
ECLIPSEE4=$(HOME)/projects/data/eclipse-e4.txt
all: lucene-3.0.3.all.lexed.txt lucene-3.0.3.comments.lexed.txt lucene-3.0.3.code.lexed.txt xerces-2_11_0.all.lexed.txt xerces-2_11_0.comments.lexed.txt xerces-2_11_0.code.lexed.txt code.txt code-and-comments.txt comments.txt \
lucene-3.0.3.all.lexed.txt lucene-3.0.3.comments.lexed.txt lucene-3.0.3.code.lexed.txt xerces-2_11_0.all.lexed.txt xerces-2_11_0.comments.lexed.txt xerces-2_11_0.code.lexed.txt eclipse-e4.all.lexed.txt eclipse-e4.comments.lexed.txt eclipse-e4.code.lexed.txt ant.all.lexed.txt ant.comments.lexed.txt ant.code.lexed.txt batik.all.lexed.txt batik.comments.lexed.txt batik.code.lexed.txt cassandra.all.lexed.txt cassandra.comments.lexed.txt cassandra.code.lexed.txt log4j.all.lexed.txt log4j.comments.lexed.txt log4j.code.lexed.txt luceneg.all.lexed.txt luceneg.comments.lexed.txt luceneg.code.lexed.txt maven2.all.lexed.txt maven2.comments.lexed.txt maven2.code.lexed.txt maven3.all.lexed.txt maven3.comments.lexed.txt maven3.code.lexed.txt xerces2.all.lexed.txt xerces2.comments.lexed.txt xerces2.code.lexed.txt code.txt comments.txt code-and-comments.txt



lucene-3.0.3.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(LUCENE) | $(CODEJOIN) > $@

lucene-3.0.3.comments.lexed.txt:
	$(COMMENTS) $(LUCENE) > $@

lucene-3.0.3.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(LUCENE) | $(CODEJOIN) > $@

xerces-2_11_0.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(XERCES) | $(CODEJOIN) > $@

xerces-2_11_0.comments.lexed.txt:
	$(COMMENTS) $(XERCES) > $@

xerces-2_11_0.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(XERCES) | $(CODEJOIN) > $@

eclipse-e4.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(ECLIPSEE4) | $(CODEJOIN) > $@
eclipse-e4.comments.lexed.txt:
	$(COMMENTS) $(ECLIPSEE4) > $@
eclipse-e4.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(ECLIPSEE4) | $(CODEJOIN) > $@

ant.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(ANT) | $(CODEJOIN) > $@
ant.comments.lexed.txt:
	$(COMMENTS) $(ANT) > $@
ant.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(ANT) | $(CODEJOIN) > $@

batik.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(BATIK) | $(CODEJOIN) > $@
batik.comments.lexed.txt:
	$(COMMENTS) $(BATIK) > $@
batik.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(BATIK) | $(CODEJOIN) > $@



cassandra.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(CASSANDRA) | $(CODEJOIN) > $@
cassandra.comments.lexed.txt:
	$(COMMENTS) $(CASSANDRA) > $@
cassandra.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(CASSANDRA) | $(CODEJOIN) > $@



log4j.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(LOG4J) | $(CODEJOIN) > $@
log4j.comments.lexed.txt:
	$(COMMENTS) $(LOG4J) > $@
log4j.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(LOG4J) | $(CODEJOIN) > $@


luceneg.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(LUCENEG) | $(CODEJOIN) > $@
luceneg.comments.lexed.txt:
	$(COMMENTS) $(LUCENEG) > $@
luceneg.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(LUCENEG) | $(CODEJOIN) > $@


maven2.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(MAVEN2) | $(CODEJOIN) > $@
maven2.comments.lexed.txt:
	$(COMMENTS) $(MAVEN2) > $@
maven2.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(MAVEN2) | $(CODEJOIN) > $@


maven3.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(MAVEN3) | $(CODEJOIN) > $@
maven3.comments.lexed.txt:
	$(COMMENTS) $(MAVEN3) > $@
maven3.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(MAVEN3) | $(CODEJOIN) > $@


xalan-j.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(XALANJ) | $(CODEJOIN) > $@
xalan-j.comments.lexed.txt:
	$(COMMENTS) $(XALANJ) > $@
xalan-j.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(XALANJ) | $(CODEJOIN) > $@


xerces2.all.lexed.txt: $(CODEJOIN)
	$(COMMENTSANDCODE) $(XERCES2) | $(CODEJOIN) > $@
xerces2.comments.lexed.txt:
	$(COMMENTS) $(XERCES2) > $@
xerces2.code.lexed.txt: $(CODEJOIN)
	$(CODE) $(XERCES2) | $(CODEJOIN) > $@





CODETXT=lucene-3.0.3.code.lexed.txt \
xerces-2_11_0.code.lexed.txt \
eclipse-e4.code.lexed.txt \
ant.code.lexed.txt \
batik.code.lexed.txt \
cassandra.code.lexed.txt \
log4j.code.lexed.txt \
luceneg.code.lexed.txt \
maven2.code.lexed.txt \
maven3.code.lexed.txt \
xerces2.code.lexed.txt

COMMENTSTXT=lucene-3.0.3.comments.lexed.txt \
xerces-2_11_0.comments.lexed.txt \
eclipse-e4.comments.lexed.txt \
ant.comments.lexed.txt \
batik.comments.lexed.txt \
cassandra.comments.lexed.txt \
log4j.comments.lexed.txt \
luceneg.comments.lexed.txt \
maven2.comments.lexed.txt \
maven3.comments.lexed.txt \
xerces2.comments.lexed.txt

CODECOMMENTSTXT=lucene-3.0.3.all.lexed.txt \
xerces-2_11_0.all.lexed.txt \
eclipse-e4.all.lexed.txt \
ant.all.lexed.txt \
batik.all.lexed.txt \
cassandra.all.lexed.txt \
log4j.all.lexed.txt \
luceneg.all.lexed.txt \
maven2.all.lexed.txt \
maven3.all.lexed.txt \
xerces2.all.lexed.txt

code.txt: $(CODETXT)
	cat $(CODETXT) > $@

comments.txt: $(COMMENTSTXT)
	cat $(COMMENTSTXT) > $@

code-and-comments.txt: $(CODECOMMENTSTXT)
	cat $(CODECOMMENTSTXT) > $@

5projs.all.lexed.txt:
	cat ant.all.lexed.txt  log4j.all.lexed.txt   maven3.all.lexed.txt  xalan-j.all.lexed.txt  xerces2.all.lexed.txt > 5projs.all.lexed.txt

5projs.comments.lexed.txt:
	cat ant.comments.lexed.txt  log4j.comments.lexed.txt   maven3.comments.lexed.txt  xalan-j.comments.lexed.txt  xerces2.comments.lexed.txt > 5projs.comments.lexed.txt

5projs.code.lexed.txt:
	cat ant.code.lexed.txt  log4j.code.lexed.txt   maven3.code.lexed.txt  xalan-j.code.lexed.txt  xerces2.code.lexed.txt > 5projs.code.lexed.txt

