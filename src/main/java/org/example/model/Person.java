package org.example.model;

import org.example.enums.Country;
import org.example.enums.Gender;

public class Person {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Country country;

    public Person(String id,String firstName, String lastName, Gender gender, int age, Country country) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.country = country;
    }

    //    "grf55,Poghos,Poghosyan,MALE,234,ARM"


    @Override
    public String toString() {
        return "Person{" +
                "  id='"+ id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
//grf15,Poghos,Poghosyan,MALE,234,ARM
