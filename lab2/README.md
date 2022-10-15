# Notes taken while completing this lab

## Java Servlet

__Java Servlet__ allows to create dynamic websites i.e the ones which have the capability to change the site contents according to the time.

They are Java programs that run on the Java-enabled web server or application server. They are used to handle the request obtained from the webserver, process the request, produce the response, then send a response back to the webserver. 

[Introduction to servlets - Geeks for Geeks] (https://www.geeksforgeeks.org/introduction-java-servlets/)


## Apache Tomcat

__Apache Tomcat__ is a web container. It allows the users to run Servlet and JAVA Server Pages that are based on the web-applications.

### Start Tomcat 

inside installation directory

`./bin/startup.sh` 

### Check if its running

access [this page](http://localhost:8080)

### Deploy to server

[Server Manager](http://localhost:8080/manager)
 -select war file and deploy
(it is necessary to undeploy before deploying it, if its already been deployed)

### Logs

inside installation directory

`vim logs/catalina.out`



## Embedded servers

controling de web container from within the app itself. (start, stop...)



## Spring Boot

Spring Boot eases the development of stand-alone and production-grade spring application. It allows to get started with minimum effort by assuming common configuration choices by default.

[Spring Initializer](https://start.spring.io/)


## Maven Wrapper

> The Maven Wrapper is an excellent choice for projects that need a specific version of Maven (or for users that don't want to install Maven at all). 
> Instead of installing many versions of it in the operating system, we can just use the project-specific wrapper script.

[Baeldung](https://www.baeldung.com/maven-wrapper)



# Review Questions

## A) What are the responsibilities/services of a "servlet container"?
Servlet Container manages the life cycle of servlet component, creates, manages and destroys objects and calls methods.



## B) Explain, in brief, the "dynamics" of Model-View-Controller approach used in Spring Boot to serve web content. (You may exemplify with the context of the previous exercises.)

__Model__ - corresponds to all the data-related logic that the user works with
__View__ - used for all the UI logic of the application
__Controller__ -  interface between Model and View components to process all the business logic and incoming requests


## C) Inspect the POM.xml for the previous Spring Boot projects. What is the role of the "starters" dependencies?

__Starters dependencies__ are aggreates of commonly used dependencies for a particular feature. They increase productivity by giving a standard configuration (with the necessary dependencies at the right versions) that developes dont have to worry about.


## D) Which annotations are transitively included in the @SpringBootApplication?

- @EnableAutoConfiguration
- @ComponentScan 
- @Configuration



## E) Search online for the topic "Best practices for REST API design". From what you could learn, select you "top 5" practices. and briefly explaain then in your own words.

- Use Json as the format for sending and receiving data
  Nowadays JSON (JavaScript Object Notation) has become standard format for sending and receiving API data.

- Use nouns instead of verbs in endpoints
  Verbs such as "get", "post", "put"... are already used for performing basic CRUD (Create, Read, Update, Delete)

- Name collections with plural nouns
  Naming wiht singular nouns would create unnecessary ambiguity since the data in APIs are a collection of different resources and not one singular

- Use satus codes in error handling
  Using regular http status codes will help users know what is going on (if the request was successful or failed...)

- Use nesting on endpoints to show relationships
  It is common for different endpoints to be interlinked an in those cases nesting should be used to make the connections clear. 
  However nesting more than 3 levels should be avoided as this can make the API less readable.