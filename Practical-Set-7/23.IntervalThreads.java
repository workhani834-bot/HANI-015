class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Thread 1: " + i);
                Thread.sleep(1000); // 1 second interval
            }
        } catch (InterruptedException e) { System.out.println(e); }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 11; i <= 20; i++) {
                System.out.println("Thread 2: " + i);
                Thread.sleep(500); // 500 ms interval
            }
        } catch (InterruptedException e) { System.out.println(e); }
    }
}

public class IntervalThreads {
    public static void main(String[] args) {
        new ThreadOne().start();
        new ThreadTwo().start();
    }
}
