package com.david.class113;

public class Example2 {
	 void testException(int age) throws MyUnCheckedException {
		if(age > 120) {
			throw new MyUnCheckedException("age is larger than 120");
		} else {
			System.out.println("age = "+age);
		}				
	}
	public static void main(String[] args) {
		new Example2().testException(30);
		new Example2().testException(121);
	}
}
