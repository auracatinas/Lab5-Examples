package lab5.exceptions;

import lab5.pillarsOOP.Idea;

import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;

/**
 * @author flo
 * @since 06/12/2016.
 */
public class ExceptionExample {

    public static void main(String[] args){
        ExceptionExample exceptionExample = new ExceptionExample();

        try {
            exceptionExample.doSomething(false);
            exceptionExample.doSomething(true);
        } catch (PersonalException e) {
            System.out.println("Got an exception exxample");
        }

    }

    public void doSomething(boolean shoould) throws PersonalException {

        try {
            System.out.println("Executing try block");
            exceptionThrower(shoould);
            System.out.println("Printing something. Never Executed");
        } catch (IOException e) {
            System.out.println("just got an IO exception");
        } catch (PersonalException pe) {
            System.out.println("Got Personal, but throwing again");
            throw pe;
        } finally {
            System.out.println("This will always be executed.");
        }
    }

    public void exceptionThrower(boolean shouldThrow) throws IOException, PersonalException {
        if(shouldThrow)
            throw new IOException();
    }
}
