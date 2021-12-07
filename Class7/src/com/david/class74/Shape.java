package com.david.class74;

public sealed class Shape permits Rectangle,Triangle,Circle {// sealed class declaration
	void area() {
		System.out.println(" shape area");
	}
}
