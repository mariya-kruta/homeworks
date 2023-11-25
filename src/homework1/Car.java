package homework1;
import java.lang.Override;
public class Car extends Transport {
    int numberOfPassengers;
    String fuelType;
    public void toString (String name, int maxSpeed, int  numberOfPassengers, String fuelType) {
        super.toString(name, maxSpeed);
        System.out.println("Пасажири: "+numberOfPassengers+". Тип пального: "+fuelType+".");
    }
    @Override
    public void toString(String name, int maxSpeed){
        toString(name,maxSpeed,numberOfPassengers,fuelType);
    }
}