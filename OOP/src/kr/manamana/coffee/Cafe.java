package kr.manamana.coffee;

import java.util.Scanner;

public class Cafe {
    
	private static Coffee[] info = new Coffee[100];
	private static Scanner sc = new Scanner(System.in);
	static int count=0;
	
	public static void main(String[] args) {
       boolean run = true; 
       
       while(run) {
    	   System.out.println("재고장입니다");
    	   System.out.println("1.입력 | 2. 창고출력 | 3.입하  |31. 삭제  | 4. 출하 | 5.종료");
    	   System.out.println("선택하세요>>");
    	 int choice = sc.nextInt();
    	 
    	 if(choice == 1) {
    		 input();
    	 }else if(choice==2) {
    		 showstroage();
    	 }else if(choice==3) {
    		 plusbean();
    	 }else if(choice==4) {
    		 minusbean();
    	 }else if(choice==31) {
    		 delete(); 
    	 }else {
    		 System.out.println("시스템을 종료합니다");
    		 break;
    	 }
    	   
       }
	}
	private static void delete() {
		System.out.println("================");
		System.out.println("커피콩삭제하기");
		System.out.print("이름을 적어주세요");
		String bean = sc.next();
		
        if(findbean(bean)==null) {
        	System.out.println("해당하는콩이없습니다");
        }else {
        	for(int i=0; i<(count-1); i++) {
        		info[i] = info[i+1];
        		
        	}
        	count--;
        }
	}
	private static void minusbean() {
		System.out.println("===========");
		System.out.println("출하");
		System.out.print("콩이름을 적어주세요");
		String bean = sc.next();
		System.out.print("얼만큼사용하십니까?");
		int bal  = sc.nextInt();
		
		if(findbean(bean)==null) {
			System.out.println("해당하는 콩이 없습니다");
			return;
		}else {
			findbean(bean).setGram(findbean(bean).getGram() - bal);
			System.out.println("커피콩의양은"+findbean(bean).getGram()+"입니다");
		}
	
	}
	//같은이름을 가진 콩을 찾는다
	private static Coffee findbean(String bean) {
		for(int i=0; i<count; i++) {
			if(info[i].getBean().equals(bean)) {
				return info[i];
			}
		}
		return null;
	}
	
	

	private static void plusbean() {
		System.out.println("===========");
		System.out.println("입하");
		System.out.print("콩이름을 적어주세요");
		String bean = sc.next();
		System.out.println("그램을 입력하세요");
		int balance = sc.nextInt(); //더해야 할 콩 양
		
		if(findbean(bean)==null) {
			System.out.println("해당하는콩이없습니다");
		}else {
			findbean(bean).setGram(findbean(bean).getGram() + balance);
			System.out.println("커피콩의양은"+findbean(bean).getGram()+"입니다");
		}
		
		
	}

	private static void showstroage() {
		System.out.println("===========");
		System.out.println("재고를 출력합니다");
		System.out.print("콩이름을 적어주세요");
		String bean = sc.next();
		
		for(int i=0; i<count; i++) {
			System.out.println("커피콩명:"+info[i].getBean()+" "+"커피원산지:"+info[i].getCountry()+" "+"그램수:"+info[i].getGram());
		}
		
	}

	private static void input() {
		System.out.println("===========");
		System.out.println("재고를 입력합니다");
		System.out.print("콩이름을 적어주세요");
		String bean = sc.next();
		System.out.print("원산지를 적어주세요");
		String country = sc.next();
		System.out.println("그램을 적어주세요");
		int gram = sc.nextInt();
		
		info[count++] = new Coffee(bean, country, gram);
		System.out.println("입력이 완료되었습니다");
		
	}
}
