package com.david.class91;

public class Example4 {
	public static void main(String[] args) {
		String s1 = "My name is David";
		s1 = s1.replace("David", "Paul");
		System.out.println("s1 after replace = "+s1);
		System.out.println("substring = "+s1.substring(2));
		System.out.println("checking  starts with My = "+s1.startsWith("My"));
		System.out.println("String in lower case = "+s1.toLowerCase());
		System.out.println("split operation");
		for(String s : s1.split(" ")){
			System.out.println(s);
		}
		
	}
}
