package com.david.class105;

import java.util.Date;

public class Example1 {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println("print date :"+d1);
		System.out.println("getTime method"+d1.getTime());
		System.out.println("Date before : "+d1.before(new Date(0)));
		System.out.println("Date after : "+d1.after(new Date(0)));
		
		
	}
}
