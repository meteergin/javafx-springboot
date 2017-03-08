package com.meteergin.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

@Component
public class MainController implements Initializable
{
    @FXML
    private Button buttonHelloWorld;

    private static final Logger logger = Logger.getLogger(MainController.class);

    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
	
    }

    @FXML
    public void buttonHelloWorldOnClick()
    {
	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setContentText("Hello world :)");
	alert.setTitle("It works.");
	alert.setHeaderText(null);
	alert.showAndWait();
    }
}
