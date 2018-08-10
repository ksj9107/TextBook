package Chapter05;

public class Ex5_7 {
	public static void main(String[] args) {
		int[] numArr = new int[45];
		
		for(int i=0;i<numArr.length;i++){
			numArr[i] = i+1;
			System.out.print(numArr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<1000;i++){
			int n=(int)(Math.random()*45);
			int tmp = numArr[0];
			numArr[0]=numArr[n];
			numArr[n]=tmp;
		}
		
		for(int i=0;i<6;i++){
			System.out.print(numArr[i]+" ");
		}
	}
}
