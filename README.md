# Demo Spring Boot Application

A simple Spring Boot demonstration project showcasing basic REST API functionality with Spring Boot 2.7.14.

## Overview

This is a minimal Spring Boot application that demonstrates:
- Spring Boot application setup and configuration
- RESTful web services using Spring Web
- Spring Boot Actuator for application monitoring
- Basic testing with JUnit

## Prerequisites

- Java 17 or higher
- Maven 3.6+ or use the provided Maven Wrapper

## Project Structure

```
demo-springboot/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   └── DemoApplication.java      # Main application class and REST controller
│   │   └── resources/
│   │       └── application.properties     # Application configuration
│   └── test/
│       └── java/com/example/demo/
│           └── DemoApplicationTests.java  # Basic integration tests
├── pom.xml                                 # Maven project configuration
└── README.md                              # This file
```

## Getting Started

### Building the Application

Using Maven:
```bash
mvn clean install
```

Or using the Maven Wrapper:
```bash
./mvnw clean install
```

### Running the Application

Using Maven:
```bash
mvn spring-boot:run
```

Or using the Maven Wrapper:
```bash
./mvnw spring-boot:run
```

Or run the JAR directly:
```bash
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

The application will start on port 8080 by default.

### Testing the Application

Run all tests:
```bash
mvn test
```

## API Endpoints

### Hello World Endpoint

**GET** `/hi`

Returns a simple greeting message.

**Example:**
```bash
curl http://localhost:8080/hi
```

**Response:**
```
Hello World
```

### Actuator Endpoints

Spring Boot Actuator provides several monitoring and management endpoints:

**GET** `/actuator`

Returns available actuator endpoints.

**Example:**
```bash
curl http://localhost:8080/actuator
```

## Configuration

Application configuration can be customized in `src/main/resources/application.properties`.

Currently, the application uses default Spring Boot configurations.

## Technologies Used

- **Spring Boot 2.7.14**: Main framework
- **Spring Web**: For building REST APIs
- **Spring Boot Actuator**: For application monitoring and management
- **Spring Boot Test**: For testing support
- **JUnit 5**: Testing framework
- **Maven**: Build and dependency management

## Development

### Adding New Features

1. Create new REST controllers in `src/main/java/com/example/demo/`
2. Add configuration properties in `application.properties` if needed
3. Write corresponding tests in `src/test/java/com/example/demo/`

### Code Style

Follow standard Java conventions and Spring Boot best practices.

## License

This is a demonstration project. Please refer to your organization's licensing requirements.

## Contributing

This is a demo project. For production projects, please follow your organization's contribution guidelines.
