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
		System.out.println("회원의 이름 : " + name + ", 회원 번호 : " + csn + ", 회원의 키 : " + height + ", 회원의 몸무게 : " + weight);
	}

}
