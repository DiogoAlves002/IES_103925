# Notes taken while completing this lab


## Spring boot

easier way to run an application
`./mvnw spring-boot:run`


## Jakarta Persistence API *JPA*

Persistence means any mechanism by which Java objects outlive the application process that created them.
The JPA specification allows to define which objects should be persisted, and how they are persisted.
By itself, JPA is not a tool or framework; rather, it defines a set of concepts that guide implementers.


## Object-Relational Mapping *ORM*

ORM is a middleware application or tool that sits between the web application and database. 
Its a technique for converting data between Java objects and relational databases (table). 
In simple words, we can say that itimplements responsibility of mapping the object to relational model and vice-versa.




# Review Questions


## A) Explain the differences between the RestController and Controller components used in different parts of this lab.

RestController is a specialized version of the controller. It includes the @Controller and @ResponseBody annotations, and as a result, simplifies the controller implementation. Every request handling method of the controller class automatically serializes return objects into HttpResponse.



## B) Create a visualization of the Spring Boot layers (UML diagramor similar), displaying the key abstractions in the solutionof 3.3, in particular: entities, repositories, servicesand REST controllers.Describe the role of the elements modeled in the diagram.


## C) Explain the annotations @Table, @Colum, @Id found in the Employee entity.

__@Table__ specifies the primary table where the annotated entity will be saved. 

__@Colum__  is used to specify the mapped column for a persistent property or field.

__@Id__ defines a certain field as the object's primary key.

 
## D) Explain the use of the annotation @AutoWired (in the Rest Controller class).

It allows Spring to resolve and inject collaborating beans into our bean. The annotation can be used directly on properties, therefore eliminating the need for getters and setters.


