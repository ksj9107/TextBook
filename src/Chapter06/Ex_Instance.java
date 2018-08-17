package Chapter06;

class t{
	int inst_a=100; // 인스턴스 변수
	static int class_a=100; // 클래스 변수
	
	//인스턴스 메소드
	void inst_get(){
		System.out.println("inst_get() : " + inst_a);
	}
	//클래스 메소드
	static void class_get(){
		System.out.println("class_get() : " + class_a);
	}
}

public class Ex_Instance {
	public static void main(String[] args) {
		//테스트 1. 인스턴스화 시키지 않고 인스턴스 메소드를 호술
		//예상결과 : 오류
		//t.inst_get();
		//테스트 2. 인스턴스화 시키지 않고 클래스 메서드를 호출
		//예상결과 : 오류 없이 호출 가능
		t.class_get();
		
		//그러면 인스턴스화를 진행하고 테스트 1을 똑같이 한번 더 실행
		t in1 = new t();
		in1.inst_get();
	}
}
