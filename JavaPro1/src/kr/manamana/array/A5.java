package kr.manamana.array;

public class A5 {
	//������ �迭
  /*int[][] arr1 = new int[7][2]
   * 2���� �迭 arr�� ����n,����m�� ��ġ�� 20�� �����ҷ���
   * arr[N-1][M-1] = 20���� ǥ���Ѵ�  ��: 0�������� �����ϹǷ�
   */
	
	public static void main(String[] args) {
		int [][] arr = new int[3][4];
		
		for(int i=0; i<3; i++)
			for(int j=0; j<4;j++)
				arr[i][j]= i+j;
		
		for(int i=0; i<3; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

}
