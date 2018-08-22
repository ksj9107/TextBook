package Chapter06;

public class Ex6_27BlockTest {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	public Ex6_27BlockTest() {
		System.out.println("»ý¼ºÀÚ");
	}
	public static void main(String[] args) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		Ex6_27BlockTest bt = new Ex6_27BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		Ex6_27BlockTest bt2 = new Ex6_27BlockTest(); 
	}
}
