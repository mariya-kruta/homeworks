package homework1;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport("Mustang", 255);
        Car car = new Car("KIA", 100, 4, "A95");
        Bicycle bicycle = new Bicycle("Velo", 10, 4);

        transport.description();
        car.description();
        bicycle.description("ПЕРЕГРУЖЕННЫЙ МЕТОД");
        bicycle.description();
    }

}