package kr.manama.account2;

import java.util.Scanner;

public class AccountMana {

	Account[] arr = new Account[20];
	int counter = 0;
	Scanner sc = new Scanner(System.in);

	public void insert() { // 저장하기
		System.out.println("계좌명을 입력하세요");
		String name = sc.next();
		System.out.println("계좌번호를 입력하세요");
		String ano = sc.next();
		System.out.println("초기 입금금액을 입력하세요");
		int balance = sc.nextInt();
		arr[counter++] = new Account(name, ano, balance);
		System.out.println("계좌가 생성되었습니다");

	}

	public void print() { // 출력하기
		for (int i = 0; i < counter; i++) {
			System.out.println("계좌명:" + " " + arr[i].getName() + "계좌번호:" + " " + arr[i].getAno() + "금액:" + " "
					+ arr[i].getBalance());
		}
	}

	public void deposit() { //예금하기
		System.out.print("계좌명을 조회홥니다 이름을 입력하세요");
		String name = sc.next();
		 System.out.print("입금하실 금액을 입력해주세요");
		  int money = sc.nextInt();
		for(int i=0; i<counter; i++) {
			if(arr[i].getName()==null) {
				System.out.println("해당하는 계좌명이 없습니다");
			}else {
				arr[i].setBalance(arr[i].getBalance()+money);
			}
			System.out.println("잔액은"+arr[i].getBalance()+"원입니다");
			 
		}
		
	  }
		
    

	public void withdrew() { // 출금하기
        System.out.println("계좌명을 입력해주세요");
        String name = sc.next();
        System.out.println("출금하실 금액을 입력해주세요");
        int money =sc.nextInt();
        for(int i=0; i<counter; i++) {
        	if(arr[i].getName()==null) {
        		System.out.println("해당하는 계좌가 없습니다");
        	}else {
        		arr[i].setBalance(arr[i].getBalance()-money);
        	}
        	System.out.println("잔액은"+arr[i].getBalance()+"원입니다");
        }
	}

	public void delete() { // 삭제하기
	  System.out.print("계좌를 삭제합니다 삭제하실 계좌명을 입력하세요");
	  String name = sc.next();
	  for(int i=0; i<counter; i++) {
		  if(arr[i].getName()==null) {
			  System.out.println("삭제하실 계좌가 없습니다");
		  }
		  for(int j=i; j<counter; j++) {
			  arr[j] = arr[j+1];
		  }
		  counter--;
	  }
	  
	}

	
}
