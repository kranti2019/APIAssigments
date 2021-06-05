package Abstractexamples.abtractex;
//you cannot create instances from an abstract 
//class (otherwise, you will have an incomplete 
//instance with missing method's body).
/*
* To use an abstract class, you have to derive 
* a subclass from the abstract class. In the 
* derived subclass, you have to override the 
* abstract methods and provide implementation 
* to all the abstract methods. The subclass derived 
* is now complete, and can be instantiated. 
* (If a subclass does not provide implementation 
* to all the abstract methods of the superclass, 
* the subclass remains abstract.)
*/
abstract public  class Shape {
    // Private member variable
    private String color;
     
    
    public Shape (String color) {
       this.color = color;
    }
     
    public String getColor() {
     return color;
 }

 public void setColor(String color) {
     this.color = color;
 }

 @Override
    public String toString() {
       return "Shape of color=\"" + color + "\"";
    }
     
    public void printArea() {
        System.out.println(getArea());
    }
     
    // All Shape subclasses must implement a method called getArea()
     
    abstract public double getArea(); //dynamic binding
  //  abstract public void printName() {
   // }
     
     
     
    /* - Abstract class may or may not include abstract method
     * - You can declare fields that are static or non-static 
     * while in interface you can declare only static fields
     * You can have all public private and protect concrete methods
     * In interface all fields are automatically public, static, and final
     * and all methods are public
     * An abstract class can implement and interface
     */
 }