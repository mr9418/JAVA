package kr.manamana.java;
//����
class person{
	String name = "ȫ�浿";
	int age = 29;
	char gender = '��';
	String email = "hahaha@naver.com";
	String phone = "0000-1111";
}

public class Ex3 {
  public static void main(String[] args) {
	person a = new person();
	System.out.println(a.age);
	System.out.println(a.email);
	System.out.println(a.gender);
	System.out.println(a.phone);
	System.out.println(a.name);
  }
}
