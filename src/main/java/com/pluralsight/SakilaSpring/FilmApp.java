package com.pluralsight.SakilaSpring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class FilmApp implements CommandLineRunner {

    public void run(String... args) throws Exception {
        System.out.println("The Thing Ran");
    }

}
