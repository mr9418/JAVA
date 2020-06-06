package kr.manamana.depart;

public class CustomerTest2 { 
	
	public static void main(String[] args) {
		Customer c1 = new Customer(10010,"이순신");
		c1.bonuspoint = 1000;
		VipCustomer v1 = new VipCustomer(10020, "김유신", 12345);
		v1.bonuspoint = 10000;
		
		int price = 1000;
		System.out.println(c1.getCustomername()+"님이 지불해야하는 금액은"+c1.calcprice(price)+"입니다");
		System.out.println(v1.getCustomername()+"님이 지불해야하는 금액은"+v1.calcprice(price)+"입니다");
	}

}
