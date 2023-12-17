package homework2;

import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Integer id, Book book) {
        isValidBook(book, id);
        validateId(id);
        isUniqueValue(id, book.getTitle());
        books.put(id, book);
    }

    public void removeBook(Integer id) {
        if (books.containsKey(id)) {
            books.remove(id);
        } else {
            throw new IllegalArgumentException("Remove book with ID " + id + ": this book doesn't exist");
        }
    }

    public void searchId(Integer id) {
        if (books.containsKey(id)) {
            System.out.printf("Found id '%s' in book: %s%n", id, books.get(id));
        } else {
            throw new IllegalArgumentException("Search for a id " + id + " in library: nothing found.");
        }
    }

    public void searchTitle(String title) {
        boolean found = false;
        for (Book value : books.values()) {
            if (title.equals(value.getTitle())) {
                System.out.printf("Found title '%s' in book: %s%n", title, value);
                found = true;
            }
        }
        if (!found) throw new NotFoundValueException.NotFoundTitleException(title);
    }

    public void searchAuthor(String author) {
        boolean found = false;
        for (Book value : books.values()) {
            if (author.equals(value.getAuthor())) {
                System.out.printf("Found author '%s' in book: %s%n", author, value);
                found = true;
            }
        }
        if (!found) throw new NotFoundValueException.NotFoundAuthorException(author);
    }

    public void searchYear(int year) {
        boolean found = false;
        for (Book value : books.values()) {
            if (year == value.getYear()) {
                System.out.printf("Found year '%d' in book: %s%n", year, value);
                found = true;
            }
        }
        if (!found) throw new NotFoundValueException.NotFoundYearException(year);
    }

    public void searchSubject(String subject) {
        boolean found = false;
        for (Book book : books.values()) {
            if (book instanceof NonFictionBook nonFictionBook) {
                if (nonFictionBook.getSubject().equals(subject)) {
                    System.out.printf("Found subject '%s' in book: %s%n", subject, book);
                    found = true;
                }
            }
        }
        if (!found) throw new NotFoundValueException.NotFoundSubjectException(subject);
    }

    public void searchGenre(String genre) {
        boolean found = false;
        for (Book book : books.values()) {
            if (book instanceof FictionBook FictionBook) {
                if (FictionBook.getGenre().equals(genre)) {
                    System.out.printf("Found genre '%s' in book: %s%n", genre, book);
                    found = true;
                }
            }
        }
        if (!found) throw new NotFoundValueException.NotFoundGenreException(genre);
    }

    private void validateId(Integer id) {
        if (id < 1000) {
            throw new InvalidValueException.InvalidIdException(id);
        }
    }

    private void isUniqueValue(Integer id, String title) {
        for (Book value : books.values()) {
            if (title.equals(value.getTitle()) || books.containsKey(id))
                throw new InvalidValueException.NotUniqueValueException(id);

        }
    }

    private void isValidBook(Book book, int id) {
        if (book.getTitle() == null || book.getAuthor() == null){
            throw new NullPointerException("Add book with ID " + id + ": title or author can't be null.");
        }
    }

}
