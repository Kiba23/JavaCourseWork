package com.example.coursework.model.users;

import com.example.coursework.model.courses.Course;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends User{
    private ArrayList<Course> teachingCourses;
    private String teacherQualification;
    private int yearsOfExperience;

    public Teacher(int id, String email, String password, String name, String surname, LocalDate dateCreated, LocalDate dateModified, ArrayList<Course> teachingCourses, String teacherQualification, int yearsOfExperience) {
        super(id, email, password, name, surname, dateCreated, dateModified);
        this.teachingCourses = teachingCourses;
        this.teacherQualification = teacherQualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Teacher(ArrayList<Course> teachingCourses, String teacherQualification, int yearsOfExperience) {
        this.teachingCourses = teachingCourses;
        this.teacherQualification = teacherQualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Teacher(String email, String password, ArrayList<Course> teachingCourses, String teacherQualification, int yearsOfExperience) {
        super(email, password);
        this.teachingCourses = teachingCourses;
        this.teacherQualification = teacherQualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Teacher(int id, String email, String password, String name, String surname, LocalDate dateCreated, LocalDate dateModified, String teacherQualification) {
        super(id, email, password, name, surname, dateCreated, dateModified);
        this.teacherQualification = teacherQualification;
    }

    public Teacher(String teacherQualification) {
        this.teacherQualification = teacherQualification;
    }

    public Teacher(String login, String password, String teacherQualification) {
        super(login, password);
        this.teacherQualification = teacherQualification;
    }

    public ArrayList<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public void setTeachingCourses(ArrayList<Course> teachingCourses) {
        this.teachingCourses = teachingCourses;
    }

    public String getTeacherQualification() {
        return teacherQualification;
    }

    public void setTeacherQualification(String teacherQualification) {
        this.teacherQualification = teacherQualification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
