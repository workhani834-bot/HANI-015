public class VotingApp {
    public static void checkEligibility(int age) {
        if (age < 18) {
            // Manually throwing a predefined exception
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote. Welcome!");
        }
    }

    public static void main(String[] args) {
        int[] testAges = {20, 15}; // Testing one valid and one invalid age

        for (int age : testAges) {
            System.out.println("Checking eligibility for age: " + age);
            try {
                checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught Exception: " + e.getMessage());
            } finally {
                // This always runs regardless of an error
                System.out.println("Validation process completed\n");
            }
        }
    }
}
