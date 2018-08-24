package Chapter08;

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException(){}
	public BalanceInsufficientException(String msg){
		super(msg);
	}
}
