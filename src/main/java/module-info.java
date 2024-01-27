module com.practice.javafxpractice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.practice.javafx to javafx.fxml;
    exports com.practice.javafx;
}