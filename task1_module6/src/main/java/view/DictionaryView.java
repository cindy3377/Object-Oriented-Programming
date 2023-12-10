package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import model.Dictionary;

@Component
public class DictionaryView extends Application {
    private TextField wordInput;
    private Label meaningLabel;

    public void start(Stage stage) {
        // Initialize components
        wordInput = new TextField();
        Button searchButton = new Button("Search");
        meaningLabel = new Label();
        DictionaryController controller = new DictionaryController(new Dictionary());
        // Set up the layout
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(10, 10, 10, 10));
        pane.setVgap(10);
        pane.getChildren().addAll(wordInput, searchButton, meaningLabel);

        // Set up the scene
        Scene scene = new Scene(pane, 300, 150);
        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
        searchButton.setOnAction(event -> {
            String word = wordInput.getText();
            if (!word.isEmpty()) {
                String meaning = controller.searchWord(word);
                meaningLabel.setText(meaning);
            } else {
                meaningLabel.setText("Please enter a word.");
            }
        });

    }
    public static void main(String[] args) {
        // Launch the application
        launch(DictionaryView.class);
    }

}

