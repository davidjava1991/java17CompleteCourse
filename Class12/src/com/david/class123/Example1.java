package com.david.class123;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Example1 {
	public static void main(String[] args) {
		Collection<String> names = Arrays.asList("david","paul", "jose");
		Iterator<String> it = names.iterator();
		System.out.println("printing list elements");
		while(it.hasNext()) {
			System.out.println(it.next());{
		}
			
		}
	}
}
