package m4_activity5;

public class AccountValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountValidator account = new AccountValidator();
		
		System.out.println("=== Account Number Validation Test ===");
		
		account.testValidation("Test 1: Valid account (1234567890) ","1234567890");
		account.testValidation("Test 2: Too short (123) ","123");
		account.testValidation("Test 3: Contains letters (12345ABC90) ","12345ABC90");
		account.testValidation("Test 4: Contains space (1234 567890) ","1234 567890");
		account.testValidation("Test 5: Null value ",null);
		
		
	}
	
	public void validateAccountNumber(String accountNumber)  throws InvalidAccountNumberException{
		
		 if (accountNumber == null) {
			 throw new NullPointerException("Account number cannot be null");
		 }
		
		 for (char c : accountNumber.toCharArray()) {
			 if (!Character.isDigit(c)) {
				 throw new InvalidAccountFormatException("Account number must contain only digits");
			 }
		 }
		 
		 if (accountNumber.length() != 10) {
			 throw new InvalidAccountNumberException("Account number must be exactly 10 digits");
		 }
		 
		 System.out.println("Valid account number: " + accountNumber);
	}
	
	public void testValidation(String testName, String accountNumber) {
		
		System.out.println("\n"+testName);
		
		try {
			validateAccountNumber(accountNumber);
		}catch (InvalidAccountNumberException e) {
			System.err.println("Error: " + e.getMessage());
	    } catch (InvalidAccountFormatException e) {
	        System.err.println("Warning: " + e.getMessage());
	    }catch (NullPointerException e) {
	        System.err.println("Warning: " + e.getMessage());
	    }
		
		
	}

}
