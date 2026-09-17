package com.methods;

import java.util.Scanner;

public class StudentMarks {
	int getMathsMarks() {
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a maths marks:");
	int  marks=sc.nextInt();
	 return marks;
		
	}
	int getenglishmarks() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a enhlish marks:");
		  int englishmarks=sc.nextInt();
		return  englishmarks;
	}
	int getsciencemarks() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a science marks:");
		int  sciencemarks=sc.nextInt();
		return  sciencemarks;
	}int getsocialmarks() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a social marks:");
		int socialmarks=sc.nextInt();
		return  socialmarks;
	}
	public static void main(String[] args) {
		
     System.out.println("main method started");
     StudentMarks s=new StudentMarks();
     int maths = s.getMathsMarks();
     int science = s.getsciencemarks();

     int total = maths + science;
     
     int english=s.getenglishmarks();
     int social=s.getsocialmarks();
     
    int  total2=english+social;
     System.out.println("total marks of maths ans science:"+total);
     System.out.println("total marks of english and social:"+total2);
	}

}
