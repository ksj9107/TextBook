package Chapter05;

public class StringEqual {
	public static void main(String[] args) {
		String s1 = "generate";
		String s2 = "generate";
		String s3 = "green";
		//String클래스의 equals를 이용해
		//두 값을 비교해
		//같으면 true / 다르면 false를 반환
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
