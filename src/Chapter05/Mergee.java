package Chapter05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergee {
	public static void main(String[] args) {

		String a[] = {"A","E","I"};
		String b[] = {"O","U"};
		List list = new ArrayList(Arrays.asList(a));
		//배열 a를 리스트로 변환한다.
		list.addAll(Arrays.asList(b));
		//배열 b를 리스트에 추가한다.
		Object[] c = list.toArray();
		//toString을 이용해 출력하기 위해 리스트를 배열로 변환한다.
		System.out.println(Arrays.toString(c));
		//toString메소드를 사용해 출력한다.
	}
}
