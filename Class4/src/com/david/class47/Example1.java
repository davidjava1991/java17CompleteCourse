package com.david.class47;

public class Example1 {
	static void primitive(int a) {
		a=100;
	}
	static void derived(Employee e) {
		e.name = "paul";
	}
	public static void changeString(String s) {
		s = "world";
	}
	public static void main(String[] args) {
		int a =10;
		System.out.println(" value of a before "+a);
		primitive(a);
		System.out.println("value of a after "+a);
		Employee e = new Employee("David)");
		System.out.println(" employee name before "+ e.name);
		derived(e);
		System.out.println(" employee name after "+e.name);
		String s ="Hello";
		System.out.println(" value of s before "+s);
		changeString(s);
		System.out.println("value of s after "+s);
		
	}
}
