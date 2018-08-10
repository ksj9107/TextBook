package Chapter05;

import java.util.ArrayList;

public class RemoveElement {
	public static void main(String[] args) {
		ArrayList<String> objarr = new ArrayList<String>();
		objarr.clear();
		objarr.add(0,"0th element");
		objarr.add(1,"1th element");
		objarr.add(2,"2th element");
		objarr.add(3,"3th element");
		System.out.println("Array before removing an element"+objarr);
		
		objarr.remove(1);
		objarr.remove("0th element");
		System.out.println("Array after removing an element"+objarr);
		
		objarr.add(0,"0th element");
		System.out.println(objarr);
	}
}
