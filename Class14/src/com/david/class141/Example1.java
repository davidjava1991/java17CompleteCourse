package com.david.class141;

public class Example1 {
	public static void main(String[] args) {
		Printable p = () ->System.out.println("Hello");
		p.print();
		Incrementor in =i->{ return ++i;};
		System.out.println("increment 5 = "+in.increment(5));
		Addable a = (int x, int y)->{return (x+y);};
		System.out.println("sum = "+a.add(20, 34));
		
	}
}
