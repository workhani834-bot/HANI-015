class BillingSystem {
    // Regular Customer
    void generateBill(int total) {
        System.out.println("Regular Bill: Rs. " + total);
    }

    // Privileged Customer (Flat Discount)
    void generateBill(int total, int discount) {
        System.out.println("Privileged Bill: Rs. " + (total - discount));
    }

    // Festive Offer (Percentage Discount)
    void generateBill(int total, double discountPercent) {
        double finalAmt = total - (total * (discountPercent / 100));
        System.out.println("Festive Bill: Rs. " + finalAmt);
    }
}

public class BillGenerator {
    public static void main(String[] args) {
        BillingSystem mall = new BillingSystem();
        mall.generateBill(1000);             // Regular
        mall.generateBill(1000, 100);        // Privileged
        mall.generateBill(1000, 15.0);       // Festive
    }
}
