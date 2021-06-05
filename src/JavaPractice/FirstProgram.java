package JavaPractice;

import java.util.Scanner;

public class FirstProgram {
static int result;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first no.");
		  num1=sc.nextInt();
		  System.out.println("Enter second no.");
		  num2=sc.nextInt();
		  sc.close();
		  result=addition(num1,num2);
		  System.out.println("Addition is"+result);
		  result=substraction(num1,num2);
		  System.out.println("Substraction is"+result);
		  result=multiplication(num1,num2);
		  System.out.println("Multiplication"+result);
	}
	 public static int addition(int num3,int num4)
	 {
			 
		return num3+num4;
		 
	 }
	 public static int substraction(int num3,int num4)
	 {
			 
		return num3-num4;
		 
	 }
	 public static int multiplication(int num3,int num4)
	 {
		 return num3*num4;
	 }
}
