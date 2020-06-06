package kr.manamana.array;

import java.util.Scanner;

public class A4 {
   //배열에 저장된 최대값과 최솟값을 구해서 반환한는 메소드
	public static int maxValue(int[] arr) {
		int max =arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int minValue(int[]arr) {
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] intarr = new int[7]; //배열길이 임의설정
		
	   for(int i =0; i<intarr.length; i++) {
		   System.out.print("정수입력:");
		   intarr[i] = keyboard.nextInt();
	   }
	   
	   System.out.println("최댓값은:"+maxValue(intarr));
	   System.out.println("최솟값은:"+minValue(intarr));
	}
}
