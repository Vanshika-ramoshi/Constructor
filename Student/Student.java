package com.constructor;

public class Student {


	    String name;
	    int marks;

	  
	    Student(String n, int m) {
	        name = n;
	        marks = m;
	    }

		    void displayResult() {
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);

	        if (marks >= 35) {
	            System.out.println("Result: Pass");
	        } else {
	            System.out.println("Result: Fail");
	        }
	    }
	}
