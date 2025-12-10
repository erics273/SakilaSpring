package com.pluralsight.SakilaSpring.controllers;

import com.pluralsight.SakilaSpring.dao.IFilmDao;
import com.pluralsight.SakilaSpring.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

}
