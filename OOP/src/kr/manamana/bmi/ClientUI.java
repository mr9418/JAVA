package kr.manamana.bmi;

import java.util.Scanner;

public class ClientUI {
	private int choice;
	private boolean flag = true;
	Scanner sc = new Scanner(System.in);
	ClientManager cm = new ClientManager();

	public ClientUI() {

	while(flag)

	{
		menu();
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.print("ȸ���� �̸��� �Է��ϼ���:");
			String name = sc.next();
			System.out.println("ȸ����ȣ:");
			String csn = sc.next();
			System.out.println("ȸ�� Ű:");
			double height = sc.nextDouble();
			System.out.println("ȸ���� ������:");
			double weight = sc.nextDouble();

			Client c = new Client(name, csn, height, weight);
			cm.insertClient(c);
			break;
		case 2:
			cm.printAll();
			break;

		case 3:
			cm.printBmi();
			break;
		case 4:
			System.out.print("Ż���� ȸ���� ��ȣ �Է�:");
			String csn1 = sc.next();
			cm.delete(csn1);
			break;

		case 5:
			System.out.print("������ �����ϰ� ���� ȸ���� �̸�:");
			String name2 = sc.next();
			System.out.println("�����ϰ� ���� ������ �Է�");
			double weight2 = sc.nextDouble();
			cm.modify(name2, weight2);
			break;
		case 6:
			flag = false;
			break;
		}

	}

}

	public void menu() {
		System.out.println("==============================");
		System.out.println("1.���       2.��ü���"); 
		System.out.println("3.���� BMI ���");
		System.out.println("4.����(Ż��)   5.������ ����");
		System.out.println("6.���α׷� ����");
		System.out.println("==============================");
	} 
}



