package Chapter07;

public class Ex07_30DefaultMethodTest {
	static int a=0;
	int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c =  new Child();
		c.method1();
		c.method2();  // ����Ŭ������ default�޼ҵ� Ȥ�� abstract�޼ҵ�� �浹�� �������̽��� ���õȴ�.
					  // parentŬ������ method2()�� ���� ���
		MyInterface.staticMethod();  //static �޼ҵ�� �����ϸ� ��ü�� ���� �����ʿ� ���� 
		MyInterface2.staticMethod(); //'Ŭ������(Ȥ�� �������̽���).�޼ҵ��̸�' �� ���� ������� ���డ��
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
	abstract void method2();//�����Ұ� abstractŬ������ �����ص� �� �������� �ʰ� ������ �߻����� �ʴ°�?
		
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