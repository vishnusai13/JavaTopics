package arthematicoperators;

import java.util.Scanner;

public class Shift {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter shift value: ");
        int b = sc.nextInt();

        System.out.println("\n--- Shift Operators ---");

        System.out.println("a << b  : " + (a << b));
        System.out.println("a >> b  : " + (a >> b));
        System.out.println("a >>> b : " + (a >>> b));

        sc.close();
    }
}