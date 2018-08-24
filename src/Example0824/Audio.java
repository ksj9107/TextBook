package Example0824;

public class Audio implements RemoteControl{
	private int volume;
	static boolean mutestate;
	
	//interface�� turnOn �޼ҵ带 ����
	public void turnOn(){
		System.out.println("������� �մϴ�.");
	}
	
	//interface�� turnOff �޼ҵ带 ����
	public void turnOff(){
		System.out.println("������� ���ϴ�.");
	}
	
	public void setMute(boolean mute){
		mutestate = mute;
		if(mute){
			System.out.println("������� ���Ұ��մϴ�.");
		}else{
			System.out.println("������� ���ҰŸ� �����մϴ�.");
		}
	}


	public void setVolume(int volume){
		if(mutestate){
			System.out.println("���Ұ� �����Դϴ�.");
		}else{
			if(volume > RemoteControl.MAX_VOLUME){
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume <= RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			}else{
				this.volume = volume;
			}
			System.out.println("���� ������� ���� : "+this.volume);
		}
	
	//default �޼ҵ带 �����ؼ� ������� setMute�� ����
	}
}
