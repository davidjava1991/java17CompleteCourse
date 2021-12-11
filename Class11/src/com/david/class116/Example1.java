package com.david.class116;

import java.util.Optional;

public class Example1 {
	public static void main(String[] args) {
			Optional<String> op1 = Optional.empty();
			System.out.println("op1 is present() : "+op1.isPresent());
			System.out.println("op1 isEmpty : "+op1.isEmpty());
			//System.out.println("op1 get : "+op1.get()); throws nosuchelement exception
			Optional<String> op2 = Optional.of("Hello");
			System.out.println("op2 get : "+op2.get());
			Optional<String> op3 = Optional.ofNullable(null);
			System.out.println("op3 orElse:"+op3.orElse("value is not there"));
			
			
	}
}
