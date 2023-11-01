package homework1;
import java.lang.Override;
public class Car extends Transport {
    int numberOfPassengers;
    String fuelType;
    public void description (String name, int maxSpeed, int  numberOfPassengers, String fuelType) {
        super.description(name, maxSpeed);
        System.out.println("Пасажири: "+numberOfPassengers+". Тип пального: "+fuelType+".");
    }
    @Override
    public void description(String name, int maxSpeed){
        description(name,maxSpeed,numberOfPassengers,fuelType);
    }
}