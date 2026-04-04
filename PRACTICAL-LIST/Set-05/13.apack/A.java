package apack;

public class A {
    public int pubVar = 10;
    protected int protVar = 20;
    private int privVar = 30;

    public A() {
        System.out.println("Constructor of A initialized variables.");
    }
    
    // Method to show private variable is only accessible here
    public int getPrivVar() { return privVar; }
}
