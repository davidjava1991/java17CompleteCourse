package com.david.class84;

import java.math.BigInteger;

public class Example1 {
	public static void main(String[] args) {
		BigInteger b1 = new BigInteger("3975246455443");
		System.out.println(" value of b = "+b1);
		System.out.println(" b bitcount = "+b1.bitCount());
		System.out.println(" absolute value = "+b1.abs());
		BigInteger b2 = new BigInteger("100").add(new BigInteger("200")); 
		System.out.println("value of b2 = "+b2);
		System.out.println("check prime "+b2.isProbablePrime(1));
		
	}
}
