package Javaclassobject_example;

import java.util.Scanner;

public class BicycleDemo
{

	public static void main(String[] args) 
	{
		Scanner keyboard;
        keyboard = new Scanner(System.in);
        keyboard.next();
        Bicycle bike1;
        bike1 = new Bicycle();
        bike1.setGear(20);
        System.out.println(bike1.getGear());
        Bicycle bike2;
        bike2= new Bicycle(20,70,2);
         
        bike1 = bike2;
    }
 
}