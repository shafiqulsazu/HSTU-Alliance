module com.example.hstuism {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hstuism to javafx.fxml;
    exports com.example.hstuism;
}