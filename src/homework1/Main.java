package homework1;
public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        transport.toString("bus", 60);
        car.toString("KIA",100,4, "A95");
        bicycle.toString("Velo",10,4);
    }
}