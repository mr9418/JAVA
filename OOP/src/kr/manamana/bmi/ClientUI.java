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
			System.out.print("회원의 이름을 입력하세요:");
			String name = sc.next();
			System.out.println("회원번호:");
			String csn = sc.next();
			System.out.println("회원 키:");
			double height = sc.nextDouble();
			System.out.println("회원의 몸무게:");
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
			System.out.print("탈퇴한 회원의 번호 입력:");
			String csn1 = sc.next();
			cm.delete(csn1);
			break;

		case 5:
			System.out.print("몸무게 수정하고 싶은 회원의 이름:");
			String name2 = sc.next();
			System.out.println("수정하고 싶은 몸무게 입력");
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
		System.out.println("1.등록       2.전체출력"); 
		System.out.println("3.고객별 BMI 출력");
		System.out.println("4.삭제(탈퇴)   5.몸무게 수정");
		System.out.println("6.프로그램 종료");
		System.out.println("==============================");
	} 
}



