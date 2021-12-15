package com.david.class152;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {
	public static void main(String[] args) {
		Path p1 = Paths.get("out", "Example.txt");
		try {
			Files.writeString(p1,"""
					Hello
					World""");
			System.out.println("File written");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
