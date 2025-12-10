package M2_Act6;

public abstract class Vehicle {
	
	private int numberOfWheels;
	private String brand;
	
	public Vehicle() {
		
	};
	
	public Vehicle(String brand, int numberOfWheels) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.numberOfWheels=numberOfWheels;

	}

	abstract void startEngine();
	
	 void destroy() {
		String print = "This "+this.getBrand()+" with its cute litle "+this.getNumberOfWheels()+" tires will be destroyed mwahahaha!"+"\n"+
				"BOOOM!";
		System.out.println(print);
	}
	
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}


}
