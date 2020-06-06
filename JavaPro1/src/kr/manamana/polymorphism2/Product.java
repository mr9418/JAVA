package kr.manamana.polymorphism2;

public class Product {
	private String name;
	private String code;
	private int price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String name, String code, int price) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String showInfo() {
		return "상품의 이름은"+name+"바코드는"+code+"가격은"+price+"입니다";
	}

}
