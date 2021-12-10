package com.david.class105;

import java.time.Duration;

public class Example3 {
	public static void main(String[] args) {
		Duration d1 = Duration.ofSeconds(100);
		System.out.println("printing duration "+d1);
		System.out.println("duration in minutes : "+d1.toMinutes());
		System.out.println("duration is negative : "+d1.isNegative());
		System.out.println("divide : "+d1.dividedBy(2));
	}
}
