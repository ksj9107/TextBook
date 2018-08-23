package Chapter07;

public class Ex07_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		if(f instanceof Fightable)
			System.out.println("f�� Fightable �������̽��� �����߽��ϴ�.");
		if(f instanceof Movable)
			System.out.println("f�� Movable �������̽��� �����߽��ϴ�..");
		if(f instanceof Attackable)
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		if(f instanceof Object)
			System.out.println("f�� ObiectŬ������ �ڼ��Դϴ�.");

	}

}
class Fighter extends Unit implements Fightable{
	public void move(int x, int y){}
	public void attack(Unit u){}
}
class Unit{
	int currentHP;
	int x;
	int y;
}
interface Fightable extends Movable,Attackable{} 
interface Movable{void move(int x,int y);}
interface Attackable{void attack(Unit u);}
