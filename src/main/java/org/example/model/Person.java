package org.example.model;

import org.example.enums.Country;
import org.example.enums.Gender;

public class Person {
    private int Id;
    private String firstName;
    private String lastName;

    public void setId(int id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

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

    public int getId() {
        return Id;
    }
}
