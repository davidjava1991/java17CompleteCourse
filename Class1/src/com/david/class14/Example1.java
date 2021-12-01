package com.david.class14;

public class Example1 {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		System.out.printf("%d + %d = %d",a,b,sum(a,b));
	}
	
	public static int sum(int a, int b) {
		return(a +b);
	}
}