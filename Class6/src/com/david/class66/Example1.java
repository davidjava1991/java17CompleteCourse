package com.david.class66;

public class Example1 {
	public static void main(String[] args) {
		Father f1 = new Father();
		Father f2 = f1.getObject();
		f2.getObject();
		GrandFather g1 = new GrandFather();
		g1.getObject();
		GrandFather g2 = new Father();
		g2.getObject();
	}
}
