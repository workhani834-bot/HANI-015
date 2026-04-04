import java.util.Scanner;

class BankAccount {
    String accountId, accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("ID: " + accountId + " | Name: " + accountHolderName + " | Balance: " + balance);
    }
}

public class BankSearch {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[5];
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        for (int i = 0; i < 5; i++) {
            accounts[i] = new BankAccount();
            accounts[i].assignValues("ACC00" + (i + 1), names[i], 1000 * (i + 1));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account ID to search: ");
        String searchId = sc.next();

        boolean found = false;
        for (BankAccount acc : accounts) {
            if (acc.accountId.equalsIgnoreCase(searchId)) {
                System.out.println("Account Found!");
                acc.displayValues();
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Account not found.");
        sc.close();
    }
}
