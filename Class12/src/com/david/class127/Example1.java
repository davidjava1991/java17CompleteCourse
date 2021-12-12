package com.david.class127;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Sam", 6000);
		hm.put("Fred", 2000);
		hm.put("Paul", 4000);
		hm.put("David", 4000);
		hm.put("David", 3000);
		System.out.println("hash map = "+hm);
		System.out.println("Keyset"+hm.keySet());
		System.out.println("check for David : "+hm.containsKey("David"));
		System.out.println("check for value : "+hm.containsValue(3000));
		Set<Entry<String,Integer>> entry = hm.entrySet();
		System.out.println("printing entryset");
		for(Entry<String,Integer> e : entry) {
			System.out.println("key : "+e.getKey());
			System.out.println("value : "+e.getValue());
		}
		
		
	}
}
