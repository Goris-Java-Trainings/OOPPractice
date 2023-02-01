package org.example.film;

import org.example.enums.Genre;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Studio;


import java.util.Scanner;

//import static org.example.Main.resolveStudio;
import static org.example.model.Studio.STUDIOS;
import static org.example.model.Studio.resolveStudio;

public class FilmService {


    public boolean launch(Film film) {
        return false;
    }

    public Film record(String... details) {
        return new ArtFilm();
    }

 //   Film film = null;//
  //  Film [] films={film} ;//
    public static Film createFilm() {
        System.out.println("Put the number of films you want to create...");
        Scanner scanner = new Scanner(System.in);
        int filmsCount = scanner.nextInt();
        if (filmsCount < 1) {
            filmsCount = 1;
        }
        int count = 0;

        Film film;
        do {
            System.out.println("Type the concrete type of the film (M | A )...");
            String type = scanner.next();

            System.out.println("Type the duration of the film...");
            String duration = scanner.next();
            System.out.println("Type the Operator of the film...");
            String operator = scanner.next();
            Scanner anotherScanner = new Scanner(System.in);
            System.out.println("Type the Director of the film...");
            String director = anotherScanner.nextLine();
            System.out.println("Type the Studio id where the film is founded...");
            int studio = anotherScanner.nextInt();
            System.out.println("Type the genre of the film...");
            String genre = anotherScanner.next();
            System.out.println("Type the launch year of the film...");
            int launchYear = anotherScanner.nextInt();

            switch (type) {
                case "M":
                    film = new MultFilm();
                    break;
                default:
                case "A":
                    film = new ArtFilm();
            }

            film.setDuration(Long.parseLong(duration));
            film.setOperator(film.resolvePerson(operator));
            film.setDirector(film.resolvePerson(director));
            film.setGenre(Genre.valueOf(genre));

            Studio currentStudio = resolveStudio(studio);
            film.setStudio(currentStudio);
            film.setLaunchYear(launchYear);

            currentStudio.addFilm(film);
            count++;
        }
        while (count < filmsCount);
        return film;
    }
    public static void printFilmsSince1985(){
       System.out.println("Problem1");
        for (Studio studio : STUDIOS) {
            for (Film film : studio.getFilms()) {
                if (film == null) {
                    break;
                }

                if (film.getLaunchYear()>1985 ) {
                    System.out.println("The studio: " + studio.getName() +
                            "has recorded " + studio.getFilmsCount() + " films:\n");
                    System.out.println(film.toString());
                }
                else {
                    System.out.println("No such movie found");
                }
            }

        }

    }
   /* public static void printFilmsRecordedByaSpecificDirector(Film [] films){
        System.out.println("Problem2");
        boolean conditionIs=true;
        int count=0;
        while (conditionIs){
            conditionIs=false;
            for (int i = 0; i <films.length-count ; i++) {
                if (films[i].getDirector()==films[i+1].getDirector()){
                    System.out.println(films.toString());
                    conditionIs=true;
                }
        }
            count++;
        }

}*/
}
