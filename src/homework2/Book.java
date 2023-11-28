package homework2;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title.toLowerCase();
    }

    public String getAuthor() {
        return author.toLowerCase();
    }

    public int getYear() {
        return year;
    }

    public String getSubject() {
        return "is absent";
    }

    public String getGenre() {
        return "is absent";
    }

    public String toString() {
        return "Name: " + title + ". Author: " + author + ". Year: " + year + ". ";
    }
}

