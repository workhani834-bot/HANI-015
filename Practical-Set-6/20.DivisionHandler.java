public class DivisionHandler {
    public static void main(String[] args) {
        try {
            // Taking values from command-line arguments
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two numbers as command-line arguments.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
