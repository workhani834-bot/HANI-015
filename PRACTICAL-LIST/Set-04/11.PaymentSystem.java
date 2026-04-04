import java.util.Scanner;

class Payment {
    public void processPayment(int amount) {
        System.out.println("Processing generic payment of Rs." + amount);
    }
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card.");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(int amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI.");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payment paymentRef; // Parent reference

        System.out.println("1. Credit Card\n2. UPI");
        System.out.print("Select Payment Mode: ");
        int choice = sc.nextInt();
        
        System.out.print("Enter Amount: ");
        int amt = sc.nextInt();

        if (choice == 1) {
            paymentRef = new CreditCardPayment(); // Upcasting
        } else if (choice == 2) {
            paymentRef = new UPIPayment(); // Upcasting
        } else {
            paymentRef = new Payment();
        }

        // Method Overriding in action
        paymentRef.processPayment(amt);
        
        sc.close();
    }
}
