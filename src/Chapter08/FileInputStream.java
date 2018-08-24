package Chapter08;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file){
		this.file = file;
	}
	public void Read(){
		System.out.println(file+"을 읽습니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void close() throws Exception{
		System.out.println(file+"을 닫습니다");
	}
}
