package Operatorexample;

public class PrePostDemo {

	public static void main(String[] args) 
	{
		int i = 3;              
        i++;
        System.out.println(i);//
        ++i;                    
        System.out.println(i);  //
        
        System.out.println(++i);//
         
        System.out.println(i++);//
        System.out.println(i);//
        i = 5;
        int j = ++i;
        System.out.println("Value of j is - " + j); //
        System.out.println(i);//
         
        j = i++; //
        System.out.println("Value of j is - " + j);//
                     
         
         
        i=3;            
        j=++i + i++; //     
        System.out.println("value of J is - " + j);//
        System.out.println(i);//
         
        
        System.out.println("j =" + j);//
        System.out.println("i =" + i);//

	}

}
