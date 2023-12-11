
import control.PetController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Pet;
import view.PetView;

import java.io.FileNotFoundException;

public class VirtualPetApp extends Application {
    private static final int CANVAS_SIZE = 4000;
    private static final int PET_SIZE = 5000;

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(PET_SIZE, PET_SIZE);
        Pet pet = new Pet(50, 50); // Initial pet position
        PetView petView = new PetView(canvas);
        PetController petController = new PetController(pet, petView);

        canvas.setOnMouseMoved(event -> {
            try {
                petController.handleMouseMoved(event);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        });

        StackPane root = new StackPane(canvas);
        Scene scene = new Scene(root, CANVAS_SIZE, CANVAS_SIZE);

        primaryStage.setTitle("Virtual Pet");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
