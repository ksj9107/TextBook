package Chapter07;

public class Ex07_30DefaultMethodTest {
	static int a=0;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c =  new Child();
		c.method1();
		c.method2();  // 조상클래스가 default메소드 혹은 abstract메소드와 충돌시 인터페이스는 무시된다.
					  // parent클래스의 method2()의 내용 출력
		MyInterface.staticMethod();  //static 메소드로 선언하면 객체를 따로 만들필요 없이 
		MyInterface2.staticMethod(); //'클래스명(혹은 인터페이스명).메소드이름' 과 같은 방식으로 실행가능
	}
}
class Child extends Parent implements MyInterface,MyInterface2{
	public void method1(){
		System.out.println("method1() in child");
	}
}
class Parent{
	public void method2(){
		System.out.println("method2() in parent");
	}
}
interface MyInterface{
	default void method1(){
		System.out.println("method1() in MyInterface");
	}
	abstract void method2();//질문할것 abstract클래스로 선언해도 왜 구현하지 않고 오류가 발생하지 않는가?
		
	static void staticMethod(){
		System.out.println("staticMethod() in MyInterface");
	}
}
interface MyInterface2{
	default void method1(){
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod(){
		System.out.println("staticMethod() in MyInterface2");
	}
}