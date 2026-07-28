package com.languagefundamentals;

public class ProductBilling {
 String productname;
 double price;
 int quantity;
	ProductBilling(){
		this("laptop");
		
		
	}
	
	ProductBilling(String productname){
		this(productname,10.0);
		
		
		
	
		
	}
	ProductBilling(String productname,double price){
		this(productname,price,5);
		
	}
	ProductBilling(String productname,double price,int quantity){
		 this .productname=productname;
		 this.price=price;
		 this.quantity=quantity;
		
	}
	void display() {
		System.out.println(productname);
		System.out.println(price);
		System.out.println(quantity);
	}
	public static void main(String[] args) {
		ProductBilling p=new ProductBilling();
		p.display();
		
		

	}

}
