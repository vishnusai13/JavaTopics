package com.v2;

import java.util.Scanner;

public class Two_Dsum {

	public static void main(String[] args) {
		// int sum = 0;;

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][4];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("Enter the  the elements  at  " + i + "index  of  " + j + "sub index: ");
				arr[i][j] = sc.nextInt();

			}

		}
		// Here
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)

			{

				System.out.print(arr[i][j] + " ");

			}
			System.out.println(" ");
		}
		// Here this loop is used to calculate the sum of all rows
		//----> Here the first length should be " arr of length "
		//---> Here the second j is under the i should be arr[i].length that means count a[i][j] 		
		
		
		for (int i = 0; i < arr.length; i++) {

			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				// here we use print cause it is inside the loop and still more we required the information of the data
			
			//System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
			}

			System.out.println("The total value rows is " + (i + 1) + " row: " + sum);
		}
	}

}
