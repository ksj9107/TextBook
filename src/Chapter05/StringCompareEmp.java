package Chapter05;

public class StringCompareEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello World";
		String another = "korea";
		Object obj = str;
		//������Ʈ�� �Է� �迭(String Ÿ��)�� ���Ͽ�
		//������ 0�� ��ȯ
		//�ٸ��� ó�� �ٸ� ���� �ƽ�Ű�ڵ尪�� ���Ͽ� 
		//�ڵ尪�� ���̸� ��ȯ�Ѵ�.
		//(������Ʈ�� �� ũ�� (-)����/ ���� �迭�� ��ũ��(+))
		System.out.println(str.compareTo(another));
		System.out.println(str.compareToIgnoreCase(another));
		System.out.println(str.compareTo(obj.toString()));
	}
}
