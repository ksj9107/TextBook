package Example0824;

public interface RemoteControl {
	//상수와 추상메소드만 선언할 수 있다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	//abstract method
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	void setMute(boolean mute);//end of setMute
	
	//static method
	static void changeBattery(){
		System.out.println("배터리를 교체합니다.");
	}//end of changeBattery
}
