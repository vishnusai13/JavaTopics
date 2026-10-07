package arthematicoperators;

	import java.util.Scanner;

	public class uranaryoperators{
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();

	        System.out.println("\n--- Unary Operators ---");

	        System.out.println("Original value : " + a);
	        System.out.println("+a             : " + (+a));
	        System.out.println("-a             : " + (-a));

	        boolean value = true;

	        System.out.println("value           : " + value);
	        System.out.println("!value          : " + (!value));

	        sc.close();
	    }
	}


