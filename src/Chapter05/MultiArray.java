package Chapter05;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
							 {100,100,100}
							,{20,20,20}
							,{30,30,30}
							,{40,40,40}
							,{50,50,50}
						};
		int korsum=0,engsum=0,mathsum=0;
		System.out.printf("번호     국어      영어     수학      총점     평균%n");
		for(int i=0;i<arr.length;i++){
			int Psum = 0;
			float Pavg=0;
			korsum += arr[i][0];
			engsum += arr[i][1];
			mathsum += arr[i][2];
			System.out.printf("%3d",(i+1));
			for(int j=0;j<arr[i].length;j++){
				Psum += arr[i][j];
				System.out.printf("%5d",arr[i][j]);
			}
			Pavg = Psum/(float)arr[i].length;
			System.out.printf("%5d %5.1f%n",Psum,Pavg);
		}
		System.out.printf("총점   국어:%d/ 영어:%d/ 수학:%d",korsum,engsum,mathsum);
	}
}
