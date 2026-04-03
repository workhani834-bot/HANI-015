package exam;
import student.Student; // Importing the Student class from the student package

public class Result extends Student {
    private int marks1, marks2, marks3;

    // Constructor calling the super (Student) constructor
    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Method to calculate and display the full mark sheet
    public void displayResult() {
        displayStudent(); // Calls method from the Parent class (Student)
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;
        
        System.out.println("Marks   : " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Total   : " + total);
        System.out.printf("Average : %.2f\n", average);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Creating a student with marks and displaying the sheet
        Result studentResult = new Result(101, "Hani", 85, 92, 78);
        studentResult.displayResult();
    }
}
