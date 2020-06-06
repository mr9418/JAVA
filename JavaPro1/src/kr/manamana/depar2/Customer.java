package kr.manamana.depar2;
//다형성을 이용한 Customer관리
public class Customer {
	
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

	public Customer() {
	  initCustomer();
	}
   
	public Customer(int customerId,String customername) {
		this.customerId = customerId;
		this.customername = customername;
		initCustomer(); //고객등급과 보너스포인트 나타내는 메소드 호출
	
	}	
	//생성자에서만 호출하는 메서드이므로 private로 선언
	private void initCustomer() {
		customergrade = "실버";
		bonusratio = 0.01;
		
	}
	public int calcPrice(int price) {
		bonuspoint += price * bonusratio;
		return price;
	}
    
	public String showInfo() {
		return customername+"님의 등급은" + customergrade+"이며 포인트는" + bonuspoint+"입니다";
	}
	
}
