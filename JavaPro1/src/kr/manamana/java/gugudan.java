package kr.manamana.java;

import java.util.Scanner;

public class gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����մϴ�");
	  boolean confirm = true;	//boolean�Ǻ�����true�ϱ�
	  while(confirm) {//while���� true���ӹݺ�
		  System.out.println("���ڸ��Է��ϼ���");
		  int num = sc.nextInt();
		  
	for(int i=0; i<10; i++) {
		System.out.println(num+"X"+i+"="+num*i );
	}
	System.out.println("�Լ������ұ��? y or n");
    String check = sc.next();
    
    if(check.equals("n")) {
    	confirm = false;
    }
		  
	  }
	  System.out.println("������ ���α׷� ����");
		
	}

}
