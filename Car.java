package M2_Act3;

public class Car {
	//attributes
	final String brand="Honda";
	private String model;
	private int seatCapacity;
	private String color;
	
	//default constructor
	public Car() {
		
	}
	//parameterized constructor
	public Car(String color,String model, int seatCapacity) {
		this.color=color;
		this.model=model;
		this.seatCapacity=seatCapacity;
	}
	
	//method1
	void displayCarDetails() {
		String header="=========Car Details========";
		String details = "Brand: "+brand +"\n"+
						 "Model: "+model +"\n"+
				         "Seat Capacity: "+seatCapacity+"\n"+
						 "Color: " + color;
		System.out.println(header+"\n"+details);	
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeatCapacity() {
		return seatCapacity;
	}
	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}
