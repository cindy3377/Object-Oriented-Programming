
import java.util.ArrayList;
import java.util.List;

public class GroceryListManager {
    private ArrayList <String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
        }

    public void removeItem(String item) {
        groceryList.remove(item);
        }
    public void displayList() {
        System.out.println("Grocery List: ");
        for ( int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String [] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Eggs");
        manager.addItem("Bread");

        manager.displayList();

        String itemToCheck = "Milk";
        boolean isItemInList = manager.checkItem(itemToCheck);
        System.out.println("Is \"" + itemToCheck + "\" in the list? " + isItemInList) ;

        String itemToRemove = "Milk";
        manager.removeItem(itemToRemove);
        System.out.println("\nRemoving \"" + itemToRemove + "\" from the list? " ) ;

        manager.displayList();
    }
}

