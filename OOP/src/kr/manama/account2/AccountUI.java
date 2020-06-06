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
				System.out.println("����� ���µ��� ��ȸ�մϴ�");
				am.print();
				break;
			case 3:
				System.out.println("������ �����մϴ�");
				am.deposit();
				break;
			case 4:
				System.out.println("����� �����մϴ�");
				am.withdrew();
				break;
			case 5:
				System.out.println("������ �����մϴ�");
				am.delete();
				break;
			case 6:
				System.out.println("�ý����� �����մϴ�");
				flag = false;

			}

		}

	}

	public void menu() {
		System.out.println("=-------------------------------=");
		System.out.println("1.���»���| 2.���¸�� | 3.���� | 4. ��� | 5.���� |6.����");
		System.out.println("=--------------------------------=");
		System.out.println("�����ϱ�>>");
	}
}
