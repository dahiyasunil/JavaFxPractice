package com.practice.javafx.views;

import com.practice.javafx.controllers.HomeScreenController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    //Datasets views
    private AnchorPane clientView;
    private AnchorPane telephoneBankingView;
    private AnchorPane accountsView;
    private AnchorPane cardsView;

    public AnchorPane getClientView() {
        if (clientView == null) {
            try {
                clientView = new FXMLLoader(getClass().getResource("/Fxml/datasets/Client.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return clientView;
    }

    public AnchorPane getTelephoneBankingView() {
        if (telephoneBankingView == null) {
            try {
                telephoneBankingView = new FXMLLoader(getClass().getResource("/Fxml/datasets/TelephoneBanking.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return telephoneBankingView;
    }

    public AnchorPane getAccountsView() {
        if (accountsView == null) {
            try {
                accountsView = new FXMLLoader(getClass().getResource("/Fxml/datasets/Accounts.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return accountsView;
    }

    public AnchorPane getCardsView() {
        if (cardsView == null) {
            try {
                cardsView = new FXMLLoader(getClass().getResource("/Fxml/datasets/Cards.fxml")).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return cardsView;
    }

    public void showHomeScreenWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/HomeScreen.fxml"));
        loader.setController(new HomeScreenController());

        Scene scene = null;
        try {
            scene = new Scene(loader.load());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setTitle("Automatic Dataset Creation Tool");
        stage.setScene(scene);
        stage.show();
    }

}
