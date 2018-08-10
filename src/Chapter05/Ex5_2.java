package Chapter05;
/*
 * Array OutPut with Arrays.toString()
 * Arrays.toString() 메소드를 이용하여 배열 요소 출력하기
 * Source : Textbook page 191
 * */

import java.util.*; //Arrays.toString()을 사용하기 위한 준비

public class Ex5_2 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		//배열 초기화 하는 방법 : For 루프 이용
		for(int i=0;i<iArr1.length;i++){
			iArr1[i]=i+1; //1부터 10의 숫자를 배열에 대입
		}
		
		for(int i=0;i<iArr2.length;i++){
			// random() 함수는 0.0부터 1.0보다 작은 숫자를 랜덤으로 생성
			// 10을 곱하면 0~9까지의 숫자가 생성된다
			// +1을 해주면 1~10의 숫자를 생성한다.
			iArr2[i]=(int)(Math.random()*10)+1; 
		}
		
		for(int i=0;i<iArr1.length;i++){
			System.out.print(iArr1[i]+" ");
		}
		System.out.println();
		//Arrays.toString을 이용한 출력
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		//배열을 직접 출력
		System.out.println(iArr3);
		System.out.println(chArr);

	}

}
