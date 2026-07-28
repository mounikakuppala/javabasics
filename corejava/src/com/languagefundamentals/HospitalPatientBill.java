package com.languagefundamentals;
import java.util.Scanner;

public class HospitalPatientBill {
	String patient_name;
	int age;
	double room_charge_per_day;
	short number_of_days_admitted;
	
	HospitalPatientBill( String patient_name,int age,double room_charge_per_day,short number_of_days_admitted){
		this.patient_name=patient_name;
		this.age=age;
		this.room_charge_per_day=room_charge_per_day;
		this.number_of_days_admitted=number_of_days_admitted;
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a patient name:");
		String patient_name=sc.nextLine();
		System.out.println("enter age:");
		int age=sc.nextInt();
		System.out.println("enter charge per day");
		double room_charge_per_day=sc.nextDouble();
		System.out.println("enter number of days admitted");
		short number_of_days_admitted=sc.nextShort();
		HospitalPatientBill h= new HospitalPatientBill(patient_name,age,room_charge_per_day,number_of_days_admitted);
		h. displaypatient();
		h.total();
		
	

	}
	void displaypatient() {
		System.out.println("patient  name:"+patient_name);
       System.out.println("age:"+age);
       System.out.println("room charge per day:"+room_charge_per_day);
       System.out.println("number of days admitted:"+number_of_days_admitted);
	}
	void total() {
		int totalhospitalbill= (int)room_charge_per_day*number_of_days_admitted;
		System.out.println("enter a totalhospitalbill:"+totalhospitalbill);
	}

}
