# employee-adapter
# Employee Adapter Service (Application 2)

This is a Spring Boot application that exposes a REST API to retrieve employee information from an H2 in-memory database.  
It is designed to be called by a client application (Application 1) using a REST GET request.

---

## Features

- Exposes `GET /employee/{id}` endpoint.
- Returns an `Employee` object in JSON format.
- Uses H2 in-memory database.
- Pre-populates data using `import.sql` on application startup.

---

## Technologies

- Java 21
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven


## Running the Application

### Prerequisites

- Java 17+
- Maven
