package homework2;

public class NotFoundValueException extends RuntimeException {

    public NotFoundValueException(String massege) {
        super(massege);
    }

    public static class NotFoundTitleException extends NotFoundValueException {

        public NotFoundTitleException(String title) {
            super(String.format("Found title '%s' in book: nothing found.", title));
        }
    }

    public static class NotFoundAuthorException extends NotFoundValueException {

        public NotFoundAuthorException(String author) {
            super(String.format("Found author '%s' in book: nothing found.", author));
        }
    }

    public static class NotFoundYearException extends NotFoundValueException {

        public NotFoundYearException(int year) {
            super(String.format("Found year '%s' in book: nothing found.", year));
        }
    }

    public static class NotFoundSubjectException extends NotFoundValueException {

        public NotFoundSubjectException(String subject) {
            super(String.format("Found subject '%s' in book: nothing found.", subject));
        }
    }

    public static class NotFoundGenreException extends NotFoundValueException {

        public NotFoundGenreException(String genre) {
            super(String.format("Found genre '%s' in book: nothing found.", genre));
        }
    }
}
