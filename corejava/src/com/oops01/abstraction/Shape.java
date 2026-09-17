package com.oops01.abstraction;

abstract class Shape1 {
	abstract void area();

}
class  Cricle extends Shape1{
	double radius=5;
	@Override
	void area() {
		double result=3.14*radius*radius;
		System.out.println("area of cricle:"+result);
	}
	
} 
class Rectangle extends Shape1{
	double length=10;
	double breadth=5;
	@Override
	void area() {
		double result=length*breadth;
		System.out.println("area of rectangle:"+result);
	}
}
class Triangle extends Shape1{
	double base=8;
	double height=6;
	@Override
	void area() {
		double result=base*height;
		System.out.println("area of triangle:"+result);
		
	}
}
public class Shape{
	public static void main(String[] args) {
		Cricle c=new Cricle();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		c.area();
		r.area();
		t.area();
		
	}
}
