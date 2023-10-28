package homework1;
public class Main {
    public static void main(String[] args) {
        Велосипед Leleka = new Велосипед();
        Leleka.назва = "Лелека";
        Leleka.швидкість = 15;
        Leleka.кількість_передач = 3;
        Leleka.опис(Leleka.назва, Leleka.швидкість, Leleka.кількість_передач );

        Автомобіль Tavria = new Автомобіль();
        Tavria.назва = "Таврія";
        Tavria.швидкість = 50;
        Tavria.кількість_пасажирів = 4;
        Tavria.тип_топлива = "дизель";
        Tavria.опис(Tavria.назва, Tavria.швидкість, Tavria.тип_топлива, Tavria.кількість_пасажирів);
    }
}