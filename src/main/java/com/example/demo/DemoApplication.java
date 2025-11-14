package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Spring Boot application class for the demo project.
 * 
 * This application demonstrates a basic Spring Boot REST API setup
 * with a simple "Hello World" endpoint.
 */
@SpringBootApplication
public class DemoApplication {

    /**
     * Application entry point.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

/**
 * REST controller providing basic HTTP endpoints.
 * 
 * This controller demonstrates a simple GET endpoint that returns
 * a greeting message.
 */
@RestController
class HelloWorldController {
    
    /**
     * Returns a simple greeting message.
     * 
     * @return a "Hello World" greeting string
     */
    @GetMapping("/hi")
    public String sayHi() {
        return "Hello World";
    }
}