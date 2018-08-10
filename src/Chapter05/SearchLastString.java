package Chapter05;

public class SearchLastString {
	public static void main(String[] args) {
		String strOrig = "Helo world, Helo Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");
		
		if(lastIndex == -1){
			System.out.println("Hello not found");
		}else{
			System.out.println("Last occurance of Hello is at"+lastIndex);
		}
	}
}
