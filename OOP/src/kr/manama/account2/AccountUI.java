package kr.manama.account2;

import java.util.Scanner;

import kr.manamana.phonebook4.AccountManager;

public class AccountUI {

	private boolean flag = true;
	private int choice = 0;
	Scanner sc = new Scanner(System.in);
	AccountMana am = new AccountMana();

	public AccountUI() {

		while (flag) {
			menu();
			choice = sc.nextInt();
			switch (choice) {

			case 1:
				am.insert();
				break;
			case 2:
				System.out.println("저장된 계좌들을 조회합니다");
				am.print();
				break;
			case 3:
				System.out.println("예금을 시작합니다");
				am.deposit();
				break;
			case 4:
				System.out.println("출금을 시작합니다");
				am.withdrew();
				break;
			case 5:
				System.out.println("삭제를 시작합니다");
				am.delete();
				break;
			case 6:
				System.out.println("시스템을 종료합니다");
				flag = false;

			}

		}

	}

	public void menu() {
		System.out.println("=-------------------------------=");
		System.out.println("1.계좌생성| 2.계좌목록 | 3.예금 | 4. 출금 | 5.삭제 |6.종료");
		System.out.println("=--------------------------------=");
		System.out.println("선택하기>>");
	}
}
