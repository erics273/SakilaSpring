package com.pluralsight.SakilaSpring.dao;

import com.pluralsight.SakilaSpring.models.Film;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IFilmDao {

    //CRUD: Create, Read, Update, Delete

    //(C)RUD
    void add(Film film);

    //C(R)UD
    List<Film> getAll();

    //C(R)UD
    Film findById(int id);

    void updateById(int id);

    //CRU(D)
    void deleteById(int id);




}
