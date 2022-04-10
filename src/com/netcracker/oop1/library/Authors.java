package com.netcracker.oop1.library;

import java.util.Objects;

public class Authors {
    private String name;
    private String email;
    private char gender;

    public Authors() {

    }

    public Authors(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Authors authors = (Authors) o;
        return gender == authors.gender && Objects.equals(name, authors.name) && Objects.equals(email, authors.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, gender);
    }

    @Override
    public String toString() {
        return "Authors{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
