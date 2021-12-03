package com.david.class32;

public class Example3 {
	public static void main(String[] args) {
		int num = 4 , fact = 1;
		for(int i=num;i>=1;i--) {
			fact *= i;
		}
		System.out.printf("Factorial of %d is %d",num,fact);
	}
}
