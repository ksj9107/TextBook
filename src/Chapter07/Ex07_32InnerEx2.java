package Chapter07;

public class Ex07_32InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod(){
		//InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		Ex07_32InnerEx2 outer = new Ex07_32InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
	}
	void instanceMethod(){
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		//LovalInner lv = LocalInner();
	}
	void myMethod(){
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
