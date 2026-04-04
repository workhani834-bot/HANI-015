class Time {
    int hours, minutes;

    void setTime(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    void addTime(Time t1, Time t2) {
        this.minutes = t1.minutes + t2.minutes;
        this.hours = t1.hours + t2.hours + (this.minutes / 60);
        this.minutes = this.minutes % 60;
    }

    void displayTime() {
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }
}

public class TimeAdder {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        t1.setTime(2, 45);
        t2.setTime(1, 30);

        t3.addTime(t1, t2); // Stores result in t3

        System.out.print("T1: "); t1.displayTime();
        System.out.print("T2: "); t2.displayTime();
        System.out.print("Result (T3): "); t3.displayTime();
    }
}
