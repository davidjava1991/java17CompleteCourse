package com.david.class105;

import java.time.Instant;

public class Example2 {
	public static void main(String[] args) {
		Instant i1 = Instant.now();
		System.out.println("printing instant : "+i1);
		System.out.println("epoch seconds : "+i1.getEpochSecond());
		System.out.println("instant after : "+i1.isAfter(Instant.now()));
		System.out.println("Instant before : "+i1.isBefore(Instant.now()));
		System.out.println("minus millis to i1 "+i1.minusMillis(1000));
	}
}
