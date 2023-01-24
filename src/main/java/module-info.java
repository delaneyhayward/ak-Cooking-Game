module com.example.ak {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.ak to javafx.fxml;
    exports com.example.ak;
}