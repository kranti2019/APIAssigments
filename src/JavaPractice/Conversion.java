package JavaPractice;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		int sec,min,hr;
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter seconds");
		 sec=s.nextInt();
		 System.out.println("Enter minutes");
		 min=s.nextInt();
		 min=sec/60;
		 hr=sec/3600;
		 System.out.println(hr);
		 sec=min*60;
		 System.out.println(sec);
		 
		
	        

	}

}
