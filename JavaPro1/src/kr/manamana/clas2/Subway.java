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
		System.out.println("����"+line+"���� �°���"+passenger+"���̰� ������"+money+"���Դϴ�");
	}
}
