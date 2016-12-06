package lab5.exceptions;

import java.io.IOException;

/**
 * @author flo
 * @since 06/12/2016.
 */
public class ExceptionExample {

    public static void main(String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();

        exceptionExample.doSomething(false);
        exceptionExample.doSomething(true);
    }

    public void doSomething(boolean shoould) {

        try {
            System.out.println("Executing try block");
            exceptionThrower(shoould);
            System.out.println("Printing something. Never Executed");
        } catch (IOException e) {
            System.out.println("just got an IO exception");
        } finally {
            System.out.println("This will always be executed.");
        }
    }

    public void exceptionThrower(boolean shouldThrow) throws IOException {
        if(shouldThrow)
            throw new IOException();
    }
}
