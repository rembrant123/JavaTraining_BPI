package ph.com.bpi.helloworld.main;
import java.util.*;

public class HelloMain {

	public static void main(String[] args) {
		
		int sum = sumTo50();
		display("Sum = " + sum);
		
		}
		public static int  sumTo50() {
			int i = 0;
			for (int j = 1; j<=50; j++) {
				i+=j;
				System.out.print(i);
			}
			return i;
		}
		public static void display(String displayString) {
			System.out.println(displayString);
		}
}
