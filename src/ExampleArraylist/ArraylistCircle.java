package ExampleArraylist;

import java.util.ArrayList;
import java.util.List;

import Javaclassobject_example.Circle;

public class ArraylistCircle
{

	public static void main(String[] args)
	
	{
		List<Circle> arraylistCircles = new ArrayList();
		
		arraylistCircles.add(new Circle(3,"Red"));
		arraylistCircles.add(new Circle());
		arraylistCircles.add(new Circle(6.2,"Green"));
		arraylistCircles.add(new Circle(6.5,"Black"));
		//For loop
		for (int j = 0; j < arraylistCircles.size(); j++) 
        {
            System.out.println(" Radius of circle  is - " + arraylistCircles.get(j).getRadius()+" and Area of circle is   "+arraylistCircles.get(j).calculateArea());
        }
		
		//Enhanced for loop
		
		for (Circle c1: arraylistCircles) 
        {
			 System.out.println(c1);
            System.out.println("Area of circle is  "+  c1.calculateArea());
        }
		
		
	}

}
