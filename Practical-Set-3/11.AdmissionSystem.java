import java.util.Scanner;

class College {
    String collegeName;

    public College(String collegeName) {
        this.collegeName = collegeName;
    }

    // Non-static Inner Class
    class Admission {
        String studentName;
        String course;

        public void acceptDetails() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course Name: ");
            course = sc.nextLine();
        }

        public void displayDetails() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College: " + collegeName); // Accessing outer class variable
            System.out.println("Student: " + studentName);
            System.out.println("Course: " + course);
        }
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {
        // Create Outer class object
        College myCollege = new College("Government Engineering College");

        // Create Inner class object using the Outer object
        College.Admission studentAdmission = myCollege.new Admission();

        studentAdmission.acceptDetails();
        studentAdmission.displayDetails();
    }
}
