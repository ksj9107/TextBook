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
		
		//contains�޼ҵ�� ��(���� ����, ���ڵ�  cf)�迭���� �ȵ�)
		//�� �Է¹޾� �迭�� �ش� ���� �����ϴ��� ���Ͽ�
		//true / false�� ��ȯ�Ѵ�.
		System.out.println("arr1 contains array2??"+arr.contains("common1"));
		System.out.println("arr2 contains array1??"+arr2.contains(arr));
		
		
	}

}
