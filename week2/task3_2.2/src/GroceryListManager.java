
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class GroceryListManager {
    private Map <String, List<String>> groceryList = new HashMap<>();

    public void addItemWithCategory(String item, String category) {
        if (!groceryList.containsKey(category)) {
            groceryList.put(category, new ArrayList<>());
        }
        groceryList.get(category).add(item);
    }
    public void removeItem(String item) {
        for (List<String> items : groceryList.values()) {
            items.remove(item);
        }
    }
    public void displayList() {
        System.out.println("Grocery List: ");
        for (Map.Entry<String, List<String>> entry: groceryList.entrySet()) {
            System.out.println(entry.getKey() + ":");
            int i = 1;
            for (String item : entry.getValue()) {
                System.out.println(i + ". " + item);
                i++;
            }
        }
    }

    public void displayByCategory(String category) {
        if (groceryList.containsKey(category)) {
            System.out.println("Items in the " + category + " category:");
            List<String> items = groceryList.get(category);
            for (int i = 0; i < items.size(); i++) {
                System.out.println((i + 1) + ". " + items.get(i));
            }
        } else {
          System.out.println("Category not found: " + category);
        }
    }
    public boolean checkItem(String item) {
        for (List<String> items: groceryList.values()) {
            if (items.contains(item)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String [] args) {
        GroceryListManager manager = new GroceryListManager();
        manager.addItemWithCategory("Apples", "Fruits");
        manager.addItemWithCategory("Milk", "Dairy");
        manager.addItemWithCategory("Bread", "Bakery");
        manager.addItemWithCategory("Oranges", "Fruits");
        manager.addItemWithCategory("Butter", "Dairy");

        manager.displayList();

        String itemToCheck = "Milk";
        boolean isItemInList = manager.checkItem(itemToCheck);
        System.out.println("Is \"" + itemToCheck + "\" in the list? " + isItemInList) ;

        String itemToRemove = "Milk";
        manager.removeItem(itemToRemove);
        System.out.println("\nRemoving \"" + itemToRemove + "\" from the list? " ) ;

        manager.displayByCategory("Dairy");
        manager.displayByCategory("Fruits");
    }
}

