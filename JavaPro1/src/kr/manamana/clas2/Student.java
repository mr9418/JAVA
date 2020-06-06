package kr.manamana.clas2;

public class Student {
	
	public String stname;
	public String grade;
	public int money;
	
	public Student(String stname,int money) {//학생이름과 돈을 매개변수로 받음
      this.stname = stname;
      this.money = money;
		
	}
	public void takebus(Bus bus) {
		bus.take(1000); //버스를 탈때 1000원지불
		this.money-=1000; //돈은 1000원을 뺀값이다
	}
    public void takeSubway(Subway sub) {
    	sub.take(1200);
    	this.money-=1200;
    }
    public void showInfo() {
    	System.out.println("학생"+stname+"의 남은돈은"+money+"원입니다");
    }
}
