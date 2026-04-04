package bpack;
import apack.A;

public class B extends A {
    public void display() {
        System.out.println("\n--- Inside Class B (Extends A) ---");
        System.out.println("Public Var: " + pubVar);   // Accessible
        System.out.println("Protected Var: " + protVar); // Accessible via inheritance
        // System.out.println(privVar); // COMPILER ERROR: Private not accessible
    }
}
