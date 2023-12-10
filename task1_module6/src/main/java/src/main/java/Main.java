package src.main.java;

import javafx.application.Application;
import javafx.stage.Stage;
import view.DictionaryView;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) {
        // Initialize components
        DictionaryView dictionaryView = new DictionaryView();
        // Set up the scene
        dictionaryView.start(stage);
    }
}
