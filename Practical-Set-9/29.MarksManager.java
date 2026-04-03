import java.util.*;

public class MarksManager {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        // Adding marks
        marks.add(85);
        marks.add(92);
        marks.add(78);
        marks.add(88);
        marks.add(95);

        System.out.println("All Student Marks: " + marks);

        // Finding max and min
        int highest = Collections.max(marks);
        int lowest = Collections.min(marks);

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
    }
}
