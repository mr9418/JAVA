package kr.manamana.depart;

public class CustomerTest2 { 
	
	public static void main(String[] args) {
		Customer c1 = new Customer(10010,"�̼���");
		c1.bonuspoint = 1000;
		VipCustomer v1 = new VipCustomer(10020, "������", 12345);
		v1.bonuspoint = 10000;
		
		int price = 1000;
		System.out.println(c1.getCustomername()+"���� �����ؾ��ϴ� �ݾ���"+c1.calcprice(price)+"�Դϴ�");
		System.out.println(v1.getCustomername()+"���� �����ؾ��ϴ� �ݾ���"+v1.calcprice(price)+"�Դϴ�");
	}

}
