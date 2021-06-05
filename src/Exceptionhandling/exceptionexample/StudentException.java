package Exceptionhandling.exceptionexample;

public class StudentException extends Exception
{
	StudentException(String msg)
	{
	super(msg);
	System.out.println(msg);
	}
}