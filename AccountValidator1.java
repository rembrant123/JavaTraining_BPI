package m4_activity4;

public class AccountValidator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccountValidator1 account = new AccountValidator1(); 
		
		runTest(account,"1234567890");
		runTest(account,"123");
		runTest(account,null);
		

	}
	
	public void validateAccountNumber(String accountNumber) throws Exception{
		
		
		if (accountNumber == null) {
			throw new NullPointerException("Cannot be null");
		}
		
		if (accountNumber.length() != 10) {
			throw new Exception("Must be 10 digits");
		}
		
		System.out.println("Valid account: " + accountNumber);
			
	}
	
	public static void runTest(AccountValidator1 account, String accountNumber) {
		
		try {
			account.validateAccountNumber(accountNumber);
		}catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
	}

}
