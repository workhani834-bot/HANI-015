public class AverageCalculator {

    // Method with throws clause
    public static double average(String[] values) throws NullPointerException, NumberFormatException {
        if (values == null) throw new NullPointerException("Array is null");

        double sum = 0;
        for (String s : values) {
            if (s == null) throw new NullPointerException("Element is null");
            // Parsing might throw NumberFormatException
            sum += Double.parseDouble(s);
        }
        return sum / values.length;
    }

    public static void main(String[] args) {
        // Test Cases
        String[][] testInputs = {
            {"10.5", "20.0", "30.5"}, // Valid
            {"10", "abc", "30"},      // Invalid Number
            {"10", null, "30"}        // Null element
        };

        for (int i = 0; i < testInputs.length; i++) {
            System.out.println("--- Test Case " + (i + 1) + " ---");
            try {
                double avg = average(testInputs[i]);
                System.out.println("Result: Average = " + avg);
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Error: One of the inputs is not a valid number.");
            } finally {
                System.out.println("Clean-up: Average calculation attempt finished.");
            }
            System.out.println();
        }
    }
}
