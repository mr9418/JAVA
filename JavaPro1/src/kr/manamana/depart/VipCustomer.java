package kr.manamana.depart;

public class VipCustomer extends Customer {
	//�տ� CustomerŬ������ ������ �κ��� �����ʰ� vip�� �������ִ� �κи� ���´�
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


	//���� Ŭ�������� ������ �޼��带 ����Ŭ�������� ������ �Ҷ� ����ϴ� �������̵�����ϱ�
	//�޼����̸�,�Ű�����,�Ű������ڷ����� ���ƾ��Ѵ�
	 
	@Override
	public int calcprice(int price) {
		bonuspoint+=price * bonusratio; //���ʽ�����Ʈ����
		return price -(int)(price * saleRatio); //���ε� ������ ����Ͽ� ��ȯ  salqRatio�� double�� ���������� int������ �ٲ����
	}
	
}
