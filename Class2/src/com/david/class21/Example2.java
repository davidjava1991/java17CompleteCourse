package com.david.class21;

public class Example2 {
	public static void main(String[] args) {
		int i = 234;
		long l = i;// widening - implicit
		System.out.println("l = "+l);
		int j =120;
		byte b = (byte)j; // narrowing - explicit
		System.out.println("b ="+b);
		
	}
}
