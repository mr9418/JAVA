package kr.manamana.depar2;

public class Gold extends Customer {
  
	double saleratio;

	

	public Gold(int customerId, String customername) {
		super(customerId, customername);
		customergrade ="���";
		bonusratio = 0.02;
		saleratio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonuspoint += price * bonusratio;
		return price - (int)(price * saleratio);
	}

	@Override
	public String showInfo() {
		return customername+"���� �����" + customergrade+"�̸� ����Ʈ��" + bonuspoint+"�Դϴ�";
	}
	
}
