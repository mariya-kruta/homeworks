package homework2;


public class Main {

    public static void main(String[] args) {
        Library library1 = new Library();

        library1.addBook(1000, new Book("1984", "J.Oruel", 1954));
        library1.addBook(1001, new FictionBook("The last leaf", "O.Henry", 1914, "novel"));
        library1.addBook(1003, new Book("Perfumer", "P.Suskind", 1741));
        library1.addBook(1004, new NonFictionBook("TDCom", "R.Savin", 2003, "IT"));
        library1.addBook(1005, new FictionBook("POCROV", "L.Dashvar", 2018, "modern UA"));
        library1.addBook(1006, new Book("Hello", "Kroshka", 1954));
        library1.addBook(1008, new NonFictionBook("Math", "Merzliak", 2015, "math"));
        library1.addBook(1009, new NonFictionBook("Clean code", "I.Husky", 2018, "IT"));

        library1.searchId(1001);
        library1.searchTitle("TDCom");
        library1.searchAuthor("O.Henry");
        library1.searchYear(2018);
        library1.searchSubject("IT");
        library1.searchGenre("modern UA");

        try {
            library1.addBook(999, new NonFictionBook("Cute cat", "I.Husky", 2018, "IT"));
        } catch (InvalidValueException.InvalidIdException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.addBook(1009, new FictionBook("1984", "Author", 100, "comedy"));
        } catch (InvalidValueException.NotUniqueValueException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.addBook(1010, new Book(null, "Author", 2023));
        } catch (NullPointerException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.removeBook(1021);
        } catch (IllegalArgumentException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.searchId(1111);
        } catch (IllegalArgumentException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.searchTitle("I.Husky");
        } catch (NotFoundValueException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.searchAuthor("Morgenshtern");
        } catch (NotFoundValueException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.searchYear(1235);
        } catch (NotFoundValueException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.searchSubject("biology");
        } catch (NotFoundValueException e) {
            System.out.println("Error - " + e.getMessage());
        }

        try {
            library1.searchGenre("hentai");
        } catch (NotFoundValueException e) {
            System.out.println("Error - " + e.getMessage());
        }

    }

}
