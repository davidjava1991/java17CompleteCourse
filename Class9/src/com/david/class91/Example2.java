package com.david.class91;

public class Example2 {
	public static void main(String[] args) {
		String s1 = "Hello world";
		System.out.println("character at 0th index = "+s1.charAt(0));
		System.out.println("code point at 0 = "+s1.codePointAt(0));
		s1 = s1.concat(" java17");
		System.out.println("concatenated string = "+s1);
		System.out.println("checking for java17 = "+s1.contains("java17"));
		System.out.println("s1 ends with 17 "+s1.endsWith("17"));
	}
}
