
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryListManager {
    private Map <String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }
    public void displayList() {
        System.out.println("Grocery List: ");
        int i = 1;
        for (Map.Entry<String, Double> entry: groceryList.entrySet()) {
            System.out.println(i + ". " + entry.getKey() + " - €" + entry.getValue());
            i++;
        }
    }
    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }
    public double calculateTotalCost() {
        double sum = 0.0;
        for (Double cost : groceryList.values()) {
            sum += cost;
        }
        return sum;
    }
    public static void main(String [] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.addItem("Apples", 1.99);
        manager.addItem("Milk", 0.99);
        manager.addItem("Eggs", 2.69);
        manager.addItem("Bread", 2.99);

        manager.displayList();

        String itemToCheck = "Milk";
        boolean isItemInList = manager.checkItem(itemToCheck);
        System.out.println("Is \"" + itemToCheck + "\" in the list? " + isItemInList) ;

        String itemToRemove = "Milk";
        manager.removeItem(itemToRemove);
        System.out.println("\nRemoving \"" + itemToRemove + "\" from the list? " ) ;

        double sum = manager.calculateTotalCost();
        System.out.println("Total price of the grocery list: " + sum);
        manager.displayList();
    }
}

