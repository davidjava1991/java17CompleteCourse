package com.david.class124;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Example2 {
	public static void main(String[] args) {
		List<String> bands = Arrays.asList("Metallica'","Linkin park","Greenday","Coldplay");
		ListIterator<String> it= bands.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
