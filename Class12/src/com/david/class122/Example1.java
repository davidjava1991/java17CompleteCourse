package com.david.class122;

import java.util.Arrays;

public class Example1 {
	public static void main(String[] args) {
		int intArray[] = {1,4,2,6,5,8,3};
		System.out.println("sorting arrray");
		Arrays.sort(intArray);
		for(int a: intArray) {
			System.out.println(a);
		}
		System.out.println("Binary search : "+Arrays.binarySearch(intArray, 3));
		Arrays.fill(intArray, 1);// fill array with 1
		System.out.println("Array after fill");
		for(int a: intArray) {
			System.out.println(a);
		}
	
	}
}
