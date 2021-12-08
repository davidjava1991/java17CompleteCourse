package com.david.class81;

public class Example1 {
	public static void main(String[] args) {
		System.out.println("printing useful constants");
		System.out.println("max value of byte is "+Byte.MAX_VALUE);
		System.out.println("no of bytes in int "+Integer.BYTES);
		if(1.2/0 == Double.POSITIVE_INFINITY) {
			System.out.println("infinity");
		}
	}
}
