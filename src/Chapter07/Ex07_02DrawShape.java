package Chapter07;

public class Ex07_02DrawShape {

	public static void main(String[] args) {
		point[] p = {
				new point(100,100),
				new point(140,150),
				new point(200,100)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new point(150,150),50);
		
		t.draw();
		c.draw();
	}	
}
class shape{
	String color = "black";
	void draw(){
		System.out.println("color="+color);
	}
}

class point{
	int x;
	int y;
	
	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public point() {
		this(0,0);
	}
	
	String getXY(){
		return "("+x+","+y+")";
	}
}

class Circle extends shape{
	point center;
	int r;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		this(new point(0, 0),100);
	}
	Circle(point center, int r){
		this.center = center;
		this.r=r;
	}
	
	void draw(){
		System.out.printf("center=(%d,%d), r=%d, color=%s\n",center.x,center.y,r,color);
	}
}

class Triangle extends shape{
	point[] p = new point[3];
	
	public Triangle(point[] p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	
	void draw(){
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n",
				p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}