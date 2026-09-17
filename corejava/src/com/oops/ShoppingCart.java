package com.oops;

public class ShoppingCart {

	private  int cartitem;
	private double totalamount;
	
	public void setCartItem() {
		this.cartitem=cartitem;
	}
	public int  getCartItem(int cartitem) {
		return cartitem;
		
	}
	public void setTotalAmount() {
		this.totalamount=totalamount;
	}
	public int getTotalAmount(int totalamount) {
		return totalamount;
	}
	void additem(int price) {
		cartitem++;
		totalamount=totalamount+price;
		
	}
	void removeitem(int price) {
		if(cartitem>0) {
			cartitem--;
			totalamount=totalamount-price;
			
		}
	}
	
	public double getTotal(double amount) {
		return totalamount;
	}
	
		

	}


