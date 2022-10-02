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


# Review Questions

## A)

## B)
Of course. Maven facilitates not only the standardizing of the project's organization but the implementation of other projects features by declaring them as dependencies. Running the project using maven makes it easier and simpler to work with those dependencies.

## C)
- ```git clone URL``` (to get the project for the first time)
- ```git pull``` (update local files)
- write new features
- ```git add file_name | * ``` (add changed files to the staging area)
- ```git commit [-m "message"]``` (makes a permanent snapshot of the current state of the repository) (without the flag -m vim will be openned to write the message anyway)
- ```git push``` (update cloud repository with changes) 
- ```git status```(optional step to get info on the repository state) (can and should be used between the other commands)

## D)
- Write a short message that with a concise description of the changes made (don't write just "fixed bugs")
- Use the imperative mood
- Start with a small title telling what was changed
- Optionaly add a body, focusing on why the changes were needed
  - separate it from the title with a blank line
  - separate paragraphs with blank lines aswell
