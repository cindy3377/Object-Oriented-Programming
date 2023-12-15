module com.example.task7_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task7_1 to javafx.fxml;
    exports com.example.task7_1;
}