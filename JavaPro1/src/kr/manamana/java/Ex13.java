package kr.manamana.java;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Random rd = new Random();
			int num = rd.nextInt(100);
			System.out.println("숫자를 입력하세요0~99까지");
			int i = 1;

			while (true) {
				System.out.println(i+"시작>>");
				int input = sc.nextInt();

				while (input != num) {
					if (input < num) {
						System.out.println("더 크게");
					} else if (input > num) {
						System.out.println("더 작게");
					}
					i++;
					break;
				}
				if (input==num) {
					System.out.println("정답입니다");
					System.out.println("다시 하시겠습니까? y or n");
				
				if (sc.next().equals("n")) {
					System.out.println("프로그램을 종료합니다");
					System.exit(0);
				} else {
					break;
				}
			}
		}
	}
  }
}	