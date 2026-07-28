package com.corejava;

public class InstanceVariable2 {
	int employeeid;
	
	
	 String employeename;
	 double employeesalary;
	   static String employeecompany;
	   

	public static void main(String[] args) {
		InstanceVariable2 i=new InstanceVariable2();
		System.out.println("employeeid:"+i.employeeid);
		System.out.println("employeename:"+i.employeename);
		System.out.println("employee salary:"+i.employeesalary);
        System.out.println("employeecompany:"+employeecompany);
        System.out.println("***************************************************");
        InstanceVariable2 i2=new InstanceVariable2();
        i2.employeeid=201;
        i2.employeename="sujatha";
        i2.employeesalary=2000;
        i2.employeecompany="vcube";
        System.out.println("employeeid:"+i2.employeeid);
		System.out.println("employeename:"+i2.employeename);
		System.out.println("employee salary:"+i2.employeesalary);
        System.out.println("employeecompany:"+employeecompany);
        
        System.out.println("***********************************************");
        i2.employeeid=301;
        i2.employeename="mounika";//reassigning the values
        i2.employeesalary=100000;
        i2.employeecompany="microsoft";
        System.out.println("enter a employeeid:"+i2.employeeid);
		System.out.println("enter a employeename:"+i2.employeename);
		System.out.println("enter a employee salary:"+i2.employeesalary);
        System.out.println("enter a employeecompany:"+employeecompany);
        
        
        
		

	}

}
