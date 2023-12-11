package control;

import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import model.Pet;
import view.PetView;

public class PetController {
    private final Pet pet;
    private final PetView petView;

    public PetController(Pet pet, PetView petView) {
        this.pet = pet;
        this.petView = petView;
    }

    public void handleMouseMoved(MouseEvent event) {
        double targetX = event.getX();
        double targetY = event.getY();
        pet.moveTo(targetX, targetY);
        petView.drawPet(pet.getX(), pet.getY(), new Image("view/petImage.webp"));
    }
}
