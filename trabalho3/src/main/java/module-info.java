module com.example.trabalho3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabalho3 to javafx.fxml;
    exports com.example.trabalho3;
}