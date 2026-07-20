package com.constructor;

public class EvenOdd {
  
  int number;
  
	EvenOdd(int n){
		this.number = n;
	}
	
	public void checkNumber() {
		if(number % 2 ==0) {
			System.out.println("This is Even Number ");
			
		}else {
			System.out.println("This is Odd Number ");
		}
	}
}
	
