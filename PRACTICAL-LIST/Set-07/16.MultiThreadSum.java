/**
 * A worker class that calculates the sum of a range of numbers in a separate thread.
 */
class SumWorker extends Thread {
    private int start;
    private int end;
    private long partialSum = 0;

    public SumWorker(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += i;
        }
        System.out.println(Thread.currentThread().getName() + " finished calculating.");
    }

    public long getPartialSum() {
        return partialSum;
    }
}

public class MultiThreadSum {
    public static void main(String[] args) {
        // 1. Create two thread objects with specific ranges
        SumWorker thread1 = new SumWorker(1, 1000);
        SumWorker thread2 = new SumWorker(1001, 2000);

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        // 2. Start both threads (Parallel Execution)
        thread1.start();
        thread2.start();

        try {
            // 3. Wait for both threads to finish
            // Without join(), the main thread would print 0 as it wouldn't wait for calculation
            thread1.join();
            thread2.join();

            // 4. Combine results
            long totalSum = thread1.getPartialSum() + thread2.getPartialSum();

            System.out.println("\n--- Results ---");
            System.out.println("Partial Sum 1 (1-1000): " + thread1.getPartialSum());
            System.out.println("Partial Sum 2 (1001-2000): " + thread2.getPartialSum());
            System.out.println("Final Combined Sum: " + totalSum);

        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }
    }
}
