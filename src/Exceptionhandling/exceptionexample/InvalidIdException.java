package Exceptionhandling.exceptionexample;

public class InvalidIdException extends StudentException
{
InvalidIdException(String msg)
{
super(msg);
System.out.println(msg);
}}
