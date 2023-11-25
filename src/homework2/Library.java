package homework2;

import java.util.HashMap;
import java.util.Map;

public class Library {
    public static void main(String[] args) {

        Map<Integer, Book> books = new HashMap<>();
        books.put(1001, new Book("1984", "J.Oruel", 1954));
        books.put(1002, new FictionBook("The last leaf", "O.Henry", 1914, "novel"));
        books.put(1003, new NonFictionBook("Clean code", "I.Husky", 2018, "IT"));
        books.put(1004, new Book("Perfumer", "P.Suskind", 1741));
        books.put(1005, new NonFictionBook("Testing.Dot.Com", "R.Savin", 2003, "IT"));
        books.remove(1001);
        books.put(1006, new FictionBook("POCROV", "L.Dashvar", 2018, "modern UA"));

        searchTitle("Clean code",books);
    }

    public static void searchTitle(String title, Map<Integer, Book> books) {
        for (Book value : books.values()) {
            if (title.equals(value.getTitle())) {
                System.out.println(value);
            }
        }
    }

    public static void searchAuthor(String author, Map<Integer, Book> books) {
        for (Book value : books.values()) {
            if (author.equals(value.getAuthor())) {
                System.out.println(value);
            }
        }
    }

    public static void searchYear(int year, Map<Integer, Book> books) {
        for (Book value : books.values()) {
            if (year == value.getYear()) {
                System.out.println(value);
            }
        }
    }
    public static void searchGenre(String genre, Map<Integer, FictionBook> books) {
        for (FictionBook value : books.values()) {
            if (genre.equals(value.getGenre())){
                System.out.println(value);
            }
        }
    }
    public static void searchSubject(String subject, Map<Integer, Book> books){
        for (Book value : books.values()){
            if(subject.equals(value.getTitle())){
                System.out.println(value);
            }
        }
    }
}
