package Example0824;

public interface RemoteControl {
	//����� �߻�޼ҵ常 ������ �� �ִ�.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	//abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setMute(boolean mute);//end of setMute
	
	//static method
	static void changeBattery(){
		System.out.println("���͸��� ��ü�մϴ�.");
	}//end of changeBattery
}
