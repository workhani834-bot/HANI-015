public class RectangleComparison {
    public static void main(String[] args) {
        // Creating two objects
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        // Displaying details
        System.out.println("Rectangle 1: Width=" + r1.width + ", Height=" + r1.height + ", Area=" + r1.getArea());
        System.out.println("Rectangle 2: Width=" + r2.width + ", Height=" + r2.height + ", Area=" + r2.getArea());

        // Comparison
        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has a larger area.");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has a larger area.");
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}
