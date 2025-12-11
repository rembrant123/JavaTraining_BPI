package M2_Act6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("Honda",4);
		car.refuel();
		car.startEngine();
		destroyVehicle(car);
		
		Truck truck = new Truck("Mitsubishi",10);
		truck.refuel();
		truck.startEngine();
		destroyVehicle(truck);
		
	}
	
	private static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}



}
