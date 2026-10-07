package MethodOverriding;

public class Main {

	public static void main(String[] args) {
		Emp e = new Emp(18);
		Dev d = new Dev();
		Tester t = new Tester("Vishnu");
		
		
		d.login();
		d.writecode();
	//	d.FixBugs();
		d.testcode();
		d.payslip();
		
		t.Evaluation();
		t.FindBugs();
		t.FixBugs();
		t.payslips();
		
		
	
		

	}

}
