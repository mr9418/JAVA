package kr.manamana.java;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num +"";
		
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		System.out.println("����:"+tempNum2.length);
		
		int len = tempNum2.length;
		for(int i=0; i<len; i++) {
			if((len-i)%3==0&&i!=0) {
				System.out.println(",");
			}
			System.out.print(tempNum2[i]);
		}
	}
   //���� 1000000000�Է¹ް� (10��) 3�ڸ� ���� �޸��� �� ���!! 1,000,000,000[��ó] Java �ǽ�����|�ۼ��� spelraummm
    
	

	
}
