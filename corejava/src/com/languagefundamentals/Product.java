package com.languagefundamentals;

public class Product {
	 int productid=101;
	 String productname="myra";
	 double price=10.2;
	   Product(){
		 
	 }
	      Product(int productid,String productname,double price){
		   this.productid=productid;
		   this.productname=productname;
		   this.price=price;
	   }
	 
		 
	 
	 

	public static void main(String[] args) {
		System.out.println("main method started");
		Product p=new Product(103,"abcd",40);
		p.show();
		Product p1=new Product();
		p1.show();
	}
	void show() {
		System.out.println("productid:"+productid);
		System.out.println("productname:"+productname);
		System.out.println("price:"+price);
		
	}
		
	

}
