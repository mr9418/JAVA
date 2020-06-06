package kr.manamana.depar2;
//�������� �̿��� Customer����
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
		initCustomer(); //����ް� ���ʽ�����Ʈ ��Ÿ���� �޼ҵ� ȣ��
	
	}	
	//�����ڿ����� ȣ���ϴ� �޼����̹Ƿ� private�� ����
	private void initCustomer() {
		customergrade = "�ǹ�";
		bonusratio = 0.01;
		
	}
	public int calcPrice(int price) {
		bonuspoint += price * bonusratio;
		return price;
	}
    
	public String showInfo() {
		return customername+"���� �����" + customergrade+"�̸� ����Ʈ��" + bonuspoint+"�Դϴ�";
	}
	
}
