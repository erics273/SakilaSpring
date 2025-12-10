package com.pluralsight.SakilaSpring.controllers;

import com.pluralsight.SakilaSpring.dao.IFilmDao;
import com.pluralsight.SakilaSpring.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    // this method will respond to http://localhost:8080/
    @GetMapping("/")
    public String homePage(@RequestParam(defaultValue="World") String name, @RequestParam(defaultValue="Red") String favcolor) {
        return "hello " + name +"! and your fovorite color is " + favcolor;
    }


    // this method will respond to http://localhost:8080/
    @GetMapping("/eric")
    public String poopagain() {
        return "this is Eric magic!";
    }

    // this method will respond to http://localhost:8080/
    @GetMapping("/andy")
    public String andy() {
        return "this is Andy magic!";
    }



}
