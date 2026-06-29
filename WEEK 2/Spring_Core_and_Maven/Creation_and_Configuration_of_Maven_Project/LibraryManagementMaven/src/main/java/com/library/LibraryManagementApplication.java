package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("     LIBRARY MANAGEMENT APPLICATION");
        System.out.println("========================================");

        ApplicationContext context = new ClassPathXmlApplicationContext();

        System.out.println("Maven Project Created Successfully");
        System.out.println("Spring Context Dependency Added");
        System.out.println("Spring AOP Dependency Added");
        System.out.println("Spring WebMVC Dependency Added");
        System.out.println("Maven Compiler Plugin Configured");
        System.out.println("Java Version : 1.8");

        System.out.println("----------------------------------------");
        System.out.println("Project Configuration Successful");
        System.out.println("========================================");
    }
}