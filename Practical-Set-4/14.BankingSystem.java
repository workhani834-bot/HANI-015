class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(int accNo, String name, double initialBal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = initialBal;
    }

    void deposit(double amount) { balance += amount; }
    void checkBalance() { System.out.println("Balance: " + balance); }
}

class SavingAccount extends BankAccount {
    void calculateInterest() { System.out.println("Interest: " + (balance * 0.04)); }
}

class FixedDepositAccount extends BankAccount {
    void maturityAmount(int years) { System.out.println("Maturity: " + (balance + (balance * 0.07 * years))); }
}
