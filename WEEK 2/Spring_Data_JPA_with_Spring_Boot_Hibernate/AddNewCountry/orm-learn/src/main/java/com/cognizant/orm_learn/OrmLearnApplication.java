package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

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
        System.out.println("CTS DN 5.0 - EXERCISE 7");
        System.out.println("Add New Country");
        System.out.println("==========================================");

        Country country = new Country("FR", "France");

        countryService.addCountry(country);

        Country result = countryService.findCountryByCode("FR");

        System.out.println("Country Added Successfully");
        System.out.println("--------------------------");
        System.out.println("Country Code : " + result.getCode());
        System.out.println("Country Name : " + result.getName());

        System.out.println("==========================================");
        System.out.println("Exercise 7 Completed.");
        System.out.println("==========================================");

    }
}