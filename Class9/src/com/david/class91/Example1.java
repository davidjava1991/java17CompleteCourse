package com.david.class91;

public class Example1 {
	public static void main(String[] args) {
		String s1 ="Hello world";// string literal
		String s2 = new String("apple");// new string object
		String html = """
						<html> 
						<head><title> index page</title></head>
						<body><h1>Hello!</h1></body>
						</html>""";// text block
		System.out.println("string s1 = "+s1);
		System.out.println("string s2 = "+s2);
		System.out.println("string html = "+html);
		}
}
