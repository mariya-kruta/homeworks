package homework2;


public class Main {

    public static void main(String[] args) {
        Library library1 = new Library();

        library1.addBook(1000, new Book("1984", "J.Oruel", 1954));
        library1.addBook(1001, new FictionBook("The last leaf", "O.Henry", 1914, "novel"));
//        library1.addBook(999, new NonFictionBook("Clean code", "I.Husky", 2018, "IT"));
        library1.addBook(1003, new Book("Perfumer", "P.Suskind", 1741));
        library1.addBook(1004, new NonFictionBook("TDCom", "R.Savin", 2003, "IT"));
        library1.addBook(1005, new FictionBook("POCROV", "L.Dashvar", 2018, "modern UA"));
        library1.addBook(1006, new Book("Hello", "Kroshka", 1954));
        library1.removeBook(1006);

        library1.searchId(1001);
        library1.searchTitle("TDCom");
        library1.searchAuthor("Kroshka");
        library1.searchYear(2018);

        library1.searchSubject("IT");

    }

}
