
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryListManager {
    private Map <String, Integer> groceryList = new HashMap<>();
    private Map<String, ShoppingList> shoppingLists = new HashMap<>();
    public void addItemWithQuantity(String item, int quantity) {
        if (groceryList.containsKey(item)) {
            int currentQuantity = groceryList.get(item);
            int totalQuantity = currentQuantity + quantity;
            groceryList.put(item, totalQuantity);
            System.out.println("Current quantity of " + item + ": " + totalQuantity);
        } else {
            groceryList.put(item, quantity);
            System.out.println("Current quantity of " + item + ": " + quantity);
        }
    }
    public void updateQuantity(String item, int newQuantity) {
        groceryList.put(item, newQuantity);
    }
    public void removeItem(String item) {
        groceryList.remove(item);
    }

    public void displayList() {
        System.out.println("\nGrocery List:");
        for (Map.Entry<String, Integer> entry : groceryList.entrySet()) {
            System.out.println(entry.getKey() + " - Quantity: " + entry.getValue());
        }
    }

    public void displayAvailableItems() {
        System.out.println("\nGrocery List with quantity: ");
        for (Map.Entry<String, Integer> entry: groceryList.entrySet()) {
            if(entry.getValue() > 0) {
                System.out.println(entry.getKey() + " has quantity of " + entry.getValue() + ".");
            }
        }
    }

    public boolean checkItem(String item) {
        return groceryList.containsKey(item);
    }

    public void createShoppingList(String purpose) {
        ShoppingList shoppingList = new ShoppingList(purpose);
        shoppingLists.put(purpose, shoppingList);
    }

    public void addShoppingListItem(String purpose, String item) {
        if (shoppingLists.containsKey(purpose)) {
            shoppingLists.get(purpose).addItem(item);
        } else {
            System.out.println("Shopping list for " + purpose + " does not exist.");
        }
    }

    public void removeShoppingListItem(String purpose, String item) {
        if (shoppingLists.containsKey(purpose)) {
            shoppingLists.get(purpose).removeItem(item);
        } else {
            System.out.println("Shopping list for " + purpose + " does not exist.");
        }
    }

    public void displayShoppingList(String purpose) {
        if (shoppingLists.containsKey(purpose)) {
            shoppingLists.get(purpose).displayList();
        } else {
            System.out.println("Shopping list for " + purpose + " does not exist.");
        }
    }

    public static void main(String[] args) {
        GroceryListManager manager = new GroceryListManager();

        manager.addItemWithQuantity("Apples", 5);
        manager.addItemWithQuantity("Milk", 3);
        manager.addItemWithQuantity("Bread", 2);

        manager.createShoppingList("Weekend Camping");
        manager.addShoppingListItem("Weekend Camping", "Tent");
        manager.addShoppingListItem("Weekend Camping", "Sleeping Bags");

        manager.createShoppingList("Backyard BBQ");
        manager.addShoppingListItem("Backyard BBQ", "Beef");
        manager.addShoppingListItem("Backyard BBQ", "Marshmallow");
        manager.addShoppingListItem("Backyard BBQ", "Chicken wings");


        manager.displayList();

        manager.displayAvailableItems();

        manager.displayShoppingList("Weekend Camping");
        manager.displayShoppingList("Backyard BBQ");
        manager.removeShoppingListItem("Backyard BBQ","Marshmallow");
        manager.displayShoppingList("Backyard BBQ");

    }
}