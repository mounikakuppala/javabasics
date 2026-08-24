package com.corejava;

public class Employee1 {

	

	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Garbage Collector Called");
	    }

	    public static void main(String[] args) {

	        //  Create an object
	        Employee emp = new Employee();

	        // Assign null to the object reference
	        emp = null;

	        
	        System.out.println("Object is eligible for Garbage Collection");

	        
	        System.gc();
	    }
	}