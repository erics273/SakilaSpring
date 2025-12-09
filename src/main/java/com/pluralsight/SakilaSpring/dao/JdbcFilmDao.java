package com.pluralsight.SakilaSpring.dao;

import com.pluralsight.SakilaSpring.models.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcFilmDao implements IFilmDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public void add(Film film) {

    }

    @Override
    public List<Film> getAll() {
        // Create an empty list to hold the Film objects we will retrieve.
        List<Film> films = new ArrayList<>();

        // This is the SQL SELECT statement we will run.
        String sql = "SELECT film_id, title, rental_rate FROM film";

        // This is a "try-with-resources" block.
        // It ensures that the Connection, Statement, and ResultSet are closed automatically after we are done.
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            // Loop through each row in the ResultSet.
            while (rs.next()) {
                // Create a new Film object.
                Film film = new Film();

                // Set the film's ID from the "film_id" column.
                film.setFilmId(rs.getInt("film_id"));

                // Set the film's title from the "title" column.
                film.setTitle(rs.getString("title"));

                // Set the film's rental rate from the "rental_rate" column.
                film.setRentalRate(rs.getDouble("rental_rate"));

                // Add the Film object to our list.
                films.add(film);
            }

        } catch (SQLException e) {
            // If something goes wrong (SQL error), print the stack trace to help debug.
            e.printStackTrace();
        }

        // Return the list of Film objects.
        return films;
    }
}
