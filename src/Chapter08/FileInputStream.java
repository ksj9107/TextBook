package Chapter08;

public class FileInputStream implements AutoCloseable{
	private String file;
	
	public FileInputStream(String file){
		this.file = file;
	}
	public void Read(){
		System.out.println(file+"�� �н��ϴ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void close() throws Exception{
		System.out.println(file+"�� �ݽ��ϴ�");
	}
}
