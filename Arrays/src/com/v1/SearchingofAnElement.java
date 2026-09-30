package com.v1;

import java.util.Scanner;

public class SearchingofAnElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5]; // Array declaration

        System.out.println("Enter 5 elements:");

        // Reading array elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Displaying array elements
        System.out.println("Array elements are:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Searching for an element
        System.out.println("Enter the element you want to search:");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (key == arr[i]) {
                System.out.println("Element found at position: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}