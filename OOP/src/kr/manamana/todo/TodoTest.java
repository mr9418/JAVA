package kr.manamana.todo;

import java.util.Scanner;

public class TodoTest {

	public static void main(String[] args) {

 	    Todo[] arr = new Todo[10];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int counter = 0;
	    int choice = 0;
	    
		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.���ϵ��:");
			System.out.println("2.���� ���� ���");
			System.out.println("3.���� �ʱ�ȭ");
			System.out.println("4.����");
			System.out.println("----------------------------");
			System.out.println("����>>:");
			 choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("���� ����ϱ�");
				System.out.print("������ �����ּ���");
				String title = sc.next();
				System.out.println("������ �����ּ���");
				String todo = sc.next();
                
				Todo t = new Todo();
				t.setTitle(title);
				t.setTodo(todo);
				
				arr[counter++] = t;
				System.out.println("������ ��ϵǾ����ϴ�");
				break;

			case 2:
				System.out.println("Todo�� ����մϴ�");
				for (int i = 0; i < counter; i++) {
						if(arr[i]!=null) {
							arr[i].print();
						}else {
							System.out.println("�����̾����ϴ�");
						}
					}
				break;
			case 3:
				System.out.println("Todo�� �ʱ�ȭ�մϴ�");
				for (int i = 0; i < counter; i++) {
					if (arr[i] != null) {
						arr[i] = null;
					}
				}
				break;
			}
			if (choice == 4) {
				System.out.println("�ý����� �����մϴ�");
				break;
			}

		}

	}

}
