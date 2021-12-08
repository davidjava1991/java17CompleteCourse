package com.david.class84;

import java.math.BigDecimal;

public class Example2 {
	public static void main(String[] args) {
		BigDecimal b1 = new BigDecimal("24.9423");
		System.out.println(" value of b1 = "+b1);
		System.out.println("integer value of b1 = "+b1.intValue());	
		System.out.println("b1 precision = "+b1.precision());
		System.out.println("square of b1 is = "+b1.pow(2));
	}
}
