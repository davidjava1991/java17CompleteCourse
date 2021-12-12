package com.david.class127;

import java.util.Map;
import java.util.TreeMap;

public class Example2 {
	public static void main(String[] args) {
		Map<String, String> map = Map.of("India","Delhi","Canada","Ottawa", "China","Beijing");
		TreeMap<String, String> t = new TreeMap<>(map);
		System.out.println(t);
	}
}
