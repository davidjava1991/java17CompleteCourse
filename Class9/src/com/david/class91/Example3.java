package com.david.class91;

public class Example3 {
	public static void main(String[] args) {
		String s1 = "i like apples";
		System.out.println("checking equals "+s1.equals("i like banana"));
		System.out.println("checking indexOf apple = "+s1.indexOf("apple"));
		System.out.println("join string "+String.join(",", "Apple", "banana"));
		System.out.println("last index of like is "+s1.lastIndexOf("like"));
		System.out.println("length of s1 = "+s1.length());
	}
}
