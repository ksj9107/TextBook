package Chapter05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mergee {
	public static void main(String[] args) {

		String a[] = {"A","E","I"};
		String b[] = {"O","U"};
		List list = new ArrayList(Arrays.asList(a));
		//�迭 a�� ����Ʈ�� ��ȯ�Ѵ�.
		list.addAll(Arrays.asList(b));
		//�迭 b�� ����Ʈ�� �߰��Ѵ�.
		Object[] c = list.toArray();
		//toString�� �̿��� ����ϱ� ���� ����Ʈ�� �迭�� ��ȯ�Ѵ�.
		System.out.println(Arrays.toString(c));
		//toString�޼ҵ带 ����� ����Ѵ�.
	}
}
