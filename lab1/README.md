# Some Maven Commands

## Compiling
mvn clean package

## Runnig
mvn exec:java -Dexec.mainClass="package.class"

## Passing Arguments
mvn exec:java -Dexec.mainClass=package.class -Dexec.args="arg1 arg2 arg3"
