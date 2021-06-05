package Controlflowexample;

public class nestedfor {

	public static void main(String[] args)
	{
		 //int N = Integer.parseInt(args[0]);
	    //int P = Integer.parseInt(args[1]);
	    int N = 5;
	    int P = 10;
	    for (int i = 1; i <= N; i++) {
	        for (int j = 1; j <= P; j++) {
	            if (i % j == 0 || j % i == 0) {
	                System.out.print("* "); 
	            }
	            else {
	                System.out.print("$ "); 
	            }
	        }
	        System.out.println(i);
	    }
	}
	}