package Abstractexamples.abtractex;
public class Square extends Shape {
    private int side;
    public Square(String color,int side) {
        super(color);
        this.side = side;
    }
 
    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return side*side;
    }
     
 
}