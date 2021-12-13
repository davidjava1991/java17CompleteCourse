package com.david.class133;

import java.util.List;

public class Example3 {
	
	public static void printNumbers(List<? super Integer> list) { 
		for(Object o:list) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		List<Number> numList = List.of(1.3,4.5,6.5);
		System.out.println("Number list : ");
		printNumbers(numList);
		List<Integer> intList = List.of(22,34,57,16,35);
		System.out.println("Integer list");
		printNumbers(intList);
		;
	}
}
