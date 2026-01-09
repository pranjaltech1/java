package practice;

public class Airplane extends Vehicle {
    Airplane(int speed, String fuelType) {
        super(speed, fuelType);
    }

    @Override
    void move() {
        System.out.println("Airplane flies in the sky.");
    }
}
