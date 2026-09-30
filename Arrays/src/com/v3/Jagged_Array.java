package com.v3;

import java.util.Scanner;

public class Jagged_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowsize = sc.nextInt();
		int arr[][] = new int[rowsize][];
		
		for( int i = 0; i < arr.length ; i++) {
			System.out.println("Enter the size of the " + i + "array: ");
			int colsize = sc.nextInt();
			arr[i] =  new int[colsize];
			}
//		arr[0] = new int[5];
//		arr[1] = new int[2];
//		arr[2] = new int[1];
//		arr[3] = new int[3];
//		
		for(int i = 0 ; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}		
	}	
}
