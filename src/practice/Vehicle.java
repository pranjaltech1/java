package practice;

// Abstract class
abstract class Vehicle {
    int speed;
    String fuelType;

    // Constructor
    Vehicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Abstract method (to be implemented by subclasses)
    abstract void move();

    // Concrete method (common functionality for all vehicles)
    void showInfo() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}