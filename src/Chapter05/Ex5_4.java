package Chapter05;

public class Ex5_4 {
	public static void main(String[] args) {
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//�迭 abc�� num�� ���ļ� result��� �迭�� ����
		char[] result = new char[abc.length+num.length];
		//abc�� 0���� ������ ���� result�� 0�������� abc.length�� ����
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);//���� ���� ����
		System.out.println(result);
		
		//�迭 abc�� ���� num�� 0��°���� abc.length�� �Է�
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//�迭 abc�� ���� num�迭�� 6��°���� 3�� �Է�
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
	}
}
