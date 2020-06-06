package kr.manamana.coffee;

public class Coffee {
	
	private String bean;
    private String country;
    private int gram;
    
    public Coffee() {
    	
    }
	public Coffee(String bean, String country, int gram) {
		this.bean = bean;
		this.country = country;
		this.gram = gram;
	}


	public String getBean() {
		return bean;
	}


	public void setBean(String bean) {
		this.bean = bean;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getGram() {
		return gram;
	}


	public void setGram(int gram) {
		this.gram = gram;
	}

}
