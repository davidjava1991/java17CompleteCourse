package com.david.class33;

public class Example3 {
	public static void main(String[] args) {
		int num = 12345 , rev = 0, rem = 0;
		while(num != 0) {
			rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
		}
		System.out.println("reverse : "+rev);
	}
}
