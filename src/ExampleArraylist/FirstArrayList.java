package ExampleArraylist;

import java.util.ArrayList;
public class FirstArrayList {

	public static void main(String[] args) {
		//constructors
		//1.
		ArrayList l=new ArrayList();//Raw list-Default capacity is 10.
		//New capacity=(current capacity*3/2)+1
		//NC=10*3/2+1=16
		
		//2.
	
		ArrayList<Integer> l1=new ArrayList<Integer>(20);
		
		l1.add(10);
		//l1.add(2,8);
		System.out.println(l1);
		
		l.add(10);
		l.add("a");//Different types are objects are allowed.
		l.add(3.5);//Resizable array
		l.add(3.5);//Duplicates are allowed
		l.add(null);//Null insertion is possible
		//Insertion order is preserved.(In same order objects will be stored internally)
		System.out.println(l);//[10, a, 3.5, 3.5, null]Whenever we are trying to print any object reference 
		//internally tostring() called thats why we got output in square bracket.
		l.remove(2);
		System.out.println(l);//[10, a, 3.5, null]
		
		try
		{
			l.add(3,4);//[10, a, 3.5, 4, null]
			System.out.println(l);
		}
	   catch(ArrayIndexOutOfBoundsException e)
		{
		   System.out.println("Enter values within range");
		}
		finally
		{
		l.add(2,4);
	System.out.println(l);//[10, a, 4, 3.5, 4, null]
		}
		
	}

}
