package Assignments_Examples;

import java.util.Scanner;

public class Factorial_Number
{

	public static void main(String[] args) 
	{
		int num,i;
		int fact = 1;
	     
	      System.out.println("Enter the number");
	      Scanner in = new Scanner(System.in);
	     
	      num = in.nextInt();
	     
	      if (num < 0)
	      {
	         System.out.println("Number should be positive.");
	      }
	      else
	      {
	         
	    	  for (i = 1; i <= num; i++)
	    	  {
	            fact = fact*i;
	     
	           
	    	  }
	    	  System.out.println("Factorial of "+num+" is  "+fact);
	      }
	   }
	}