package Chapter06;

public class Ex6_8CallStackTest2 {

	public static void main(String[] args) {
		System.out.println("main(String[] args)�� ����Ǿ���");
		firstMethod();
		System.out.println("main(String[] args)�� ����Ǿ���");
	}
	static void firstMethod(){
		System.out.println("firstMethod�� ����Ǿ���.");
		secondMethod();
		thirdMethod();
		System.out.println("firstMethod�� ����Ǿ���.");
	}
	static void secondMethod(){
		System.out.println("secondMethod�� ����Ǿ���.");
		System.out.println("secondMethod�� ����Ǿ���.");
	}
	static void thirdMethod(){
		System.out.println("thirdMethod�� ����Ǿ���.");
		System.out.println("thirdMethod�� ����Ǿ���.");
	}

}
