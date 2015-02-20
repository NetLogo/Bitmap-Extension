ifeq ($(origin JAVA_HOME), undefined)
  JAVA_HOME=/usr
endif

ifneq (,$(findstring CYGWIN,$(shell uname -s)))
  JAVA_HOME := `cygpath -up "$(JAVA_HOME)"`
endif

JAVAC=$(JAVA_HOME)/bin/javac
SRCS=$(wildcard src/*.java)

bitmap.jar: $(SRCS) manifest.txt NetLogoHeadless.jar Makefile
	mkdir -p classes
	$(JAVAC) -g -deprecation -Xlint:all -Xlint:-serial -Xlint:-path -encoding us-ascii -source 1.7 -target 1.7 -classpath NetLogoHeadless.jar -d classes $(SRCS)
	jar cmf manifest.txt bitmap.jar -C classes .

NetLogoHeadless.jar:
	curl -f -s -S 'http://ccl.northwestern.edu/devel/6.0-M1/NetLogoHeadless.jar' -o NetLogoHeadless.jar

bitmap.zip: bitmap.jar
	rm -rf bitmap
	mkdir bitmap
	cp -rp bitmap.jar README.md Makefile src manifest.txt bitmap
	zip -rv bitmap.zip bitmap
	rm -rf bitmap
