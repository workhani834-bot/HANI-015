package student;

public class Student {
    public int rollNo;
    public String name;

    // Constructor to initialize student details
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student information
    public void displayStudent() {
        System.out.println("--------------------------");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
    }
}
