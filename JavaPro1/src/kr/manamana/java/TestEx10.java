package kr.manamana.java;

public class TestEx10 {
  //1.1���� 10������ ��
	
	public static void main(String[] args) {
		 //1.1���� 10������ ��
		/*int sum =0;
		for(int i=1; i<=10; i++) {
			sum +=i;
			System.out.println(sum);
		}
	}*/
	//2.1����100������ ���� 3����� ��
	  int sum = 0;
	  for(int i=0; i<=100; i++) {
		  if(i%3==0) {
			  sum+=i;
		  }else {
			  
		  }
	  }
	  System.out.println(sum);
	}  
}
