package Chapter06;

class t{
	int inst_a=100; // �ν��Ͻ� ����
	static int class_a=100; // Ŭ���� ����
	
	//�ν��Ͻ� �޼ҵ�
	void inst_get(){
		System.out.println("inst_get() : " + inst_a);
	}
	//Ŭ���� �޼ҵ�
	static void class_get(){
		System.out.println("class_get() : " + class_a);
	}
}

public class Ex_Instance {
	public static void main(String[] args) {
		//�׽�Ʈ 1. �ν��Ͻ�ȭ ��Ű�� �ʰ� �ν��Ͻ� �޼ҵ带 ȣ��
		//������ : ����
		//t.inst_get();
		//�׽�Ʈ 2. �ν��Ͻ�ȭ ��Ű�� �ʰ� Ŭ���� �޼��带 ȣ��
		//������ : ���� ���� ȣ�� ����
		t.class_get();
		
		//�׷��� �ν��Ͻ�ȭ�� �����ϰ� �׽�Ʈ 1�� �Ȱ��� �ѹ� �� ����
		t in1 = new t();
		in1.inst_get();
	}
}
