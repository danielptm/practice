package exceptions;

public class ExceptionExample {
    private ExceptionExample () {}

    public static void throwCheckedException() throws ClassNotFoundException {
        throw new ClassNotFoundException("asdf");
    }

    public static void throwUncheckedException() {
        throw new IllegalArgumentException("asdf");
    }
}
