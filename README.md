# loginCRUDApp

Spring Boot login/register form with CRUD

## What's inside 
This project is based on the [Spring Boot](http://projects.spring.io/spring-boot/) project and uses these packages :
- Maven
- Spring Boot
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](www.thymeleaf.org)

## Installation 
The project is created with Maven, so you just need to import it to IDE [Spring Tool Suite™](https://spring.io/tools/sts/all) and build the project to resolve the dependencies

## Database configuration 
Create a MySQL database with the name `accounts`and add the credentials to `/resources/application.properties`.  
The default ones are :

# ====
## DATA SOURCE
# ====
- spring.datasource.url = jdbc:mysql://localhost:3306/accounts
- spring.datasource.username = root
- spring.datasource.password = 
- spring.datasource.testWhileIdle = true
- spring.datasource.validationQuery = SELECT 1

# Usage
Create DBSchema from file db_schema.sql

Run the project and head out to [http://localhost:8080](http://localhost:8080)
