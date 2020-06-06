package kr.manamana.java;
//메서드(함수)는 메서드 안에 작성할 수 없다
//class안에 메서드(함수)작성
public class Mem {
    int num = 10;
    static String name  = "홍길동";
    void test() {
    	//지역변수라서 날아감
    	int num = 5;
    	
    }
    
    public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:"+sum);
		Mem m = new Mem( );//주소를 가지고 있는것들은 4바이드 ,new 하면 heap이생성됨
		m.test();//test는static이 아니라 heap이 들고있음
		System.out.println("번호:"+m.num);//num도 static이 아니라 heap이들고있음
		System.out.println(1);
		System.out.println(2);
		System.out.println("프로그램종료");
		
		
	}
}
