package kr.manamana.depar2;

public class CustomerTest {  
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCustomername("�̼���");
		c1.setCustomerId(10010);
		c1.bonuspoint = 1000;
	  
		System.out.println(c1.showInfo());
	   
		//Vip�� Customer������ ����
		Customer v1 = new VipCustomer(10020, "������", 12345);
		v1.bonuspoint = 10000;
		
		System.out.println(v1.showInfo());
		System.out.println("------------������ ����ϱ�-------------");
		
		int price = 10000;
		int c1price = c1.calcPrice(price);
		int v1price = v1.calcPrice(price);
		
		System.out.println(c1.getCustomername()+"���� "+c1price+"�� �����Ͽ����ϴ�");
		System.out.println(c1.showInfo());
		System.out.println(v1.getCustomername()+"����"+v1price+"�� �����Ͽ����ϴ�");
		System.out.println(v1.showInfo());
	}

}
