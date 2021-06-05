package ExampleInterface;

public class TestHero {
	 
    public static void main(String[] args) {
    HeroBicycles myBike = new HeroBicycles();
    myBike.applyBrakes(30);
    System.out.println(myBike);
    System.out.println(InterfaceBicycle.ID);
    System.out.println(Bell.ID);
    }
     
}