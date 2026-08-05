package com.corejava;

public class Employee1 {

	

	    @Override
	    protected void finalize() throws Throwable {
	        System.out.println("Garbage Collector Called");
	    }

	    public static void main(String[] args) {

	        // Step 1: Create an object
	        Employee emp = new Employee();

	        // Step 2: Assign null to the object reference
	        emp = null;

	        // Step 3: Object becomes eligible for Garbage Collection
	        System.out.println("Object is eligible for Garbage Collection");

	        // Step 4: Request the JVM to run Garbage Collector
	        System.gc();
	    }
	}