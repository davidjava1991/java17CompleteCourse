package com.david.class31;

public class Example3 {
	public static void main(String[] args) {
		int a = 2, b = 3, c = 8, large = 0;
		if(a>b) {
			large = a;
		} else {
			large = b;
		}
		if(c > large) {
			large = c;
		}
		System.out.println("largest value is : "+large);
	}		
}
