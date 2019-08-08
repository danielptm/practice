package exceptions;

import org.junit.Test;

public class TestExceptionExample {

    /**
     * The method being called throws ClassNotFoundException.
     * This is an example of a checked exception. Using checked exceptions is
     * good if you know that an error could be thrown and you want the programmer to
     * implement the handling of this probably because the exception can be recovered from.
     *
     * Checked exceptions extend Exception.
     *
     * @throws ClassNotFoundException
     */
    @Test
    public void testCheckedException() throws ClassNotFoundException {
        ExceptionExample.throwCheckedException();
    }

    /**
     * The method being called throws IllegalArgument exception.
     * This is an example of an unchecked exception. Using unchecked exceptions is
     * appropriate if the error cant be recovered from or it is not necessary that
     * the programmer handle these.
     *
     * Unchecked exceptions extend Runtime Exception and Error
     *
     */
    @Test
    public void testUncheckedException() {
        ExceptionExample.throwUncheckedException();
    }
}
