class VolumeCalculator {
    // For Cube
    public double calculateVolume(double side) {
        return side * side * side;
    }

    // For Rectangular Cube (Box)
    public double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // For Sphere
    public double calculateVolume(double radius, boolean isSphere) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

public class VolumeTest {
    public static void main(String[] args) {
        VolumeCalculator vc = new VolumeCalculator();

        System.out.printf("Cube Volume: %.2f\n", vc.calculateVolume(5));
        System.out.printf("Rectangular Cube Volume: %.2f\n", vc.calculateVolume(5, 10, 2));
        System.out.printf("Sphere Volume: %.2f\n", vc.calculateVolume(3, true));
    }
}
