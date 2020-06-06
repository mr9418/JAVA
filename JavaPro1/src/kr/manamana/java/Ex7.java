package kr.manamana.java;

public class Ex7 {
       public static void main(String[] args) {
		int money = 2680;
		int rest_money = money;
		int count;
		
	int arr [ ] = {500,100,50,10};
	
	for(int i=0; i<4; i++) {
		count = rest_money/arr[i];
		System.out.println(arr[i]+"원"+count);
		rest_money = rest_money - (arr[i]*count);
		System.out.println("남은금액:"+rest_money);
	}
		
		
	}
}
