package Chapter05;


import java.util.Arrays;



public class ArrayCompare {
	public static void main(String[] args) {
		int[] arr = {11,2,3,6,1,4,143,33,5,15,22};
		Arrays.sort(arr);
		printArray("Sorted array", arr);
		System.out.println("asc : "+Arrays.toString(arr));
		
		int index = Arrays.binarySearch(arr, 2);
		System.out.println("found 2 @"+index);
	}
	
	private static void printArray(String message, int array[]){
		System.out.println(message+": [length: "+array.length);
		for(int i=0; i<array.length;i++){
			if(i != 0){
				System.out.println(", ");
			}
			System.out.println(array[i]);
		}
		System.out.println();
	}
}
