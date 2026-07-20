package com.constructor;

public class Intrest {

	double principle;
	double rate;
	double time;
	
	Intrest(double p , double r, double t){
		this.principle = p;
		this.rate = r;
		this.time = t;
			
	}
	
	void calculateSI() {
		double si = (principle*rate*time)/100;
		
		System.out.println("Principle :"+ principle);
		System.out.println("Rate :"+ rate + "%");
		System.out.println("Time :"+ time + "years");
		System.out.println("Simple Intrest :" + si);
	}
	
	
}
	
