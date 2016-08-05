# hello-jboss-modules
Hello World with JBoss Modules

### Run

```sh
java -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app

java -jar jboss-modules-1.5.2.Final.jar -debuglog -mp mods org.jbugkorea.app

java -verbose:class -jar jboss-modules-1.5.2.Final.jar -mp mods org.jbugkorea.app

Hello!
```

```sh 
java -jar jboss-modules-1.5.2.Final.jar -deptree -mp mods org.jbugkorea.app

org.jbugkorea.app:main
└─ org.jbugkorea.hello:main
```

### Original Reference

* [http://arhipov.blogspot.kr/2016/05/hello-world-with-jboss-modules.html](http://arhipov.blogspot.kr/2016/05/hello-world-with-jboss-modules.html)