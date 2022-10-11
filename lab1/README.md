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




## Some Docker Commands

### Build and tag an image from the Dockerfile in the directory
```docker build -t myimage:1.0```

### List all locally saved images with Docker Engine 
```docker image ls``` 

### List all running Docker containers
```docker ps```

### Delete a local image
```docker image rm myimage:1.0```

### Run container "myimage", version 1.0, giving it the name "web" and making the host port 5000, and the container port 80
```docker container run --name web -p 5000:80 myimage:1.0```

### Stop container
```docker container stop web```

### List all containers (the flag --all includes stopped containers)
```docker container ls [--all]```



# Review Questions

## A) Maven has three lifecycles: clean, site and default. Explain the main phases in the default lifecycle.
- __Compile__ -> compiles the project's code
- __Test__ -> tests the compiled code with a unit testing framework
- __Package__ -> packages the compiled code (p.e. in a JAR).
- __Install__ -> installs the package (to be used as a dependency)
- __Deploy__ -> copies package to the remote repository (to be used by other developers).

## B) Maven is a build tool; is it appropriate to run your project too?
Of course.
By standardizing the project's organization, Maven allows it to always be run the same way, independently of what operating system or code editor... the developer uses.
Besides, Maven facilitates the implementation of other project's features into ours as well (dependencies). 
Running the project using Maven makes it easier and simpler to work with those dependencies.

## C) What wouldbe a likely sequence of Git commands required to contribute with a new feature to a given project? (i.e., get a fresh copy, develop some increment, post back the added functionality)
- ```git clone URL``` (to get the project for the first time)
- ```git pull``` (update local files)
- write new features
- ```git add file_name | * ``` (add changed files to the staging area)
- ```git commit [-m "message"]``` (makes a permanent snapshot of the current state of the repository) (without the flag -m vim will be openned to write the message anyway)
- ```git push``` (update cloud repository with changes) 
- ```git status```(optional step to get info on the repository state) (can and should be used between the other commands)

## D) There are strong opinions on how to write Git commitmessages... Find some best practices online and give your own informed recommendationson how to write good commit messages(in a teamproject).
- Write a short message that with a concise description of the changes made (don't write just "fixed bugs")
- Use the imperative mood
- Start with a small title telling what was changed
- Optionaly add a body, focusing on why the changes were needed
  - separate it from the title with a blank line
  - separate paragraphs with blank lines aswell

## E) Docker automatically prepares the required volume space as you start a container. Why is it important that you take an extra step configuring the volumes for a (production) database?

Volumes allow you to keep data stored after the container stops and share it between containers.
Configuring the volumes by hand makes it easier to back up the data and to protect it from problems such as deleting the container.
