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
    	 System.out.println("�°���"+passenger+"���̰� ���ݱ��� ������"+money+"���Դϴ�");
     }
}
