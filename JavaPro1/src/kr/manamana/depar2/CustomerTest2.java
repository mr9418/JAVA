package kr.manamana.depar2;

import java.util.ArrayList;

public class CustomerTest2 {
	
	
	public static void main(String[] args) {
		//ArrayList를 사용하여 5명의 고객들을 구하기 
		//Customer형으로 선언하면 상속받은 애들을 전부 사용이 가능하다
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer c11 = new Customer(10010,"이순신1");
		Customer c2 = new Customer(10011,"이순신2");
		Customer c3 = new Gold(10012,"이순신3");
		Customer c4 = new Gold(10013,"이순신4");
		Customer c5 = new VipCustomer(10014,"이순신5",12345);
		
		//add속성을 사용해 객체배열에 고객추가
		customerList.add(c11);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		
		System.out.println("================고객정보출력===============");
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println("-============할인율과보너스포인트계산============");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomername()+"님이"+cost+"원을 지불하였습니다");
			System.out.println(customer.getCustomername()+"님의 현재 보너스포인트는"+customer.bonuspoint+"입니다");
			System.out.println(customer.showInfo());
		}
		
	}
	

}
