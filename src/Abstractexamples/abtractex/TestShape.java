package Abstractexamples.abtractex;
public class TestShape {
    public static void main(String[] args) {
  
        //     Shape s1 = new Rectangle("red", 4, 5);
       Rectangle s3 = new Rectangle("green",6,7);
       Triangle t1 = new Triangle("Red",4,5);
      // Shape s343 = new Shape("red");
       Square sq1 = new Square("Black",5);
       System.out.println(s3);
       s3.printArea(); //(same as below line)
       System.out.println("Area is " + s3.getArea());
        
       Shape s2 = new Triangle("blue", 4, 5);
       System.out.println(s2);
       System.out.println("Area is " + s2.getArea());
       calculateAreaAnd100(s3);
       // Cannot create instance of an abstract class
     //  Shape s3 = new Shape("green");   // Compilation Error!!
    }
     
     
 /*   public static void calculateAreaAnd100(Rectangle r1) {
        double value = r1.getArea()*100;
        System.out.println(value);
    }
     
    public static void calculateAreaAnd100(Triangle r1) {
        double value = r1.getArea()*100;
        System.out.println(value);
    }*/
     
    public static void calculateAreaAnd100(Shape r1) {
        double value = r1.getArea()*100;
        System.out.println(value);
    }
     
     
 }