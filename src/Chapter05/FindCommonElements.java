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
		//retain�� ������Ʈ�迭�� �Է¹迭�� ���Ͽ�
		//���� ���� �����ϸ� �ش� ���� �迭���� ��ȯ�Ѵ�.
		arr2.retainAll(arr);
		System.out.println("Array1 after retaing common elements of array2 & array1"+arr2);
	}
}
