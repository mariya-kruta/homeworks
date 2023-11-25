package homework2;

public class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }
    public String getGenre(){
        return this.genre;
    }
    public String toString(){
        return super.toString()+"Genre: "+genre+".";
    }
}
