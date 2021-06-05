package Assignments_Examples;

import java.util.Scanner;

public class Swap_numbers
{

	public static void main(String[] args)
	{
		int num1,num2;
		System.out.println("Enter the first number");
	    Scanner i1 = new Scanner(System.in);
	    num1 = i1.nextInt();
	    System.out.println("First number is "+ "num1=  " + num1);
		
	    System.out.println("Enter the second number");
	    Scanner i2 = new Scanner(System.in);
	    num2 = i2.nextInt();
	    System.out.println("Second number is "+ "num2=  " + num2);
  
       
        num1 = num1 * num2; // num1 = 900
        
        num2 = num1 / num2; // num2 = 10 
        
        num1 = num1 / num2; // num1 = 90
  
        System.out.println("After swaping:" +" num1 = " + num1 +", num2 = " + num2); 

	}

}
