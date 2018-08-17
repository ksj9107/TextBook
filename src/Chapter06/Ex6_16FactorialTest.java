package Chapter06;

//재귀호출(recursive call) 예제 입니다
public class Ex6_16FactorialTest {
	static long factorial(int n){
		if(n<=0 || n>20){
			return -1;
		}
		if(n<=1){
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		long rs = 0;
		
		for(int i=1;i<n;i++){
			rs = factorial(i);
			if(rs == -1){
				System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n",n);
				break;
			}
			System.out.printf("%2d!=%20d%n",i,rs);
		}
	}

}
