package org.example.enums;

public enum Genre {
    THRILLER("Thr"),
    DRAMA("Dr"),
    ACTION("Act"),
    DETECTIVE("Det"),
    COMEDY("Com"),
    MELODRAMA("mel"),
    FANTASY("Fan");

    private final String name;

    Genre(String name) {
        this.name = name;
    }

    /*public static Genre resolveGenre(String text) {
        return Genre.valueOf(Genre.class, text);
    }*/
}
