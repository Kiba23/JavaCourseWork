package com.example.coursework.model.users;

import java.time.LocalDate;

public abstract class User {
    private int id;
    private String email;
    private String password;
    private String name;
    private String surname;
    private LocalDate dateCreated;
    private LocalDate dateModified;

    public User(int id, String email, String password, String name, String surname, LocalDate dateCreated, LocalDate dateModified) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    public User() {
    }

    public User(String email, String password) {
        // TODO: check if I need initialize id here
        this.email = email;
        this.password = password;
        this.dateCreated = LocalDate.now();
        this.dateModified = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }
}
