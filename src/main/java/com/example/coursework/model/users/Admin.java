package com.example.coursework.model.users;

import java.time.LocalDate;

public class Admin extends User{


    public Admin(int id, String email, String password, String name, String surname, LocalDate dateCreated, LocalDate dateModified) {
        super(id, email, password, name, surname, dateCreated, dateModified);
    }

    public Admin() {
    }

    public Admin(String login, String password) {
        super(login, password);
    }
}
