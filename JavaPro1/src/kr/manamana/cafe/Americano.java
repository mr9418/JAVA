package kr.manamana.cafe;

public class Americano {
	
	int money;
	String name;
	int coffeecup;
	
	
	public Americano(String name) {
		this.name = name;
	}
	
	public void make(int money) {
		this.money+=money;
		coffeecup++;
		
	}
	public void showInfo() {
		System.out.println("¾Æ¸Þ¸®Ä«³ë"+coffeecup+"ÀÜÀ» ÆÈ¾Ñ¾¹´Ï´Ù");
	}

}
