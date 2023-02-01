package org.example;

import org.example.enums.Genre;
import org.example.film.Film;
import org.example.film.FilmService;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Studio;

import java.util.Scanner;

public class Main {

    /*    private static final Studio[] STUDIOS = initStudios();
       /* private static Studio[] initStudios() {
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
   */
    public static void main(String[] args) {

        /*System.out.println("Put your username...");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        System.out.println("Put your password...");
        String password = scanner.nextLine();

        System.out.println("Re-type your password...");
        String replicaPassword = scanner.nextLine();

        System.out.println("Type your email...");
        String email = scanner.nextLine();

        User user = new User(userName, password, replicaPassword, email);

        System.out.println(user);*/

    /*  public Film createFilm() {
            System.out.println("Put the number of films you want to create...");
        Scanner scanner = new Scanner(System.in);
        int filmsCount = scanner.nextInt();
        if (filmsCount < 1) {
            filmsCount = 1;
        }
        int count = 0;

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

            Film film;

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
    }*/
    Film film= FilmService.createFilm();
    FilmService.printFilmsSince1985();
     /*   System.out.println("Problem1");
        for (Studio studio : STUDIOS) {
            for (Film film : studio.getFilms()) {
                if (film == null) {
                    break;
                }

                if (film.getLaunchYear()>1998 ) {
                    System.out.println("The studio: " + studio.getName() +
                            "has recorded " + studio.getFilmsCount() + " films:\n");
                    System.out.println(film.toString());
                }
                else System.out.println("No such movie found");
            }
            
        }*/
        System.out.println("--------");
 //   FilmService.printFilmsRecordedByaSpecificDirector(new Film[]{film});
    }

    // TODO: get the films for a specific Studio which are launched after 1985
    // TODO: get all films recorder by specific director


}