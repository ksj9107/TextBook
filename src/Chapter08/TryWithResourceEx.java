package Chapter08;

public class TryWithResourceEx {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.Read();
			throw new Exception();
		}catch(Exception e){
			System.out.println("예외 처리 코드가 실행되엇습니다.");
		}
		
	}

}
