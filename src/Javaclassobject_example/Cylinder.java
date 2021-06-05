package Javaclassobject_example;

public class Cylinder extends Circle
{
	private double height;
	public Cylinder()
	{
		super();
		this.height=2.8;
		
	}
	
	public Cylinder(double radius,String color,double height)
	{
		super(radius, color);
		this.height=height;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	@Override
	public double calculateArea() 
	 {
		double area;
		//2πrh+2πr2
	    //return area=2*Math.PI * getRadius() * height + 2  * Math.PI * getRadius()* getRadius();
	    return area=2*Math.PI * getRadius() * height + 2  * super.calculateArea();
	    
	    
	 }
	public double getVolume()
	{
		double volume;
		return volume=super.calculateArea()*height;
		
		
	}
	 
	
	
	

}
