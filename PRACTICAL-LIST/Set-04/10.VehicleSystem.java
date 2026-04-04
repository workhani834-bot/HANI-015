// Base Class
class Vehicle {
    protected String vehicleNumber;
    protected String brand;
    protected String fuelType;

    public Vehicle(String vehicleNumber, String brand, String fuelType) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Subclass
class Car extends Vehicle {
    protected int numberOfSeats;
    protected boolean acAvailable;

    public Car(String vehicleNumber, String brand, String fuelType, int numberOfSeats, boolean acAvailable) {
        super(vehicleNumber, brand, fuelType); // Constructor Chaining
        this.numberOfSeats = numberOfSeats;
        this.acAvailable = acAvailable;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Calling parent method
        System.out.println("Seats: " + numberOfSeats);
        System.out.println("AC Available: " + (acAvailable ? "Yes" : "No"));
    }
}

// Grandchild Class
class ElectricCar extends Car {
    private int batteryCapacity;
    private double chargingTime;

    public ElectricCar(String vehicleNumber, String brand, int numberOfSeats, boolean acAvailable, int batteryCapacity, double chargingTime) {
        super(vehicleNumber, brand, "Electric", numberOfSeats, acAvailable);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh");
        System.out.println("Charging Time: " + chargingTime + " hours");
    }

    public void showEcoMode() {
        System.out.println("System: Eco-driving mode enabled.");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        // 1. Regular objects
        Vehicle v1 = new Vehicle("GJ-01-1234", "Toyota", "Petrol");
        Car c1 = new Car("GJ-05-5678", "Honda", "Diesel", 5, true);
        ElectricCar e1 = new ElectricCar("GJ-06-9999", "Tesla", 4, true, 75, 8.5);

        System.out.println("--- Vehicle Details ---");
        v1.displayDetails();
        System.out.println("\n--- Car Details ---");
        c1.displayDetails();
        System.out.println("\n--- Electric Car Details ---");
        e1.displayDetails();

        // 2. Upcasting
        System.out.println("\n--- Demonstrating Upcasting & Downcasting ---");
        Vehicle vRef = new ElectricCar("MH-12-0001", "Tata", 5, true, 40, 6.0);
        vRef.displayDetails(); // Calls the ElectricCar version (Polymorphism)

        // 3. Downcasting with instanceof
        if (vRef instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar) vRef; 
            ec.showEcoMode(); // Accessing subclass specific method
        }
    }
}
