module com.example.ak {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ak to javafx.fxml;
    exports com.example.ak;
}