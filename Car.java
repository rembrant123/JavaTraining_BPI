package M2_Act6;

public class Car extends Vehicle implements Refuelable{
	
	public Car(String brand, int numberOfWheels) {
		super(brand,numberOfWheels);
        String details = "I see a car that is a " + brand + " and it has " +numberOfWheels+ " wheels.";
		System.out.println(details);
	}

	@Override
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+" is now starting the engine...");
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(this.getBrand()+" is refuelable with 13 gallons of gas.");
		
	}
}
