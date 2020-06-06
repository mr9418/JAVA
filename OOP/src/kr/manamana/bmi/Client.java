package kr.manamana.bmi;

public class Client {
	
	private String name;
	private String csn;
	private double height;
	private double weight;
	
	
	
	public Client() {};
	
	public Client(String name, String csn, double height, double weight) {
		super();
		this.name = name;
		this.csn = csn;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCsn() {
		return csn;
	}
	public void setCsn(String csn) {
		this.csn = csn;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void print(){
		System.out.println("ȸ���� �̸� : " + name + ", ȸ�� ��ȣ : " + csn + ", ȸ���� Ű : " + height + ", ȸ���� ������ : " + weight);
	}

}
