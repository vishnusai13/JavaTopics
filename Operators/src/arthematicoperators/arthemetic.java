package arthematicoperators;


	import java.util.Scanner;

	public class arthemetic {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        System.out.println("\n===== JAVA OPERATORS DEMO =====");

	        // 1. ARITHMETIC OPERATORS
	        System.out.println("\n1. Arithmetic Operators");
	        System.out.println("a + b = " + (a + b));
	        System.out.println("a - b = " + (a - b));
	        System.out.println("a * b = " + (a * b));

	        if (b != 0) {
	            System.out.println("a / b = " + (a / b));
	            System.out.println("a % b = " + (a % b));
	        } else {
	            System.out.println("Division and modulus by zero are not allowed.");
	        }
	    }}
	






