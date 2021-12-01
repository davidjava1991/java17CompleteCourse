package com.david.class14;

public class Example2 {
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		} else {
			return n*factorial(n - 1);
		}
	}
	public static void main(String[] args) {
		System.out.printf("factorial of %d is %d", 4,factorial(4));
	}
}
