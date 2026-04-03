class NumberPrinter extends Thread {
    int start, end;
    NumberPrinter(int s, int e) { start = s; end = e; }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n--- Thread Finished ---");
    }
}

public class SequentialThreads {
    public static void main(String[] args) throws InterruptedException {
        NumberPrinter t1 = new NumberPrinter(1, 100);
        NumberPrinter t2 = new NumberPrinter(101, 200);
        NumberPrinter t3 = new NumberPrinter(201, 300);

        t1.start();
        t1.join(); // Wait for T1 to finish

        t2.start();
        t2.join(); // Wait for T2 to finish

        t3.start();
        t3.join(); // Wait for T3 to finish
    }
}
