package kr.manamana.java;

public class Ex9 {
  public static void main(String[] args) {
	int money = 5555;
	int count = 0;
	int coin[] = {500,100,50,10};
	System.out.println("���۱ݾ�:"+money);
	
	//coin�� �迭�� ���̸�ŭ �ݺ�
	for(int i=0; i<coin.length; i++) {
		count = money/coin[i];
		
		money = money % coin[i];
	
		System.out.println(coin[i]+"���ǰ���"+count);
		System.out.println("�����ݾ�"+money);
	}
}
}
