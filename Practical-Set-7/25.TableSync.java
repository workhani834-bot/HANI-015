class Table {
    // Synchronized method prevents mixing of output
    synchronized void printTable(int n) {
        System.out.println("Table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        System.out.println("----------------");
    }
}

class TableThread extends Thread {
    Table t;
    int num;
    TableThread(Table t, int num) { this.t = t; this.num = num; }
    public void run() { t.printTable(num); }
}

public class TableSync {
    public static void main(String[] args) {
        Table obj = new Table(); // Shared resource
        
        TableThread t1 = new TableThread(obj, 5);
        TableThread t2 = new TableThread(obj, 7);

        t1.start();
        t2.start();
    }
}
