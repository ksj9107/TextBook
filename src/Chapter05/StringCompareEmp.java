package Chapter05;

public class StringCompareEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello World";
		String another = "korea";
		Object obj = str;
		//오브젝트와 입력 배열(String 타입)을 비교하여
		//같으면 0을 반환
		//다르면 처음 다른 값의 아스키코드값을 비교하여 
		//코드값의 차이를 반환한다.
		//(오브젝트가 더 크면 (-)정수/ 비교할 배열이 더크면(+))
		System.out.println(str.compareTo(another));
		System.out.println(str.compareToIgnoreCase(another));
		System.out.println(str.compareTo(obj.toString()));
	}
}
