package Chapter05;

public class Ex5_4 {
	public static void main(String[] args) {
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc와 num을 합쳐서 result라는 배열을 만듬
		char[] result = new char[abc.length+num.length];
		//abc의 0번지 부터의 값을 result의 0번지부터 abc.length개 복사
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);//위와 같은 원리
		System.out.println(result);
		
		//배열 abc의 값을 num에 0번째부터 abc.length개 입력
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//배열 abc의 값을 num배열의 6번째부터 3개 입력
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
