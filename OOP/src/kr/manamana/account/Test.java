package kr.manamana.account;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		int menu, money = 0;

		while (true) {
			System.out.println("=========================");
			System.out.println("1.�Ա�/2.��� /3.�ܰ�");
			System.out.println("==========================");
			System.out.println("0�� ������ ���α׷��� ����˴ϴ�");
			System.out.println("�޴��� �������ּ���:");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("�󸶸��Ա��Ͻðڽ��ϱ�?");
				money = sc.nextInt();
				a.balance += money;
				System.out.println("�ܾ���" + a.balance + "���Դϴ�");
				break;

			case 2:
				System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
				money = sc.nextInt();
				a.balance -= money;
				System.out.println("�ܾ���" + a.balance + "���Դϴ�");
				break;

			case 3:
				System.out.println("�ܾ���" + a.balance + "���Դϴ�");
				break;
			}
			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}

		}
	}
}
