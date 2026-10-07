package arthematicoperators;


	import java.util.Scanner;

	public class IncrementDecrement {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();

	        System.out.println("\n--- Increment / Decrement ---");

	        System.out.println("Original a : " + a);

	        System.out.println("++a : " + (++a));

	        System.out.println("a++ : " + (a++));
	        System.out.println("After a++ : " + a);

	        System.out.println("--a : " + (--a));

	        System.out.println("a-- : " + (a--));
	        System.out.println("After a-- : " + a);

	        sc.close();
	    }
	}
