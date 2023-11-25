package homework1;

public class Bicycle extends Transport{
    int numberOfGears;
    public void toString(String name, int maxSpeed, int numberOfGears){
    super.toString(name, maxSpeed);
    System.out.println("Кількість передач: "+numberOfGears+".");
    }
    public void toString(String name, int maxSpeed){
        toString(name,maxSpeed,numberOfGears);
    }
}
