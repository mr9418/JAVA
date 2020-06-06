package kr.manamana.clas2;

public class Take {
	
	public static void main(String[] args) {
		//학생생성
		Student st1 = new Student("제임스",15000);
		Student st2 = new Student("고슬링",10000);
		
		//버스생성
		Bus bus100 = new Bus(100);
		st1.takebus(bus100);
		st1.showInfo();
		bus100.showInfo();
		
		//지하철생성
		Subway subgreen = new Subway("2호선");
		st1.takeSubway(subgreen);
		st1.showInfo();
		st2.takeSubway(subgreen);
		st2.showInfo();
		subgreen.showInfo();
		st2.takebus(bus100);
		st2.showInfo();
		
	}

}
