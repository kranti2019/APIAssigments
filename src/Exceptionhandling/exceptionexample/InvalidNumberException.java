package Exceptionhandling.exceptionexample;

public class InvalidNumberException extends InvalidIdException
{
InvalidNumberException(String msg)
{
super(msg);
System.out.println(msg);
}
}
