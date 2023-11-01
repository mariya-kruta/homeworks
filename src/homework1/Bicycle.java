package homework1;

public class Bicycle extends Transport{
    int numberOfGears;
    public void description(String name, int maxSpeed, int numberOfGears){
    super.description(name, maxSpeed);
    System.out.println("Кількість передач: "+numberOfGears+".");
    }
    public void description(String name, int maxSpeed){
        description(name,maxSpeed,numberOfGears);
    }
}
