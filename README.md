# Spring JDBC Learning Project

This project is created as part of learning **Spring JDBC** – a module of the Spring Framework that simplifies the use of JDBC (Java Database Connectivity) for database operations in Java applications.

## 📚 Topics Covered

- Introduction to JDBC and Spring JDBC
- Setting up a Spring project with JDBC support
- Connecting to a relational database (MySQL/PostgreSQL/H2)
- CRUD operations using `JdbcTemplate`
- Using `DataSource` and connection pooling
- Mapping ResultSet to Java objects (RowMapper)
- Handling exceptions with Spring JDBC

## 🛠️ Technologies Used

- Java 8+
- Spring Framework (Core, JDBC)
- Maven (or Gradle)
- MySQL (or any other RDBMS)
- Eclipse IDE (or IntelliJ IDEA)

## 🗂️ Project Structure

src/
└── main/
├── java/
│ └── com.example.jdbc/
│ ├── config/
│ ├── dao/
│ ├── model/
│ └── main/
└── resources/
└── applicationContext.xml


## ⚙️ Setup Instructions

1. Clone this repository:
   ```bash
   git clone https://github.com/Anjali22-07/JDBC.git
   cd JDBC
2. Configure your database in applicationContext.xml or jdbc.properties.

3. Add necessary JDBC driver dependency in pom.xml.

4. Build and run the project using Eclipse or your preferred IDE.

##   ✅ Sample Features Implemented

--Add a new user to the database

--Retrieve all users

--Update user details

--Delete a user

## 📌 Key Classes
JdbcConfig.java – Java-based configuration (if not using XML)

jdbcCon.xml--for xml configuration

jdbc.dao – DAO layer for interacting with the database

User – Model class

App.java – Entry point to run the app

## 📝 Notes

--Spring JDBC handles resource management and error handling better than plain JDBC.

--It encourages writing cleaner and more modular code.

##  📖 References
-- Spring JDBC Official Docs

-- Spring JDBC by code with durgesh

## ✍️ Author

Anjali
Learning Spring JDBC as part of backend development journey 🚀
Happy Learning!

