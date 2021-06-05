package Operatorexample;

public class ComparisonDemo {

	public static void main(String[] args) 
	{
		int value1 = 3;
        int value2 = 7;
        if(value1 == value2){
            System.out.println("value1 == value2 - Line 9");
            value1 = 9 - value2;  //  6          
        }        
       //15,21
         
        if(value1 != value2) //
            System.out.println("value1 != value2 - Line 15");  //       
        else if(value1 > value2) {
            System.out.println("value1 > value2 - Line 17");
            value1 = value2 - 1;//
        }                
        if(value1 < value2)
            System.out.println("value1 < value2 - Line 21");    //    
        else if(value1 >= value2)
            System.out.println("value1 <= value2 - Line 23");  //
        else
            System.out.println("Whatever - Line 25");              
        }
         

	}


