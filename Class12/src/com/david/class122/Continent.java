package com.david.class122;

public class Continent implements Comparable<Continent> {
	String name;
	int size;
	
	public Continent(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String toString() {
			return this.name+":"+this.size;
	}
	
	@Override
	public int compareTo(Continent o) {
		return this.name.compareTo(o.name);
	
	}
}
