package com.practice.javafx.controllers;

import com.practice.javafx.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class DatasetOptionsMenuController implements Initializable {
    public Button client_btn;
    public Button telephone_banking_btn;
    public Button accounts_btn;
    public Button cards_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListenersForDatasetButtons();
    }

    private void addListenersForDatasetButtons() {
        client_btn.setOnAction(actionEvent -> onClient());
        telephone_banking_btn.setOnAction(actionEvent -> onTelephoneBanking());
        accounts_btn.setOnAction(actionEvent -> onAccounts());
        cards_btn.setOnAction(actionEvent -> onCards());
    }

    private void onClient() {
        Model.getInstance().getViewFactory().getSelectedDatasetItem().set("Client");
    }

    private void onTelephoneBanking() {
        Model.getInstance().getViewFactory().getSelectedDatasetItem().set("TelephoneBanking");
    }

    private void onAccounts() {
        Model.getInstance().getViewFactory().getSelectedDatasetItem().set("Accounts");
    }

    private void onCards() {
        Model.getInstance().getViewFactory().getSelectedDatasetItem().set("Cards");
    }
}
