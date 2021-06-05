package Assignments_Examples;

import java.util.Scanner;

public class Palidrome
{

	public static void main(String[] args) 
	{
		int r,sum=0,temp;    
		 
		  int n;
		    Scanner in= new Scanner(System.in);
		 
		    System.out.println("Enter number upto which Fibonacci series to print:");


		    n=in.nextInt();
		 
		    temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(+temp+" is palindrome number ");    
		  else    
		   System.out.println(+temp+" is not palindrome");    
		}  
		}  