package kr.manamana.cafe;

public class Guest {

	public String coffee;
	public int money;
	public int point;

	public Guest(String coffee, int money, int point) {
		this.coffee = coffee;
		this.money = money;
		this.point = point;
	}

	public void order(Americano ame) {
		ame.make(1000);
		this.money -= 1000;
		this.point += point;
	}

	public void order2(Latte latte) {
		latte.make(2000);
		this.money -= 2000;
		this.point += point;
	}

	public void showInfo() {
		System.out.println("�մ���" + coffee + "�� ��Ű�� �ܵ���" + money + "���̰� ����Ʈ��" + point + "�Դϴ�");
	}

}
