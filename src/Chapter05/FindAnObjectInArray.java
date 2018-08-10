package Chapter05;

import java.util.ArrayList;

public class FindAnObjectInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("common1");
		arr2.add("common2");
		arr2.add("notcommon");
		arr2.add("notcommon1");
		arr.add("common1");
		arr.add("common2");
		System.out.println("Array elements of array1"+arr);
		System.out.println("Array elements of array2"+arr2);
		
		//contains메소드는 값(실제 문자, 숫자등  cf)배열값은 안됨)
		//을 입력받아 배열이 해당 값을 포함하는지 비교하여
		//true / false를 반환한다.
		System.out.println("arr1 contains array2??"+arr.contains("common1"));
		System.out.println("arr2 contains array1??"+arr2.contains(arr));
		
		
	}

}
