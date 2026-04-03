class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0; // Shared by all accounts

    public BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    // Static method to update the shared rate
    public static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }

    public void displayInterest() {
        double interestEarned = (balance * interest_rate) / 100;
        System.out.println(account_holder_name + "'s Interest Earned: " + interestEarned);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 1000);
        BankAccount acc2 = new BankAccount("Bob", 2000);

        BankAccount.updateInterestRate(7.5); // Updates for everyone
        
        acc1.displayInterest();
        acc2.displayInterest();
    }
}
