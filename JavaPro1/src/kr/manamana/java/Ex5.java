package kr.manamana.java;

public class Ex5 {
	//Method �Լ�
	// �μ�:���� ���� , �Ű�����:����Ÿ��
	//ȣ��->�����ڽ��ֱ�->return 
	//void-return���� �ʰٴٸ��ǹ�
	//static���� �޸𸮸�����ش�(new��static�̾ƴѸ���-heap)
	static int add(int n1,int n2) {
		int result = n1+n2;
		//System.out.println("result:"+result);
		return result;
	}
	static int minus(int n1,int n2) {
		int result = n1-n2;
		return result;
	}
   public static void main(String[] args) {
       //Ex5.add(5,3);
	 /*ù��°�� static�� �޸𸮿� �ø��⶧���� 14������(���κ��ͽ���)���� �����ϴٰ�
	  * �޼ҵ�Ex5.add(4,4)�� �����ϱ� ���� 9������ ���ư�
	  * return �� 8�� ������ �ٽ� 14�������� �ٽ� �����Ѵ�
	  */
	   int num = Ex5.add(4,4);
	   System.out.println("���:"+num);
	   
	   int num2 = Ex5.minus(5, 3);
	   System.out.println("���:"+num2);
  }
}
