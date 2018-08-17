package Chapter06;

public class Ex6_8CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)이 실행되었음");
		firstMethod();
		System.out.println("main(String[] args)이 종료되었음");
	}
	static void firstMethod(){
		System.out.println("firstMethod가 실행되었음.");
		secondMethod();
		thirdMethod();
		System.out.println("firstMethod가 종료되었음.");
	}
	static void secondMethod(){
		System.out.println("secondMethod가 실행되었음.");
		System.out.println("secondMethod가 종료되었음.");
	}
	static void thirdMethod(){
		System.out.println("thirdMethod가 실행되었음.");
		System.out.println("thirdMethod가 종료되었음.");
	}

}
