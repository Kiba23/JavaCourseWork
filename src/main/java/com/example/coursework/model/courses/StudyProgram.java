package com.example.coursework.model.courses;

import com.example.coursework.model.users.Admin;
import com.example.coursework.model.users.Student;

import java.time.LocalDate;
import java.util.ArrayList;

// Study Program - whole Bachelor or Master period
public class StudyProgram extends Curriculum {
    private String studyProgramId;
    private ArrayList<Course> courses;

    public StudyProgram(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, ArrayList<Admin> programModerators, ArrayList<Student> students, int studyProgramId, ArrayList<Course> courses) {
        super(title, description, dateCreated, startDate, endDate, programModerators, students);
        this.studyProgramId = "SP" + String.valueOf(studyProgramId);
        this.courses = courses;
    }

    public StudyProgram(int studyProgramId, ArrayList<Course> courses) {
        this.studyProgramId = "SP" + String.valueOf(studyProgramId);
        this.courses = courses;
    }

    public StudyProgram(String title, String description, LocalDate dateCreated, LocalDate startDate, LocalDate endDate, int studyProgramId, ArrayList<Course> courses) {
        super(title, description, startDate, endDate);
        this.studyProgramId = "SP" + String.valueOf(studyProgramId);
        this.courses = courses;
    }

    public String getStudyProgramId() {
        return studyProgramId;
    }

    public void setStudyProgramId(int studyProgramId) {
        this.studyProgramId = "SP" + String.valueOf(studyProgramId);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
