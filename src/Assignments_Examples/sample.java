package Assignments_Examples;

public class sample 
{

	public static void main(String[] args) 
	{
		int arr[]={4,5,6,-8,0,-6,7,-3,0,9,-5};
		System.out.println("J="+arr.length);
		int a1 = arr.length - 1;//a1=10
		int a2 = arr.length - 1;//a2=10
		while (a1 >= 0) //10>=0
		{
		  if (arr[a1] != 0) //arr[10]!=0
		  {
		    arr[a2--] = arr[a1];//
		  }
		  a1--;
		}
		while (a2 >= 0) arr[a2--] = 0;
		for (int i = 0; i < arr.length; i++) 
		 {
	            System.out.print(arr[i] + " ");
        }
	}

}
