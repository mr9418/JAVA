package kr.manamana.java;
//�޼���(�Լ�)�� �޼��� �ȿ� �ۼ��� �� ����
//class�ȿ� �޼���(�Լ�)�ۼ�
public class Mem {
    int num = 10;
    static String name  = "ȫ�浿";
    void test() {
    	//���������� ���ư�
    	int num = 5;
    	
    }
    
    public static void main(String[] args) {
		int sum = 100;
		System.out.println("sum:"+sum);
		Mem m = new Mem( );//�ּҸ� ������ �ִ°͵��� 4���̵� ,new �ϸ� heap�̻�����
		m.test();//test��static�� �ƴ϶� heap�� �������
		System.out.println("��ȣ:"+m.num);//num�� static�� �ƴ϶� heap�̵������
		System.out.println(1);
		System.out.println(2);
		System.out.println("���α׷�����");
		
		
	}
}
