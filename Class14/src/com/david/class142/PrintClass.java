package com.david.class142;

public class PrintClass {
	public PrintClass() {
		System.out.println("Constructor message");
	}
	static void printMessage() {
		System.out.println("static Message ");
	}
	
	void printNonStatic() {
		System.out.println("Non static message");
	}
	
	public static void main(String[] args) {
		Printable p = PrintClass::printMessage;/// static reference
		p.print();
		PrintClass p1 = new PrintClass();
		Printable n = p1::printNonStatic; // non static reference
		n.print();
		Printable p2 = PrintClass::new; // Constructor method reference
	}
}
