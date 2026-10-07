package COLLEGE;

public class Student extends Teacher {
			
	String designation =  "Main Student";
	double Fee = 56000;
	
	
	public Student() {

		
		System.out.println(designation);
		System.out.println(super.designation);
		System.out.println(Fee);
	
		System.out.println("Student  Constructor : ");
	}

	
	
	void  Name(){
		System.out.println(" Vishnu sai : ");
		
	}
	void Age() {
		System.out.println(" my current age is  = 25");
		
	}
	void place() {
		System.out.println(" I am from vijayawada :  ");
	}
}
