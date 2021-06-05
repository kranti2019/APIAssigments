/*Write a java program to reverse any number:*/

package Assignments_Examples;

import java.util.Scanner;

public class Reverse_Number 
{
	public static void main(String[] args)
	{
		
		int number, reverse = 0,rem=0;
		Scanner input;
		System.out.println("Enter the number");
		input=new Scanner(System.in);
		number=input.nextInt();
		while(number!=0)
		{
			
		//modulus operator to strip off the last digit
			
			rem=number%10;
			
			
		//create the reversed number
			reverse=reverse*10;
			reverse=reverse+rem;
			number=number/10;
			
			
		}
		
		//output the reversed number
		
		System.out.println("Reverse number is " + reverse);
	 }
		
		

}


