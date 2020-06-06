package kr.manamana.java;

public class Ex5 {
	//Method 함수
	// 인수:실제 동전 , 매개변수:동전타입
	//호출->매직박스넣기->return 
	//void-return하지 않겟다를의미
	//static으로 메모리를띄어준다(new는static이아닌모든것-heap)
	static int add(int n1,int n2) {
		int result = n1+n2;
		//System.out.println("result:"+result);
		return result;
	}
	static int minus(int n1,int n2) {
		int result = n1-n2;
		return result;
	}
   public static void main(String[] args) {
       //Ex5.add(5,3);
	 /*첫번째로 static을 메모리에 올리기때문에 14번라인(메인부터시작)부터 시작하다가
	  * 메소드Ex5.add(4,4)를 실행하기 위해 9번으로 돌아감
	  * return 값 8을 가지고 다시 14번라인을 다시 실행한다
	  */
	   int num = Ex5.add(4,4);
	   System.out.println("결과:"+num);
	   
	   int num2 = Ex5.minus(5, 3);
	   System.out.println("결과:"+num2);
  }
}
