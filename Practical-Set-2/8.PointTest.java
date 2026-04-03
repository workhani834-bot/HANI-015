class Point {
    int x, y;

    // Default constructor
    public Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void display() {
        System.out.println("Point Coordinates: (" + x + ", " + y + ")");
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(); // Default
        Point p2 = new Point(10, 20); // Parameterized
        Point p3 = new Point(p2); // Copy

        p1.display();
        p2.display();
        p3.display();
    }
}
