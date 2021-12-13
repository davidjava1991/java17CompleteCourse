package com.david.class136;

import java.lang.reflect.Method;

public class Example1 {
	
	@MyMethod(name="David", since=1.7)
	public void sayHi() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		try {
			Method m=Example1.class.getMethod("sayHi");
			MyMethod a = m.getAnnotation(MyMethod.class); 
			System.out.println("name = "+a.name());
			System.out.println("since = "+a.since());
			System.out.println("tested = "+a.tested());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}  
		  
	}
}
