package com.constructor;

public class CircleMain {

	
	public static void main(String[] args) {
		 
		Circle c1 = new Circle(7);
		System.out.println("Radius : " + c1.radius);
		c1.calculateArea();
		c1.calculateCircumtance();
	}

}
