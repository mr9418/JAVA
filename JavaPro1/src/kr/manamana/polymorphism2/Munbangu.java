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
			System.out.print("��ǰ���� �Է��ϼ���");
			String name =sc.next();
			System.out.println("���ڵ带 �Է��ϼ���");
			String code = sc.next();
			System.out.println("������ �Է��ϼ���");
			int price = sc.nextInt(); 
			submenu();
			choice = sc.nextInt(); 
			switch(choice) {
			case 1:
				Product p = new Product(name, code, price);
				arr[count++] = p; 
				System.out.println("��ǰ�Է��� �Ϸ�Ǿ����ϴ�");
				break;
				
			case 2:
				System.out.print("������ ���� �Է��ϼ���");
				pagenum = sc.nextInt();
				Note n = new Note(name, code, price, pagenum);
				arr[count++] = n;
				System.out.println("��ǰ�Է��� �Ϸ�Ǿ����ϴ�");
				break;
				
			case 3:
				System.out.print("�� ������ �Է��ϼ���");
				kind = sc.next();
				Penceil pe = new Penceil(name, code, price, kind);
				arr[count++] = pe;
				System.out.println("��ǰ�Է��� �Ϸ�Ǿ����ϴ�");
				break;
			}
		case 2:
			System.out.println("��ǰ�� ����մϴ�");
			for(int i=0; i<count; i++) {
				System.out.println(arr[i].showInfo());
			}
			break;
		case 3:
			System.out.println("��ǰ�� �����մϴ�");
			delete();
			System.out.println("��ǰ�� �����Ǿ����ϴ�");
			break;
		case 4:
			System.out.println("��ǰ�� �����մϴ�");
			modify();
			break;
		case 5:
			System.out.println("��ǰ�� ������ ����մϴ�");
			System.out.println("��"+count+"�� �ֽ��ϴ�");
			break;
		case 6:
			System.out.println("��ǰ�� �˻��մϴ�");
			search();
			
			break;
		case 7:
			System.out.println("���α׷��� �����մϴ�");
			run = false;
			break;
		}
		
		
		
		}
		
	}
	
	
	
	private static void search() {
	    System.out.println("�̸��� �˻��ϼ���");
	    String name = sc.next();
	    for(int i=0; i<count; i++) {
	    	if(arr[i].getName().equals(name)) {
	    		System.out.println("��ǰ���ڵ��"+arr[i].getCode()+"�Դϴ�");
	    	}
	  }
		
	}



	



	private static void modify() {
	   System.out.println("������ ��ǰ�� �ڵ带 �Է��ϼ���");
	   String code = sc.next();
	   for(int i=0; i<count; i++) {
		   if(arr[i].getCode().equals(code)) {
			   System.out.println("���ο� �ڵ带 �Է��ϼ���");
			   String code1 = sc.next();
			  arr[i].setCode(code1);
			  
		   }
		   
	   }
		
	}



	private static void delete() {
     System.out.println("��ǰ�ڵ带 �Է��ϼ���");
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
		System.out.println("�޴��� �����ϼ���");
		System.out.println("1.���");
		System.out.println("2.��ü���");
		System.out.println("3.����");
		System.out.println("4.����");
		System.out.println("5.��ǰ�� ����");
		System.out.println("6.��ǰ�˻�");
		System.out.println("7.���α׷�����");
		System.out.println("����>>>>");
		System.out.println("==============================");
		
	}
	public static void submenu() {
		System.out.println("1.�Ϲݻ�ǰ");
		System.out.println("2.��Ʈ");
		System.out.println("3.����");
	}
	
  
}
