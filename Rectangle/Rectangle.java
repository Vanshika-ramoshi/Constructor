package com.constructor;

public class Rectangle {
  
  	   double length;
	     double breadth;
	     
	     Rectangle(double l , double b){
           this.length = l;
           this.breadth = b;
	    	 
	     }
	     
	     void calculatearea() {
	    	 double area = length * breadth;
	    	 System.out.println("Length : "+ length);
	    	 System.out.println("Breadth : "+ breadth);
	    	 System.out.println("area of reactangle : " + area );
	     }
	}
