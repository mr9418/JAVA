package kr.manamana.clas2;

public class Student {
	
	public String stname;
	public String grade;
	public int money;
	
	public Student(String stname,int money) {//�л��̸��� ���� �Ű������� ����
      this.stname = stname;
      this.money = money;
		
	}
	public void takebus(Bus bus) {
		bus.take(1000); //������ Ż�� 1000������
		this.money-=1000; //���� 1000���� �����̴�
	}
    public void takeSubway(Subway sub) {
    	sub.take(1200);
    	this.money-=1200;
    }
    public void showInfo() {
    	System.out.println("�л�"+stname+"�� ��������"+money+"���Դϴ�");
    }
}
