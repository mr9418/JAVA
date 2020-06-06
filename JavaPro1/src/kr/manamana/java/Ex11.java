package kr.manamana.java;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num +"";
		
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		System.out.println("길이:"+tempNum2.length);
		
		int len = tempNum2.length;
		for(int i=0; i<len; i++) {
			if((len-i)%3==0&&i!=0) {
				System.out.println(",");
			}
			System.out.print(tempNum2[i]);
		}
	}
   //숫자 1000000000입력받고 (10억) 3자리 마다 콤마를 찍어서 출력!! 1,000,000,000[출처] Java 실습예제|작성자 spelraummm
    
	

	
}
