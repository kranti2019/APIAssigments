package Assignments_Examples;

import java.util.Scanner;

public class Fibonacci_Without_Recursion
{

	public static void main(String[] args)
	{
		int max;
	    Scanner in= new Scanner(System.in);
	 
	    System.out.println("Enter number upto which Fibonacci series to print:");


	    max=in.nextInt();
	 
		 int n1 = 0, n2 = 1, n3, i;
	       System.out.print(n1 + " " + n2);
	       for (i = 2; i < max; ++i) {
	          n3 = n1 + n2;
	          System.out.print(" " + n3);
	          n1 = n2;
	          n2 = n3;
	       }
	    }
	 }