package org.example.model;

import org.example.film.Film;

public class Studio {

    private int id;
    private String name;
    private int foundedAt;

    private Film[] films = new Film[10];
    private int filmsCount = 0;

    public Studio(int id, String name, int foundedAt) {
        this.id = id;
        this.name = name;
        this.foundedAt = foundedAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundedAt() {
        return foundedAt;
    }

    public void setFoundedAt(int foundedAt) {
        this.foundedAt = foundedAt;
    }

    public void addFilm(Film film) {
        films[filmsCount++] = film;
    }

    public int getFilmsCount() {
        return filmsCount;
    }

    public Film[] getFilms() {
        return films;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundedAt=" + foundedAt +
                ", filmsCount=" + filmsCount +
                '}';
    }
}
