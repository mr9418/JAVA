package kr.manamana.java;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 시작합니다");
	  boolean confirm = true;	//boolean의변수가true니까
	  while(confirm) {//while에서 true면계속반복
		  System.out.println("숫자를입력하세요");
		  int num = sc.nextInt();
		  
	for(int i=0; i<10; i++) {
		System.out.println(num+"X"+i+"="+num*i );
	}
	System.out.println("게속진행할까요? y or n");
    String check = sc.next();
    
    if(check.equals("n")) {
    	confirm = false;
    }
		  
	  }
	  System.out.println("구구단 프로그램 종료");
		
	}

}
