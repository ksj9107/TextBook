package Example0824;

public class Audio implements RemoteControl{
	private int volume;
	static boolean mutestate;
	
	//interface의 turnOn 메소드를 구현
	public void turnOn(){
		System.out.println("오디오를 켭니다.");
	}
	
	//interface의 turnOff 메소드를 구현
	public void turnOff(){
		System.out.println("오디오를 끕니다.");
	}
	
	public void setMute(boolean mute){
		mutestate = mute;
		if(mute){
			System.out.println("오디오를 음소거합니다.");
		}else{
			System.out.println("오디오의 음소거를 해제합니다.");
		}
	}


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
			System.out.println("현재 오디오의 볼륨 : "+this.volume);
		}
	
	//default 메소드를 변경해서 오디오의 setMute를 정의
	}
}
