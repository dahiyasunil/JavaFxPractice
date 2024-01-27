module com.practice.javafxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.javafx to javafx.fxml;
    exports com.practice.javafx;
    exports com.practice.javafx.controllers;
    exports com.practice.javafx.controllers.datasets;
    exports com.practice.javafx.models;
    exports com.practice.javafx.views;
}