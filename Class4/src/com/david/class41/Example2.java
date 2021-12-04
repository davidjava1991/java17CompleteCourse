package com.david.class41;

public class Example2 {
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.name = "book1";
		b1.numOfPages = 322;
		b1.author = "author1";
		b1.printBookDetails();
		
		Book b2 = new Book();
		b2.name = "book2";
		b2.numOfPages = 222;
		b2.author = "author2";
		b2.printBookDetails();
		
		Book b3 = new Book();
		b3.name = "book3";
		b3.numOfPages = 342;
		b3.author = "author3";
		b3.printBookDetails();
		
	}
}
