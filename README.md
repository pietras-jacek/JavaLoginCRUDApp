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
The project is created with Maven, so you just need to import it to your IDE [Spring Tool Suite™](https://spring.io/tools/sts/all) and build the project to resolve the dependencies

## Database configuration 
Create a MySQL database with the name `accounts`and add the credentials to `/resources/application.properties`.  
The default ones are :

# ===============================
# = DATA SOURCE
# ===============================
spring.datasource.url = jdbc:mysql://localhost:3306/accounts
spring.datasource.username = root
spring.datasource.password = 1234
spring.datasource.testWhileIdle = true
spring.datasource.validationQuery = SELECT 1

# ===============================
# = JPA / HIBERNATE
# ===============================
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update
spring.jpa.hibernate.naming-strategy = org.hibernate.cfg.ImprovedNamingStrategy
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect

# ===============================
# = Thymeleaf configurations
# ===============================
spring.thymeleaf.mode=LEGACYHTML5
spring.thymeleaf.cache=false

# ==============================================================
# = Spring Security / Queries for AuthenticationManagerBuilder  
# ==============================================================
security.basic.enabled=false
spring.queries.users-query=select email, password, active from user where email=?
spring.queries.roles-query=select u.email, r.role from user u inner join user_role ur on(u.user_id=ur.user_id) inner join role r on(ur.role_id=r.role_id) where u.email=?

## Usage
First create DBSchema from file db_schema.sql

Run the project and head out to [http://localhost:8080](http://localhost:8080)
