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
			System.out.println("1.등록하기 |2. 전체출력 |3.초기화  |4.나기기");
			System.out.println("=================================");
			System.out.println("선택>>>:");

			menu = sc.nextInt();

			switch (menu) {

			case 1:
				System.out.println("동물을 등록합니다");
				System.out.print("이름:");
				String name = sc.next();
				System.out.print("종류:");
				String king = sc.next();
				System.out.println("나이:");
				int age = sc.nextInt();

				Animal a = new Animal();
				a.setName(name);
				a.setKing(king);
				a.setAge(age);

				arr[count++] = a;
				System.out.println("등록이 완료되었습니다");
				break;

			case 2:
				System.out.println("동물자료를 출력합니다");
				for (int i = 0; i < count; i++) {
					if (arr[i] != null) {
						arr[i].print();
					} else {
						System.out.println("동물이 없습니다");
					}
				}
				break;

			case 3:
				System.out.println("자료를 초기화시킵니다");
				for (int i = 0; i < count; i++) {
					if (arr[i] != null) {
						arr[i] = null;
					}
				}
				break;

  			}
			  
			  if(choice==4) {
				  System.out.println("시스템을 종료합니다");
				  break;
			  }
        
			
			
		}

	}

}
