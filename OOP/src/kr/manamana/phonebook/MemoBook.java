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
	  System.out.println("이름:"+name);
	  System.out.println("학교:"+school);
	  if(grade!=null) {
		  System.out.println("grade:"+grade);
	  }
	  System.out.println("");
  }  
}

public class MemoBook {
     static Scanner keyboard = new Scanner(System.in);
     
     
     public static void showMenu() {
    	 System.out.println("선택하세요:");
    	 System.out.println("1.데이터입력");
    	 System.out.println("2.프로그램종료");
    	 System.out.println("선택:");
     }
     
     public static void readMenu() {
    	System.out.println("이름:");
    	String name = keyboard.nextLine();
    	System.out.println("학교:");
    	String school = keyboard.nextLine();
    	System.out.println("학년");
    	String grade = keyboard.nextLine();
    	
    	MemoInfo info = new MemoInfo(name, school, grade);
    	System.out.println("입력된 정보출력");
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
				System.out.println("프로그램을 종료합니다");
				return;
			}
		}
	}
     
}
