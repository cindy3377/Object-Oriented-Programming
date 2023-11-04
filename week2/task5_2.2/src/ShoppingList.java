import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private String purpose;
    private List<String> items;

    public ShoppingList(String purpose) {
        this.purpose = purpose;
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public void displayList() {
        System.out.println("Shopping List for " + purpose + ":");
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }
}
