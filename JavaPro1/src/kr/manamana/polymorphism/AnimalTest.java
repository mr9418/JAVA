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
    
    /*Animal을 전부 상속받은 Human과 Tiger은 animal.move 메소드를 불러오면 모두 animal형으로 변환된다
     * 그래서 Human.move를 하지 않아도 moveAnimal을 호출함으로써 Human과 Tiger의 move메소드가 같이 호출되어서 
     * 출력이 나올 수 있다
     */
}
