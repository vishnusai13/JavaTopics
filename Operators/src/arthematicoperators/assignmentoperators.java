package arthematicoperators;

		import java.util.Scanner;

		public class assignmentoperators {
		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int a = sc.nextInt();

		        System.out.print("Enter another number: ");
		        int b = sc.nextInt();

		        System.out.println("\n--- Assignment Operators ---");

		        int x = a;

		        System.out.println("x = " + x);

		        x += b;
		        System.out.println("x += b : " + x);

		        x -= b;
		        System.out.println("x -= b : " + x);

		        x *= b;
		        System.out.println("x *= b : " + x);

		        x /= b;
		        System.out.println("x /= b : " + x);

		        x %= b;
		        System.out.println("x %= b : " + x);

		        sc.close();
		    }
		
	}

