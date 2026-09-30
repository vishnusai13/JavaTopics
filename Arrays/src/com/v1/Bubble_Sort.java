package com.v1;

public class Bubble_Sort {

	public static void main(String[] args) {

		int arr[] = {18, 7, 45, 65, 34, 23, 3, 12};

		// Before Sorting
		System.out.println("Before Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
 
		// Here Sorting is done
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// After Sorting the result will be from this line
		System.out.println("After Sorting:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}