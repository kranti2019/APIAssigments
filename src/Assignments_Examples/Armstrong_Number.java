package Assignments_Examples;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args)
	{
		 int c=0,a,temp;  
		 int n;
		    Scanner in= new Scanner(System.in);
		 
		    System.out.println("Enter a number to check armstrong");
		    n=in.nextInt();
		    
		    temp=n;  
		    while(n>0)  
		    {  
		    a=n%10;  
		    n=n/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    System.out.println(+temp+" is armstrong number");   
		    else  
		        System.out.println(+temp+ " is not armstrong number");   
		   }  
		}  
//153 = (1*1*1)+(5*5*5)+(3*3*3)  
//where:  
//(1*1*1)=1  
//(5*5*5)=125  
//(3*3*3)=27  
//So:  
//1+125+27=153  