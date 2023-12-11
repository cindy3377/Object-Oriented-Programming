package control;

import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import model.Pet;
import view.PetView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PetController {
    private final Pet pet;
    private final PetView petView;

    public PetController(Pet pet, PetView petView) {
        this.pet = pet;
        this.petView = petView;
    }

    public void handleMouseMoved(MouseEvent event) throws FileNotFoundException {
        double targetX = event.getX();
        double targetY = event.getY();
        pet.moveTo(targetX, targetY);
        Image image = new Image(new FileInputStream("/Users/trang/Desktop/Object-Oriented-Programming/task6_3/petImage.png"));
        petView.drawPet(pet.getX(), pet.getY(), image);
        System.out.println("Pet Position: (" + pet.getX() + ", " + pet.getY() + ")");
    }
}
