package org.example;
import org.example.enums.Genre;
import org.example.film.Film;
import org.example.film.FilmService;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Studio;
import java.util.Scanner;
import static org.example.film.FilmService.mostFrequentGenre;

public class Main {
    public static void main(String[] args) {
    Film film= FilmService.createFilm();
        System.out.println("--------");
   // FilmService.printFilmsSince1985();
        System.out.println("--------");
     FilmService.printFilmsRecordedByaSpecificDirector();
        System.out.println("--------");
  //   FilmService.mostFrequentGenre();//+
        System.out.println("--------");
//     FilmService.printlongestArtFilm();


    }
    //+ TODO: Get the films for a specific Studio which are launched after 1985
    //  TODO: Get all films recorder by specific director
    //+ TODO: Get the most popular GENRE (which is more often used) within the all films(ամենահաճախ կրկնվող ժանրը) (edited)
    //+ TODO: Get the longest ArtFilm


}