package homework2;

public class InvalidValueException extends RuntimeException {

    public InvalidValueException(String message) {
        super(message);
    }

    public static class InvalidIdException extends InvalidValueException {
        public InvalidIdException(int id) {
            super(String.format("Add book with ID %s: ID can't be less than 1000.", id));
        }
    }

    public static class NotUniqueValueException extends InvalidValueException {
        public NotUniqueValueException(int id) {
            super(String.format("Add book with ID %s: ID or title already exist in the library.", id));
        }
    }

}
