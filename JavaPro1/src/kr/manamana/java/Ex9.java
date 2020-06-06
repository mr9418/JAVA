package kr.manamana.java;

public class Ex9 {
  public static void main(String[] args) {
	int money = 5555;
	int count = 0;
	int coin[] = {500,100,50,10};
	System.out.println("시작금액:"+money);
	
	//coin의 배열의 길이만큼 반복
	for(int i=0; i<coin.length; i++) {
		count = money/coin[i];
		
		money = money % coin[i];
	
		System.out.println(coin[i]+"원의개수"+count);
		System.out.println("남은금액"+money);
	}
}
}
