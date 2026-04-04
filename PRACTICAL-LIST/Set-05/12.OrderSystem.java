import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

// Abstract class providing partial implementation
abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected final int pricePerItem = 500;

    @Override
    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        System.out.println("Order placed for: " + item + " (Qty: " + qty + ")");
    }
}

// Concrete class providing full implementation
class FinalOrder extends PartialOrder {
    private int orderId = 101;

    @Override
    public void cancelOrder(int id) {
        if (id == orderId) {
            System.out.println("Order ID " + id + " has been cancelled successfully.");
        } else {
            System.out.println("Order ID not found.");
        }
    }

    @Override
    public void generateBill() {
        int total = qty * pricePerItem;
        System.out.println("\n--- FINAL BILL ---");
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + qty);
        System.out.println("Total Amount: Rs." + total);
        System.out.println("------------------");
    }
}

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder myOrder = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.nextLine();
        System.out.print("Enter quantity: ");
        int q = sc.nextInt();

        myOrder.placeOrder(item, q);

        System.out.println("\nChoose Action: 1. Generate Bill  2. Cancel Order");
        int choice = sc.nextInt();

        if (choice == 1) {
            myOrder.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID to cancel: ");
            int id = sc.nextInt();
            myOrder.cancelOrder(id);
        }
        sc.close();
    }
}
