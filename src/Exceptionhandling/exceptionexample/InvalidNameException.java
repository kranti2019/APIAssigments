package Exceptionhandling.exceptionexample;

public class InvalidNameException extends StudentException
{
InvalidNameException(String msg)
{
super(msg);
System.out.println(msg);
}
}