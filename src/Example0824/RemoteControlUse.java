package Example0824;

public class RemoteControlUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RemoteControl rc = null; //�������̽����� ����
		
		// �������̽� �迭�� ���� ��ü �����ϱ�
		RemoteControl rc[] ={
			new Television(),
			new Audio()
		};
		//rc = new Television(); // �ڷ����� ��ü�� �������̽� ������ ����
		rc[0].turnOn(); 
		rc[0].setMute(true);
		rc[0].setVolume(22);
		rc[0].turnOff();
		RemoteControl.changeBattery(); 
		//static �޼ҵ带 ���� ��ü�� �ƴ� �������̽��� ���� ���ؼ� call�Ѵ�.
		
		//rc = new Audio();
		rc[1].turnOn();
		rc[1].setMute(true); //�������̵� �� ����Ʈ �޼ҵ� ���
		rc[1].setVolume(-7);
		rc[1].turnOff();
		RemoteControl.changeBattery();
		
	}
}
