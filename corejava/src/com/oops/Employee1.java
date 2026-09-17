package com.oops;

public class Employee1 {
//encapsulation
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(101);
		e.setName("mounika");
		e.setSalary(100000);
		e.setPassword("mouni");
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getPassword());

	}

}
