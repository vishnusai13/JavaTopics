package loop;

import java.util.Scanner;

public class Wrong_Attempts {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int originalPin = 1234;
        int attempts = 3;
        boolean correctPin = false;

        while (attempts > 0) {

            System.out.print("Please enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (originalPin == enteredPin) {
                System.out.println("Correct PIN!");
                System.out.println("Access Granted.");
                correctPin = true;
                break;
            } else {
                attempts--;
                System.out.println("Invalid PIN!");

                if (attempts > 0) {
                    System.out.println("You have " + attempts + " attempt(s) remaining.");
                }
            }
        }

        if (!correctPin) {
            System.out.println("Too many wrong attempts.");
            System.out.println("Your account is locked.");
        }

        sc.close();
    }
}