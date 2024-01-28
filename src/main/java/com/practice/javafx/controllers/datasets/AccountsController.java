package com.practice.javafx.controllers.datasets;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsController implements Initializable {
    public Label temp_lbl;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        temp_lbl.setText("Welcome to Accounts Dataset Flow!");
    }
}
