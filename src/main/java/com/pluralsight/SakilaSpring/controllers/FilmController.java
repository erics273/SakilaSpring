package com.pluralsight.SakilaSpring.controllers;

import com.pluralsight.SakilaSpring.dao.IFilmDao;
import com.pluralsight.SakilaSpring.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FilmController {

    @Autowired
    @Qualifier("jdbcFilmDao")
    IFilmDao filmDao;

    @GetMapping("/films" )
    public List<Film> getAllFilms(){
        return filmDao.getAll();
    }

    @GetMapping("/films/{id}")
    public int getAllFilms(@PathVariable int id){
        return id;
    }

    //this is a post mapping so it will respond to a post request (Create in Crud)
    @PostMapping("/films")
    public void addFilm(@RequestBody Film film){
        filmDao.add(film);
    }

}
