package Chapter07;

//�߻� Ŭ���� : abstract �޼ҵ带 �ϳ��� �����ϰ� �ִ� Ŭ����
abstract class Player{ 
	abstract void play(int pos);
	void stop(){};
}

//�Ϲ� Ŭ����
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
