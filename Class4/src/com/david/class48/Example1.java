package com.david.class48;

public class Example1 {
	public static int sum(int... param) { // variable argument parameter
		int sum = 0;
		for(int i :param){
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(" sum1 "+sum());
		System.out.println(" sum2 "+sum(1));
		System.out.println(" sum3 "+sum(1,2));
		System.out.println(" sum4 "+sum(1,2,3));
		
		
	}
}
