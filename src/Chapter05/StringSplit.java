package Chapter05;

public class StringSplit {
	public static void main(String[] args) {
		String str = "jan-feb-march-";
		String[] temp;
		String delimeter = "-";
		//split(delimeter,(반복횟수+1))은
		//delimeter 1개 를 기준으로 문장을 나눈다.
		//입력 반복수가 0보다 클 경우 반복횟수+1번만큼 split을 적용한다.
		//입력 반복수가 0보다 작을 경우 무제한으로 split을 적용한다.
		//다음 문장이 지정한 delimeter로 시작하는 경우 공백을 출력한다.
		//문자열의 마지막이 delimeter로 끝나는 경우 공백을 한 번 더 출력한다.
		temp = str.split(delimeter,6);
		
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]);
			System.out.println();
			str = "jan.feb.march";
			delimeter = "\\.";
			temp = str.split(delimeter);
		}
		System.out.println("asd");
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
			System.out.println();
			temp = str.split(delimeter,5);
		}
	}
}
