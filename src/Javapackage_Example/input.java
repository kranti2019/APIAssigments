package Javapackage_Example;

import java.util.Scanner;

public class input {

	public static void main(String[] args) 
	{
		int i;
		i=10;
		Scanner keyboard;//class file provided by Java in JRE
		keyboard=new Scanner(System.in);//creating objects in Java
		int age;
		String height;
		Double weight;
		System.out.println("How old are you?");
		age=keyboard.nextInt();//age=keyboard.toUpperCase();
		
		System.out.print("How tall are you?");
		height=keyboard.next();
		
		System.out.println("How much do you weigh?");
		weight=keyboard.nextDouble();
		
		System.out.println("So you are "+ age +" yr old, "+height+" tall and  "+weight+" kg heavy");
		keyboard.close();


	}

}
