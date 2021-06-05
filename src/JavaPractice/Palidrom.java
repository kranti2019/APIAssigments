package JavaPractice;

import java.util.Scanner;

public class Palidrom {

	public static void main(String[] args) {
		String orginal,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no./string");
		orginal=sc.nextLine();
	    for(int i=orginal.length()-1;i>=0;i--)
	    {
	    	reverse = reverse + orginal.charAt(i);
	    }
	    System.out.println("reverse is:" +reverse);
        
        if(orginal.equals(reverse)) 
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome");
	}

}
