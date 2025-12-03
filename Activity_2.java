package ph.com.bpi.activity2.main;

import java.util.Scanner;

public class Activity_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		String myAge = input.nextLine();
		
		int ageInt = Integer.parseInt(myAge);
		System.out.println("Your age as int " + ageInt);
		
		double ageDouble = Double.parseDouble(myAge);
		System.out.println("Your age as double " + ageDouble);

	}

}
