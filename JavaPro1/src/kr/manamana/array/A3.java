package kr.manamana.array;

public class A3 {
	//메소드를 사용한 배열
	//int []ar:지역변수로 메소드를 빠져나가면 소멸된다
	public static int [] addarray(int []ar, int addval) {
		for(int i=0; i<ar.length; i++) {
			ar[i]+=addval;
		}
		return ar; //참조값 ar을 그대로 반환
	}
	
	public static void main(String[] args) {
		
        int [] arr = {1,2,3,4,5};
		int [] ref;
		
		ref = addarray(arr,7);
		
		
		if(arr==ref) {
			System.out.println("동일 배열 참조");
		}else {
			System.out.println("다른 배열 참조");
		}
		for(int i=0; i<ref.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
