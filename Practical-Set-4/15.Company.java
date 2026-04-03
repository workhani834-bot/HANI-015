class Employee {
    String name = "John", dept = "IT";
    void displayDetails() { System.out.println("Name: " + name + ", Dept: " + dept); }
}

class Manager extends Employee {
    int teamSize = 10;
    @Override
    void displayDetails() { 
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize); 
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        e.displayDetails();
        m.displayDetails();
    }
}
