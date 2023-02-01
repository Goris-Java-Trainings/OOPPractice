package org.example;
import org.example.enums.Genre;
import org.example.film.Film;
import org.example.film.FilmService;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Studio;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Film film= FilmService.createFilm();
    FilmService.printFilmsSince1985();
        System.out.println("--------");
 //   FilmService.printFilmsRecordedByaSpecificDirector(new Film[]{film});
    }
    // TODO: get the films for a specific Studio which are launched after 1985
    // TODO: get all films recorder by specific director
}