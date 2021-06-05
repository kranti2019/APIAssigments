package Javaclassobject_example;

public class Circle 
{
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}

	//Instance variables
	private double radius;
	private String color;
	
	//Constructor declaration
	public Circle()
	{
		radius=8.7;
		color="Red";
	}
	
	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	
	
    //getter and setter for radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius() 
	{
		return radius;
	}

	
	//getter and setter for color
	public void setColor(String color) 
	{
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}
	
    //area method
	public double calculateArea() 
	 {
		double area;
	    return area= radius * radius * Math.PI;
	    
	 }
	 

}
