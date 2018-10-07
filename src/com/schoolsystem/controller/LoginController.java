package com.schoolsystem.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.schoolsystem.model.LoginModel;
import com.schoolsystem.util.option;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    LoginModel loginModel = new LoginModel();
    @FXML
    private JFXTextField usernametf;

    @FXML
    private JFXPasswordField passwordtf;

    @FXML
    private JFXComboBox<option> cboxLogin;

    @FXML
    private JFXButton loginbtn;

    @FXML
    private Label dbStatus;

    @FXML
    private Label errorlogin;


    public void  initialize (URL url, ResourceBundle rb){

        if(this.loginModel.isDbConnected()){
            this.dbStatus.setText("Connected");
        }else {
            this.dbStatus.setText("Not Connected");
        }

        this.cboxLogin.setItems(FXCollections.observableArrayList(option.values()));

    }

    @FXML
    void getLogin(ActionEvent event) {

    }

}
