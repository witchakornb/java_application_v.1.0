module com.login.application {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.login.application to javafx.fxml;
    exports com.login.application;
}