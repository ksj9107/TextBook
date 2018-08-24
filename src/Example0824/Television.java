package Example0824;

public class Television implements RemoteControl{
	private int volume;
	static boolean mutestate;
	
	//interface의 turnOn 메소드를 구현
	public void turnOn(){
		System.out.println("텔레비전을 켭니다.");
	}
	
	//interface의 turnOff 메소드를 구현
	public void turnOff(){
		System.out.println("텔레비전을 끕니다.");
	}
	
	public void setMute(boolean mute){
		mutestate = mute;
		if(mute){
			System.out.println("Tv를 음소거합니다.");
		}else{
			System.out.println("Tv의 음소거를 해제합니다.");
		}
	};
	
	public void setVolume(int volume){
		if(mutestate){
			System.out.println("음소거 상태입니다.");
		}else{
			if(volume > RemoteControl.MAX_VOLUME){
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume <= RemoteControl.MIN_VOLUME){
				this.volume = RemoteControl.MIN_VOLUME;
			}else{
				this.volume = volume;
			}
			System.out.println("현재 Tv의 볼륨 : "+this.volume);
		}
		
	}
}
