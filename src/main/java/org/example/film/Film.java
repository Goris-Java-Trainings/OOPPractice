package org.example.film;

import org.example.enums.Country;
import org.example.enums.Gender;
import org.example.enums.Genre;
import org.example.model.Person;
import org.example.model.Studio;

public abstract class Film {
    private long duration;
    private Person operator;
    private Person director;
    private Studio studio;
    private Genre genre;
    private int launchYear;

    public Film() {

    }

    public Film(long duration, Person operator, Person director, Studio studio, Genre genre, int launchYear) {
        this.duration = duration;
        this.operator = operator;
        this.director = director;
        this.studio = studio;
        this.genre = genre;
        this.launchYear = launchYear;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public Person getOperator() {
        return operator;
    }

    public void setOperator(Person operator) {
        this.operator = operator;
    }

    public Person getDirector() {
        return director;
    }

    public void setDirector(Person director) {
        this.director = director;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public Person resolvePerson(String text) { // Poghos,Poghosyan,MALE,234,ARM
        String[] details = text.split(",");

        return new Person(details[0], details[1], Gender.valueOf(details[2]),
                Integer.parseInt(details[3]), Country.valueOf(details[4]));
    }

    @Override
    public String toString() {
        return "Film{" +
                "duration=" + duration +
                ", operator=" + operator +
                ", director=" + director +
                ", studio=" + studio +
                ", genre=" + genre +
                ", launchYear=" + launchYear +
                '}';
    }
}
