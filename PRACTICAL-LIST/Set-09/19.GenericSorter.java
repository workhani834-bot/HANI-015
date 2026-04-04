import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericSorter {

    /**
     * Generic method to sort a list.
     * T extends Comparable<T> ensures the elements have a compareTo method.
     */
    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        // 1. Demonstrate with Integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(12);
        numbers.add(89);
        numbers.add(7);

        System.out.println("--- Integer List ---");
        System.out.println("Before Sorting: " + numbers);
        sortList(numbers);
        System.out.println("After Sorting:  " + numbers);

        // 2. Demonstrate with Strings
        List<String> names = new ArrayList<>();
        names.add("Zebra");
        names.add("Apple");
        names.add("Mango");
        names.add("Banana");

        System.out.println("\n--- String List ---");
        System.out.println("Before Sorting: " + names);
        sortList(names);
        System.out.println("After Sorting:  " + names);
    }
}
