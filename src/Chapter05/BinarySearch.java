package Chapter05;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {3,7,11,18,21,35,44,61,88,100,183,222,253,364,366,416};
		int h=0,l=0,m=0;
		int target = 416;
		int cnt=0;
		
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		h=arr.length-1;
		l=0;
		while(true){
			++cnt;
			m=(h+l)/2;
			if(target==arr[m]){
				break;
			}else if(target<arr[m]){
				h=m-1;
			}else{
				l=m+1;
			}		
		}
		System.out.println(target+"��"+(m+1)+"��°�� �ֽ��ϴ�.");
		System.out.println("�ݺ�Ƚ�� : "+cnt);
		
		int cnt2=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==target){
				System.out.println(target + "��"+(i+1)+"��°�� �ֽ��ϴ�.");
				break;
			}
			cnt2++;
		}
		System.out.println("�ݺ�Ƚ�� : "+cnt2);
	}
}
