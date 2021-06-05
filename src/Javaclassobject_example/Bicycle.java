package Javaclassobject_example;

public class Bicycle 
{
	 @Override
	public String toString() {
		return "Bicycle [speed=" + speed + ", cadence=" + cadence + ", gear=" + gear + "]";
	}

	//Instance variables, members, fields
    private int speed;
    private int cadence;
    private int gear;
 
    //constructor method name should be same as class name
    //constructor does not have any return type or void
    public Bicycle() {//constructor
        speed = 40;
        cadence = 100;
        gear = 3;
    }
    //Method overloading in Java - Poly, constructor overload
    //public Bicycle (int speed, String startCadence, int gear)
    public Bicycle(int speed, int startCadence, int gear) {
        this.speed = speed;
        this.cadence = startCadence;
        this.gear = gear;
    }
     
    public Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        cadence = 100;
    }
     
    public void setGear(int gear) {
        if (gear <=6)
            this.gear = gear;
        else
            System.out.println("Invalid option, please provide value below 7");
    }
     
    public int getCadence() {
        return cadence;
    }
    public int getGear(){
        return gear;
    }
     
     
    public void changeSpeed(int speed) {
        if (speed < 60)
            this.speed = speed;
    }
     
    public int currentSpeed() {
        return speed;
    }
     
    private void setCadence(int cadence) {
        this.cadence = cadence;
    }
     
 
}


