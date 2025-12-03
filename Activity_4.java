package ph.com.bpi.activity4.main;
import java.util.*;

public class Activity_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if (age < 18) {
			System.out.println("Minor");
			}
			else if(age >= 18 && age <= 59) {
				System.out.println("Adult");
			}	
			else {
				System.out.println("Senior");
			}
		}

	}


