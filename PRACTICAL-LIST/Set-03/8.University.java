/**
 * Program to demonstrate static members, static blocks, 
 * and instance initialization blocks.
 */
public class University {
    // Static data members
    private static int totalStudents = 0;
    private static String universityName;

    // Static block: Executed once when the class is first loaded
    static {
        universityName = "Global Technical University";
        System.out.println("1. Static Block: University Name initialized to: " + universityName);
    }

    // Instance block: Executed every time an object is created, before the constructor
    {
        totalStudents++;
        System.out.println("2. Instance Block: New student object being created. Current count: " + totalStudents);
    }

    // Constructor
    public University() {
        System.out.println("3. Constructor: Object creation complete.");
    }

    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void main(String[] args) {
        System.out.println("--- Starting Execution ---");
        
        University s1 = new University();
        System.out.println("--------------------------");
        University s2 = new University();
        
        System.out.println("\nFinal Result:");
        System.out.println("Total Students in " + universityName + ": " + University.getTotalStudents());
    }
}
