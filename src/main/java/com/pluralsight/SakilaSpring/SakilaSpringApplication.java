package com.pluralsight.SakilaSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SakilaSpringApplication {

	public static void main(String[] args) {

        SpringApplication.run(SakilaSpringApplication.class, args);

        //after the above line runs, it will any classes (components) that implement the Commnand Line Runner

    }

}
