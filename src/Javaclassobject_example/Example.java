package Javaclassobject_example;

public class Example {

	public static void main(String[] args) {
	int a,b,c,d;
	a=b=5;
	c=10;
	String name="Paratus";
	name="Niche";
	System.out.println(name);
			
	try
	{
	d=c/(a-b);//runtime exception are unchecked
	System.out.println("Value of d is -"+ d);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Enter different values for a and b");
		//throw e;
	}
	
	
System.out.println("Value of a is -"+ a);

//System.out.println("Value of a is -"+ d);
//Thread.sleep(5000);//compiletime exception(No object creation)
	}

}
