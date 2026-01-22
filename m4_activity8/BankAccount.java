package m4_activity8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
	
	private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
	
	private double initialBalance = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();

		 runTest(() -> account.deposit(5000), "Deposit");
		 runTest(() -> account.withdraw(3000), "Withdrawal");
		 runTest(() -> account.deposit(-500), "Deposit");
		 runTest(() -> account.withdraw(20000), "Withdrawal");
		 runTest(() -> account.deposit(60000), "Deposit");
		
	}
	
	
	public void deposit(double amount) throws InvalidAmountException {
		
		logger.info("Deposit requested: ₱{}",amount);
		
		if ( amount <= 0) {
			logger.error("Invalid deposit amount:{}", amount);
			throw new InvalidAmountException("Deposit amount must be positive");
		}
		
		if (amount > 50000) {
			logger.warn(" Large deposit: ₱{} - requires verification",amount);
		}
		
		initialBalance +=amount;
		logger.info( "Deposit completed: ₱{}, New balance: ₱{}",amount,initialBalance);
		
	}
	
	public void withdraw(double amount) throws InvalidAmountException,InsufficientFundsException  {
		logger.info("Withdrawal requested: ₱{}",amount);
		
		if (amount < 0) {
			logger.error("Invalid deposit amount:{}", amount);
			throw new InvalidAmountException("Invalid amount");
		}
		
		if (amount > initialBalance) {
			logger.warn("Insufficient funds: ₱{} available",initialBalance);
			throw new InsufficientFundsException("Insufficient funds for withdrawal", initialBalance, amount);
		}
		
		
		initialBalance -= amount;
		logger.info("Withdrawal completed: ₱{}, New balance: ₱{}",amount,initialBalance);
	}
	
	public static void runTest(BankTestOperation operation, String operationName) {
		
		
		try {
			operation.execute();
		}catch (InvalidAmountException e) {
			logger.error("{} failed: {}",operationName, e.getMessage(),e);
	    } catch (InsufficientFundsException e) {
	    	logger.error("{} failed: {}",operationName, e.getMessage(),e);
	    }
		
		
	}
	
	

}
