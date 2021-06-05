package JavaPractice;

import java.util.Scanner;

public class FToC {
	public static void main(String[] args) {
	double f,c;
	 Scanner sc=new Scanner(System.in);
	  System.out.println("Enter temp");
	  f=sc.nextDouble();
	  c=((f-32)*5)/9;
      System.out.println(c);
	}
}
