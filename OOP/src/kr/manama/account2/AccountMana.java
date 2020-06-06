package kr.manama.account2;

import java.util.Scanner;

public class AccountMana {

	Account[] arr = new Account[20];
	int counter = 0;
	Scanner sc = new Scanner(System.in);

	public void insert() { // �����ϱ�
		System.out.println("���¸��� �Է��ϼ���");
		String name = sc.next();
		System.out.println("���¹�ȣ�� �Է��ϼ���");
		String ano = sc.next();
		System.out.println("�ʱ� �Աݱݾ��� �Է��ϼ���");
		int balance = sc.nextInt();
		arr[counter++] = new Account(name, ano, balance);
		System.out.println("���°� �����Ǿ����ϴ�");

	}

	public void print() { // ����ϱ�
		for (int i = 0; i < counter; i++) {
			System.out.println("���¸�:" + " " + arr[i].getName() + "���¹�ȣ:" + " " + arr[i].getAno() + "�ݾ�:" + " "
					+ arr[i].getBalance());
		}
	}

	public void deposit() { //�����ϱ�
		System.out.print("���¸��� ��ȸ�d�ϴ� �̸��� �Է��ϼ���");
		String name = sc.next();
		 System.out.print("�Ա��Ͻ� �ݾ��� �Է����ּ���");
		  int money = sc.nextInt();
		for(int i=0; i<counter; i++) {
			if(arr[i].getName()==null) {
				System.out.println("�ش��ϴ� ���¸��� �����ϴ�");
			}else {
				arr[i].setBalance(arr[i].getBalance()+money);
			}
			System.out.println("�ܾ���"+arr[i].getBalance()+"���Դϴ�");
			 
		}
		
	  }
		
    

	public void withdrew() { // ����ϱ�
        System.out.println("���¸��� �Է����ּ���");
        String name = sc.next();
        System.out.println("����Ͻ� �ݾ��� �Է����ּ���");
        int money =sc.nextInt();
        for(int i=0; i<counter; i++) {
        	if(arr[i].getName()==null) {
        		System.out.println("�ش��ϴ� ���°� �����ϴ�");
        	}else {
        		arr[i].setBalance(arr[i].getBalance()-money);
        	}
        	System.out.println("�ܾ���"+arr[i].getBalance()+"���Դϴ�");
        }
	}

	public void delete() { // �����ϱ�
	  System.out.print("���¸� �����մϴ� �����Ͻ� ���¸��� �Է��ϼ���");
	  String name = sc.next();
	  for(int i=0; i<counter; i++) {
		  if(arr[i].getName()==null) {
			  System.out.println("�����Ͻ� ���°� �����ϴ�");
		  }
		  for(int j=i; j<counter; j++) {
			  arr[j] = arr[j+1];
		  }
		  counter--;
	  }
	  
	}

	
}
