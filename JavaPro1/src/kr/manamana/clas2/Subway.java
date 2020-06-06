package kr.manamana.clas2;

public class Subway {
     
	String line;
	int passenger;
	int money;
	
	public Subway(String line) {
		this.line = line;
	}
	
	public void take(int money) {
		this.money +=money;
		passenger++;
	}
	public void showInfo() {
		System.out.println("현재"+line+"에서 승객은"+passenger+"명이고 수입은"+money+"원입니다");
	}
}
