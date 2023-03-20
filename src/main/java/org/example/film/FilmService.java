package org.example.film;

import org.example.enums.Genre;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Person;
import org.example.model.Studio;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

import static org.example.model.Studio.STUDIOS;
import static org.example.model.Studio.resolveStudio;

public class FilmService {


    public boolean launch(Film film) {
        return false;
    }

    public Film record(String... details) {
        return new ArtFilm();
    }


    public static Film createFilms(Map<Studio, List<Film>> films) {
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
            //  String isArtfilm = scanner.next();

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
                case "m":
                    film = new MultFilm();
                    film.setArtfilm(false);
                    break;
                default:
                case "a":
                case "A":
                    film = new ArtFilm();
                    film.setArtfilm(true);
            }
            film.setType((type));
            //  film.setArtfilm((Boolean.parseBoolean(isArtfilm));
            film.setDuration(Long.parseLong(duration));
            film.setOperator(film.resolvePerson(operator));
            film.setDirector(film.resolvePerson(director));
            film.setGenre(Genre.valueOf(genre));

            Studio currentStudio = resolveStudio(studio);
//            film.setStudio(currentStudio);
            films.putIfAbsent(currentStudio, new LinkedList<>());
            films.get(currentStudio).add(film);

            film.setLaunchYear(launchYear);

//            currentStudio.addFilm(film);
            count++;
        }
        while (count < filmsCount);
        return film;
    }

    public static void printFilmsSince1985(Map<Studio, List<Film>> films) {
        System.out.println("Problem1");
        System.out.println("Films released after 1985.");
        /*for (Studio studio : STUDIOS.values()) {
            for (Film film : studio.getFilms()) {
                if (film == null) {
                    break;
                }

                if (film.getLaunchYear() > 1985) {
                    System.out.println("The studio: " + studio.getName() +
                            "has recorded " + studio.getFilmsCount() + " films:");
                    System.out.println(film.toString());
                }

            }

        }*/

        for (Map.Entry<Studio, List<Film>> value : films.entrySet()) {
            for (Film film : value.getValue()) {
                if (film == null) {
                    break;
                }

                Studio studio = value.getKey();

                if (film.getLaunchYear() > 1985) {
                    System.out.println("The studio: " + studio.getName() +
                            "has recorded " + studio.getFilmsCount() + " films:");
                    System.out.println(film);
                }

            }
        }

    }

    public static void printFilmsRecordedBySpecificDirector(String director, Map<Studio, List<Film>> filmsMap) {
        System.out.println("Problem2");

        for (List<Film> films : filmsMap.values()) {
            Film film2 = null;
            for (Film film : films) {
                if (film == null) {
                    break;
                }
                Person person = film.resolvePerson(director);

                if (Objects.equals(film.getDirector().getId(), film.resolvePerson(director).getId())) {
                    film = film2;
                }

            }
            System.out.println(film2);
        }
    }

    public static void printlongestArtFilm() {
        System.out.println("Problem 4");
        for (Studio studio : STUDIOS.values()) {
            Film[] films = studio.getFilms();
            if (films[0] == null) {
                break;
            }
            Film max = films[0];

            for (int i = 0; i < films.length; i++) {
                if (films[i] == null) {
                    break;
                }
                if ((films[i].isArtfilm()) && (films[i].getDuration() > max.getDuration())) {
                    max = films[i];
                }

            }
            System.out.println(max.toString());
        }

    }


    public static void mostFrequentGenre(Map<Studio, List<Film>> filmsMap) {
        System.out.println("Problem3");

        Map<Genre, List<Film>> filmsByGenre = new HashMap<>();


        for (List<Film> films : filmsMap.values()) {
            int maxcount = 0;
            Genre genreHavingMaxFrequent = null;

//            for (Film film : films) {
//                int count = 0;
//                for (int j = 0; j < films1.length; j++) {
//                    if ((films1[i] != null && films1[j] != null)
//                            &&
//                            (films1[i].getGenre() == films1[j].getGenre())) {
//                        count++;
//                    }
//                }
//
//                if (count > maxcount) {
//                    maxcount = count;
//                    genreHavingMaxFrequent = films1[i].getGenre();
//                }
//                break;
//            }
//            System.out.println("The most popular genre in " + studio.getName() + " is " + genreHavingMaxFrequent);
            // System.out.println(genreHavingMaxFrequent);
        }
    }


}
















