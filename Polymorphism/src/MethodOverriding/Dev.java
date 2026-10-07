package MethodOverriding;


public class Dev extends Emp {
	
	
	//create instance variables
		String designation =  "Team lead";
		double salary = 56000;
		
		//creare a constructor
		public Dev() {
			// Super must be the first statement in the costructor  --> super();
		super(2);
		System.out.println(designation);
		System.out.println(super.designation);
		System.out.println(salary);
		System.out.println(super.salary);
		System.out.println("Dev Constructor : ");
	}
// required for dev 
	void writecode() {
			System.out.println("Emp had been logged in : ");
			

		}
		void testcode() {
			System.out.println("you have sucessfully logged out :  ");
		}
		void payslips() {
			System.out.println("dev payslip is here : ");
		}
		
		
		

	}


