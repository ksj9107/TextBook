package Chapter07;
class Product{
	int price;
	int bonusPoint;

	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
class Tvpro extends Product{
	Tvpro(){
		super(100);
	}
	public String toString(){return "Tv";}
}
class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString(){return "Computer";}
}
class buyer{
	int money = 1000;
	int bonusPoint = 0;
	void buy(Product p){
		if(money<p.price){
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
}

public class Ex07_21PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		buyer b = new buyer();
		
		b.buy(new Tvpro());
		b.buy(new Computer());
		
		System.out.println("���� ���� ���� "+b.money+"���� �Դϴ�.");
		System.out.println("���� ���ʽ�����Ʈ�� "+b.bonusPoint+"�� �Դϴ�.");
	}

}
