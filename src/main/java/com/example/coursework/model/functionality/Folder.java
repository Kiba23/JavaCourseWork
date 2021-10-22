package com.example.coursework.model.functionality;

import com.example.coursework.model.users.User;

import java.time.LocalDate;
import java.util.ArrayList;

public class Folder {
    private int id;
    private String folderName;
    private LocalDate dateCreated;
    private ArrayList<Folder> subFolders;
    private ArrayList<User> editors;
    private ArrayList<File> files;

    public Folder(int id, String folderName, LocalDate dateCreated, ArrayList<Folder> subFolders, ArrayList<User> editors, ArrayList<File> files) {
        this.id = id;
        this.folderName = folderName;
        this.dateCreated = dateCreated;
        this.subFolders = subFolders;
        this.editors = editors;
        this.files = files;
    }

    public Folder() {
    }

    public Folder(String folderName) {
        this.folderName = folderName;
        this.dateCreated = LocalDate.now();
        this.files = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ArrayList<Folder> getSubFolders() {
        return subFolders;
    }

    public void setSubFolders(ArrayList<Folder> subFolders) {
        this.subFolders = subFolders;
    }

    public ArrayList<User> getEditors() {
        return editors;
    }

    public void setEditors(ArrayList<User> editors) {
        this.editors = editors;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
}
