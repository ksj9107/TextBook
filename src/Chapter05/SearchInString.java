package Chapter05;

public class SearchInString {
	public static void main(String[] args) {
		String strorg = "Hello readers";
		int intIndex = strorg.indexOf("Hello");
		
		if(intIndex == -1){
			System.out.println("not found");
		}else{
			System.out.println("found Index is "+intIndex);
		}
	}
}
