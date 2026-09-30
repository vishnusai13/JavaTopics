package com.v2;

public class Two_D {

	public static void main(String[] args) {
		int arr[][] = new int[3][4];
		
		arr[0][0] = 18;
		arr[0][1] = 28;
		arr[0][2] = 38;
		arr[0][3] = 48;
		
		arr[1][0] = 19;
		arr[1][1] = 29;
		arr[1][2] = 39;
		arr[1][3] = 49;
		
		arr[2][0] = 12;
		arr[2][1] = 22;
		arr[2][2] = 32;
		arr[2][3] = 42;
		
		for(int i = 0 ;  i < arr.length; i++)
		{
			
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}	
	}

}
