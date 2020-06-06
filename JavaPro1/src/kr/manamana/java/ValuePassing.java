package kr.manamana.java;

class Data{
	int num = 10;
	
}

public class ValuePassing {
	//static void up(int num) {
    static int up(int num) {		
	  num++;
		System.out.println("증가num:"+num);
		return num;
	}
  static void down(Data data) {
	  data.num--;
	  System.out.println("감소num:"+data.num);
  }
  
  public static void main(String[] args) {
	int mynum = 100;
	mynum = up(mynum);
	System.out.println("mynum"+mynum);
	
	Data data = new Data();
	 
  }
   
}
