abstract class Vehicle {
    abstract String fuelType();
    abstract int noOfWheels();
}

class Car extends Vehicle {
    String fuelType() { return "Petrol/Diesel"; }
    int noOfWheels() { return 4; }
}

class Bike extends Vehicle {
    String fuelType() { return "Petrol"; }
    int noOfWheels() { return 2; }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        System.out.println("Car: " + c.fuelType() + ", Wheels: " + c.noOfWheels());
        System.out.println("Bike: " + b.fuelType() + ", Wheels: " + b.noOfWheels());
    }
}
