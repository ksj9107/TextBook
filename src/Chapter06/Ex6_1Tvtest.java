package Chapter06;
class Tv{
	//Tv�� �Ӽ�
	String color;
	boolean power;
	int channel;
	String maker;
	
	Tv(String p_maker) {
		power = false;
		channel = 1;
		maker = p_maker;
		System.out.println("TV��ü�� �����Ǿ����ϴ�.");
	}	
	void chkMaker(){
		System.out.println("Maker : "+maker);
	}
	//Tv�� ���
	void power(){
		power = !power;
		if(power==true){
			System.out.println("Power status : ON");
		}else{
			System.out.println("Power status : OFF");
		}
	}
	void channelup(){
		if(power){
		++channel;
		System.out.println("Channel : "+channel);
		}else{
			System.out.println("Tv is OFF");
		}
	}
	void channeldown(){
		if(power){
		--channel;
		System.out.println("Channel : "+channel);
		}else{
			System.out.println("Now, Tv is OFF");
		}
	}
	int setChannel(int chn){
		if(power){
			channel = chn;
			return channel;
		}else{
			System.out.println("Now, Tv is OFF...Can't set channel..");
			return channel;
		}
	}
	void chkChannel(){
		System.out.println("Channel : "+channel);
	}
}//End of class Tv

public class Ex6_1Tvtest {

	public static void main(String[] args) {
		Tv t = new Tv("SAMSUNG");
		Tv t2 = new Tv("LG");
		
		t.power();
		t2.power();
		
		t.chkChannel();
		t2.chkChannel();
		
		t.chkMaker();
		t2.chkMaker();
		
		t.setChannel(13);
		t2.setChannel(24);
		
		t.chkChannel();
		t2.chkChannel();
		
		t.power();
		t2.power();
		
		
	}
}
