package kr.manamana.java;

class 동물{
	static String name="사자";
	static String color="노랑";
	static int speed = 100;
	static char gender = '여';		
}
/*heap
 * new 연산자 특징:내가 원하는 시점에 메모리에 로드
 * 필요할 때 마다 생성 하는것 (생성과 소멸이 계속 반복)
 * 메모리의 특정공간은 static 
 * 또 다른 특정공간은 heap 
 * */
public class Ex2 {
	static int name  = 100;
	//공간이 다르면 변수가 같아도 상관안한다
	static int num = 10;
   public static void main(String[] args) {
	System.out.println("동물생성준비");
	//동물 a = new 동물 로 새로운 주소를 만들어줌
	동물 a = new 동물();
	//출력하면 내가 custom class한것이 나온다 힙에 저장된게나옴
	System.out.println(a.gender);
	/*System.out.println(동물.color);
	System.out.println(동물.name);
	System.out.println(동물.speed);
	System.out.println(동물.gender);*/
	System.out.println(num);
	System.out.println(name);
   }
   
   
   
}