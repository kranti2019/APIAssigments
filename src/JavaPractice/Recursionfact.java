package JavaPractice;

import java.util.Scanner;

public class Recursionfact {

	public static void main(String[] args) {
		 //Scanner object for capturing the user input
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter the number:");
	      //Stored the entered value in variable
	      int num = scanner.nextInt();
	      int factorial=fact(num);
	      System.out.println("Factorial of entered number is: "+factorial);

	}
	public static int fact(int n)
	{
		if(n==1)
		{
		return n;
		}
		else
		{
			return(fact(n-1)*n);
		}
		
	}

}
