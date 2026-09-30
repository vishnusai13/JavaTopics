package com.v2;

import java.util.Scanner;

public class Two_d2 {

	public static void main(String[] args) 
	{
		//int i,j;
	
		Scanner sc  =  new Scanner(System.in);
		int arr[][] = new int[3][4];
	
		
		
		for(int i = 0 ;  i < arr.length; i++)
		{
			
			for(int j = 0 ; j < arr[i].length ; j++){
				
			System.out.print("Enter the  the elements  at  "  + i +  "index  of  " + j);
			arr[i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < arr[i].length; i++)
		{
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}	
	}
}


