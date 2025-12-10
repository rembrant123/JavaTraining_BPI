package M2_Act6;

public class Truck extends Vehicle implements Refuelable {

	public Truck(String brand, int numberOfWheels) {
		super(brand,numberOfWheels);
        String details = "I see a truck that is " + brand + " and it has " +numberOfWheels+ " wheels.";
		System.out.println(details);
	}
	
	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+" is now starting the engine but takes longer...");
		
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+" is refuelable with 30 gallons of diesel.");
		
	}

}
