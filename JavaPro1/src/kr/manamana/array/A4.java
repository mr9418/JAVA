package kr.manamana.array;

import java.util.Scanner;

public class A4 {
   //�迭�� ����� �ִ밪�� �ּڰ��� ���ؼ� ��ȯ�Ѵ� �޼ҵ�
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
		int[] intarr = new int[7]; //�迭���� ���Ǽ���
		
	   for(int i =0; i<intarr.length; i++) {
		   System.out.print("�����Է�:");
		   intarr[i] = keyboard.nextInt();
	   }
	   
	   System.out.println("�ִ���:"+maxValue(intarr));
	   System.out.println("�ּڰ���:"+minValue(intarr));
	}
}
