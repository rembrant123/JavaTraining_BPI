package M2_Act6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("Honda",4);
		putGas(car);
		startEngine(car);
		car.destroy();
		
		Truck truck = new Truck("Mitsubishi",10);
		putGas(truck);
		startEngine(truck);
		truck.destroy();
		
	}
	
	private static void putGas(Refuelable vehicle) {
		vehicle.refuel();
	}
	private static void startEngine(Vehicle vehicle) {
		vehicle.startEngine();
	}


}
