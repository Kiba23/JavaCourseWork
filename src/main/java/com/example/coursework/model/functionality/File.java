package com.example.coursework.model.functionality;

import com.example.coursework.model.users.User;

import java.time.LocalDate;

public class File {
    private int id;
    private String fileName;
    private String fileLocation;
    private LocalDate dateCreated;
    private User creator;

    public File(int id, String fileName, String fileLocation, LocalDate dateCreated, User creator) {
        this.id = id;
        this.fileName = fileName;
        this.fileLocation = fileLocation;
        this.dateCreated = dateCreated;
        this.creator = creator;
    }

    public File() {
    }

    public File(String fileName, String fileLocation, User creator) {
        this.fileName = fileName;
        this.fileLocation = fileLocation;
        this.creator = creator;
        this.dateCreated = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }
}
