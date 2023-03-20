package org.example.model;

import org.example.film.Film;

import java.util.HashMap;
import java.util.Map;

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

    public static final Map<Integer, Studio> STUDIOS = initStudios();
    private static int count = 1;

    private static Map<Integer, Studio> initStudios() {
        Map<Integer, Studio> allStudios = new HashMap<>();

        Studio universalStudio = new Studio(1, "Universal Pictures", 1976);
        Studio paramountStudio = new Studio(2, "Paramount Pictures",
                1865);
        Studio marvelStudio = new Studio(3, "Marvel",
                1954);
        Studio metroGoldenStudio = new Studio(4, "MetroGolden",
                1921);

        allStudios.put(count++, universalStudio);
        allStudios.put(count++, paramountStudio);
        allStudios.put(count++, marvelStudio);
        allStudios.put(count++, metroGoldenStudio);

        return allStudios;
    }

    public void add(Studio studio) {
        STUDIOS.put(count++, studio);
    }

    public static Studio resolveStudio(Integer id) {
        return STUDIOS.get(id);
    }
}
