package kr.manamana.polymorphism2;

public class Penceil  extends Product{
	
	private String kind;

	public Penceil() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Penceil(String name, String code, int price,String kind) {
		super(name, code, price);
		this.kind = kind;
	
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String showInfo() {
		return "��ǰ�� ������"+getName()+"��������"+kind+"�Դϴ�";
	}
	
	

}
