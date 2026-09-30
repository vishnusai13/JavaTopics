
package constructors;

public class Student {
	// Default Constructor
	public Student(int age) {

		// Here if we required directly we can assign or else manually depending upon
		// the user wish
		stdetails("Vishnu", 22);//here calling of the required thing in first
	}

	void stdetails() {
		System.out.println("Default - 4");
	}

	void stdetails(String name) {
		System.out.println(name + " - 2");
		stdetails(22, 85.5);//then it is printed or called 
	}

	void stdetails(String name, int age) {
		System.out.println("Name: " + name + ", Age: " + age+"-1");
		stdetails("Vishnu");
	}

	void stdetails(int age, double marks) {
		System.out.println("Age: " + age + ", Marks: " + marks+"-3");
		stdetails();
		
	}

	public static void main(String[] args) {

		// Here we should assign student to s1 and create a new varaible
		Student s1 = new Student(18);
		System.out.println("Done");

		// now here we would call the constructor any the cases that are required for
		// the user .3
		
		
		
		
	}

}
