package kr.manamana.java;

import java.util.Scanner;

public class EX12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를입력하세요");
		int num = sc.nextInt();//6자리 수 입력
		
		String strNum =num+"";
		
		int len = strNum.length();
		boolean check = false;
		
		for(int i=0; i<len; i++) {
			if(strNum.charAt(i)=='3') {
				check = true;
			}
		}
		if(check) {
			System.out.println("3이 있습니다");
		}else {
			System.out.println("3이 없습니다");
		}
	}

}
