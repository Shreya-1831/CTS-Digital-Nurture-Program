package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        LOGGER.info("===== START =====");

        SpringApplication app = new SpringApplication(SpringLearnApplication.class);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.run(args);

        LOGGER.info("Spring Web Project Created Successfully");
        LOGGER.info("===== END =====");
    }
}


