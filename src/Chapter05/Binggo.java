package Chapter05;

import java.util.Scanner;

public class Binggo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 5;
		int comarr[][] = new int[size][size];

		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<comarr.length;i++){
			for(int j=0;j<comarr[i].length;j++){
				comarr[i][j] = 0;
			}
		}

		for(int i=0; i<comarr.length;i++){
			for(int j=0; j<comarr.length;){
				int tmp = (int)(Math.random()*size*size)+1;
				boolean input = false;
				for(int a=0; a<size;a++){
					for(int b=0; b<size;b++){
						if(comarr[a][b]==tmp){
							input = true;
						}
					}
				}
				if(input == false){
					comarr[i][j] = tmp;
					j++;
				}
			}
		}
		System.out.println("======빙고판======");
		for(int i=0;i<comarr.length;i++){
			for(int j=0;j<comarr[i].length;j++){
				
				System.out.printf("%3d",comarr[i][j]);
			}
			System.out.println();
		}
		System.out.println("================");
		int sel = -1;
		while(sel!=0){
			System.out.print("1~25사이의 숫자를 입력하세요(종료 0) : ");
			sel = sc.nextInt();
			sc.nextLine();
			for(int i=0; i<comarr.length;i++){
				for(int j=0; j<comarr.length;j++){
					if(comarr[i][j]==sel){
						comarr[i][j] = 0;
						break;
					}
				}
			}
			System.out.println("======빙고결과======");
			for(int i=0;i<comarr.length;i++){
				for(int j=0;j<comarr[i].length;j++){
					
					System.out.printf("%3d",comarr[i][j]);
				}
				System.out.println();
			}
			System.out.println("================");
		}
		sc.close();
	}
}
