package Assignments_Examples;

import java.util.Scanner;

public class Even_Odd_Number
{

	public static void main(String[] args) 
	{
	int num;
    Scanner in= new Scanner(System.in);
 
    System.out.println("Enter a number to check even or odd");
    num=in.nextInt();
 
    if((num / 2)*2==num)
    {
        System.out.println(+num+" is Even number");
    }else
    {
        System.out.println(+num+" is Odd Number");
    }
 
}
}
