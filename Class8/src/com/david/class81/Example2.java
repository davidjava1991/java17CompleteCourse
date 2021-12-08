package com.david.class81;

public class Example2 {
	public static void main(String[] args) {
		System.out.println("Wrapper class methods");
		int a = Integer.valueOf(23);
		System.out.println(" value of a = "+a);
		double d = Double.valueOf("12.334");
		System.out.println(" value of d = "+d);
		System.out.println("max value = "+Double.max(21.33, 33.33));
		System.out.println("parsed long = "+Long.parseLong("21234"));
		System.out.println("@ is letter = "+Character.isLetter('@'));
		System.out.println("int value = "+Integer.toString(44));
		Double d1 = Double.parseDouble("32.678"); 
		System.out.println("double value = "+d1.doubleValue());
	}
}
