package org.example.model;

import org.example.enums.Country;
import org.example.enums.Gender;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;
    private Country country;

    public Person(String firstName, String lastName, Gender gender, int age, Country country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.country = country;
    }

    //    "Poghos,Poghosyan,MALE,234,ARM"


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", country=" + country +
                '}';
    }
}
