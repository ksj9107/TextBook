package Example0824;

public class Television implements RemoteControl{
	private int volume;
	static boolean mutestate;
	
	//interface�� turnOn �޼ҵ带 ����
	public void turnOn(){
		System.out.println("�ڷ������� �մϴ�.");
	}
	
	//interface�� turnOff �޼ҵ带 ����
	public void turnOff(){
		System.out.println("�ڷ������� ���ϴ�.");
	}
	
	public void setMute(boolean mute){
		mutestate = mute;
		if(mute){
			System.out.println("Tv�� ���Ұ��մϴ�.");
		}else{
			System.out.println("Tv�� ���ҰŸ� �����մϴ�.");
		}
	};
	
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
			System.out.println("���� Tv�� ���� : "+this.volume);
		}
		
	}
}
