package com.example.coursework.model.courses;

import com.example.coursework.model.functionality.Folder;
import com.example.coursework.model.users.Admin;
import com.example.coursework.model.users.Student;
import com.example.coursework.model.users.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;

// Subject - single study subject in course
public class Subject extends Curriculum {
    private String subjectId;
    private double gradeFromSubject;
    private ArrayList<Teacher> teachers;
    private ArrayList<Folder> folders;

    public Subject(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, ArrayList<Admin> programModerators, ArrayList<Student> students, int subjectId, double gradeFromSubject, ArrayList<Teacher> teachers, ArrayList<Folder> folders) {
        super(title, description, dateCreated, startDate, endDate, programModerators, students);
        this.subjectId = "S" + String.valueOf(subjectId);
        this.gradeFromSubject = gradeFromSubject;
        this.teachers = teachers;
        this.folders = folders;
    }

    public Subject(int subjectId, double gradeFromSubject, ArrayList<Teacher> teachers, ArrayList<Folder> folders) {
        this.subjectId = "S" + String.valueOf(subjectId);
        this.gradeFromSubject = gradeFromSubject;
        this.teachers = teachers;
        this.folders = folders;
    }

    public Subject(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, int subjectId, double gradeFromSubject, ArrayList<Teacher> teachers, ArrayList<Folder> folders) {
        super(title, description, startDate, endDate);
        this.subjectId = "S" + String.valueOf(subjectId);
        this.gradeFromSubject = gradeFromSubject;
        this.teachers = teachers;
        this.folders = folders;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = "S" + String.valueOf(subjectId);
    }

    public double getGradeFromSubject() {
        return gradeFromSubject;
    }

    public void setGradeFromSubject(double gradeFromSubject) {
        this.gradeFromSubject = gradeFromSubject;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}
