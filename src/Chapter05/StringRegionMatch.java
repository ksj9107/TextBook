package Chapter05;

public class StringRegionMatch {
	public static void main(String[] args) {
		String first = "Welcome to Microsoft";
		String second = "I work with Microsoft";
		//regionMatches�� ������Ʈ�� 
		//n(ù��° �Ķ����)��° ������ ; ������Ʈ�� �ε���
		//n(������ �Ķ����)���� ���ڸ�
		//�Է� ���ڿ�(�ι�° �Ķ����)�� n��°(����° �Ķ����)���� ; �Է¹��ڿ��� �ε���
		//n��(������ �Ķ����)��
		//Match�Ǵ��� Ȯ���� true/false�� ��ȯ�Ѵ�.
		boolean match = first.regionMatches(11, second, 12, 9);
		System.out.println("ù��° ���� 11~19�� �ι�° ������ 12~20�� ��ġ�Ǵ°�?"+match);
	}
}
