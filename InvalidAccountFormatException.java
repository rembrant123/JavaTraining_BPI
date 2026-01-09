package m4_activity5;

public class InvalidAccountFormatException extends RuntimeException {
	
	private String accountNumber;
	
	public InvalidAccountFormatException(String string) {
		super(string);
	}
	
}
