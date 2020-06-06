package kr.manamana.coffee;

import java.util.Scanner;

public class Cafe {
    
	private static Coffee[] info = new Coffee[100];
	private static Scanner sc = new Scanner(System.in);
	static int count=0;
	
	public static void main(String[] args) {
       boolean run = true; 
       
       while(run) {
    	   System.out.println("������Դϴ�");
    	   System.out.println("1.�Է� | 2. â����� | 3.����  |31. ����  | 4. ���� | 5.����");
    	   System.out.println("�����ϼ���>>");
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
    		 System.out.println("�ý����� �����մϴ�");
    		 break;
    	 }
    	   
       }
	}
	private static void delete() {
		System.out.println("================");
		System.out.println("Ŀ��������ϱ�");
		System.out.print("�̸��� �����ּ���");
		String bean = sc.next();
		
        if(findbean(bean)==null) {
        	System.out.println("�ش��ϴ����̾����ϴ�");
        }else {
        	for(int i=0; i<(count-1); i++) {
        		info[i] = info[i+1];
        		
        	}
        	count--;
        }
	}
	private static void minusbean() {
		System.out.println("===========");
		System.out.println("����");
		System.out.print("���̸��� �����ּ���");
		String bean = sc.next();
		System.out.print("��ŭ����Ͻʴϱ�?");
		int bal  = sc.nextInt();
		
		if(findbean(bean)==null) {
			System.out.println("�ش��ϴ� ���� �����ϴ�");
			return;
		}else {
			findbean(bean).setGram(findbean(bean).getGram() - bal);
			System.out.println("Ŀ�����Ǿ���"+findbean(bean).getGram()+"�Դϴ�");
		}
	
	}
	//�����̸��� ���� ���� ã�´�
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
		System.out.println("����");
		System.out.print("���̸��� �����ּ���");
		String bean = sc.next();
		System.out.println("�׷��� �Է��ϼ���");
		int balance = sc.nextInt(); //���ؾ� �� �� ��
		
		if(findbean(bean)==null) {
			System.out.println("�ش��ϴ����̾����ϴ�");
		}else {
			findbean(bean).setGram(findbean(bean).getGram() + balance);
			System.out.println("Ŀ�����Ǿ���"+findbean(bean).getGram()+"�Դϴ�");
		}
		
		
	}

	private static void showstroage() {
		System.out.println("===========");
		System.out.println("��� ����մϴ�");
		System.out.print("���̸��� �����ּ���");
		String bean = sc.next();
		
		for(int i=0; i<count; i++) {
			System.out.println("Ŀ�����:"+info[i].getBean()+" "+"Ŀ�ǿ�����:"+info[i].getCountry()+" "+"�׷���:"+info[i].getGram());
		}
		
	}

	private static void input() {
		System.out.println("===========");
		System.out.println("��� �Է��մϴ�");
		System.out.print("���̸��� �����ּ���");
		String bean = sc.next();
		System.out.print("�������� �����ּ���");
		String country = sc.next();
		System.out.println("�׷��� �����ּ���");
		int gram = sc.nextInt();
		
		info[count++] = new Coffee(bean, country, gram);
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�");
		
	}
}
