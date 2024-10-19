

# E-Commerce Application

## Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)

## Features
- User registration and authentication
- Product catalog management
- Shopping cart functionality
- Order management
- Payment integration
- RESTful API endpoints for client applications

## Technologies Used
- **Backend:** Spring Boot
- **Database:** MySQL
- **Build Tool:** Maven
## Getting Started

### Prerequisites
Make sure you have the following installed on your local machine:
- **Java JDK** (version 17 or later)
- **MySQL** (version 8 or later)
- **Maven** (version 3.9 or later)

### Installation

1. **Clone the Repository**
   Open your terminal and run:
   ```bash
   git clone https://github.com/rajpatil777/ecommerce-backend

2. Create a MySQL Database
   ```bash
     CREATE DATABASE ecommerce;

4. Configure Application Properties Open src/main/resources/application.properties and update the database connection details:
 
    spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
    spring.datasource.username=<your-username>
    spring.datasource.password=<your-password>
    spring.jpa.hibernate.ddl-auto=update


5. Build the Project Run the following command to install the dependencies and build the project:
   ```bash
    mvn clean install

6. Run the Application Start the application using the following command:
   ```bash
   mvn spring-boot:run


7. Access the Application Once the application is running, you can access it at:
    ```bash
    http://localhost:8080


