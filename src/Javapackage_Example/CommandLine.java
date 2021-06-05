package Javapackage_Example;

public class CommandLine {

	public static void main(String[] args)
	{
		int sum=0;
		 System.out.println("No. of arguments are: "+args.length);
		 int i;
		  for(i=0;i<args.length;i++)
		  {
			
			   sum = sum + Integer.parseInt(args[i]);
			  System.out.println("Sum of numbers at present is:"+sum);
		  }
		     System.out.println("Total sum is :"+sum);

	}

}
