package Chapter05;

import java.util.Arrays;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {1,2,3,4};
		
		//arrays의 equals를 이용해 
		//arr과 arr1,2의 배열크기, 값, 순서가 같은 지를 비교하여
		//true / false를 반환한다.
		System.out.println("Is array 1 equal to arr 2??" + Arrays.equals(arr, arr1));
		System.out.println("Is array 1 equal to arr 3??" + Arrays.equals(arr, arr2));
	}

}
