package kr.manamana.java;

import java.util.Random;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			Random rd = new Random();
			int num = rd.nextInt(100);
			System.out.println("���ڸ� �Է��ϼ���0~99����");
			int i = 1;

			while (true) {
				System.out.println(i+"����>>");
				int input = sc.nextInt();

				while (input != num) {
					if (input < num) {
						System.out.println("�� ũ��");
					} else if (input > num) {
						System.out.println("�� �۰�");
					}
					i++;
					break;
				}
				if (input==num) {
					System.out.println("�����Դϴ�");
					System.out.println("�ٽ� �Ͻðڽ��ϱ�? y or n");
				
				if (sc.next().equals("n")) {
					System.out.println("���α׷��� �����մϴ�");
					System.exit(0);
				} else {
					break;
				}
			}
		}
	}
  }
}	