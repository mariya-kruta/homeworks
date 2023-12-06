package homework2;

public class InvalidIdException extends Exception{

    public InvalidIdException(){
        super("ID can't be less than 1000");
    }
}
