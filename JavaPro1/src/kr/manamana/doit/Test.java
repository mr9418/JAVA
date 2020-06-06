package kr.manamana.doit;

public class Test {
	
	public static void main(String[] args) {
		Student s1= new Student(1001,"ÀÌ¾¾");
		s1.addSubject("±¹¾î", 50);
		s1.addSubject("¼öÇÐ", 100);
		
		Student s2 = new Student(1002,"±è¾¾");
		s2.addSubject("¿µ¾î", 15);
		s2.addSubject("¼öÇÐ", 89);
		s2.addSubject("±¹¾î", 90);
		
		s1.showStudentInfo();
		System.out.println("----------------------------");
		s2.showStudentInfo();
		
	}

}
