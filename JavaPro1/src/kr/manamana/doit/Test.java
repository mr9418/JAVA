package kr.manamana.doit;

public class Test {
	
	public static void main(String[] args) {
		Student s1= new Student(1001,"�̾�");
		s1.addSubject("����", 50);
		s1.addSubject("����", 100);
		
		Student s2 = new Student(1002,"�达");
		s2.addSubject("����", 15);
		s2.addSubject("����", 89);
		s2.addSubject("����", 90);
		
		s1.showStudentInfo();
		System.out.println("----------------------------");
		s2.showStudentInfo();
		
	}

}
