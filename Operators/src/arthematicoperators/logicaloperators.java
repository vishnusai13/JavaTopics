package arthematicoperators;



	
	import java.util.Scanner;

	public class logicaloperators {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        System.out.print("Are you a citizen? (true/false): ");
	        boolean citizen = sc.nextBoolean();

	        System.out.println("\n--- Logical Operators ---");

	        boolean condition1 = age >= 18;
	        boolean condition2 = citizen;

	        System.out.println("age >= 18 : " + condition1);
	        System.out.println("citizen    : " + condition2);

	        // AND
	        System.out.println(
	            "Adult AND Citizen : " +
	            (condition1 && condition2)
	        );

	        // OR
	        System.out.println(
	            "Adult OR Citizen : " +
	            (condition1 || condition2)
	        );

	        // NOT
	        System.out.println(
	            "NOT Adult : " +
	            (!condition1)
	        );

	        sc.close();
	    }
	}
