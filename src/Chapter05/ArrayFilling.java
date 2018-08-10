package Chapter05;

import java.util.Arrays;

public class ArrayFilling {
	public static void main(String[] args) {
		int arr[] = new int[6];
		Arrays.fill(arr, 100);
		
		for(int i=0,n=arr.length;i<n;i++){
			System.out.println(arr[i]);
		}
		System.out.println();
		
		Arrays.fill(arr, 3, 6, 50);
		for(int i=0,n=arr.length;i<n;i++){
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
