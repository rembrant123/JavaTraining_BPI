package ph.com.bpi.activity3.main;
import java.util.*;

public class Activity_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int intA = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int intB = input.nextInt();
		
		int sum = add(intA, intB);
		System.out.println("Sum " + sum);
		
		int difference = subtract(intA, intB);
		System.out.println("Difference " + difference);
		
		int product = multiply(intA, intB);
		System.out.println("Product " + product);
		
	}
	public static int add (int a, int b) {
		return a + b;
	}
	public static int subtract (int a, int b) {
		return a - b;
	}
	public static int multiply (int a, int b) {
		return a * b;
	}

}

