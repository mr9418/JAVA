package kr.manamana.depart;

public class VipCustomer extends Customer {
	//앞에 Customer클래스와 동일한 부분은 적지않고 vip만 가지고있는 부분만 적는다
	private int agentID;
	double saleRatio;
  
	
	
	
	public VipCustomer(int customerId,String customername, int agentId) {
	  super(customerId,customername);
	  customergrade = "VIP";
		bonusratio = 0.05;
		saleRatio = 0.1;
	}

	public int agentID() {
		return agentID;
	}


	//상위 클래스에서 정의한 메서드를 하위클래스에서 재정의 할때 사용하는 오버라이딩사용하기
	//메서드이름,매개변수,매개변수자료형이 같아야한다
	 
	@Override
	public int calcprice(int price) {
		bonuspoint+=price * bonusratio; //보너스포인트적립
		return price -(int)(price * saleRatio); //할인된 가격을 계산하여 반환  salqRatio를 double로 지정했으니 int형으로 바꿔야함
	}
	
}
