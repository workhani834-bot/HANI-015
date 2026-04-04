import java.util.Scanner;

public class ATMDispenser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be dispensed: ");
        int amount = sc.nextInt();

        int[] denominations = {100, 50, 10, 5, 2, 1};
        System.out.println("Currency breakdown:");

        for (int notes : denominations) {
            int count = amount / notes;
            if (count > 0) {
                System.out.println(notes + " Notes : " + count);
            }
            amount = amount % notes;
        }
        sc.close();
    }
}
