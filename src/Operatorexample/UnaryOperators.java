package Operatorexample;

public class UnaryOperators {

	    public static void main(String[] args) {
	        int result = 3;
	        result += 51;//result = result + 51;
	        System.out.println(result);//
	        result =+ 51;
	        System.out.println(result);//
	         
	        result = 1;
	        System.out.println(result);//
	        result = +1;//
	        System.out.println(result);//
	        result--;//result = result - 1 ;
	        System.out.println(result);//
	        result++; //result = result + 1; 
	        System.out.println(result);//
	        result = -result;//-1
	        System.out.println(result);//
	        result =- result; 
	        System.out.println(result);//
	        result = 2;
	        result -= result;//0
	    
	        System.out.println("MyResult " + result);//
	 
	        boolean success = false;
	        
	        System.out.println(success);//false
	                
	        boolean failure = !success;//
	        System.out.println(!success);//
	        System.out.println(!failure);//
	        System.out.println(success);//       
	    }
	 
	}