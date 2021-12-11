package com.david.class114;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example1 {
	public static void main(String[] args) {
		try (PrintWriter writer = new PrintWriter(new File("./out/test.txt"))) {
		    writer.println("Hello World");
		    System.out.println("File written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
