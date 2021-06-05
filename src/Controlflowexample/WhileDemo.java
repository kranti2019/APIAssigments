package Controlflowexample;

public class WhileDemo {

	public static void main(String[] args) 
	{int count = 106;
    //102,103,104,105,106   102,103,104,105
    
    while (count <= 105) {  //
        if (count < 100)
               count--;//
        ++count;//              
        System.out.println("Count is: " + count);                     
    }
     
}
}