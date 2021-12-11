package com.david.class116;

import java.util.Optional;
import java.util.function.Consumer;

public class Example2 {
	public static void main(String[] args) {
		Optional<String> op1 = Optional.of("Hello");
		op1.ifPresent(new Consumer<String>() {
		@Override
			public void accept(String s) {
				System.out.println("length : "+s.length());
			}
		});
		
		Optional<String> op2 = Optional.ofNullable(null);
		System.out.println("orElse get : "+op2.orElseGet(() -> "default"));
		
	}
}
