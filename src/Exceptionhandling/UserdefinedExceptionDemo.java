package Exceptionhandling;
import java.util.Scanner;
public class UserdefinedExceptionDemo
{
	 public static void main(String[] args) 
	 {
           int num;

           Scanner Sc = new Scanner(System.in);

           System.out.print("\n\tEnter any number : ");
           num = Integer.parseInt(Sc.nextLine());

           try
           {
               if(num%2 != 0)
                   throw(new OddNumberException());    // Statement 2
               else
                   System.out.print("\n\t" + num + " is an even number");
           }
           catch(OddNumberException Ex)
           {
               System.out.print("\n\tError : " + Ex.getMessage());
           }

           System.out.print("\n\tEnd of program");
       }
   }





		

