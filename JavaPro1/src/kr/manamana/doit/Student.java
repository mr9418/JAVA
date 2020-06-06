package kr.manamana.doit;

import java.util.ArrayList;

public class Student {
	int studentId;
	String name;
	ArrayList<Subject> subjectList;
	
   public Student(int studentId, String name) {
	   this.studentId = studentId;
	   this.name = name;
	   subjectList = new ArrayList<Subject>(); //��̸���Ʈ ����
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
		   System.out.println("�л�" + name +"�� " +s.getName()+"����������"+s.getScore()+"�Դϴ�");
	   }
	   System.out.println("�л�"+name+"�� ������"+total+"�Դϴ�");
	   System.out.println("�л�"+name+"�� ���������"+avg+"�Դϴ�");
   }
   
   
}
