package practice;

public class Car extends Vehicle{
    Car(int speed, String fuelType) {
        super(speed, fuelType);
    }

    @Override
    void move() {
        System.out.println("Car moves on roads.");
    }
}
