// Custom Exception Class
class NotSufficientFundException extends Exception {
    public NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 1000.00; // Initial balance
        System.out.println("Account opened with balance: Rs. 1000.00");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund (Current Balance: " + balance + ")");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // 1. Deposit 1000
        account.deposit(1000.00);

        // 2. Perform withdrawals
        double[] withdrawals = {400.00, 300.00, 500.00, 900.00}; // The last one will trigger the exception

        for (double amt : withdrawals) {
            try {
                account.withdraw(amt);
            } catch (NotSufficientFundException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
}
