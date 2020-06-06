package kr.manamana.phonebook;

import java.util.Scanner;

class MemoInfo{
	String name;
	String school;
	String grade;
	
	public MemoInfo(String name,String school,String grade) {
		this.name = name;
		this.school = school;
		this.grade = grade;
	}
   
  public void showInfo() {
	  System.out.println("�̸�:"+name);
	  System.out.println("�б�:"+school);
	  if(grade!=null) {
		  System.out.println("grade:"+grade);
	  }
	  System.out.println("");
  }  
}

public class MemoBook {
     static Scanner keyboard = new Scanner(System.in);
     
     
     public static void showMenu() {
    	 System.out.println("�����ϼ���:");
    	 System.out.println("1.�������Է�");
    	 System.out.println("2.���α׷�����");
    	 System.out.println("����:");
     }
     
     public static void readMenu() {
    	System.out.println("�̸�:");
    	String name = keyboard.nextLine();
    	System.out.println("�б�:");
    	String school = keyboard.nextLine();
    	System.out.println("�г�");
    	String grade = keyboard.nextLine();
    	
    	MemoInfo info = new MemoInfo(name, school, grade);
    	System.out.println("�Էµ� �������");
    	info.showInfo();
     }
     
     public static void main(String[] args) {
		int choice;
		while(true) {
			showMenu();
			choice = keyboard.nextInt();
			keyboard.nextLine();
			
			switch(choice) {
			case 1:
				readMenu();
				break;
			case 2:
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
		}
	}
     
}
