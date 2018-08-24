package Chapter08;

public class Account {
	private long balance;
	
	public Account(){}
	
	public long getBalance(){
		return balance;
	}
	
	public void deposite(int money){
		balance += money;
	}
	
	public void widthdraw(int money)
			throws BalanceInsufficientException{
		if(balance < money){
			throw new BalanceInsufficientException("잔고부족 :"+(money-balance)+" 모자람");
		}else{
			balance -= money;
		}
	}
}
