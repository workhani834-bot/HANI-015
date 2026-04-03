public class Rectangle {
    double width;
    double height;

    // No-argument constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Parameterized constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
