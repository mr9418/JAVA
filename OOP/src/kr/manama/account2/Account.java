package kr.manama.account2;

public class Account {
   private String name;
   private String ano;
   private int balance;
   
   
   public Account() {}
   
   public Account(String name,String ano,int balance) {
	   this.name = name;
	   this.ano = ano;
	   this.balance = balance;
   }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano = ano;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}
   
   
}
