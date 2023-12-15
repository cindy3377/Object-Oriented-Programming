module com.example.task6_4.view {
    exports view;

    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task6_4 to javafx.fxml;
    exports com.example.task6_4;
}