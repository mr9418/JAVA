package kr.manamana.java;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		// 성적입력 프로그램 만들기
		System.out.println("성적을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();// 정수 입력받기

		if (point <= 100 && point >= 90) {
			System.out.println("A학점입니다");
		} else if (point < 90 && point >= 80) {
			System.out.println("B학점입니다");
		} else if (point < 80 && point >= 70) {
			System.out.println("C학점입니다");
		} else if (point < 70 && point >= 60) {
			System.out.println("D학점입니다");
		} else if (point < 60 && point >= 0) {
			System.out.println("F학점입니다");
		} else {
			System.out.println("다시 입력해주세요");
		}
		System.out.println((3>2)&&(3>4));
		System.out.println((3!=2)||(-1>0));
		System.out.println((3!=2)^(-1>0));
		
	//중첩if-else문
	Scanner sc1 = new Scanner(System.in);
	System.out.println("점수를 입력해주세요(0~100):");
	int score = sc1.nextInt();
	System.out.println("학년을 입력해주세요(1~4):");
	int year = sc1.nextInt();
	
	if(score>=60) {
		if(year!=4)
			System.out.println("합격!");
	else if(score>=70)
		System.out.println("합격!");
	else
		System.out.println("불합격");
	}else
		System.out.println("불합격");
	}
}
