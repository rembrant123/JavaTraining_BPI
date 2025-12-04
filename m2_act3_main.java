package M2_Act3;

public class m2_act3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setModel("Civic");
		car1.setColor("White");
		car1.setSeatCapacity(4);
		
		Car car2 = new Car("Gray","BR-V",7);
		
		car1.displayCarDetails();
		car2.displayCarDetails();

	}

}
