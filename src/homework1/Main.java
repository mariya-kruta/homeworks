package homework1;
public class Main {
    public static void main(String[] args) {
        Transport transport = new Transport();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        transport.description("bus", 60);
        car.description("KIA",100,4, "A95");
        bicycle.description("Velo",10,4);
    }
}