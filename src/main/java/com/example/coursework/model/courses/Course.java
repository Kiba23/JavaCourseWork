package com.example.coursework.model.courses;

import com.example.coursework.model.users.Admin;
import com.example.coursework.model.users.Student;

import java.time.LocalDate;
import java.util.ArrayList;

// Course - 1 course period (1 year)
public class Course extends Curriculum {
    private String courseId;
    private ArrayList<Subject> subjects;

    public Course(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, ArrayList<Admin> programModerators, ArrayList<Student> students, int courseId, ArrayList<Subject> subjects) {
        super(title, description, dateCreated, startDate, endDate, programModerators, students);
        this.courseId = "C" + String.valueOf(courseId);
        this.subjects = subjects;
    }

    public Course(int courseId, ArrayList<Subject> subjects) {
        this.courseId = "C" + String.valueOf(courseId);
        this.subjects = subjects;
    }

    public Course(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, int courseId, ArrayList<Subject> subjects) {
        super(title, description, startDate, endDate);
        this.courseId = "C" + String.valueOf(courseId);
        this.subjects = subjects;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = "C" + String.valueOf(courseId);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
}
