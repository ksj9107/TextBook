package Chapter08;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = null;
		
		try{
			System.out.println(data[0]);
		}catch(NullPointerException e){
			System.out.println("널값입니다.");
		}
	}

}
