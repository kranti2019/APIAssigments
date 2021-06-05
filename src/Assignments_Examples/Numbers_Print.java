/*Print all the numbers  from 1 to 50 but   
    Input  : 1 to 50 
    
    Output : when the number  divisible by 3 print abc, 
             divisible by 5 prind def, 
             divisible by 10 print abcdef.*/

package Assignments_Examples;

public class Numbers_Print {

	public static void main(String[] args)
	{
		
		
	
		System.out.println("Divided by 3: ");		
		for (int i=1; i<50; i++) 
		{
			if (i%3==0) 
			System.out.println(i +", "+"abc");	
			//System.out.print("abc");
			
		}	
		
		
		
		
				
		System.out.println("Divided by 5: ");
		for (int i=1; i<50; i++) 
		{
			if (i%5==0) System.out.println(i +", "+"def");			
		}
		
		
		
				
		System.out.println("Divided by 10: ");			
		for (int i=1; i<50; i++) 
		{
			if (i%10==0) System.out.println(i +", "+"abcdef");			
		}
		
  }
}