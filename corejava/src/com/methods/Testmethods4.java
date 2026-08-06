package com.methods;

public class Testmethods4 {
	double balance=10000;
	

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("welcome to vcube banking");
		Testmethods4 t4=new Testmethods4();
		t4.checkbalance();
		t4.deposite(5000);
		t4.withdraw(2000);		
		System.out.println("main method ended");

	}
	void checkbalance() {
		System.out.println("the current balnace is :"+balance);
	}
	
    void deposite(double amount) {
    	System.out.println("deposite method called");
    	balance=balance+amount;
    	System.out.println("deposite amount:"+amount);
    	checkbalance();
    }
    void withdraw(float amount) {
    	System.out.println("withdraw method called");
    	balance=balance-amount;
    	System.out.println("withdraw amount:"+amount);
    	checkbalance();
    }
    
}
