package Chapter08;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.deposite(10000);
		System.out.println("¿¹±Ý¾×"+ac.getBalance());
		
		try{
			ac.widthdraw(12000);
		}catch(BalanceInsufficientException e){
			//String message =  e.getMessage();
			System.out.println(e.getMessage());
			System.out.println();
			e.printStackTrace();
		}
	}
}
