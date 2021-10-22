package com.example.coursework.model.users;

import com.example.coursework.model.courses.Course;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends User {
    private ArrayList<Course> enrolledCourses;
    private double averageGrade;

    public Student(int id, String email, String password, String name, String surname, LocalDate dateCreated, LocalDate dateModified, ArrayList<Course> enrolledCourses) {
        super(id, email, password, name, surname, dateCreated, dateModified);
        this.enrolledCourses = enrolledCourses;
    }

    public Student(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public Student(String login, String password, ArrayList<Course> enrolledCourses) {
        super(login, password);
        this.enrolledCourses = enrolledCourses;
    }

    public Student(int id, String email, String password, String name, String surname, LocalDate dateCreated, LocalDate dateModified) {
        super(id, email, password, name, surname, dateCreated, dateModified);
    }

    public Student() {
    }

    public Student(String login, String password) {
        super(login, password);
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
