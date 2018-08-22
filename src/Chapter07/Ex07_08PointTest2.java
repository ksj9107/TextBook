package Chapter07;

public class Ex07_08PointTest2 {
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		System.out.println("p3.x="+p3.x);
		System.out.println("p3.y="+p3.y);
		System.out.println("p3.z="+p3.z);
	}
}

class point2{
	int x=10;
	int y=20;
	
	public point2(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}

class Point3D2 extends point2{
	int z=30;
	
	Point3D2(){
		this(100,200,300);
	}
	Point3D2(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
}
