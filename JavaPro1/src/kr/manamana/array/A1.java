package kr.manamana.array;

public class A1 { 
	
	public static void main(String[] args) {
		//길이가 3인 int 배열 = 3개의 int형 데이터가 저장 가능한 배열
		int [] arr = new int [3];
		
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		
		int sum = arr[0]+arr[1]+arr[2];
		System.out.println(sum);
	}

}
