package Operatorexample;

public class ArithmaticOperators 
{
	//static int result3;
    int result;
	public static void main(String[] args) 
	{
		
	   
	        System.out.println();
	        
	        int result = 1 + 2;
        // result123 = 6;
	    // result is now 3
	    // i=10;
	        System.out.println("1 + 2 = " + result );
	        int original_result = result;
	        int result1=0;
	        result1 = getValueOfI(result);
	        System.out.println("Checking this - value of result variable is - " + result);//
	        System.out.println("value of result1 variable is - " + result1);
	        System.out.println("value of orignal_result variable is - " + original_result);
	        getValueOfI(10);
	        result = getValueOfI(result);
	        System.out.println("value of result variable is - " + result);
	        System.out.println("value of result1 variable is - " + result1);
	        getValueOfI(result1);
	        result = 3;
	        result = result - 1;
	        // result is now 2
	        System.out.println(original_result + " - 1 = " + result);
	        original_result = result;
	 
	        result = result * 2;
	        // result is now 4
	        System.out.println(original_result + " * 2 = " + result);
	     //   printMyName("Ketan");
	        original_result = result;
	 
	        result = result / 2;
	        // result is now 2
	        System.out.println(original_result + " / 2 = " + result);
	        original_result = result;
	        int sum = sum(3,4);
	        result = result + 8;
	        // result is now 10
	        System.out.println(original_result + " + 8 = " + result);
	       
	        original_result = result;
	 
	        result = result % 7;
	        // result is now 3
	        System.out.println(original_result + " % 7 = " + result);
	        System.out.println();
	        //comment.Comment
	         
	    }//End of main()
	     
	    //Method declaration
	    public static int getValueOfI(int result)
	    { //result = 3    
	            System.out.println(result);
	        return result = result + 1;
	        //return "Hi";
	    }
	     
	    public String toUpperCase(String input) 
	    {
//	      result = 6;
	    //  result = 7;
	        return input;
	    //  System.out.println("Hi");
	                 
	    }
	     
	    public void printMyName(String name) 
	    {
	        //result = 10;
	        String result;
	        System.out.println(name);
	        result = "5";
	         
	    }
	     
	    public void printCompanyName() 
	    {
	        System.out.println("Niche Thyself");
	        result = 5;
	     
	    }
	     
	    public  static int sum(int i,int j) {
	    //  result = 5;
	        return i+j;
	    }
	     
	

	}


