package com.david.class74;

public sealed class Rectangle extends Shape{
	@Override
	void area() {
		System.out.println("length x breadth");
	}
}

final class Square extends Rectangle {
	@Override
	void area() {
		System.out.println("side x side");
	}
}
