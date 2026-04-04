import java.util.ArrayList;
import java.util.List;

/**
 * A Generic class that can store items of any type T.
 */
class Box<T> {
    private List<T> items;

    public Box() {
        // Initialize the list to store items of type T
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("Box contents: " + items);
    }
}

public class GenericBoxDemo {
    public static void main(String[] args) {
        // 1. Box for Strings (Names)
        Box<String> nameBox = new Box<>();
        nameBox.addItem("Alice");
        nameBox.addItem("Bob");
        nameBox.addItem("Charlie");
        System.out.print("String ");
        nameBox.displayItems();

        // 2. Box for Integers (Roll Numbers)
        Box<Integer> rollBox = new Box<>();
        rollBox.addItem(101);
        rollBox.addItem(102);
        rollBox.addItem(103);
        System.out.print("Integer ");
        rollBox.displayItems();
    }
}
