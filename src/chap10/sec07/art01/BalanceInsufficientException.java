package chap10.sec07.art01;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
