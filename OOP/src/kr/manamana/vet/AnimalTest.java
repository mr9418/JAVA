package kr.manamana.vet;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {

		Animal[] arr = new Animal[10];
		int menu, count = 0;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		boolean mung = true;

		while (mung) {
			System.out.println("==========================");
			System.out.println("1.����ϱ� |2. ��ü��� |3.�ʱ�ȭ  |4.�����");
			System.out.println("=================================");
			System.out.println("����>>>:");

			menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.println("������ ����մϴ�");
				System.out.print("�̸�:");
				String name = sc.next();
				System.out.print("����:");
				String king = sc.next();
				System.out.println("����:");
				int age = sc.nextInt();

				Animal a = new Animal();
				a.setName(name);
				a.setKing(king);
				a.setAge(age);

				arr[count++] = a;
				System.out.println("����� �Ϸ�Ǿ����ϴ�");
				break;

			case 2:
				System.out.println("�����ڷḦ ����մϴ�");
				for (int i = 0; i < count; i++) {
					if (arr[i] != null) {
						arr[i].print();
					} else {
						System.out.println("������ �����ϴ�");
					}
				}
				break;

			case 3:
				System.out.println("�ڷḦ �ʱ�ȭ��ŵ�ϴ�");
				for (int i = 0; i < count; i++) {
					if (arr[i] != null) {
						arr[i] = null;
					}
				}
				break;

  			}
			  
			  if(choice==4) {
				  System.out.println("�ý����� �����մϴ�");
				  break;
			  }
        
			
			
		}

	}

}
