package Chapter05;

public class StringSplit {
	public static void main(String[] args) {
		String str = "jan-feb-march-";
		String[] temp;
		String delimeter = "-";
		//split(delimeter,(�ݺ�Ƚ��+1))��
		//delimeter 1�� �� �������� ������ ������.
		//�Է� �ݺ����� 0���� Ŭ ��� �ݺ�Ƚ��+1����ŭ split�� �����Ѵ�.
		//�Է� �ݺ����� 0���� ���� ��� ���������� split�� �����Ѵ�.
		//���� ������ ������ delimeter�� �����ϴ� ��� ������ ����Ѵ�.
		//���ڿ��� �������� delimeter�� ������ ��� ������ �� �� �� ����Ѵ�.
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
