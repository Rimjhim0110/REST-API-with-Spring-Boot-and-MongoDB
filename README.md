# REST-API-with-Spring-Boot-and-MongoDB
This repository contains an Expenditure Manager application that integrates Spring Boot and MongoDB to create a robust RESTful API for managing expenditures. The application facilitates CRUD (Create, Read, Update, Delete) operations on expenditure records.


## Technology Stack

- Spring Boot
- Spring Data MongoDB
- MongoDB Compass

  
## Prerequisites

- Java 17
- Maven
- MongoDB Compass


## API Endpoints

- **Add Expenditure:** Create a new expenditure

  - **Method:** POST
  - **Endpoint:** /api/expenditure
  - **Request Body:** JSON data representing the new expenditure

- **Update Expenditure:** Update an existing expenditure

  - **Method:** PUT
  - **Endpoint:** /api/expenditure
  - **Request Body:** JSON data representing the updated expenditure

- **Get All Expenditures:** Retrieve a list of all expenditures

  - **Method:** GET
  - **Endpoint:** /api/expenditure

- **Get Expenditure by Name:** Retrieve an expenditure by its name

  - **Method:** GET
  - **Endpoint:** /api/expenditure/{name}

- **Delete Expenditure:** Delete an expenditure by its ID

  - **Method:** DELETE
  - **Endpoint:** /api/expenditure/{id}


Thank you for checking out my project!
