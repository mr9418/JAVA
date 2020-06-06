package kr.manamana.cafe;

public class Latte {
	
	int money;
	String name;
	int coffeecup;
   
	
	public Latte(String name) {
		this.name = name;
	}
	
	public void make(int money) {
		this.money+=money;
		coffeecup++;
		
	}
	public void showInfo() {
		System.out.println("Ä«Æä¶ó¶¼´Â"+coffeecup+"ÀÜ ÆÈ·È½À´Ï´Ù");
	}
}
