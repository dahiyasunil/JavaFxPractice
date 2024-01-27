package com.practice.javafx;

import com.practice.javafx.models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) {
        Model.getInstance().getViewFactory().showHomeScreenWindow();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
