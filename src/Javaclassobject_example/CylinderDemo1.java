package Javaclassobject_example;

public class CylinderDemo1 
{

	public static void main(String[] args)
	{
		    Cylinder cylinder1;
			cylinder1=new Cylinder();
			System.out.println("The radius of cylinder is : "+cylinder1.getRadius());
			System.out.println("The color of cylinder is : "+cylinder1.getColor());
			System.out.println("The area of cylinder is : " + cylinder1.calculateArea());
			System.out.println("The volume of cylinder is : " + cylinder1.getVolume());
			System.out.println("The height of cylinder is : " + cylinder1.getHeight());
				
			
			System.out.println("***********************************************************");
			
			Cylinder cylinder2;
			cylinder2=new Cylinder(5.6,"Yellow",6.7);
			System.out.println("The radius of cylinder is : "+cylinder2.getRadius());
			System.out.println("The color of cylinder is : "+cylinder2.getColor());
			System.out.println("The area of cylinder is : " + cylinder2.calculateArea());
			System.out.println("The volume of cylinder is : " + cylinder2.getVolume());
			System.out.println("The height of cylinder is : " + cylinder2.getHeight());
			System.out.println("***********************************************************");
			
			Cylinder cylinder3;
			cylinder3=new Cylinder(7.9,"Black",9.6);
			System.out.println("The radius of cylinder is : "+cylinder3.getRadius());
			System.out.println("The color of cylinder is : "+cylinder3.getColor());
			System.out.println("The area of cylinder is: " +cylinder3.calculateArea());
			System.out.println("The volume of cylinder is : " + cylinder3.getVolume());
			System.out.println("The height of cylinder is : " + cylinder3.getHeight() );
			System.out.println("***********************************************************");
	}
}