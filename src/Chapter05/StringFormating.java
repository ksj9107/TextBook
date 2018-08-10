package Chapter05;

public class StringFormating {
	public static void main(String[] args) {
		String name = "Hello World";
		String s1 = String.format("name %s", name);
		String s2 = String.format("value %f",32.33134);
		String s3 = String.format("value %32.32f", 32.33134);
		String s4 = String.format("value %x", 30);
		System.out.print(s1);
		System.out.println();
		System.out.print(s2);
		System.out.println();
		System.out.print(s3);
		System.out.println();
		System.out.print(s4);
		System.out.println();
	}
}
