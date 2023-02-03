package org.example.film;

import org.example.enums.Genre;
import org.example.film.impl.ArtFilm;
import org.example.film.impl.MultFilm;
import org.example.model.Person;
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
            film.setStudio(currentStudio);
            film.setLaunchYear(launchYear);

            currentStudio.addFilm(film);
            count++;
        }
        while (count < filmsCount);
        return film;
    }

    public static void printFilmsSince1985() {
        System.out.println("Problem1");
        System.out.println("Films released after 1985.");
        for (Studio studio : STUDIOS) {
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

        }

    }

    public static void printFilmsRecordedByaSpecificDirector(){
         System.out.println("Problem2");
         System.out.println("Type the Director of the film...");
         Scanner scanner1 = new Scanner(System.in);
         for (Studio studio : STUDIOS) {
                 Film [] films= studio.getFilms();
                 Film film2 = null;
                 for (int i = 0; i < films.length; i++) {
                     if (films[i]== null){break;}
                     String director = scanner1.next();
                     Person person = films[i].resolvePerson(director);

                     if (films[i].getDirector().getId() == films[i].resolvePerson(director).getId()) {
                         films[i]=film2;
                     }

                 }
                 System.out.println(film2);
         }

     }

    public static void printlongestArtFilm() {
        System.out.println("Problem 4");
        for (Studio studio : STUDIOS) {
            Film[] films = studio.getFilms();
            if (films[0]==null){
                break;
            }
            Film max=films[0] ;

            for (int i = 0; i < films.length; i++) {
                if (films[i]== null){
                    break;
                }
                if ((films[i].isArtfilm()) && (films[i].getDuration() > max.getDuration())){
                        max = films[i];
                }

            }
            System.out.println(max.toString());
        }

    }


    public static void mostFrequentGenre() {
        System.out.println("Problem3");
        for (Studio studio : STUDIOS) {
            Film[] films1 = studio.getFilms();
            int maxcount = 0;
            Genre genreHavingMaxFrequent = null;

            for (int i = 0; i < films1.length; i++) {
                int count = 0;
                for (int j = 0; j < films1.length; j++) {
                    if ((films1[i]!=null && films1[j]!=null )
                            &&
                            (films1[i].getGenre() == films1[j].getGenre())) {
                        count++;
                    }
                }

                if (count > maxcount) {
                    maxcount = count;
                    genreHavingMaxFrequent = films1[i].getGenre();
                }
                break;
            }
                System.out.println("The most popular genre in "+studio.getName()+" is "+genreHavingMaxFrequent);
            // System.out.println(genreHavingMaxFrequent);
        }


    }




}
















