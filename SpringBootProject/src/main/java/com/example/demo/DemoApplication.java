package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

// To run the project
// Post
// http://localhost:8080/api/students

// To get all registered student
// http://localhost:8080/api/students/id

// To delete student
// http://localhost:8080/api/students/id
