# RestaurantAPI

<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.6-brightgreen.svg" />
</a>
</center>
This is a backend API built using the Spring framework that handles various HTTP requests for an Ecommerce domain. The API allows users to create accounts, add products, create orders and manage addresses

---
<br>

## Framework Used
* Spring Boot

---
<br>

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok

<br>

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
<br>

## Language Used
* Java

---
<br>

## Data Model

The  data model is defined in the Model class, which has the following attributes:
<br>

* Food Model
```
Id:Long
name:string
price:string
```

* Restaurant Model
```
id:integer 
name:string
address:string
```

## Data Flow


---

<br>


## API End Points 

The following endpoints are available in the API:

```
/foods/ (POST)
/restaurants/{id}/foods (GET)
/food/{id}(PUT)
```
<br>

## DataBase Used
* SQL database
```
We have used Persistent database to implement CRUD Operations.
```
---
<br>

## Project Summary

The restaurant Management System using Spring Boot is a web-based application designed to streamline the management of restaurant data for an organisation. This application provides an easy-to-use interface for restaurant managers to manage restaurant information such as food item details  information, and more. The application also allows restaurants to view their own information and make updates to their personal details.

The restaurant Management System using Spring Boot is a restaurant-friendly and efficient application that streamlines the management of restaurant data. This application provides an easy-to-use interface for HR personnel to manage restaurant information, and also allows restaurants to view and update their own personal details. With its advanced features such as reporting and restaurant management, this application is a valuable tool for any organisation looking to manage their restaurant data effectively.
