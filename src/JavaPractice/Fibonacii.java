package JavaPractice;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		int previousnum=0;
		int nextnum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.");
		int maxno=sc.nextInt();
		for(int i=0;i<maxno;i++)
		{
			
			int sum=previousnum+nextnum;
			previousnum=nextnum;
			nextnum=sum;
			System.out.println(previousnum);
			
		}

	}

}
