package com.oops01.inheritance;

class Product1 {
	int productid;
	String productname;
	double price;

	Product1(int productid, String productname, double price) {
		this.productid = productid;
		this.productname = productname;
		this.price = price;

	}

	void displayproddetails() {
		System.out.println("productid:" + productid);
		System.out.println("productname:" + productname);
		System.out.println("product price is:" + price);
	}

	double calculatediscount() {
		return 0;
	}
}
	class Electronics extends Product1 {
		String brand;

		Electronics(int productid, String productname, double price, String brand) {
			super(productid, productname, price);
			this.brand = brand;

		}

		@Override
		double calculatediscount() {
			return price * 0.10;
		}

		@Override
		void displayproddetails() {
			System.out.println("brand:" + brand);
			super.displayproddetails();
			System.out.println("discount:" + calculatediscount());
			System.out.println("final price:" + (price - calculatediscount()));
		}

	}

	class Furniture extends Product1 {
		String material;

		Furniture(int productid, String productname, double price, String material) {
			super(productid, productname, price);
			this.material = material;
		}

		@Override
		void displayproddetails() {
			super.displayproddetails();
			System.out.println("material:" + material);
			System.out.println("discount:" + calculatediscount());
			System.out.println("final price :" + (price - calculatediscount()));
		}

	}

	public class Product {
		public static void main(String[] args) {

			Product1 p1 = new Electronics(101, "laptop", 30000, "del");
			Product1 p2 = new Furniture(102, "chair", 30000, "wood");
			p1.displayproddetails();
			p2.displayproddetails();

		
	}
}
