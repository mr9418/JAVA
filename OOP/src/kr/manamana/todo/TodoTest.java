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
			System.out.println("1.할일등록:");
			System.out.println("2.오늘 할일 출력");
			System.out.println("3.할일 초기화");
			System.out.println("4.종료");
			System.out.println("----------------------------");
			System.out.println("선택>>:");
			 choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("할일 등록하기");
				System.out.print("할일을 적어주세요");
				String title = sc.next();
				System.out.println("내용을 적어주세요");
				String todo = sc.next();
                
				Todo t = new Todo();
				t.setTitle(title);
				t.setTodo(todo);
				
				arr[counter++] = t;
				System.out.println("할일이 등록되었습니다");
				break;

			case 2:
				System.out.println("Todo를 출력합니다");
				for (int i = 0; i < counter; i++) {
						if(arr[i]!=null) {
							arr[i].print();
						}else {
							System.out.println("할일이없습니다");
						}
					}
				break;
			case 3:
				System.out.println("Todo를 초기화합니다");
				for (int i = 0; i < counter; i++) {
					if (arr[i] != null) {
						arr[i] = null;
					}
				}
				break;
			}
			if (choice == 4) {
				System.out.println("시스템을 종료합니다");
				break;
			}

		}

	}

}
