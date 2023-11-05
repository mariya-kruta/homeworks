package homework1;

public class Bicycle extends Transport {

    int numberOfGears;

    Bicycle(String name, int maxSpeed, int numberOfGears) {
        super(name, maxSpeed);
        this.numberOfGears = numberOfGears;
    }

    @Override
    public void description() {
        super.description();
        System.out.println("Кількість передач: " + numberOfGears + ".");
    }

    public void description(String str1) {
        super.description();
        System.out.println("Кількість передач: " + numberOfGears + ".");
        System.out.println(str1);
    }

}
