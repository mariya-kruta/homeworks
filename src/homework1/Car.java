package homework1;

import java.lang.Override;

public class Car extends Transport {

    int numberOfPassengers;
    String fuelType;

    public Car(String name, int maxSpeed, int numberOfPassengers, String fuelType) {
        super(name, maxSpeed);
        this.numberOfPassengers = numberOfPassengers;
        this.fuelType = fuelType;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Пасажири: " + numberOfPassengers + ". Тип пального: " + fuelType + ".");
    }

}