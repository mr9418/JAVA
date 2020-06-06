package kr.manamana.clas2;

public class Bus {
      int busnum;
      int passenger;
      int money;
      
     public Bus(int busnum) {
    	 this.busnum = busnum;
     }
     public void take(int money) {
    	 this.money+=money;
    	 passenger++;
     }
     public void showInfo() {
    	 System.out.println("승객은"+passenger+"명이고 지금까지 수익은"+money+"원입니다");
     }
}
