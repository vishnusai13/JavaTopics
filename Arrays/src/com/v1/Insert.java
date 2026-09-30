package com.v1;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
	//choosing a array and insertion of one array in the other
		
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		//herer n is nothing but a scannner
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the elemets to be inserted ");
		int element = sc.nextInt();
		
		
		System.out.println("{Enter the position to be inserted");
		int position = sc.nextInt();
		// here the position of array changes from one block to other block .
		for(int i = n ; i > position; i--) {
			arr[i]=arr[i-1];
			
		}
		arr[position] = element;
		n++;
		
		
		System.out.println("elements after insertion : ");
		
		for(int i = 0 ; i<n ; i++) {
			System.out.println(arr[i]);
		}

	}

}
