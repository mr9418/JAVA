package kr.manamana.java;

public class Ex8 {
	//남은 동전의 개수를 구하는 프로그램
	public static void main(String[] args) {
		int money = 2680;
		System.out.println("시작금액:"+money);
		
		int count = money/500;
		money = money%500;
		System.out.println("500원개수:"+count);
		System.out.println("남은금액:"+money);
		
	}

}
