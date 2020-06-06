package kr.manamana.array;

public class A5 {
	//이차원 배열
  /*int[][] arr1 = new int[7][2]
   * 2차원 배열 arr의 세로n,가로m인 위치에 20을 저장할려면
   * arr[N-1][M-1] = 20으로 표현한다  왜: 0에서부터 시작하므로
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
