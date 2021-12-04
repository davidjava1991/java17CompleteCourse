package com.david.class47;

public class Example2 {
	static void change(int arr[]) {
		arr[0] = 10;
	}
	public static void main(String[] args) {
		int arr[] = {5};
		System.out.println("Array value before : "+arr[0]);
		change(arr);
		System.out.println("Array value after : "+arr[0]);
		
	}
}
