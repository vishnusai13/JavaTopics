package com.wrapper;

public class Ex1 {
	public static void main(String[] args) {
		Integer x = 9;
		int y = 5;
		
		System.out.println(x);
		
		int a = (int)x;//Boxing
		int b = x; //auto boxing
		System.out.println(x);
		
		Integer obj1 = (Integer)y;
		Integer obj2 = y;
		System.out.println(obj1);
		}
}
