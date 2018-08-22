package Chapter07;

public class Ex07_07PointTest {

	public static void main(String[] args) {
		point3D p3 = new point3D(1,2,3);
		System.out.println(p3.getLocation());
	}

}

class point1{
	int x, y;

	point1(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation(){
		return "x:"+x+",y:"+y;
	}
}

class point3D extends point1{
	int z;
	
	point3D(int x,int y, int z){
		super(x,y);
		this.z = z;
	}
	
	String getLocation(){
		return "x:"+x+",y:"+y+",z:"+z;
	}
}