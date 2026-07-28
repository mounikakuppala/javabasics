package com.Constructors;

public class BankAccount {
	String accountholder;
	int accountnumber;
	double accountbalance;
	BankAccount(){
		this("unknow");
	
		
	}
	BankAccount(String accountholder){
		this("unknow",0);
		
		
	}
	BankAccount(String accountholder, int accountnumber){
		this("unknow",0,0.0);
		
		
	}
	BankAccount(String accountholder, int accountnumber, double accountbalance){
		this.accountholder=accountholder;
		this.accountnumber=accountnumber;
		this.accountbalance=accountbalance;
		
	}
	void display() {
		System.out.println("bankaccount holder:"+accountholder);
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("accountbalance:"+accountbalance);
	}

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.display();
		BankAccount b1=new BankAccount("mounika",0,0.0);
		b1.display();
		

		BankAccount b2=new BankAccount("mounika",1234567,0.0);
		b2.display();
		
		BankAccount b3=new BankAccount("mounika",1234567,1200.0);
		b3.display();
		
		
	

	}

}
