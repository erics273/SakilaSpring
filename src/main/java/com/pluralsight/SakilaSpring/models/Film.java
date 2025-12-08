package com.pluralsight.SakilaSpring.models;

public class Film {

    private int filmId;
    private String title;
    private double rentalRate;

    //empty constructor
    public Film() {
    }

    //constructor that allows us to set properties of the object
    public Film(int filmId, String title, double rentalRate) {
        this.filmId = filmId;
        this.title = title;
        this.rentalRate = rentalRate;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId=" + filmId +
                ", title='" + title + '\'' +
                ", rentalRate=" + rentalRate +
                '}';
    }
}
