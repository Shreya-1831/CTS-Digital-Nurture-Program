package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {

        LOGGER.info("Received request for Hello World endpoint.");

        String message = """                
                     Hello World from Spring Boot!
                       
                Welcome to the RESTful Web Service.
                Your application is running successfully.
                
                Have a great day!
                """;

        LOGGER.info("Response sent successfully.");

        return message;
    }
}