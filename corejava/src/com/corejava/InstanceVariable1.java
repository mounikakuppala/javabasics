package com.corejava;

public class InstanceVariable1 {
	int studentid;//declaration
	String studentname;//instance variables by using object reference value
	
static String collegename="vcube";//static  variables without using object its will be  executed

	public static void main(String[] args) {
		
		
		InstanceVariable1 i=new InstanceVariable1();
		System.out.println("student id:"+i.studentid);
		System.out.println("student name:"+i.studentname);
		System.out.println("student college name:"+collegename);//staic variable 
		System.out.println("*****************************************");
		
		InstanceVariable1 i2=new InstanceVariable1();
		i2.studentid=101;
		i2.studentname="mounika";
		
		System.out.println("student id:"+i2.studentid);
		
		System.out.println("student name:"+i2.studentname);
		System.out.println("student college name:"+collegename);//staic variable 
		
		
		
		
	}
}	
     		
		

