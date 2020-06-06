package kr.manamana.doit;

import java.util.ArrayList;

public class Student {
	int studentId;
	String name;
	ArrayList<Subject> subjectList;
	
   public Student(int studentId, String name) {
	   this.studentId = studentId;
	   this.name = name;
	   subjectList = new ArrayList<Subject>(); //어레이리스트 생성
   }
   
   public void addSubject(String name, int score) {
	   Subject subject = new Subject();
	   subject.setName(name);
	   subject.setScore(score);
	   subjectList.add(subject);
	   
   }
   public void showStudentInfo() {
	   int total = 0; 
	   int avg = 0;
	   for(Subject s : subjectList) {
		   total+=s.getScore();
		  avg+=s.getScore()/3;
		   System.out.println("학생" + name +"의 " +s.getName()+"과목정석은"+s.getScore()+"입니다");
	   }
	   System.out.println("학생"+name+"의 총점은"+total+"입니다");
	   System.out.println("학생"+name+"의 평균점수는"+avg+"입니다");
   }
   
   
}
