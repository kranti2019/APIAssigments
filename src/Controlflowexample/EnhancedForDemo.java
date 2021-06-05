package Controlflowexample;
import java.util.ArrayList;
import java.util.List;
public class EnhancedForDemo {
	 public static void main(String[] args)
	 {  
	 int[] numbers = {5,2,3,4,0,6,7,8,9,10,11,34,56,98,7,8,6,4,2,3};//allRadius
     int k = numbers[7];//9,8,
     System.out.println("value of K is - " + k);
 //    int item = 8;
    for (int item : numbers) {//
           int area = item*item*3;
           System.out.println("Area is: " + area);
     }
     
    for (int i=0;i< 5;i++) {
        int area = numbers[i]*numbers[i]*3;
        System.out.println("Area is: " + area);
    }
     
     
     
     
     
     
     
     
     
     
     
    for (int i=0;i<numbers.length;i++) {
        int area=numbers[i]*numbers[i]*3;
       System.out.println("Area is: " + area);
    }      
     
    String[] company = {"Cognizant", "Infosys", "TCS"};

    for (String org : company){
        System.out.println(org);
    }
     
    for (int i=0;i<company.length;i++) {
        System.out.println(company[i]);
    }
     
     
     
     
     
 
     
    String[] names = {"Infosys","TCS", "TechM"};
    for(String item : names) {
         
        System.out.println(item);
    }
     
    int[][] num = new int[2][2];
    num[0][0] = 5;      
/* for 
     
    for (int[] outer:num) {
        for (int inner:outer) {
             
        }
    };*/
     
     
     
     
     
     
     
     
     int l = numbers.length;
 //    int l = 5;
     for(int i=0;i<numbers.length;i++) {
         int area1 = numbers[i]*numbers[i]*3;
         System.out.println("Count is: " + area1);
     }
      
    /* for (int i=0;i<numbers.length;i++)
     {
         System.out.println("Count is: " + numbers[i]);
          
     }*/
      
    
      
      
      
      
      
     List<String> myList = new ArrayList();
     myList.add("Selenium");
     myList.add("Training");
      
     for (String listItem:myList)
     {
         System.out.println(listItem);
     }
      
     
     
      
}
}