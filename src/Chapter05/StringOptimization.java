package Chapter05;

public class StringOptimization {
	public static void main(String[] args) {
		String var[] = new String[150000];
		for(int i=0;i<150000;i++){
			var[i]="s"+
		i;
		}
		
		long startTime=System.nanoTime();
		for(int i=0;i<150000;i++){
			var[i] = "hello";
		}
		long endTime=System.nanoTime();
		System.out.println("Creation time of String literals : "+(endTime-startTime)+"ns");
		
		long startTime1=System.nanoTime();
		
		for(int i=0;i<150000;i++){
			var[i] = new String("hello");
		}
		long endTime1=System.nanoTime();
		System.out.println("Creation time of String Object with 'new' keyword : "
		+(endTime1-startTime1)+"ns");
		
		long startTime2=System.nanoTime();
		
		for(int i=0;i<150000;i++){
			var[i] = new String("hello");
			var[i] = var[i].intern();
		}
		long endTime2=System.nanoTime();
		System.out.println("Creation time of String Object with 'intern' method : "
		+(endTime2-startTime2)+"ns");
	}
}
