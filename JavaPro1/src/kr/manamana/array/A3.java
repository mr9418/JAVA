package kr.manamana.array;

public class A3 {
	//�޼ҵ带 ����� �迭
	//int []ar:���������� �޼ҵ带 ���������� �Ҹ�ȴ�
	public static int [] addarray(int []ar, int addval) {
		for(int i=0; i<ar.length; i++) {
			ar[i]+=addval;
		}
		return ar; //������ ar�� �״�� ��ȯ
	}
	
	public static void main(String[] args) {
		
        int [] arr = {1,2,3,4,5};
		int [] ref;
		
		ref = addarray(arr,7);
		
		
		if(arr==ref) {
			System.out.println("���� �迭 ����");
		}else {
			System.out.println("�ٸ� �迭 ����");
		}
		for(int i=0; i<ref.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
}
