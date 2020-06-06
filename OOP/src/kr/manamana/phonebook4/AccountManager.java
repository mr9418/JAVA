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
			System.out.println("1.계좌생성| 2.계좌목록 | 3.예금 | 4. 출금 | 5.종료");
			System.out.println("=--------------------------------=");
			System.out.println("선택하기>>");
			
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
		System.out.println("프로그램 종료");
	}
		
	
    private static void createAccount() {
    	System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.next();

		System.out.print("계좌주: ");
		String owner = sc.next();

		System.out.print("초기입금액: ");
		int money = sc.nextInt();
     
		accountArray[count++] = new Account(ano, owner, money);
		System.out.println("계좌가 생성되었습니다");
		/*for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, money);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}*/
	}
    private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
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
    //account배열에서 ano와 동일한 계좌 찾기
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
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("예금액: ");
		int dep = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			findAccount(ano).setBalance(findAccount(ano).getBalance() + dep);
			System.out.println("결과: 입금이 성공되었습니다.");
		}
		
	}
    private static void withdrew() {
    	System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String ano = sc.next();
		System.out.print("출금액: ");
		int withd = sc.nextInt();

		if (findAccount(ano) == null) {
			System.out.println("입력한 계좌번호를 찾지 못했습니다.");
		} else {
			if (withd > findAccount(ano).getBalance()) {
				System.out.println("잔액보다 큰 액수를 입력하셨습니다.");
			} else {
				findAccount(ano).setBalance(findAccount(ano).getBalance() - withd);
				System.out.println("결과: 출금이 성공되었습니다.");
				System.out.println("잔액:"+findAccount(ano).getBalance());
			}
		}
    }
}   