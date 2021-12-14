package com.david.class143;

import java.util.function.DoublePredicate;

public class Example1 {
	public static void main(String[] args) {
		DoublePredicate dp = (a) -> {
			if(a> 10) {
				return true;
			} else {
				return false;
			}};
		System.out.println("test 13 = "+dp.test(13));
		System.out.println("test 3 = "+dp.test(3));
		
	}
}
