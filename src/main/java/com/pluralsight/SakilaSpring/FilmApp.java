package com.pluralsight.SakilaSpring;

import com.pluralsight.SakilaSpring.dao.IFilmDao;
import com.pluralsight.SakilaSpring.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class FilmApp implements CommandLineRunner {

    //we are asking spring to  "inject" a FilmDAO here
    //This is an example of Dependency injection and inversion of control (DI, IC)
    @Autowired
    @Qualifier("jdbcFilmDao")
    private IFilmDao filmDao;

    @Override
    public void run(String... args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        while(true){

            System.out.print("""
                    === Welcome to the Film Admin Menu ===
                        1) List All Films
                        2) Add a film
                        3) Exit the app
                    Enter Your Choice: 
                    """);

            switch (scanner.nextInt()){

                case 1:

                    displayAllFilms();
                    break;

                case 2:

                    addAFilm();
                    break;


                case 3:
                    System.out.println("Peace Out Homie!");
                    System.exit(0);
                    break;

            }

        }



    }

    private void displayAllFilms(){

        List<Film> films = filmDao.getAll();

        films.forEach(System.out::println);

    }

    private void addAFilm(){

        System.out.println("""
                We are adding a new film for you and we don't care what you want to call it
                """);

                Film theFilm = new Film();
                theFilm.setTitle("DJ Localhost 3000: An Underdog Story");
                theFilm.setRentalRate(5.99);

                filmDao.add(theFilm);

    }

}
