#!/usr/bin/env bash

#mvn clean install

cp helloB/target/helloB.jar mods/org/jbugkorea/helloB/main/
cp helloA/target/helloA.jar mods/org/jbugkorea/helloA/main/
cp app/target/app.jar mods/org/jbugkorea/app/main/

java -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app
#java -XX:+PrintFlagsFinal -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app
#java -verbose:class -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app
#java -jar jboss-modules-1.5.2.Final.jar -deptree -mp mods org.jbugkorea.app
#java -jar jboss-modules-1.5.2.Final.jar -debuglog -mp mods org.jbugkorea.app


#BYTEMAN_HOME=/Users/tedwon/runtime/byteman-3.0.6
#SCRIPT=${BYTEMAN_HOME}/sample/scripts/ClassLoadMonitor.btm
#${BYTEMAN_HOME}/bin/bmjava.sh -l $SCRIPT -verbose:class -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app