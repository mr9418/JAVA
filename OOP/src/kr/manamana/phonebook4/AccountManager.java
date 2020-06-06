package kr.manamana.phonebook4;

import java.util.Scanner;

public class AccountManager {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	private static int count =0; 
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("=-------------------------------=");
			System.out.println("1.���»���| 2.���¸�� | 3.���� | 4. ��� | 5.����");
			System.out.println("=--------------------------------=");
			System.out.println("�����ϱ�>>");
			
			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdrew();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
		
	
    private static void createAccount() {
    	System.out.println("--------");
		System.out.println("���»���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();

		System.out.print("������: ");
		String owner = sc.next();

		System.out.print("�ʱ��Աݾ�: ");
		int money = sc.nextInt();
     
		accountArray[count++] = new Account(ano, owner, money);
		System.out.println("���°� �����Ǿ����ϴ�");
		/*for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, money);
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}*/
	}
    private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸��");
		System.out.println("--------");
		for(int i=0; i<count; i++) {
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}
		/*for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				break;
			}
			System.out.println(
					accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t" + accountArray[i].getBalance());
		}*/
	}
    //account�迭���� ano�� ������ ���� ã��
    private static Account findAccount(String ano) {
    	for(int i=0; i<count; i++) {
    		if(accountArray[i].getAno().equals(ano)) {
    			return accountArray[i];
    		}
    	}
    	return null;
    	
    }
    	/*for(int i=0; i<accountArray.length; i++) {
    		if(accountArray[i] == null) {
    			break;
    		}
    		if(accountArray[i].getAno().equals(ano)) {
    			return accountArray[i];
    		}
    	}
    	return null;
    	
    }*/
      
    private static void deposit() {
    	System.out.println("--------");
		System.out.println("����");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("���ݾ�: ");
		int dep = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
			System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
		}
		
	}
    private static void withdrew() {
    	System.out.println("--------");
		System.out.println("���");
		System.out.println("--------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("��ݾ�: ");
		int withd = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("�Է��� ���¹�ȣ�� ã�� ���߽��ϴ�.");
		} else {
			if (withd > findAccount(ano).getBalance()) {
				System.out.println("�ܾ׺��� ū �׼��� �Է��ϼ̽��ϴ�.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("���: ����� �����Ǿ����ϴ�.");
				System.out.println("�ܾ�:"+findAccount(ano).getBalance());
			}
		}
    }
}   