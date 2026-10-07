package arthematicoperators;


	import java.util.Scanner;

	public class terenaryoperators  {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        // Ternary operator
	        int largest = (a > b) ? a : b;

	        System.out.println("\n--- Ternary Operator ---");

	        System.out.println("Largest number = " + largest);

	        String result = (a % 2 == 0) ? "Even" : "Odd";

	        System.out.println("First number is " + result);

	        sc.close();
	    }
	}