Requires:
* graalvm-jdk-23

Build native image:
```
export JAVA_HOME=/opt/graalvm-jdk-23.0.2+7.1/
mvn clean verify -Pnative
```

Execute:
```
./target/ni-test <pid>
```
