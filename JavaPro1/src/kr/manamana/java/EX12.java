package kr.manamana.java;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ��Է��ϼ���");
		int num = sc.nextInt();//6�ڸ� �� �Է�
		
		String strNum =num+"";
		
		int len = strNum.length();
		boolean check = false;
		
		for(int i=0; i<len; i++) {
			if(strNum.charAt(i)=='3') {
				check = true;
			}
		}
		if(check) {
			System.out.println("3�� �ֽ��ϴ�");
		}else {
			System.out.println("3�� �����ϴ�");
		}
	}

}
