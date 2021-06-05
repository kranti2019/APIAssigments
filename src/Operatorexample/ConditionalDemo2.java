package Operatorexample;

public class ConditionalDemo2 {

	public static void main(String[] args) 
	{ 
		
	int value1 = 4;
    int value2 = 3;
    int result;
    //boolean evaluate = true;
    boolean someCondition = (value1 > value2);
    result = someCondition ? value1 : value2;
 /*   if (someCondition)
        result = value1;
    else
        result = value2;*/
    System.out.println(result);//
	}

}
