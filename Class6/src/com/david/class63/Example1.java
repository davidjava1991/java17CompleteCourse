package com.david.class63;

public class Example1 {
	public static void main(String[] args) {
		Person p = new Person("Sam", 34);
		System.out.println("----person methods------");
		p.sayHello();
		p.walk(12);
		System.out.println(p.run(23));
		Employee e = new Employee("david", 24, 2);
		System.out.println("-----Employee methods------");
		e.sayHello();
		e.walk(34);
		System.out.println(e.run(2));
	}
}
