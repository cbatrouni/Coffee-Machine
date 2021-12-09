package com.login.loginform;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LogIn {

    public LogIn(){

    }

    @FXML
    private Button loginButton;
    @FXML
    private Label wrongLogIn;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    public void userLogIn(ActionEvent event) throws IOException
    {
        loginAttempt();
    }

    private void loginAttempt() throws IOException
    {
        StartScreen temp = new StartScreen();
        if(username.getText().toString().equals("cbatrouni") && password.getText().toString().equals("pass123"))
        {
            wrongLogIn.setText("Logging in");

            temp.changeScene("HomePage.fxml");
        }

        else if (username.getText().isEmpty() && password.getText().isEmpty())
        {
            wrongLogIn.setText("Please enter login information");
        }

        else
        {
            wrongLogIn.setText("Username and password are incorrect or do not match");
        }

    }
}
