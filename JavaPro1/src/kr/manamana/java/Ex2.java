package kr.manamana.java;

class ����{
	static String name="����";
	static String color="���";
	static int speed = 100;
	static char gender = '��';		
}
/*heap
 * new ������ Ư¡:���� ���ϴ� ������ �޸𸮿� �ε�
 * �ʿ��� �� ���� ���� �ϴ°� (������ �Ҹ��� ��� �ݺ�)
 * �޸��� Ư�������� static 
 * �� �ٸ� Ư�������� heap 
 * */
public class Ex2 {
	static int name  = 100;
	//������ �ٸ��� ������ ���Ƶ� ������Ѵ�
	static int num = 10;
   public static void main(String[] args) {
	System.out.println("���������غ�");
	//���� a = new ���� �� ���ο� �ּҸ� �������
	���� a = new ����();
	//����ϸ� ���� custom class�Ѱ��� ���´� ���� ����ȰԳ���
	System.out.println(a.gender);
	/*System.out.println(����.color);
	System.out.println(����.name);
	System.out.println(����.speed);
	System.out.println(����.gender);*/
	System.out.println(num);
	System.out.println(name);
   }
   
   
   
}