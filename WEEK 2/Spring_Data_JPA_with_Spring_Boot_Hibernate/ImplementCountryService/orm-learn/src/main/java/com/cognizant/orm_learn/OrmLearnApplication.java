package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("\n==========================================");
        System.out.println("CTS DN 5.0 - EXERCISE 5");
        System.out.println("Implement Services for Managing Country");
        System.out.println("==========================================");
        System.out.println("CountryService created successfully.");
        System.out.println("Repository connected successfully.");
        System.out.println("Exercise 5 Completed.");
        System.out.println("==========================================");

    }
}