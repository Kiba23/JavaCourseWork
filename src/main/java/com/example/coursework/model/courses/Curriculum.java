package com.example.coursework.model.courses;

import com.example.coursework.model.users.Admin;
import com.example.coursework.model.users.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Curriculum {
    private String title;
    private String description;
    private LocalDate dateCreated;
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Admin> programModerators;
    private ArrayList<Student> students;

    public Curriculum(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, ArrayList<Admin> programModerators, ArrayList<Student> students) {
        this.title = title;
        this.description = description;
        this.dateCreated = dateCreated;
        this.startDate = startDate;
        this.endDate = endDate;
        this.programModerators = programModerators;
        this.students = students;
    }

    public Curriculum() {
    }

    public Curriculum(String title, String description, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dateCreated = LocalDate.now();
        this.programModerators = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Admin> getProgramModerators() {
        return programModerators;
    }

    public void setProgramModerators(ArrayList<Admin> programModerators) {
        this.programModerators = programModerators;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
