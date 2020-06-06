package kr.manamana.depar2;

public class VipCustomer extends Customer{ 
	
	private int agentId;
	double saleRatio;
	

	public VipCustomer(int customerId, String customername,int agentId) {
		super(customerId, customername);
		customergrade = "vip";
		bonusratio = 0.05;
		saleRatio = 0.1;
		this.agentId = agentId;
	}

   //�޼��� ������
	@Override
	public int calcPrice(int price) {
		bonuspoint += price * bonusratio;
		return price - (int)(price * saleRatio);
	}

   //�޼��� ������
	@Override
	public String showInfo() {
		return super.showInfo()+"������ڹ�ȣ��"+agentId+"�Դϴ�";
	}


	public int getAgentId() {
		return agentId;
	}
	
	
	
	
}
