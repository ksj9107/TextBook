package Chapter07;

//추상 클래스 : abstract 메소드를 하나라도 포함하고 있는 클래스
abstract class Player{ 
	abstract void play(int pos);
	void stop(){};
}

//일반 클래스
class AudioPlayer extends Player{
	void play(int pos){System.out.println(" p ");};
	void stop(){};
}

abstract class TestAbstract extends Player{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Player p1 = new Player();
		AudioPlayer p2 = new AudioPlayer();
		
	}	

}
