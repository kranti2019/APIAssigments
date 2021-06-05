package Assignments_Examples;

import java.util.Scanner;

public class PrimeCheck 
{
	
	public static void main(String[] args) 
	{
		int i, number, count = 0; 
		Scanner sc1;
		sc1 = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc1.nextInt();		
		
		for (i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
		    {
				count++;
		        break;
		    }	
		}
		if(count == 0 && number != 1 )
		{
			System.out.println( number + " is a Prime Number");
		}
		else
		{
		   System.out.println(number + " is Not a Prime Number");
		}
	}
}