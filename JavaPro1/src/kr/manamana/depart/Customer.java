package kr.manamana.depart;

public class Customer {
	
	/*private int customerId;
	private String customername;
	private String customergrade;*/
	/*private로 선언하면 외부클래스에서 사용이 불가능하므로
	*외부클래스에서는 사용할 수 없지만 하위클래스에서는 사용할 수 있는 procted로 변경한다
	* protected는 같은 패키지 안에서, 혹은 다른 패키지에서 상속 받아 자손 클래스로 접근이 가능하다
	*/
	protected int customerId;
	protected String customername;
	protected String customergrade;
	int bonuspoint;
	double bonusratio;
	
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomergrade() {
		return customergrade;
	}
	public void setCustomergrade(String customergrade) {
		this.customergrade = customergrade;
	}

	public double getBonusratio() {
		return bonusratio;
	}
	public void setBonusratio(double bonusratio) {
		this.bonusratio = bonusratio;
	}
	
		
	//고객한명이 새로 생성될때 조건을 실버로 지정
	Customer(int customerId, String customername){//default생성자 초기화설정시킴
		this.customername = customername;
		customergrade = "silver"; //기본등급
		bonusratio = 0.01; //보너스포인트 적립비율
				
	}
	//제품에 대해 지불해야 하는 금액을 계산하여 반환 
	public int calcprice(int price) {
		bonuspoint += price * bonusratio; //보너스 포인트계산
		return price;
	}
	public String showCustomerInfo() {
		return customername+"님의 등급은"+customergrade+"이며 보너스포인트는"+bonuspoint+"입니다";
	}
}
