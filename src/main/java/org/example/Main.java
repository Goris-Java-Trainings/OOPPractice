package org.example;

import org.example.enums.Genre;
import org.example.film.Film;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Person;
import org.example.model.Studio;

import java.util.Scanner;

public class Main {

    private static final Studio[] STUDIOS = initStudios();

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

        for (Studio studio : STUDIOS) {
            System.out.println("The studio: " + studio.getName() +
                    "has recorded " + studio.getFilmsCount() + " films:\n");
            if (studio.getFilmsCount() == 0) {
                System.out.println("-----------/ EMPTY /----------");
            }
            for (Film film : studio.getFilms()) {
                if (film == null) {
                    break;
                }
                System.out.println(film);
            }
            System.out.println("---------------------------------------");
            System.out.println();
            System.out.println();
        }
    }

    // TODO: get the films for a specific Studio which are launched after 1985
    // TODO: get all films recorder by specific director

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


    public static void printFilmsSince1985() {
        System.out.println("Films released after 1985.");
        for (Studio studio : STUDIOS) {
            for (Film film : studio.getFilms()) {
                if (film == null) {
                    break;
                }
                if (film.getLaunchYear() > 1985) {
                    System.out.println("The studio: " + studio.getName() + " has recorded " + studio.getFilmsCount() + " films:");
                    System.out.println(film.toString());
                }


            }
        }
    }



    public static void printFilmsByDirector() {
        System.out.println("Type the Director of the film...");
        Scanner scanner1 = new Scanner(System.in);
        for (Studio studio : STUDIOS) {
            Film[] films = studio.getFilms();
            Film film = null;
            for (int i = 0; i < films.length; i++) {
                if (films[i] == null) {
                    break;
                }
                String director = scanner1.next();
                Person person = films[i].resolvePerson(director);

                if (films[i].getDirector().getId() == films[i].resolvePerson(director).getId()) {
                    films[i] = film;
                }

            }
            System.out.println(film);
        }

    }


    public static void printLongestArtFilm() {
        for (Studio studio : STUDIOS) {
            Film[] films = studio.getFilms();
            if (films[0] == null) {
                break;
            }
            Film max = films[0];

            for (int i = 0; i < films.length; i++) {
                if (films[i] == null) {
                    break;
                }
                if ((films[i].ArtFilm()) && (films[i].getDuration() > max.getDuration())) {
                    max = films[i];
                }

            }
            System.out.println(max.toString());
        }
    }
}