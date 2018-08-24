package Chapter08;

public class Exception08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try{
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("예외메세지 : "+e.getMessage());
		}
		System.out.println(6);
	}

}
