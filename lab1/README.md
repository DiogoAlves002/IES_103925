# Notes taken while completing this lab

## Some Maven Commands

### Create a new project
```mvn archetype:generate -DgroupId=Package -DartifactId=App-Name -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false```

### Compile
```mvn clean package```
### Install (necessary in order to use as a dependecy in another project)
```mvn install```
### Run
```mvn exec:java -Dexec.mainClass="package.class"```

### Run passing Arguments
```mvn exec:java -Dexec.mainClass=package.class -Dexec.args="arg1 arg2 arg3"```
