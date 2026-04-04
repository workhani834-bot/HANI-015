class EMIHandler {
    // Formula: [P x R x (1+R)^N]/[(1+R)^N-1]
    // For simplicity in this logic, using basic interest-based display 
    // to demonstrate parameter overloading as requested.

    void calculateEMI(int p, int t, float r) {
        double emi = (p + (p * r * t / 100)) / (t * 12);
        System.out.printf("Home Loan EMI: %.2f\n", emi);
    }

    void calculateEMI(double p, int t, double r) {
        double emi = (p + (p * r * t / 100)) / (t * 12);
        System.out.printf("Vehicle Loan EMI: %.2f\n", emi);
    }

    void calculateEMI(int p, int t) {
        double emi = (p + (p * 0.10 * t)) / (t * 12);
        System.out.printf("Personal Loan (Fixed 10%%) EMI: %.2f\n", emi);
    }
}

public class LoanCalculator {
    public static void main(String[] args) {
        EMIHandler bank = new EMIHandler();
        bank.calculateEMI(500000, 5, 8.5f); // Home
        bank.calculateEMI(200000.0, 3, 10.5); // Vehicle
        bank.calculateEMI(50000, 1); // Personal
    }
}
