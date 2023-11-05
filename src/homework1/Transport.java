package homework1;

public class Transport {

    private String name;
    private int maxSpeed;

    Transport(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void description() {
        System.out.println("\nНазва: " + name + ". Макс.швидкість: " + maxSpeed + " км/год.");
    }
}
