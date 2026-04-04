public class CommandLineCalc {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double sum = num1 + num2;
            double product = num1 * num2;

            System.out.println("First Number: " + num1);
            System.out.println("Second Number: " + num2);
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Arguments must be numeric.");
        }
    }
}
