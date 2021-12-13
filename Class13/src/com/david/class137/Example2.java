package com.david.class137;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Example2 {
	public static void main(String[] args) {
		try {
			Class<Student> c = Student.class;
			System.out.println("class name = "+c.getName());
			Field[] f = c.getDeclaredFields();
			Student s = new Student();
			for(Field f1 : f ) {
				System.out.println("field name  = "+f1.getName());
				System.out.println("field type = "+f1.getType());
				System.out.println("field value  = "+f1.getInt(s));
				f1.setInt(s, 100);
				System.out.println("field value after = "+f1.getInt(s));
			}
			Method[] m = c.getDeclaredMethods();
			for(Method m1 : m) {
				System.out.println("Method name "+m1.getName());
				System.out.println("invoke");
				m1.invoke(s, null);
			}
		} catch (IllegalArgumentException e) {
		e.printStackTrace();
		} catch (IllegalAccessException e) {
		e.printStackTrace();
		} catch (InvocationTargetException e) {
		e.printStackTrace();
		}
	}
		
}
