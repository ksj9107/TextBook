package Chapter07;

public class Ex07_16CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		//car.water();
		fe2 = (FireEngine)car;
		fe2.water();*/
		
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = new FireEngine();
		
		car = fe;
		car.drive();
		fe = (FireEngine)car;
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}
class Car {
	String color;
	int door;
	
	void drive(){
		System.out.println("drive, brrrr~");
	}
	
	void stop(){
		System.out.println("stop!!");
	}
}
class FireEngine extends Car{
	void water(){
		System.out.println("water!!!!");
	}
}