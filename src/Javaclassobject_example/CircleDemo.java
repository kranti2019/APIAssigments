package Javaclassobject_example;

public class CircleDemo {

	public static void main(String[] args)
	
	{
		Circle circle1;
		circle1=new Circle();
		System.out.println("The radius of circle is : "+circle1.getRadius());
		System.out.println("The color of circle is : "+circle1.getColor());
		System.out.println("The area of circle is : " + circle1.calculateArea());
		System.out.println("***********************************************************");
		
		Circle circle2;
		circle2=new Circle(5.6,"Yellow");
		System.out.println("The radius of circle is : "+circle2.getRadius());
		System.out.println("The color of circle is : "+circle2.getColor());
		System.out.println("The area of circle is: " + circle2.calculateArea());
		System.out.println("***********************************************************");
		
		Circle circle3;
		circle3=new Circle(7.9,"Black");
		System.out.println("The radius of circle is : "+circle3.getRadius());
		System.out.println("The color of circle is : "+circle3.getColor());
    	System.out.println("The area of circle is: " +circle3.calculateArea());
    	System.out.println("***********************************************************");
    	
		Circle circle4;
		circle4=new Circle(4.5,"White");
		System.out.println("The radius of circle is : "+circle4.getRadius());
		System.out.println("The color of circle is : "+circle4.getColor());
		System.out.println("The area of circle is: " + circle4.calculateArea());
		
	}

}
