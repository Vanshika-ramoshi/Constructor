package com.constructor;

public class Temperature {
  
	double celsius;
	
	Temperature (double c){
		this.celsius = c ;		
	}
	
	public void temperatureConverter() {
		double fahrenheit = (celsius * 9/5)+32;
		System.out.println("celcius : "+ celsius + "°C");
		System.out.println("fahrenheit : " + fahrenheit + "°F");
	}	
	
}
