package ph.com.bpi.helloworld.main;

public class Activity_5 {
	public static void main(String[] args) {
		
		int sum = sumTo50();
		display("Sum = " + sum);
		
		}
		public static int  sumTo50() {
			int i = 0;
			for (int j = 1; j<=50; j++) {
				i+=j;
			}
			return i;
		}
		public static void display(String displayString) {
			System.out.println(displayString);
		}
}
