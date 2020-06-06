package kr.manamana.depar2;

import java.util.ArrayList;

public class CustomerTest2 {
	
	
	public static void main(String[] args) {
		//ArrayList�� ����Ͽ� 5���� ������ ���ϱ� 
		//Customer������ �����ϸ� ��ӹ��� �ֵ��� ���� ����� �����ϴ�
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c11 = new Customer(10010,"�̼���1");
		Customer c2 = new Customer(10011,"�̼���2");
		Customer c3 = new Gold(10012,"�̼���3");
		Customer c4 = new Gold(10013,"�̼���4");
		Customer c5 = new VipCustomer(10014,"�̼���5",12345);
		
		//add�Ӽ��� ����� ��ü�迭�� ���߰�
		customerList.add(c11);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		System.out.println("================���������===============");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println("-============�����������ʽ�����Ʈ���============");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomername()+"����"+cost+"���� �����Ͽ����ϴ�");
			System.out.println(customer.getCustomername()+"���� ���� ���ʽ�����Ʈ��"+customer.bonuspoint+"�Դϴ�");
			System.out.println(customer.showInfo());
		}
		
	}
	

}
