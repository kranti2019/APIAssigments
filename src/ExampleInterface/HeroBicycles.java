package ExampleInterface;

class HeroBicycles implements InterfaceBicycle,Bell{
	 
    int cadence = 0;
    int speed = 0;
    int gear = 1;
 
   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.
    @Override
    public void changeCadence(int newValue) {
 //        cadence = newValue;
    }
 
    @Override
    public void changeGear(int newValue) {
         gear = newValue;
    }
 
    @Override
    public void speedUp(int increment) {
         speed = speed + increment;   
    }
 
    @Override
    public void applyBrakes(int decrement) {
         speed = speed - decrement;
    }
 
    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
 
    @Override
    public void ring() {
        // TODO Auto-generated method stub
        System.out.println("I am ringing");
    }

	@Override
	public String toString() {
		return "HeroBicycles [cadence=" + cadence + ", speed=" + speed + ", gear=" + gear + "]";
	}
}