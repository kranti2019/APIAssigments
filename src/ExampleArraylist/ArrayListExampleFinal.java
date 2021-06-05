package ExampleArraylist;
//Different types of objects are allowed.
//Resizable array
//Duplicates are allowed
//Null insertion is possible
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Javaclassobject_example.Bicycle;
import Javaclassobject_example.Circle;

public class ArrayListExampleFinal {

	public static void main(String[] args) {
//      ArrayList Creation
      //WebDriver driver = new FirefoxDriver();
      List firstList = new ArrayList(); //raw list, Object
      List<Integer> myIntegers = new ArrayList();
      List<String> arraylistB = new ArrayList(); //list using generics //type safety
      List<Bicycle> arrayOfBicycles = new ArrayList();
      List<Circle> arrayOfCircles = new ArrayList();
      
      //        Adding elements to the ArrayList
      /*
       * 
       An ArrayList capacity is the size of the array used to store the 
       elements in the list.As elements are added to an ArrayList, its 
       capacity grows automatically.It is an Array based implementation
       where elements of the List can be accessed directly through
       get() method.
       A[2], firstList.get(2), firsList.size(), A.length
       */
      
      //Raw list
      for (int i = 0; i < 5; i++)
      {
      //  firstList.add(new Integer(i));//wrapper class for int 
          firstList.add(i);//autoboxing & autounboxing
          //Autoboxing is the automatic conversion that the Java compiler makes between
          //the primitive types and their corresponding object wrapper classes.
      }
      int k = (int)firstList.get(3);
      System.out.println(firstList);
      System.out.println(firstList.get(3));
      
//      
//      for (int i = 0; i < 5; i++)
//      {
//      
//    	  myIntegers.add(i);
//      }
//      
//      int j = myIntegers.get(3) + 5;//Arrayindex exception
      
      
      
      firstList.add(new Circle(3,"Red"));
      System.out.println(firstList);
       firstList.add(new Bicycle(3,4,5));
       System.out.println(firstList);
      Bicycle bike111 = new Bicycle(4,5,2);
       firstList.add(bike111);
       System.out.println(firstList);
       //Circle c3 = (Circle)firstList.get(4);//Error Integer cannot be cast to Javaclassobject_example.Circle
       Circle c3 = (Circle)firstList.get(5);
       System.out.println(c3);
     // Bicycle I3 = (Bicycle)firstList.get(5);//Error Javaclassobject_example.Circle cannot be cast to Javaclassobject_example.Bicycle
       Bicycle I3 = (Bicycle)firstList.get(6);
       System.out.println(I3);
       
       //firstList.add(firstList.get(4));//?
       
       
    
           //Integer b2 = (Integer)firstList.get(5);//Error Javaclassobject_example.Circle cannot be cast to java.lang.Integer
          //System.out.println(b2);
          int z1 = (Integer)firstList.get(4);
          System.out.println(z1);//4
 //////////////////////////////////////////////////////////////////////         
            
         System.out.println(myIntegers);//output-[]
                       
         arraylistB.add("beginner");
         arraylistB.add("java");
         arraylistB.add("tutorial");
         arraylistB.add("make");
         arraylistB.add("java");
         arraylistB.add("very");
         arraylistB.add("easy");
         
         System.out.println(arraylistB);
                 
         String tutorialValue = arraylistB.get(2); //Object of string class
         //[beginner, java, tutorial, make, java, very, easy]
         System.out.println(tutorialValue);//tutorial
         
         //Bicycle bikexrw = arraylistB.get(2); //Object
         //Type mismatch: cannot convert from String to Bicycle
         
         //arraylistB.add(new Integer(25));
         //The method add(String) in the type List<String> is not applicable for the arguments (Integer)

         Bicycle bike1 = new Bicycle(10,10,10);
         System.out.println(bike1);//Bicycle [speed=10, cadence=10, gear=10]

         
         //arraylistB.add(bike1);
         //The method add(String) in the type List<String> is not applicable for the arguments (Bicycle)
       
         //arraylistB.add(new Bicycle(10,10,10));
         //The method add(String) in the type List<String> is not applicable for the arguments (Bicycle)
          Bicycle b1 = new Bicycle(10,10,10);
          System.out.println(b1);//Bicycle [speed=10, cadence=10, gear=10]
          System.out.println(b1.getCadence());//10
          
          arrayOfBicycles.add(b1); //adding bicycle type object to bicycle arraylist.
          System.out.println("Bicycle object"+  b1);//Bicycle [speed=10, cadence=10, gear=10]
	       
          arrayOfBicycles.add(new Bicycle(4,3,6));
          arrayOfBicycles.add(new Bicycle(1,2,6));
          arrayOfBicycles.add(new Bicycle(10,9,8));
          arrayOfBicycles.add(new Bicycle(1,6));
          System.out.println("Bicycle object"+  arrayOfBicycles);
                    
          int ket = arrayOfBicycles.get(2).getCadence();
          System.out.println("Cadence=" +ket);
          
          //Bicycle bike1 = new Bicycle(3,4,5);//Duplicate local variable bike1
          Bicycle bike2 = new Bicycle(3,4,5);
          System.out.println(bike2.getCadence());//4
          
         Bicycle keto = arrayOfBicycles.get(2);
         System.out.println(keto);
          int ket1 = keto.getCadence();//Bicycle [speed=1, cadence=2, gear=6]
          System.out.println(ket1);//2
          arrayOfBicycles.get(2).setGear(20);
          
          System.out.println(keto);
          //Invalid option, please provide value below 7
          //Bicycle [speed=1, cadence=2, gear=6]
////////////////////////////////////////////////////////////////////////////////////////////
          arrayOfCircles.add(new Circle(2,"Black"));
          arrayOfCircles.add(new Circle());
          arrayOfCircles.add(new Circle(16,"Red"));
          arrayOfCircles.add(new Circle(8,"Yellow"));
          System.out.println(arrayOfCircles);
          
          double radius = arrayOfCircles.get(2).getRadius();
          System.out.println(radius);//16.0
          String color = arrayOfCircles.get(3).getColor();
          System.out.println(color);//Yellow
          System.out.println();
          System.out.print("ArrayList firstList --> ");
          
          
          //////////////////////////////////////////////////
          //To print arraylist
          for (int j = 0; j < firstList.size(); j++)
          {//5
             System.out.print(firstList.get(j) + " , ");//assignment is remove last comma which comes in the output
             // System.out.print(firstList.get(j));
              //01234Circle [radius=3.0, color=Red]Bicycle [speed=3, cadence=4, gear=5]Bicycle [speed=4, cadence=5, gear=2]
          
          }
          
          
          // 0 , 1 , 2 , 3 , 4 , Circle [radius=3.0, color=Red] , Bicycle [speed=3, cadence=4, gear=5] , 
          //Bicycle [speed=4, cadence=5, gear=2] , 
          
          for(Object oneObjectAtATime:firstList ) {
              System.out.println(oneObjectAtATime + " , ");
          }
          System.out.println();
          //ArrayList firstList --> 0 , 
//          1 , 
//          2 , 
//          3 , 
//          4 , 
//          Circle [radius=3.0, color=Red] , 
//          Bicycle [speed=3, cadence=4, gear=5] , 
//          Bicycle [speed=4, cadence=5, gear=2] , 

          for (int j = 0; j < arrayOfBicycles.size(); j++) 
          {
              System.out.println("Cadence of Bicycle " + j + " is - " + arrayOfBicycles.get(j).getCadence() + " , ");
          }
          //Cadence of Bicycle 0 is - 10 , 
//          Cadence of Bicycle 1 is - 3 , 
//          Cadence of Bicycle 2 is - 2 , 
//          Cadence of Bicycle 3 is - 9 , 
//          Cadence of Bicycle 4 is - 100 
//           
          for (Bicycle oneBicycleAtATime: arrayOfBicycles) 
          {
              System.out.println("CurrentSpeed  of Bicycle is - " + oneBicycleAtATime.currentSpeed() );
          }
          
//          CuurentSpeed  of Bicycle is - 10
//          CuurentSpeed  of Bicycle is - 4
//          CuurentSpeed  of Bicycle is - 1
//          CuurentSpeed  of Bicycle is - 10
//          CuurentSpeed  of Bicycle is - 1

                        
           
          for (String oneStringAtATime : arraylistB) 
          {
              System.out.println(oneStringAtATime);
          }
//          beginner
//          java
//          tutorial
//          make
//          java
//          very
//          easy
           
          for (Bicycle bike: arrayOfBicycles) 
          {
              System.out.println(bike.getCadence());
          }
           
          System.out.println();
//          10
//          3
//          2
//          9
//          100
           
          int index = arraylistB.indexOf("java");//1
          System.out.println("'java' was found at : " + index); //1
          
          int lastIndex = arraylistB.lastIndexOf("java");//4
          System.out.println("'java' was found at : " + lastIndex
                  + " from the last");//4
          System.out.println();
          
 ////////////////////////////////////////////////////////////////////////
          //        Getting the subList from the original List
          
          System.out.println(firstList);
          List subList1 = firstList.subList(3, firstList.size());
          System.out.println("New Sub-List(firstList) from index 3 to "
                  + firstList.size() + ": " + subList1);
          System.out.println();
          //New Sub-List(firstList) from index 3 to 8: [3, 4, Circle [radius=3.0, color=Red], Bicycle [speed=3, cadence=4, gear=5], Bicycle [speed=4, cadence=5, gear=2]]
/////////////////////////////////////////////////////////////////////////////////
//        Sort an ArrayList
        System.out.print("Sorted ArrayList firstList --> ");
        //Collections.sort(firstList);
        //Sorted ArrayList firstList --> Exception in thread "main" java.lang.ClassCastException: Javaclassobject_example.Circle cannot be cast to java.lang.Comparable
        Collections.sort(arraylistB);
        System.out.print(arraylistB);
        //Sorted ArrayList firstList --> [beginner, easy, java, java, make, tutorial, very]
        
        System.out.println();
      //Collections.sort(arrayOfCircles);//Typesacting error
        
       // Collections.sort(arrayOfBicycles);//Typesacting error
       
 ////////////////////////////////////////////////////////////////////////////////
//      Reversing an ArrayList
        System.out.print("Reversed ArrayList firstList --> ");
        Collections.reverse(firstList);
        System.out.println(firstList);
        System.out.println();

        System.out.print("Reversed ArrayList arraylistB --> ");
        Collections.reverse(arraylistB);
        System.out.println(arraylistB);
        System.out.println();

        System.out.print("Reversed ArrayList Circlearray --> ");
        Collections.reverse(arrayOfCircles);
        System.out.println(arrayOfCircles);
        System.out.println();
   
        System.out.print("Reversed ArrayList Bicyclearray --> ");
        Collections.reverse(arrayOfBicycles);
        System.out.println(arrayOfBicycles);
        System.out.println();
        
//        Reversed ArrayList firstList --> [Bicycle [speed=4, cadence=5, gear=2], Bicycle [speed=3, cadence=4, gear=5], Circle [radius=3.0, color=Red], 4, 3, 2, 1, 0]
//
//        Reversed ArrayList arraylistB --> [very, tutorial, make, java, java, easy, beginner]
//
//        Reversed ArrayList Circlearray --> [Circle [radius=8.0, color=Yellow], Circle [radius=16.0, color=Red], Circle [radius=8.7, color=Red], Circle [radius=2.0, color=Black]]
//
//        Reversed ArrayList Bicyclearray --> [Bicycle [speed=1, cadence=100, gear=6], Bicycle [speed=10, cadence=9, gear=8], Bicycle [speed=1, cadence=2, gear=6], Bicycle [speed=4, cadence=3, gear=6], Bicycle [speed=10, cadence=10, gear=10]]

//////////////////////////////////////////////////////////////////////////////////////////
//      Checking emptyness of an ArrayList
        System.out.println("Is firstList empty?   "
                + firstList.isEmpty());
        System.out.println();
        
        System.out.println("Is arraylistB empty?   "
                + arraylistB.isEmpty());
        System.out.println();
          
        System.out.println("Is arrayOfCircles empty?   "
                + arrayOfCircles.isEmpty());
        System.out.println();
        
        System.out.println("Is arrayOfBicycles empty?   "
                + arrayOfBicycles.isEmpty());
        System.out.println();
        
//        Is firstList empty?   false
//
//        Is arraylistB empty?   false
//
//        Is arrayOfCircles empty?   false
//
//        Is arrayOfBicycles empty?   false
        
///////////////////////////////////////////////////////////////////////////////////////////

//      Checking for Equality of ArrayLists
       // ArrayList arraylisC = firstList;//Typecasting error
   
      ArrayList arraylistC = new ArrayList(firstList);                                //create a copy of arraylist
      System.out.println("firstList.equals(arraylistC)? "
              + firstList.equals(arraylistC));
      System.out.println();
      
      
      ArrayList arraylist1 = new ArrayList(arraylistB);                                //create a copy of arraylist
      System.out.println("arraylistB.equals(arraylist1)? "
              + arraylistB.equals(arraylist1));
      System.out.println();
      
      //firstList.equals(arraylistC)? true

      // arraylistB.equals(arraylist1)? true
      
  //////////////////////////////////////////////////////////////////////////////////////////
//    Converting an ArrayList to an Array
    Object[] array = firstList.toArray();
    for (int i = 0; i < array.length; i++) {
        System.out.println("Array Element [" + i + "] = " + array[i]);
    }
    System.out.println();
//    Array Element [0] = Bicycle [speed=4, cadence=5, gear=2]
//    Array Element [1] = Bicycle [speed=3, cadence=4, gear=5]
//    		Array Element [2] = Circle [radius=3.0, color=Red]
//    		Array Element [3] = 4
//    		Array Element [4] = 3
//    		Array Element [5] = 2
//    		Array Element [6] = 1
//    		Array Element [7] = 0
////////////////////////////////////////////////////////////////////////////////////////////
//  Clearing ArrayList Elements
  firstList.clear();
  System.out.println("firstList after clearing  : " + firstList);
  System.out.println();
  //firstList after clearing  : []

  List<String> stringData = new ArrayList();
  
  
  List<Circle> myCircles = new ArrayList();
   
  myCircles.add(new Circle(4,"Red"));
  myCircles.add(new Circle(6,"Black"));
  myCircles.add(new Circle(2,"White"));
   
  for (Circle oneCircle:myCircles)
  {
      System.out.println(oneCircle.calculateArea());
  }       
//  50.26548245743669
//  113.09733552923255
//  12.566370614359172

	}
}