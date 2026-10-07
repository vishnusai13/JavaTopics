package MethodOverriding;

public class Emp {
	//create instance variables
	String designation = "fresher";
	double salary = 22000;
	
	
	
	//Create a constructor 
	public Emp(int empid) {
//		System.out.println(designation);
//		System.out.println(super.designation);
//		System.out.println(salary);
//		System.out.println(super.salary);
//		
		System.out.println("Emp constructor : ");
		
		
	}
//required for emp
	void login() {
		System.out.println("Emp had been logged in : ");
		
	}
	void logout() {
		System.out.println("you have sucessfully logged out :  ");
	}
	void payslip() {
		System.out.println("your payslip is here : ");
	}

}
