package Chapter06;

class Data{int x;}

public class Ex6_9PrimitiveParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x);
		
		change(d.x);
		System.out.println("after change(d.x)");
		System.out.println("main() : x = "+d.x);
	}
	
	static void change(int x){
		x = 1000;
		System.out.println("change() : x "+ x);
	}
}
