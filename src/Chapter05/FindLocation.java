package Chapter05;

import java.util.Scanner;

public class FindLocation {

	public static void main(String[] args) {
		final int size = 10;
		int x=0,y=0;
		
		char[][] board = new char[size][size];
		byte[][] shipboard = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,1,0,0,0,1,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{1,0,0,0,0,0,0,1,0,0},
				{0,1,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		
		for(int i=0;i<size;i++){
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("좌표값을 입력하세요.(종료 00)>");
			String input = sc.nextLine();
			x = input.charAt(0) -'0';
			y = input.charAt(1) -'0';
			
			if(input.length() == 2){
				if(x==0 && y==0)
					break;
			}
			
			if(input.length()!=2||x<=0||x>size||y<=0||y>=size){
				System.out.println("잘못된 입력입니다. 다시입력하세요.");
				continue;
			}
			
			board[x][y] = shipboard[x-1][y-1]==1?'O':'X';
			
			for(int i=0;i<size;i++){
				System.out.println(board[i]);
			}System.out.println();
		}
		sc.close();
	}

}
