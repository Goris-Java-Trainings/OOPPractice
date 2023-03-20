package org.example;

import org.example.film.Film;
import org.example.film.FilmService;
import org.example.model.Studio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<Studio, List<Film>> films = new HashMap<>();

        Film film = FilmService.createFilms(films);
        System.out.println("--------");
        FilmService.printFilmsSince1985(films);
        System.out.println("--------");

        System.out.println("Type the Director of the film...");
        Scanner scanner1 = new Scanner(System.in);
        String director = scanner1.next();

        FilmService.printFilmsRecordedBySpecificDirector(director, films);
        System.out.println("--------");
        FilmService.mostFrequentGenre(films);//+
        System.out.println("--------");
        FilmService.printlongestArtFilm();


    }
    //+ TODO: Get the films for a specific Studio which are launched after 1985
    //  TODO: Get all films recorder by specific director
    //+ TODO: Get the most popular GENRE (which is more often used) within the all films(ամենահաճախ կրկնվող ժանրը) (edited)
    //+ TODO: Get the longest ArtFilm


}