package Chapter07;
class Tv{
	int channel;
	String maker;
	boolean power;
	
	void power(){
		power = !power;
	}
	void channelup(){
		++channel;
	}
	void channeldown(){
		--channel;
	}
	void initmaker(){
		maker = "Samsung";
	}
}
class CaptionTv extends Tv{
	boolean caption;
	void displayCaption(String txt){
		if(caption){
			System.out.println(txt);
		}
	}
}
public class Ex07_01CaptionTvTest{
	
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelup();
		System.out.println(ctv.channel);
		ctv.displayCaption("HeidiSQL");
		ctv.caption = true;
		ctv.displayCaption("bye");
	}
}
