package Examplepolysubstitubality;
public class Casting {
/*
 * You can revert a substituted instance back to a subclass reference. This is called "downcasting". For example,
 
Circle c1 = new Cylinder(5.0);        // upcast is safe
Cylinder aCylinder = (Cylinder) c1;   // downcast needs the casting operator
  
 * Downcasting requires explicit type casting operator in the form of prefix 
 //operator (new-type). Downcasting is not always safe, and 
 //throws a runtime ClassCastException if the instance to be 
  * downcasted does not belong to the correct subclass. 
  * A subclass object can be substituted for its superclass, 
  * but the reverse is not true.
 
Compiler may not be able to detect error in explicit cast, 
which will be detected only at runtime. For example,
 
Circle c1 = new Circle(5);
Point p1 = new Point();
  
c1 = p1;          // compilation error: incompatible types (Point is not a subclass of Circle)
c1 = (Circle)p1;  // runtime error: java.lang.ClassCastException: Point cannot be casted to Circle
 
 */
}