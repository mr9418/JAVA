package kr.manamana.clas2;

public class Take {
	
	public static void main(String[] args) {
		//�л�����
		Student st1 = new Student("���ӽ�",15000);
		Student st2 = new Student("����",10000);
		
		//��������
		Bus bus100 = new Bus(100);
		st1.takebus(bus100);
		st1.showInfo();
		bus100.showInfo();
		
		//����ö����
		Subway subgreen = new Subway("2ȣ��");
		st1.takeSubway(subgreen);
		st1.showInfo();
		st2.takeSubway(subgreen);
		st2.showInfo();
		subgreen.showInfo();
		st2.takebus(bus100);
		st2.showInfo();
		
	}

}
