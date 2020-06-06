package kr.manamana.bmi;

public class ClientManager {  
	
	Client[] arr = new Client[100];
	private int counter = 0;
	
	public void insertClient(Client c) {
		boolean flag = true;
	
		for(int i=0; i<counter; i++) {
			if(arr[i].getCsn().equals(c.getCsn())) {
				flag = false;
			}
		}
		if(flag) {
			arr[counter++]=c;
		}
	}

	public void printAll() {
		for(int i=0; i<counter; i++) {
			arr[i].print();
		}
		
	}

	public void printBmi() {
		for(int i=0; i<counter; i++) {
		//몸무게 
		  double heightresult = (arr[i].getHeight()*0.01)*(arr[i].getHeight()*0.01);
		  double bmi = arr[i].getHeight()/heightresult;
		  if(arr[i].getName()!=null) {
			  System.out.printf("회원이름:%s,회원의 bmi%.2f",arr[i].getName(),bmi);
			  System.out.println();
		  }
		}
		
	}

	public void delete(String csn) {
		for(int i=0; i<counter; i++) {
			if(arr[i].getCsn().equals(csn)) {
				for(int j=i; j<counter; j++) {
					arr[j] =arr[j+1];
				}
			}
			counter--;
		}
	}

	public void modify() {
		
		
	}

	public void modify(String name, double weight) {
		for(int i=0; i<counter; i++) {
			if(arr[i].getName().equals(name)) {
				for(int j=i; j<counter; j++) {
					arr[i].setWeight(weight);
				}
			}
		}
	}
	

}
