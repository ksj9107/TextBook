package Chapter05;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4};
		
		//arrays�� equals�� �̿��� 
		//arr�� arr1,2�� �迭ũ��, ��, ������ ���� ���� ���Ͽ�
		//true / false�� ��ȯ�Ѵ�.
		System.out.println("Is array 1 equal to arr 2??" + Arrays.equals(arr, arr1));
		System.out.println("Is array 1 equal to arr 3??" + Arrays.equals(arr, arr2));
	}

}
