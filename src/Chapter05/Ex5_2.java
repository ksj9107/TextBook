package Chapter05;
/*
 * Array OutPut with Arrays.toString()
 * Arrays.toString() �޼ҵ带 �̿��Ͽ� �迭 ��� ����ϱ�
 * Source : Textbook page 191
 * */

import java.util.*; //Arrays.toString()�� ����ϱ� ���� �غ�

public class Ex5_2 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = {100,95,80,70,60};
		char[] chArr = {'a','b','c','d'};
		
		//�迭 �ʱ�ȭ �ϴ� ��� : For ���� �̿�
		for(int i=0;i<iArr1.length;i++){
			iArr1[i]=i+1; //1���� 10�� ���ڸ� �迭�� ����
		}
		
		for(int i=0;i<iArr2.length;i++){
			// random() �Լ��� 0.0���� 1.0���� ���� ���ڸ� �������� ����
			// 10�� ���ϸ� 0~9������ ���ڰ� �����ȴ�
			// +1�� ���ָ� 1~10�� ���ڸ� �����Ѵ�.
			iArr2[i]=(int)(Math.random()*10)+1; 
		}
		
		for(int i=0;i<iArr1.length;i++){
			System.out.print(iArr1[i]+" ");
		}
		System.out.println();
		//Arrays.toString�� �̿��� ���
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		
		//�迭�� ���� ���
		System.out.println(iArr3);
		System.out.println(chArr);

	}

}
