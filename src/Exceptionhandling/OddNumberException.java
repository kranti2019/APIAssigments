package Exceptionhandling;
//UserdefinedExceptionDemo
import java.util.Scanner;

    class OddNumberException extends Exception  // Statement 1
    {
        OddNumberException()
        {
            super("Odd number exception");
        }
        OddNumberException(String msg)
        {
            super(msg);
        }
    }

