package com.david.class121;

public class Example1 {
	static int a[] = new int[4];
	public static void main(String[] args) {
		System.out.println("array elements");
		a[0] = 1; // accessing 0th element
		a[a.length-1] = 4; // using length property
		for( int ele : a) {
			System.out.println(ele);
		}
	}
}
