package org.example.film;

import org.example.film.impl.ArtFilm;

public class FilmService {

    public boolean launch(Film film) {
        return false;
    }

    public Film record(String... details) {
        return new ArtFilm();
    }
}
