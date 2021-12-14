package com.david.class144;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example1 {
	public static void main(String[] args) {
		IntStream is = IntStream.of(1,3,4,6,7);
		System.out.println("printing all values");
		 is.forEach(System.out::println);
		long count = IntStream.of(3,2,4,6,7).filter(p->p>4).count();
		System.out.println("count = "+count);
		Stream<String> names = Stream.of("David","Paul","Adam","Josh");
		List<String> l1 = names.filter(s->s.contains("D")).collect(Collectors.toList());
		System.out.println("list "+l1);
	}
}
