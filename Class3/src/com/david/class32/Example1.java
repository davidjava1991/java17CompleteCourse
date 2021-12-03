package com.david.class32;

public class Example1 {
	public static void main(String[] args) {
		for(int i=0;i<10 ;i++) { // for loop
			System.out.println("loop iteration "+i);
		}
		System.out.println("---enhanced for loop--------");
		int intArray[] = {12,44,67,24,86,46,34}; // array declaration
		for(int ele:intArray) { // enhaced for loop
			System.out.println("element value "+ele);
		}
		
	}
}
