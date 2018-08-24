package Example0824;

public class RemoteControlUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// RemoteControl rc = null; //인터페이스변수 선언
		
		// 인터페이스 배열로 구현 개체 관리하기
		RemoteControl rc[] ={
			new Television(),
			new Audio()
		};
		//rc = new Television(); // 텔레비전 객체를 인터페이스 변수에 대입
		rc[0].turnOn(); 
		rc[0].setMute(true);
		rc[0].setVolume(22);
		rc[0].turnOff();
		RemoteControl.changeBattery(); 
		//static 메소드를 사용시 객체가 아닌 인터페이스를 직접 통해서 call한다.
		
		//rc = new Audio();
		rc[1].turnOn();
		rc[1].setMute(true); //오버라이딩 된 디폴트 메소드 사용
		rc[1].setVolume(-7);
		rc[1].turnOff();
		RemoteControl.changeBattery();
		
	}
}
