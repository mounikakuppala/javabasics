package com.methods;

import java.util.Scanner;

public class TestDemo5 {

public static void main(String[] args) {
    System.out.println("main method started");

    String s = new String();
    TestDemo5 t = new TestDemo5();
    Scanner sc = new Scanner(System.in);

    System.out.println("enter your age:");
    int age = sc.nextInt();

    System.out.println("enter your name:");
    sc.nextLine();
    String fristName = sc.nextLine();

    System.out.println("enter your last name:");
    String lastName = sc.nextLine();

    System.out.println("enter your salary info:");
    double sal = sc.nextDouble();

    System.out.println("enter your height:");
    float h = sc.nextFloat();

    System.out.println("enter your weight:");
    double w = sc.nextDouble();

    System.out.println("enter your gender:");
    char c = sc.next().charAt(0);

    // calling all methods
    t.getfullname(fristName, lastName);
    t.getage(age);
    t.salaryinfo(sal);
    t.heightandweightinfo(h, w);
    t.genderinfo(c);

    System.out.println("main method ended");
}

void getfullname(String fname, String lname) {
    System.out.println("employee full name: " + fname + " " + lname);
}

void getage(int age) {
    System.out.println("age of employee: " + age);
}

void salaryinfo(double salary) {
    System.out.println("employee salary: " + salary);
}

void heightandweightinfo(float height, double weight) {
    System.out.println("employee height: " + height);
    System.out.println("employee weight: " + weight);
}

void genderinfo(char c) {
    System.out.println("gender is: " + c);
}
}