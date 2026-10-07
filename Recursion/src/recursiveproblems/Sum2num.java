package recursiveproblems;

import java.util.Scanner;


public class Sum2num {

    public static int sum(int a, int b) {

   
        if (b == 0) {
            return a;
        }

        // Recursive call
        return sum(a + 1, b - 1);
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        int num1,num2 ;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Enter the values that you wanna add");
       

        int result = sum(num1, num2);

        System.out.println("Sum = " + result);
    }
}