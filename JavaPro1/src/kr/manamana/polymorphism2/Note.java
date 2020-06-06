package kr.manamana.polymorphism2;

public class Note extends Product{
   
	private int pagenum;

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Note(String name, String code, int price,int pagenum) {
		super(name, code, price);
	   this.pagenum = pagenum;
	}

	public int getPagenum() {
		return pagenum;
	}

	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
	}

	@Override
	public String showInfo() {
		return "페이지수는"+pagenum+"입니다";
	}
  
	
	
}
