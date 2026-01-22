package m4_activity8;

public class InsufficientFundsException extends Exception{
	
	private String message;
	private double balance;
	private double requestedAmount;
	
	public InsufficientFundsException(String message, double balance, double requestedAmount) {
		super(message);
		this.message = message;
		this.balance = balance;
		this.requestedAmount = requestedAmount;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRequestedAmount() {
		return requestedAmount;
	}

	public void setRequestedAmount(double requestedAmount) {
		this.requestedAmount = requestedAmount;
	}
	
}
