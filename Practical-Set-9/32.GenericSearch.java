import java.util.*;

public class GenericSearch {
    // Generic method to search for an element of type T
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        // Testing with Integers (Roll Numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>(Arrays.asList(101, 102, 103));
        System.out.println("Roll 102 found? " + searchElement(rollNumbers, 102));

        // Testing with Strings (Names)
        LinkedList<String> names = new LinkedList<>(Arrays.asList("Hani", "Rahul", "Priya"));
        System.out.println("Name 'Amit' found? " + searchElement(names, "Amit"));
    }
}
