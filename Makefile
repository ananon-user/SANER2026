# Z3 PATH
Z3_PATH := "/opt/homebrew/bin"
# EXPERIMENTS TIMEOUT (IN MINUTES)
TIMEOUT := 360
# NUMBER OF PARALLEL PROCESSES FOR POSE/JBSE
PROCESSES := 2
# -XMX AND XMS VALUE FOR EACH POSE/JBSE PROCESS (IN GB)
XMX := 44
# -XSS VALUE FOR EACH POSE/JBSE PROCESS (IN GB)
XSS := 8

REPLICABILITY_PACKAGE_FOLDER := $(shell pwd)

all:
	mvn install:install-file \
	  -Dfile=${REPLICABILITY_PACKAGE_FOLDER}/jars/jbse2-runtime-2.0.1-SNAPSHOT.jar \
	  -DgroupId=jbse2 \
	  -DartifactId=jbse2-runtime \
	  -Dversion=2.0.1 \
	  -Dpackaging=jar
	cat ${REPLICABILITY_PACKAGE_FOLDER}/projects/methodsToAnalyze.in | sed "s|TOBEREPLACED|${REPLICABILITY_PACKAGE_FOLDER}|g" > ${REPLICABILITY_PACKAGE_FOLDER}/projects/methodsToAnalyze.json
	java -jar ${REPLICABILITY_PACKAGE_FOLDER}/jars/benchmark-executor.jar ${REPLICABILITY_PACKAGE_FOLDER} "POSE" ${Z3_PATH} ${TIMEOUT} ${XMX} ${XSS} ${PROCESSES}
	java -jar ${REPLICABILITY_PACKAGE_FOLDER}/jars/benchmark-executor.jar ${REPLICABILITY_PACKAGE_FOLDER} "JBSE" ${Z3_PATH} ${TIMEOUT} ${XMX} ${XSS} ${PROCESSES}
	Rscript obtainStats.R

build-projects:
	cd projects/bcel-6.0-src && mvn compile
	cd projects/commons-imaging && mvn compile
	cd projects/commons-jxpath-1.3-src && mvn compile
	cd projects/freehep/math/freehep-jminuit && mvn compile
	cd projects/gson && mvn compile
	cd projects/la4j-0.6.0 && mvn compile
	cd projects/okhttp/okhttp && mvn compile
	cd projects/re2j && mvn compile

clean:
	rm -f projects/methodsToAnalyze.json
	rm -f POSE_SymbolicRunStats.csv
	rm -f JBSE_SymbolicRunStats.csv
	rm -f results.csv

clean-projects:
	cd projects/bcel-6.0-src && mvn clean
	cd projects/commons-imaging && mvn clean
	cd projects/commons-jxpath-1.3-src && mvn clean
	cd projects/freehep/math/freehep-jminuit && mvn clean
	cd projects/gson && mvn clean
	cd projects/la4j-0.6.0 && mvn clean
	cd projects/okhttp/okhttp && mvn clean
	cd projects/re2j && mvn clean
