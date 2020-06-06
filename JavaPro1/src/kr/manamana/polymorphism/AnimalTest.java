package kr.manamana.polymorphism;

public class AnimalTest {
    public static void main(String[] args) {
		
    	AnimalTest a1 = new AnimalTest();
    	a1.moveAnimal(new Human());
    	a1.moveAnimal(new Tiger());
    	
    	
	}
    
    public void moveAnimal(Animal animal) {
    	animal.move();
    }
    
    /*Animal�� ���� ��ӹ��� Human�� Tiger�� animal.move �޼ҵ带 �ҷ����� ��� animal������ ��ȯ�ȴ�
     * �׷��� Human.move�� ���� �ʾƵ� moveAnimal�� ȣ�������ν� Human�� Tiger�� move�޼ҵ尡 ���� ȣ��Ǿ 
     * ����� ���� �� �ִ�
     */
}
