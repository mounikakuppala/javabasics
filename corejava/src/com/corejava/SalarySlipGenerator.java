package com.corejava;
import java.util.Scanner;

public class SalarySlipGenerator {
    void salaryslip(String employeename,double basicsalary) {
    	double  HRA=basicsalary*20/100;
    	double DA=basicsalary*10/100;
    	double salary=basicsalary+HRA+DA;
    	System.out.println("employeename:"+employeename);
    	System.out.println("basicsalary:"+basicsalary);
    	System.out.println("HRA:"+HRA);
    	System.out.println("DA:"+DA);
    	System.out.println("salary:"+salary);
    	
    	
		
	} 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		SalarySlipGenerator s=new SalarySlipGenerator();
		System.out.println("enter employee name:");
		String employeename=sc.nextLine();
		System.out.println("employee basic salary:");
		double basicsalary=sc.nextDouble();
		s.salaryslip(employeename,basicsalary);
		
		
		
		

	}
}
