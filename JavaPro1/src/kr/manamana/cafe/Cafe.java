package kr.manamana.cafe;

public class Cafe {
    
	public static void main(String[] args) {
		
		Guest g1 = new Guest("�Ƹ޸�ī��",5000,100);
	    Guest g2 = new Guest("ī���",10000,1500);
	    
	    Americano peru = new Americano("peru");
	    Latte latte = new Latte("latte");
	    
	    g1.order(peru);
	    g1.showInfo();
	    g2.order2(latte);
	    g2.showInfo();
	   
	    peru.showInfo();
	    latte.showInfo();
	}
}
