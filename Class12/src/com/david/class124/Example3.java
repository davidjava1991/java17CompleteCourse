package com.david.class124;

import java.util.Stack;

public class Example3 {
	public static void main(String[] args) {
		Stack<String> cards = new Stack<>();
		cards.push(" 2 Spade");
		cards.push(" J Diamond");
		cards.push(" Q Heart");
		cards.push(" 10 Club");
		cards.push(" 5 Diamond");
		System.out.println(cards);
		System.out.println("peek : "+cards.peek());
		System.out.println("pop : "+cards.pop());
		System.out.println("After pop "+cards);
		
		
		
	}
}
