package kr.manamana.polymorphism2;

import java.util.Scanner;

public class Munbangu {
	
	private static Product [] arr = new Product[1000];
	private static Scanner sc = new Scanner(System.in);
	static int count = 0;
	static int pagenum;
	static String kind;
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			menu();
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.print("상품명을 입력하세요");
			String name =sc.next();
			System.out.println("바코드를 입력하세요");
			String code = sc.next();
			System.out.println("가격을 입력하세요");
			int price = sc.nextInt(); 
			submenu();
			choice = sc.nextInt(); 
			switch(choice) {
			case 1:
				Product p = new Product(name, code, price);
				arr[count++] = p; 
				System.out.println("상품입력이 완료되엇씁니다");
				break;
				
			case 2:
				System.out.print("페이지 수를 입력하세요");
				pagenum = sc.nextInt();
				Note n = new Note(name, code, price, pagenum);
				arr[count++] = n;
				System.out.println("상품입력이 완료되었습니다");
				break;
				
			case 3:
				System.out.print("심 종류를 입력하세요");
				kind = sc.next();
				Penceil pe = new Penceil(name, code, price, kind);
				arr[count++] = pe;
				System.out.println("상품입력이 완료되었습니다");
				break;
			}
		case 2:
			System.out.println("상품을 출력합니다");
			for(int i=0; i<count; i++) {
				System.out.println(arr[i].showInfo());
			}
			break;
		case 3:
			System.out.println("상품을 삭제합니다");
			delete();
			System.out.println("상품이 삭제되었습니다");
			break;
		case 4:
			System.out.println("상품을 수정합니다");
			modify();
			break;
		case 5:
			System.out.println("상품의 개수를 출력합니다");
			System.out.println("총"+count+"개 있습니다");
			break;
		case 6:
			System.out.println("상품을 검색합니다");
			search();
			
			break;
		case 7:
			System.out.println("프로그램을 종료합니다");
			run = false;
			break;
		}
		
		
		
		}
		
	}
	
	
	
	private static void search() {
	    System.out.println("이름을 검색하세요");
	    String name = sc.next();
	    for(int i=0; i<count; i++) {
	    	if(arr[i].getName().equals(name)) {
	    		System.out.println("상품의코드는"+arr[i].getCode()+"입니다");
	    	}
	  }
		
	}



	



	private static void modify() {
	   System.out.println("수정할 상품의 코드를 입력하세요");
	   String code = sc.next();
	   for(int i=0; i<count; i++) {
		   if(arr[i].getCode().equals(code)) {
			   System.out.println("새로운 코드를 입력하세요");
			   String code1 = sc.next();
			  arr[i].setCode(code1);
			  
		   }
		   
	   }
		
	}



	private static void delete() {
     System.out.println("상품코드를 입력하세요");
     String code = sc.next();
     for(int i=0; i<count; i++) {
    	 if(arr[i].getCode().equals(code)) {
    		 for(int j=i; j<count; j++) {
    			 arr[j] = arr[j+1];
    		 }
    		 count--;
    	 }
     }
		
	}



	public static void menu() {
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.등록");
		System.out.println("2.전체출력");
		System.out.println("3.삭제");
		System.out.println("4.수정");
		System.out.println("5.상품의 개수");
		System.out.println("6.상품검색");
		System.out.println("7.프로그램종료");
		System.out.println("선택>>>>");
		System.out.println("==============================");
		
	}
	public static void submenu() {
		System.out.println("1.일반상품");
		System.out.println("2.노트");
		System.out.println("3.연필");
	}
	
  
}
