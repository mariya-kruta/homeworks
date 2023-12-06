package homework2;

import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Integer id, Book book) {
            if(id<1000) try {
                throw new InvalidIdException();
            } catch (InvalidIdException e) {
                System.out.println(e.getMessage());
        }if (book.getTitle() != null || book.getAuthor() != null){
            books.put(id, book);}
        else {throw new  NullPointerException("Title or author can't be null");}
    }

    public void deleteBook(Integer id) {
        if (books.containsKey(id)){
        books.remove(id);}
        else {throw new IllegalArgumentException("The book you wanted to delete doesn't exist");
        }
    }

    public void searchId(Integer id){
        if (books.containsKey(id)){
            System.out.println(books.get(id));
        } else {throw new IllegalArgumentException("This ID doesn't exist");}
    }

    public void searchTitle(String title) {
        for (Book value : books.values()) {
            if (title.equals(value.getTitle())) {
                System.out.println(value);
            }
        }
    }

    public void searchAuthor(String author) {
        for (Book value : books.values()) {
            if (author.equals(value.getAuthor())) {
                System.out.println(value);
            }
        }
    }

    public void searchYear(int year) {
        for (Book value : books.values()) {
            if (year == value.getYear()) {
                System.out.println(value);
            }
        }
    }
   /* public void searchSubject(String subject) {
        for (Book value : books.values()) {
            if (value instanceof NonFictionBook && subject.equals(((NonFictionBook) value).getSubject())) {
                System.out.println(value);
            }
        }
    }*/
}

    /*public void searchGenre(String genre) {
        for (Book value : books.values()) {
            if (genre.equals(value.getGenre())) {
                System.out.println(value);
            }
        }
    }

    public void searchSubject(String subject) {
        for (Book book : books.values()) {
            if (books instanceof NonFictionBook){
                NonFictionBook nonFictionBook = (NonFictionBook) book;
                if (subject.equals(nonFictionBook.getSubject()));
            }
        }
}*/
