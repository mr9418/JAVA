package kr.manamana.depart;

public class Customer {
	
	/*private int customerId;
	private String customername;
	private String customergrade;*/
	/*private�� �����ϸ� �ܺ�Ŭ�������� ����� �Ұ����ϹǷ�
	*�ܺ�Ŭ���������� ����� �� ������ ����Ŭ���������� ����� �� �ִ� procted�� �����Ѵ�
	* protected�� ���� ��Ű�� �ȿ���, Ȥ�� �ٸ� ��Ű������ ��� �޾� �ڼ� Ŭ������ ������ �����ϴ�
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
	
		
	//���Ѹ��� ���� �����ɶ� ������ �ǹ��� ����
	Customer(int customerId, String customername){//default������ �ʱ�ȭ������Ŵ
		this.customername = customername;
		customergrade = "silver"; //�⺻���
		bonusratio = 0.01; //���ʽ�����Ʈ ��������
				
	}
	//��ǰ�� ���� �����ؾ� �ϴ� �ݾ��� ����Ͽ� ��ȯ 
	public int calcprice(int price) {
		bonuspoint += price * bonusratio; //���ʽ� ����Ʈ���
		return price;
	}
	public String showCustomerInfo() {
		return customername+"���� �����"+customergrade+"�̸� ���ʽ�����Ʈ��"+bonuspoint+"�Դϴ�";
	}
}
