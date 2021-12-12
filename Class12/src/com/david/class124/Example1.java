package com.david.class124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1 {
	public static void main(String[] args) {
		List<String> cars = List.of("ford","skoda","ferrari");
		//cars.add("toyota"); throws error
		System.out.println("getting 1st element : "+cars.get(1));
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.addAll(Arrays.asList(2,55,3,4,77,23,44,87,43));
		System.out.println("numlist : "+numList);
		System.out.println("contains 77 : "+numList.contains(77));
		System.out.println("index of 55 : "+numList.indexOf(55));
		System.out.println("remove all : "+numList.removeAll(numList));
		System.out.println("size after removal"+numList.size());
	}
}
