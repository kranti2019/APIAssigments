/*Write a program  
    Input : {4,5,6,-8,0,-6,7,-3,0,9,-5}, 
    Output: {0,0,4,5,6,-8,-6,7,-3,9,-5}*/


package Assignments_Examples;

public class MoveZerosToStart 
{
	
	public static void main(String[] args)
	{ 
		//array with all different integer values
        int[] a = {4,5,6,-8,0,-6,7,-3,0,9,-5};
		// int[] a = {0,5,6,-8,0,0,7,-3,0,9,-5};
        //Create one integer variable c to store the current index to insert value.
        //At first, its value should be same as the last index of the array
        int c = a.length - 1;//c=10
        //Start one for loop to scan the numbers from end to the start of the array.
        //Else, continue the loop.
        for (int i = a.length - 1; i >= 0; i--) //(i=10;10>=0;i--)
        {
         /*Check for each element, if it is 0 or not. If not, 
         insert the value to current index  and decrement the value of index.*/
            if (a[i] != 0) //a[10]!=0 i. e. -5!=0
            {
                a[c] = a[i];//a[10]=-5
                c--;
                
            }
           
        }
       
        //After all elements are scanned, fill all remaining position of the array with 0.
        while (c >= 0) //1>=0
        {
            a[c] = 0;
            c--;
        }
        //Finally, print out all elements of the array. It should contain 0 in the beginning.
        for (int i = 0; i < a.length; i++) 
		 {
	            System.out.print(a[i] + " ");
        }
   }
}

