package com.practice.javafx.controllers;

import com.practice.javafx.models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeScreenController implements Initializable {
    public BorderPane parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        switchCenterPaneListener();
    }

    private void switchCenterPaneListener() {
        Model.getInstance().getViewFactory().getSelectedDatasetItem().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case "TelephoneBanking" ->
                        parent.setCenter(Model.getInstance().getViewFactory().getTelephoneBankingView());
                case "Accounts" -> parent.setCenter(Model.getInstance().getViewFactory().getAccountsView());
                case "Cards" -> parent.setCenter(Model.getInstance().getViewFactory().getCardsView());
                default -> parent.setCenter(Model.getInstance().getViewFactory().getClientView());
            }
        });
    }
}
