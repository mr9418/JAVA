package kr.manamana.vet;

public class Animal {
	
	private String name;
	private String king;
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKing() {
		return king;
	}
	public void setKing(String king) {
		this.king = king;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
		System.out.println("동물이름:"+name+"동물종류:"+king+"동물나이:"+age);
	}

}
