package m4_activity2;

public class ATMSystem {
	public static double[] accounts = {10000,15000,20000};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testCases();

	}
	
	public static void testCases() {
		System.out.println("=== ATM Withdrawal System ===");
		
		System.out.println("\n--- Test 1: valid withdrawal ---");
		processWithdrawal("1", "5000");
		
		System.out.println("\n--- Test 2: Invalid Account Index ---");
		processWithdrawal("abc", "5000");
		
		System.out.println("\n--- Test 3: Account not found---");
		processWithdrawal("10", "5000");
		
		System.out.println("\n--- Test 4: Insufficient funds ---");
		processWithdrawal("1", "20000");
		
		System.out.println("\n\n=== All test completed! ===");
		
	}
			
	public static void processWithdrawal(String accountIndex,String amountInput) {
		
		System.out.println("Account="+accountIndex + ", Account Balance="+amountInput);		

		try {
			int index = Integer.parseInt(accountIndex);
			double balance = accounts[index];
			
			System.out.printf("Current Balance: ₱ %.2f", balance);
			
			double amount = Double.parseDouble(amountInput);
			
			System.out.printf("\nWithdrawal: ₱ %.2f", amount);
			
			if (amount > balance )
				System.out.printf("\nInsufficient funds! Cannot Withdraw\n"
						+ "₱ %.2f", amount);
			else {
				accounts[index] = balance-amount;
				System.out.printf("\nNew Balance: ₱ %.2f", balance);
				System.out.println("\nWithdrawal Successful");
			}
				
		}catch (NumberFormatException e) {
			System.out.println("Error: Invalid Input\n"
					+ "Please enter valid numbers.");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Account not found\n"
					+ "Invalid Account Index");
		}
		catch(Exception e) {
			System.out.println("Transaction failed");
		}
	}

}
