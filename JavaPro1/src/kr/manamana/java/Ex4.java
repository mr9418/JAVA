package kr.manamana.java;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		// �����Է� ���α׷� �����
		System.out.println("������ �Է����ּ���");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();// ���� �Է¹ޱ�

		if (point <= 100 && point >= 90) {
			System.out.println("A�����Դϴ�");
		} else if (point < 90 && point >= 80) {
			System.out.println("B�����Դϴ�");
		} else if (point < 80 && point >= 70) {
			System.out.println("C�����Դϴ�");
		} else if (point < 70 && point >= 60) {
			System.out.println("D�����Դϴ�");
		} else if (point < 60 && point >= 0) {
			System.out.println("F�����Դϴ�");
		} else {
			System.out.println("�ٽ� �Է����ּ���");
		}
		System.out.println((3>2)&&(3>4));
		System.out.println((3!=2)||(-1>0));
		System.out.println((3!=2)^(-1>0));
		
	//��øif-else��
	Scanner sc1 = new Scanner(System.in);
	System.out.println("������ �Է����ּ���(0~100):");
	int score = sc1.nextInt();
	System.out.println("�г��� �Է����ּ���(1~4):");
	int year = sc1.nextInt();
	
	if(score>=60) {
		if(year!=4)
			System.out.println("�հ�!");
	else if(score>=70)
		System.out.println("�հ�!");
	else
		System.out.println("���հ�");
	}else
		System.out.println("���հ�");
	}
}
