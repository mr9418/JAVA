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

   //메서드 재정의
	@Override
	public int calcPrice(int price) {
		bonuspoint += price * bonusratio;
		return price - (int)(price * saleRatio);
	}

   //메서드 재정의
	@Override
	public String showInfo() {
		return super.showInfo()+"담당상담자번호는"+agentId+"입니다";
	}


	public int getAgentId() {
		return agentId;
	}
	
	
	
	
}
