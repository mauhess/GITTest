module com.example.gittest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gittest to javafx.fxml;
    exports com.example.gittest;
}