package Chapter08;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.Read();
			throw new Exception();
		}catch(Exception e){
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}
		
	}

}
