import java.util.Scanner;

public class DigitIncrementer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
        int number = sc.nextInt();
        
        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            // Add 1 and take modulus 10 to handle the 9 -> 0 case
            int newDigit = (digit + 1) % 10;
            result.append(newDigit);
        }

        System.out.println("Resulting number: " + result.toString());
        sc.close();
    }
}
