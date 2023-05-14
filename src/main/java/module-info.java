module com.example.lab1414 {
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.lab1414 to javafx.fxml;
    exports com.example.lab1414;

    opens com.example.lab1414.model to javafx.fxml;
    exports com.example.lab1414.model;
}