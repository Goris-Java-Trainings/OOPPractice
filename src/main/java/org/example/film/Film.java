package org.example.film;

import org.example.enums.Country;
import org.example.enums.Gender;
import org.example.enums.Genre;
import org.example.model.Person;
import org.example.model.Studio;

public abstract class Film {

    private String type;
    private long duration;
    private Person operator;
    private Person director;
    private Studio studio;
    private Genre genre;
    private int launchYear;
    private boolean isArtfilm;
    public Film() {

    }

    public Film(String type,long duration, Person operator, Person director, Studio studio, Genre genre, int launchYear) {
        this.type = type;
        this.duration = duration;
        this.operator = operator;
        this.director = director;
        this.studio = studio;
        this.genre = genre;
        this.launchYear = launchYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public boolean isArtfilm() {
        return isArtfilm;
    }

    public void setArtfilm(boolean artfilm) {
        isArtfilm = artfilm;
    }

    public Person resolvePerson(String text) { // Poghos,Poghosyan,MALE,234,ARM
        String[] details = text.split(",");

        return new Person(details[0],details[1], details[2], Gender.valueOf(details[3]),
                Integer.parseInt(details[4]), Country.valueOf(details[5]));
    }


     @Override
  public String toString() {
        return "Film{" +
                "type=" + type+
                ",duration=" + duration +
                ", operator=" + operator +
                ", director=" + director +
                ", studio=" + studio +
                ", genre=" + genre +
                ", launchYear=" + launchYear +
                '}';


        }
   /*   @Override
  public String toString() {
        return "Film{" +
                "isArtfilm=" + (isArtfilm?"A":"M")+
                ",duration=" + duration +
                ", operator=" + operator +
                ", director=" + director +
                ", studio=" + studio +
                ", genre=" + genre +
                ", launchYear=" + launchYear +
                '}';

    }*/
}

