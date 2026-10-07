package MethodOverriding;

public class Tester extends Emp{
	String designation = "Team lead ";
	double salary = 90000;
	
	//create a constructor
	public Tester(String name)
	{
		super(18);
		//Here your calling overall designation 
		System.out.println(designation);
		//Here your calling designation of the  particular role
		System.out.println(super.designation);
		//Here your calling overall salary 
		System.out.println(salary);
		//Here your calling tester salary 
		System.out.println(super.salary);
		//Here your just printing the constructot type ;
		
		System.out.println("Tester constructor : ");
	
	}
	//required for Tester ;
	void Evaluation() {
		System.out.println("Evaluating the code : ");
	}
	void FindBugs() {
		System.out.println("Checking for the Bugs here " ); 
	}
	void FixBugs() {
		System.out.println("fixing the bugs");
	}
	
		void payslips() {
			System.out.println("tester payslip is here : ");
	}

}
