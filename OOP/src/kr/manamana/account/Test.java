package kr.manamana.account;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		int menu, money = 0;

		while (true) {
			System.out.println("=========================");
			System.out.println("1.입금/2.출금 /3.잔고");
			System.out.println("==========================");
			System.out.println("0을 누르면 프로그램이 종료됩니다");
			System.out.println("메뉴를 선택해주세요:");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("얼마를입금하시겠습니까?");
				money = sc.nextInt();
				a.balance += money;
				System.out.println("잔액은" + a.balance + "원입니다");
				break;

			case 2:
				System.out.println("얼마를 출금하시겠습니까?");
				money = sc.nextInt();
				a.balance -= money;
				System.out.println("잔액은" + a.balance + "원입니다");
				break;

			case 3:
				System.out.println("잔액은" + a.balance + "원입니다");
				break;
			}
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}

		}
	}
}
