package Chapter05;

public class StringRegionMatch {
	public static void main(String[] args) {
		String first = "Welcome to Microsoft";
		String second = "I work with Microsoft";
		//regionMatches는 오브젝트의 
		//n(첫번째 파라미터)번째 값부터 ; 오브젝트의 인덱스
		//n(마지막 파라미터)개의 문자를
		//입력 문자열(두번째 파라미터)의 n번째(세번째 파라미터)부터 ; 입력문자열의 인덱스
		//n개(마지막 파라미터)와
		//Match되는지 확인해 true/false로 반환한다.
		boolean match = first.regionMatches(11, second, 12, 9);
		System.out.println("첫번째 문장 11~19와 두번째 문장의 12~20은 매치되는가?"+match);
	}
}
