package com.david.class92;

public class Example2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("My ").append(" name ").append(" is David");
		System.out.println("value of sb = "+sb);
		System.out.println(" check sb is empty "+sb.isEmpty());
		System.out.println("sub string of sb "+sb.substring(0, 2));
		System.out.println("reverse of sb "+sb.reverse());
		sb.reverse().setLength(2);
		System.out.println("sb set length = "+sb);
		
	}
}
