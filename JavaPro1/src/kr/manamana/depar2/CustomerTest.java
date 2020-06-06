package kr.manamana.depar2;

public class CustomerTest {  
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCustomername("이순신");
		c1.setCustomerId(10010);
		c1.bonuspoint = 1000;
	  
		System.out.println(c1.showInfo());
	   
		//Vip를 Customer형으로 선언
		Customer v1 = new VipCustomer(10020, "김유신", 12345);
		v1.bonuspoint = 10000;
		
		System.out.println(v1.showInfo());
		System.out.println("------------할인율 계산하기-------------");
		
		int price = 10000;
		int c1price = c1.calcPrice(price);
		int v1price = v1.calcPrice(price);
		
		System.out.println(c1.getCustomername()+"님이 "+c1price+"원 지불하였습니다");
		System.out.println(c1.showInfo());
		System.out.println(v1.getCustomername()+"님이"+v1price+"원 지불하였습니다");
		System.out.println(v1.showInfo());
	}

}
