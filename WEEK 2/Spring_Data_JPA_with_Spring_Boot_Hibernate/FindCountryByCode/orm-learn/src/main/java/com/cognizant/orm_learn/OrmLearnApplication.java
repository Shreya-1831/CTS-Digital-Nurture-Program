package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("\n==========================================");
        System.out.println("CTS DN 5.0 - EXERCISE 6");
        System.out.println("Find Country by Country Code");
        System.out.println("==========================================");

        Country country = countryService.findCountryByCode("IN");

        System.out.println("Country Found Successfully");
        System.out.println("--------------------------");
        System.out.println("Country Code : " + country.getCode());
        System.out.println("Country Name : " + country.getName());

        System.out.println("==========================================");
        System.out.println("Exercise 6 Completed.");
        System.out.println("==========================================");

    }
}