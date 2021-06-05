package ExampleArraylist;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {

	public static void main(String[] args)
	{
		 List<String> arraylist4 = new ArrayList();
		 arraylist4.add("TCS");
         arraylist4.add("Infosys");
         arraylist4.add("Persistent");
         arraylist4.add("TechMahindra");
         System.out.println("Printing list through for loop:"); 
         //For loop
         for(int i=0;i<arraylist4.size();i++)  
         {  
          System.out.println(arraylist4.get(i));     
         }  
         
         //Enhanced for loop
         for (String org : arraylist4)
         {
             System.out.println(org);

	      }
         

}
}
