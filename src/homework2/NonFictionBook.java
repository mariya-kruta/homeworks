package homework2;

public class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    public String toString(){
        return super.toString()+"Subject: "+subject+". ";
    }
}
