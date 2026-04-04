package cpack;
import apack.A;

public class C {
    public void display() {
        A objA = new A();
        System.out.println("\n--- Inside Class C (Non-subclass) ---");
        System.out.println("Public Var: " + objA.pubVar); // Accessible
        // System.out.println(objA.protVar); // COMPILER ERROR: Not a subclass
        // System.out.println(objA.privVar); // COMPILER ERROR: Private
    }
}
