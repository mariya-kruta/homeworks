package homework2;

public class NotFoundValueException extends RuntimeException {

    public NotFoundValueException(String massege) {
        super(massege);
    }

    public static class NotFoundTitleException extends NotFoundValueException {
        public NotFoundTitleException(String title) {
            super(String.format("Search for a title '%s' in library: nothing found.", title));
        }
    }

    public static class NotFoundAuthorException extends NotFoundValueException {
        public NotFoundAuthorException(String author) {
            super(String.format("Search for a author '%s' in library: nothing found.", author));
        }
    }

    public static class NotFoundYearException extends NotFoundValueException {
        public NotFoundYearException(int year) {
            super(String.format("Search for a year '%s' in library: nothing found.", year));
        }
    }

    public static class NotFoundSubjectException extends NotFoundValueException {
        public NotFoundSubjectException(String subject) {
            super(String.format("Search for a subject '%s' in library: nothing found.", subject));
        }
    }

    public static class NotFoundGenreException extends NotFoundValueException {
        public NotFoundGenreException(String genre) {
            super(String.format("Search for a genre '%s' in library: nothing found.", genre));
        }
    }

}
