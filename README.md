# README

Middleware application to serve as a microservice for a TODO list

# Prerequisites
- VS Code application
- Extension Pack for Java
- OpenJDK 64-bit

TODO:  OpenJDK requires login to download for VS Code (use option a prerequisites for a better experience)

# Prerequisites (option a)
- IntelliJ IDEA 2022.3.2 (Community Edition)
- OpenJDK-19 dependencies

# Optional Tools
Postman

TODO: Use Google Chrome Developer Tools

## Install

Install VS Code
Install Extension Pack for Java

(option a)
Install IntelliJ IDEA 2022.3.2 (Community Edition)
Download OpenJDK-19 dependency 

TODO:  VS Code requires OpenJDK PATH to be set (use option a instead)

## Use

Visit Spring Initializer to create a Spring Boot Package: https://start.spring.io
As of 2/6/23:
Project: Maven
Language: Java
Spring Boot: 2.7.8 (can use 3.0.2 but Validator will be using Jakarta instead of Javax for Entity ORM)
Packaging: Jar
Java: 11 (19 can be selected)

Add the following Dependencies:
Spring Data JPA for Persist data in SQL
Spring Web for MVC framework and RESTful API
H2 Database JDBC API
Validation for empty entry validation

### Browser

TODO:  Add compatible browsers

## Examples

Use Postman to test (set format to JSON):

Create:     POST: http://localhohst:8080/todolist
    Body:  { "title":"sample task" }

Retrieve:   GET:  http://localhost:8080/todolist

Update:     PUT:  http://localhost:8080/todolist
    Body: {"id":1, "title":"modified sample task", "done":true}

Delete:     DEL:  http://localhost:8080/todolist/1

View Swagger UI:  http://localhost:8080/swagger-ui/

TODO: Instructions on launching jar file

