import java.util.Scanner;
public class PasswordValidator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        
        input.close();
    }

    /**
     * Rules:
     * 1. At least 8 characters.
     * 2. Only letters and digits.
     * 3. At least two digits.
     */
    public static boolean isValidPassword(String password) {
        // Rule 1: Check length
        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Rule 2: Check if it's only letters or digits
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits for Rule 3
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: Check if at least two digits exist
        return digitCount >= 2;
    }
}
