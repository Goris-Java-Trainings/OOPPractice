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
    public static final Studio[] STUDIOS = initStudios();

    private static Studio[] initStudios() {
        Studio[] allStudios = new Studio[4];

        Studio universalStudio = new Studio(1, "Universal Pictures", 1976);
        Studio paramountStudio = new Studio(2, "Paramount Pictures",
                1865);
        Studio marvelStudio = new Studio(3, "Marvel",
                1954);
        Studio metroGoldenStudio = new Studio(4, "MetroGolden",
                1921);

        allStudios[0] = universalStudio;
        allStudios[1] = paramountStudio;
        allStudios[2] = marvelStudio;
        allStudios[3] = metroGoldenStudio;
        return allStudios;
    }

    public static Studio resolveStudio(int id) { // 4,
        switch (id) {
            case 1:
                return STUDIOS[0];
            case 2:
                return STUDIOS[1];
            default:
            case 3:
                return STUDIOS[2];
            case 4:
                return STUDIOS[3];
        }
    }
}
