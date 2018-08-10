package Chapter05;

import java.util.ArrayList;

public class FindCommonElements {
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add(0,"common1");
		arr2.add(1,"common2");
		arr2.add(2,"notcommon");
		arr2.add(3,"notcommon1");
		arr.add(0,"common1");
		arr.add(1,"common2");
		arr.add(2,"notcommon2");
		System.out.println("Array elements of array1 : "+arr);
		System.out.println("Array elements of array2 : "+arr2);
		//retain은 오브젝트배열과 입력배열을 비교하여
		//같은 값을 포함하면 해당 같은 배열값을 반환한다.
		arr2.retainAll(arr);
		System.out.println("Array1 after retaing common elements of array2 & array1"+arr2);
	}
}
