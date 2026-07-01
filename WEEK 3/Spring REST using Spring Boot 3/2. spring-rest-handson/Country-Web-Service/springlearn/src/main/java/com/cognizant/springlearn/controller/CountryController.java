package com.cognizant.springlearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {

        return new Country("IN", "India");

    }

}