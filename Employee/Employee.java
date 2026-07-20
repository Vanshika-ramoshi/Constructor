package com.constructor;

public class Employee {
	   String name;
	   double basicsalary;
	   Employee(String n , double salary ) {
		   name = n;
		   basicsalary = salary ;
	   }
	   
	   void calculatesalary() {
		   double bonus = basicsalary * 0.20;
		   double totalsalary = basicsalary + bonus ;
		   
		   System.out.println("Employee Name : "+ name );
		   System.out.println("Basic salary : "+ basicsalary);
		   System.out.println("Bonus 20% : "+ bonus );
		   System.out.println("Total Salary : "+ totalsalary);
	   }
	   
}
