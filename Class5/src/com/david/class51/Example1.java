package com.david.class51;

public class Example1 {
	static private int var1  = 23; // private variable 
	static public int var2 = 323;//  public variable
	static protected int var3 = 656; // protected variable
	static int var4 = 554; // default variable
	public static void print() {
		System.out.println("var1 = "+var1);
		System.out.println("var2 = "+var2);
		System.out.println("var3 = "+var3);
		System.out.println("var4 = "+var4);
	}
	public static void main(String[] args) {
		print();
	}
	
}
