package com.pluralsight.SakilaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SakilaSpringApplication {

	public static void main(String[] args) {

        //make sure the username and password were provided for the db
        if (args.length != 2) {
            System.out.println("Usage: java -jar app.jar <username> <password>");
            System.exit(1);
        }

        // Set system properties with the username and password so Spring can read them later.
        System.setProperty("dbUsername", args[0]);
        System.setProperty("dbPassword", args[1]);

        //the spring stuff should come after the usernamen and pw stuff above
        SpringApplication.run(SakilaSpringApplication.class, args);

        //after the above line runs, it will any classes (components) that implement the Commnand Line Runner

    }

}
