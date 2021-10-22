package com.example.coursework.fxControllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignUpForm implements Initializable {

    public TextField nameField;
    public PasswordField surnameField;
    public RadioButton studentBtn;
    public RadioButton teacherBtn;
    public TextField emailField;
    public TextField passwordField;
    public TextField qualificationField;

    public void createUser(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        if (!teacherBtn.isDisable()) {
            qualificationField.setDisable(false);
        }
    }
}
