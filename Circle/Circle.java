package com.constructor;

public class Circle {
  
  double radius;

	Circle(double r) {
		this.radius = r;
	}

	void calculateArea() {
		double area = Math.PI * radius * radius;
		System.out.println("Area Of Circle : " + area);
	}

	void calculateCircumtance() {
		double calculateCircumference = 2 * Math.PI * radius;
		System.out.println("Area of Circumference : " + calculateCircumference);
	}
