package Controlflowexample;

public class BreakDemo {

	public static void main(String[] args) 
	{
		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000,12, 622, 127 };
//  int[] k = new int[10];  
//     System.out.println(k[0]);
  int searchfor = 12;        
  int i;
  boolean foundIt=false;
 // int j = 0;
  for (i = 0; i < arrayOfInts.length; i++) {
      if (arrayOfInts[i] == searchfor) {
          foundIt = true;
          break;
      }           
  }        
  if (foundIt) {
      System.out.println("Found " + searchfor + " at index " + (i+1));        }
  else {
      System.out.println(searchfor + " not in the array");
  }      
   
   

}
}