package Chapter05;

public class ArrMulti {

	public static void main(String[] args) {
		int[][] arr1 = {{3,4,5},{4,5,6},{5,6,7}};
		int[][] arr2 = {{1,2,3},{2,3,4},{3,4,5}};
		int[][]	arr3 = new int[3][3];
		
		for(int i=0;i<arr1.length;i++){
			for(int j=0; j<arr1[i].length;j++){
				for(int a=0; a<arr1[i].length;a++){
					arr3[i][j] += arr1[i][a]*arr2[a][j];
				}
			}
		}
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
