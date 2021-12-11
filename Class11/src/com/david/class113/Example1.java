package com.david.class113;

public class Example1 {
	public static void main(String[] args) {
		try {
			throw new MyCheckedException("MyCheckedException message ");
		} catch(MyCheckedException e) {
			e.printStackTrace();
		}
	}
}
