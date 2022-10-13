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

### Deploy to server

[server manager](http://localhost:8080/manager)
select war file and deploy
(it is necessary to undeploy before deploying it, if its already been deployed)

### Logs

inside installation directory

`vim logs/catalina.out`



